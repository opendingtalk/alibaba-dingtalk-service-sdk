package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.job.deliver.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsJobDeliverAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4327322523385537399L;

	/** 
	 * 投递id
	 */
	@ApiField("deliver_id")
	private String deliverId;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setDeliverId(String deliverId) {
		this.deliverId = deliverId;
	}
	public String getDeliverId( ) {
		return this.deliverId;
	}

	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
