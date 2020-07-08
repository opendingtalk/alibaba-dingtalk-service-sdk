package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.open.device.synctime response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenDeviceSynctimeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5476535172524881295L;

	/** 
	 * callType
	 */
	@ApiField("call_type")
	private String callType;

	/** 
	 * data
	 */
	@ApiField("data")
	private String data;

	/** 
	 * devId
	 */
	@ApiField("dev_id")
	private Long devId;

	/** 
	 * devServId
	 */
	@ApiField("dev_serv_id")
	private Long devServId;

	/** 
	 * devTypeCode
	 */
	@ApiField("dev_type_code")
	private Long devTypeCode;

	/** 
	 * mid
	 */
	@ApiField("mid")
	private String mid;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;


	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getCallType( ) {
		return this.callType;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setDevId(Long devId) {
		this.devId = devId;
	}
	public Long getDevId( ) {
		return this.devId;
	}

	public void setDevServId(Long devServId) {
		this.devServId = devServId;
	}
	public Long getDevServId( ) {
		return this.devServId;
	}

	public void setDevTypeCode(Long devTypeCode) {
		this.devTypeCode = devTypeCode;
	}
	public Long getDevTypeCode( ) {
		return this.devTypeCode;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMid( ) {
		return this.mid;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	
	


}
