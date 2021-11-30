package com.taobao.api.internal.toplink;

import java.util.LinkedList;

public abstract class Pool<T> {
	private int maxSize;
	private int waitTimeout;
	private LinkedList<T> unused;
	private LinkedList<T> used;
	private Object waiter;

	public Pool() {
		this(0, 0);
	}

	public Pool(int maxSize, int waitTimeout) {
		this.unused = new LinkedList<T>();
		this.used = new LinkedList<T>();
		this.waiter = new Object();
		this.maxSize = maxSize;
		this.waitTimeout = waitTimeout;
	}

	public int size() {
		// System.out.println(this.used.size() + "-" + this.unused.size());
		return this.used.size() + this.unused.size();
	}

	public T chekOut() throws Throwable {
		T t = this.get();

		if (t != null)
			return t;

		if (this.maxSize < 1 || this.size() < this.maxSize)
			return this.createNew();

		int i = 0;
		while (this.waitTimeout > 0 && i++ < this.waitTimeout) {
			synchronized (this.waiter) {
				try {
					this.waiter.wait(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			t = this.get();

			if (t != null)
				return t;
		}

		return null;
	}

	public synchronized void checkIn(T t) {
		if (t == null)
			return;
		this.used.remove(t);
		this.unused.addLast(t);

		synchronized (this.waiter) {
			this.waiter.notifyAll();
		}
	}

	public abstract T create() throws Throwable;

	public abstract boolean validate(T t);

	private synchronized T get() {
		while (!this.unused.isEmpty()) {
			T t = this.unused.removeFirst();
			if (t == null)
				continue;
			if (this.validate(t)) {
				this.used.add(t);
				return t;
			}
		}
		return null;
	}

	private T createNew() throws Throwable {
		T t = this.create();
		this.used.addLast(t);
		return t;
	}
}
