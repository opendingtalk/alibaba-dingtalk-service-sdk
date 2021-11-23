package com.taobao.api.internal.toplink.remoting;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.taobao.api.internal.toplink.Text;

public class SynchronizedRemotingCallback extends RemotingCallback {
	private CountDownLatch latch;
	private MethodReturn methodReturn;
	private boolean sucess;
	private Throwable failure;

	public SynchronizedRemotingCallback() {
		this.latch = new CountDownLatch(1);
	}

	public boolean isSucess() {
		return this.sucess;
	}

	public Throwable getFailure() {
		return this.failure;
	}

	public MethodReturn getMethodReturn() {
		return this.methodReturn;
	}

	@Override
	public void onMethodReturn(MethodReturn methodReturn) {
		this.sucess = true;
		this.methodReturn = methodReturn;
		this.nofityCall();
	}

	@Override
	public void onException(Throwable exception) {
		this.sucess = false;
		this.failure = exception;
		this.nofityCall();
	}

	public void waitReturn(int timeout) throws RemotingException {
		try {
			if (timeout > 0) {
				if (!this.latch.await(timeout, TimeUnit.MILLISECONDS))
					throw new RemotingException(Text.RPC_EXECUTE_TIMEOUT);
			} else
				this.latch.await();
		} catch (InterruptedException e) {
			throw new RemotingException(Text.RPC_WAIT_INTERRUPTED, e);
		}
	}

	private void nofityCall() {
		this.latch.countDown();
	}
}