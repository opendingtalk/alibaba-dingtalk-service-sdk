package com.taobao.api.internal.sign;


public class SignCheckDO {

	private String secret;
	
	private Long isvId;
		
	public SignCheckDO(String secret,Long isvId){
		this.secret = secret;
		this.isvId = isvId;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public Long getIsvId() {
		return isvId;
	}

	public void setIsvId(Long isvId) {
		this.isvId = isvId;
	}
	
}