package com.taobao.api.internal.toplink.endpoint;

import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.Text;

public class SendCallback {
	private CountDownLatch latch;
	private EndpointProxy endpointProxy;
	private LinkException error;
	private Map<String, Object> _return;

	public Integer flag;

	public SendCallback(EndpointProxy endpointProxy) {
		this.endpointProxy = endpointProxy;
		this.latch = new CountDownLatch(1);
	}

	public EndpointProxy getTarget() {
		return this.endpointProxy;
	}

	public void setComplete() {
		this.nofityReturn();
	}

	public LinkException getError() {
		return this.error;
	}

	public void setError(LinkException error) {
		this.error = error;
		this.setComplete();
	}

	public Map<String, Object> getReturn() {
		return this._return;
	}

	public void setReturn(Map<String, Object> _return) {
		this._return = _return;
		this.setComplete();
	}

	public void waitReturn(int timeout) throws LinkException {
		try {
			if (timeout > 0) {
				if (!this.latch.await(timeout, TimeUnit.MILLISECONDS))
					throw new LinkException(Text.E_EXECUTE_TIMEOUT);
			} else
				this.latch.await();
		} catch (InterruptedException e) {
			throw new LinkException(Text.E_UNKNOWN_ERROR, e);
		}
	}

	private void nofityReturn() {
		this.latch.countDown();
	}
}
