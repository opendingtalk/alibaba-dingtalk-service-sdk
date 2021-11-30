package com.taobao.api.internal.toplink.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.taobao.api.internal.toplink.LoggerFactory;

// https://github.com/wsky/top-link/issues/69
// support batch processing certain type of lightweight task, avoid context switch cost 
public class BatchedScheduler<T> extends Scheduler<T> {
	private List<Runnable> batched = new ArrayList<Runnable>();

	public BatchedScheduler() {
		super();
	}

	public BatchedScheduler(LoggerFactory loggerFactory) {
		super(loggerFactory);
	}

	@Override
	protected Runnable poll(Queue<Runnable> queue) {
		Runnable first = queue.poll();

		if (first == null)
			return null;

		if (!this.enableBatch(first))
			return first;

		this.batched.add(first);

		int i = this.getBatchSize(first);
		while (i-- > 0 && this.areInSameBatch(queue.peek(), first))
			this.batched.add(queue.poll());

		// no batch
		if (this.batched.size() == 1)
			return this.batched.get(0);

		// must be render to a clone array
		final Object[] tasks = this.batched.toArray();
		this.batched.clear();
		Runnable batchedTask = new Runnable() {
			public void run() {
				for (Object t : tasks)
					try {
						((Runnable) t).run();
					} catch (Exception e) {
						// log or task should charge itself?
					}
			}
		};
		return batchedTask;
	}

	protected boolean enableBatch(Runnable task) {
		return true;
	}

	protected int getBatchSize(Runnable task) {
		return 10;
	}

	protected boolean areInSameBatch(Runnable next, Runnable first) {
		return next != null && first.getClass().equals(next.getClass());
	}
}
