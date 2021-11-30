package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.orders.inquiry response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAppstoreOrdersInquiryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4731196637144342175L;

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

	/** 
	 * 费用
	 */
	@ApiField("pay_fee")
	private String payFee;


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

	public void setPayFee(String payFee) {
		this.payFee = payFee;
	}
	public String getPayFee( ) {
		return this.payFee;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
