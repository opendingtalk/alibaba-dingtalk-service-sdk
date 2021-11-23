package com.taobao.api.internal.toplink.schedule;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimerTask;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.taobao.api.internal.toplink.DefaultLoggerFactory;
import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.Logger;
import com.taobao.api.internal.toplink.LoggerFactory;
import com.taobao.api.internal.toplink.Text;

public class Scheduler<T> {
	private Object lock;
	private Semaphore semaphore;
	private Thread dispatcher;
	private Timer checker;

	private Map<T, Queue<Runnable>> tasks;
	private ExecutorService threadPool;
	private Runnable rejectedTask;

	protected Logger logger;
	protected int max = 100;
	protected boolean running;

	public Scheduler() {
		this(DefaultLoggerFactory.getDefault());
	}

	public Scheduler(LoggerFactory loggerFactory) {
		this.logger = loggerFactory.create(this);
		this.lock = new Object();
		this.semaphore = new Semaphore(0);
		this.tasks = this.createStore();
		this.setThreadPool(Executors.newCachedThreadPool());
	}

	public void setUserMaxPendingCount(int max) {
		this.max = max;
	}

	public void setThreadPool(ExecutorService threadPool) {
		this.threadPool = threadPool;
	}

	public void start() {
		if (this.dispatcher != null)
			return;

		this.running = true;
		this.dispatcher = new Thread(new Runnable() {
			public void run() {
				while (running) {
					try {
						semaphore.tryAcquire(1, TimeUnit.SECONDS);
					} catch (InterruptedException e) {
						logger.error(e);
					}
					dispatch();
				}
			}
		});
		this.dispatcher.setDaemon(true);
		this.dispatcher.setName(Text.SCHEDULE_DISPATCHER_NAME);
		this.dispatcher.start();
		this.prepareChecker(10000, 10000);

		if (this.logger.isDebugEnabled())
			this.logger.debug(Text.SCHEDULE_START);
	}

	public void stop() throws InterruptedException {
		if (this.dispatcher == null)
			return;

		this.stopChecker();
		this.checker = null;

		this.disposeDispatcher();
		this.dispatcher = null;

		if (this.logger.isDebugEnabled())
			this.logger.debug(Text.SCHEDULE_STOP);
	}

	public void schedule(T t, Runnable task) throws LinkException {
		if (this.canRunImmediately(t, task)) {
			try {
				this.threadPool.execute(task);
				return;
			} catch (RejectedExecutionException e) {
				throw new LinkException(e.getMessage());
			}
		}

		Queue<Runnable> queue = this.tasks.get(t);
		if (queue == null) {
			synchronized (this.lock) {
				if ((queue = this.tasks.get(t)) == null)
					this.tasks.put(t, queue = this.createTaskQueue(t));
			}
		}

		if (this.haveReachMaxPendingCount(t, queue, task))
			throw new LinkException(String.format(Text.SCHEDULE_GOT_MAX, this.max));

		try {
			queue.add(task);
		} catch (Exception e) {
			throw new LinkException(Text.SCHEDULE_TASK_REFUSED, e);
		}

		// if (this.semaphore.getQueueLength() > 0)
		this.semaphore.release();
	}

	public void drop(T t) {
		if (this.tasks.get(t) == null)
			return;
		this.tasks.get(t).clear();
		this.tasks.remove(t);
	}

	protected Map<T, Queue<Runnable>> createStore() {
		return new HashMap<T, Queue<Runnable>>();
	}

	protected Queue<Runnable> createTaskQueue(T t) {
		return new ArrayBlockingQueue<Runnable>(this.max, false);
	}

	protected boolean canRunImmediately(T t, Runnable task) {
		return false;
	}

	// can override here to control pending count of t
	protected boolean haveReachMaxPendingCount(T t, Queue<Runnable> queue, Runnable task) {
		return queue.size() >= this.max;
	}

	protected final void dispatch() {
		if (this.getRejectedTask() != null) {
			if (this.executeTask(this.getRejectedTask()))
				this.setRejectedTask(null);
			else
				return;
		}

		boolean flag;
		int c = 0;
		do {
			flag = false;
			Entry<T, Queue<Runnable>> entry;
			Iterator<Entry<T, Queue<Runnable>>> iterator = this.tasks.entrySet().iterator();
			while (iterator.hasNext()) {
				try {
					entry = iterator.next();
				} catch (Exception e) {
					if (this.logger.isDebugEnabled())
						this.logger.debug(e);
					// iterator got concurrent problem
					if (e instanceof ConcurrentModificationException)
						flag = true;
					break;
				}
				if (entry == null)
					continue;

				Queue<Runnable> queue = entry.getValue();
				if (queue == null)
					continue;

				Runnable task = this.poll(queue);

				if (task == null)
					continue;

				if (!this.executeTask(task)) {
					this.setRejectedTask(task);
					return;
				}

				c++;

				if (!flag)
					flag = queue.size() > 0;
			}
		} while (flag);

		if (this.logger.isDebugEnabled() && c > 0)
			this.logger.debug(Text.SCHEDULE_TASK_DISPATCHED, c);
	}

	protected boolean executeTask(Runnable task) {
		try {
			this.threadPool.execute(task);
			return true;
		} catch (RejectedExecutionException e) {
			if (this.logger.isDebugEnabled())
				this.logger.debug(e);
			return false;
		}
	}

	protected void setRejectedTask(Runnable task) {
		this.rejectedTask = task;
	}

	protected Runnable getRejectedTask() {
		return this.rejectedTask;
	}

	protected Runnable poll(Queue<Runnable> queue) {
		return queue.poll();
	}

	protected final void disposeDispatcher() throws InterruptedException {
		this.running = false;
		this.semaphore.release();
		this.dispatcher.join();
	}

	// necessarily?
	protected final void prepareChecker(long delay, long period) {
		this.stopChecker();
		this.checker = new Timer();
		this.checker.schedule(new TimerTask() {
			@Override
			public void run() {
				if (!running || dispatcher.isAlive())
					return;
				logger.fatal(Text.SCHEDULE_DISPATCHER_DOWN);
				try {
					stop();
					start();
				} catch (Exception e) {
					logger.error(e);
				}
			}
		}, delay, period);
	}

	protected final void stopChecker() {
		if (this.checker == null)
			return;
		this.checker.cancel();
	}
}
