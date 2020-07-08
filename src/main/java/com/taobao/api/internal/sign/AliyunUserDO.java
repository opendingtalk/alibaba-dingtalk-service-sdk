package com.taobao.api.internal.sign;

import com.taobao.api.TaobaoResponse;

public class AliyunUserDO extends TaobaoResponse {
	
	private String aliyunID;
	
	private String aliyunPK;
	
	private String havanaId;

	public String getAliyunID() {
		return aliyunID;
	}

	public void setAliyunID(String aliyunID) {
		this.aliyunID = aliyunID;
	}

	public String getAliyunPK() {
		return aliyunPK;
	}

	public void setAliyunPK(String aliyunPK) {
		this.aliyunPK = aliyunPK;
	}

	public String getHavanaId() {
		return havanaId;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

}
