package com.taobao.api.internal.toplink;


// https://gist.github.com/wsky/5538632
// easy timer task, support delay and reset
public class ResetableTimer {

	private volatile boolean running;
	private Thread boss;
	private Runnable task;
	private int period;
	protected long lastTime;
	private String name;

	public ResetableTimer(int periodMillisecond) {
		this(periodMillisecond, null);
	}

	public ResetableTimer(int periodMillisecond, Runnable task) {
		this(periodMillisecond, task, null);
	}

	public ResetableTimer(int periodMillisecond, Runnable task, String name) {
		this.period = periodMillisecond;
		this.delay(0 - this.period);
		this.setTask(task);
		this.name = name;
	}

	public void setTask(Runnable task) {
		this.task = task;
	}

	public void start() {
		if (this.boss != null) {
			return;
		}

		this.running = true;
		this.boss = new Thread(new Runnable() {
			public void run() {
				while (running) {
					long split = System.currentTimeMillis() - lastTime;
					if (split >= period && task != null) {
						try {
							task.run();
						} catch (Exception e) {
							e.printStackTrace();
						}
						delay();
					}
					try {
						Thread.sleep(split >= period ? period : period - split);
					} catch (InterruptedException e) {
						running = false;
					}
				}
			}
		});
		if (this.name != null) {
			this.boss.setName(this.name);
		}
		this.boss.setDaemon(true);
		this.boss.start();
	}

	public void stop() {
		this.running = false;
		this.boss.interrupt();
		this.boss = null;
	}

	public void delay() {
		this.delay(0);
	}

	public void delay(int delayMillisecond) {
		this.lastTime = System.currentTimeMillis() + delayMillisecond;
	}
}
