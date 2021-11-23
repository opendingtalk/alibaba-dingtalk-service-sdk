package com.taobao.api.internal.spi;


/**
 * SPI请求校验结果。
 * 
 * @author fengsheng
 * @since Aug 29, 2016
 */
public class CheckResult {

	private boolean success;
	private String requestBody;

	public boolean isSuccess() {
		return this.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getRequestBody() {
		return this.requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

}
