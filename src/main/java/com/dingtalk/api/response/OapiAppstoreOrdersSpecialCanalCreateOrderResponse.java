package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.orders.special_canal.create_order response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAppstoreOrdersSpecialCanalCreateOrderResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6467549914227187962L;

	/** 
	 * 钉钉订单id
	 */
	@ApiField("ding_order_id")
	private String dingOrderId;

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


	public void setDingOrderId(String dingOrderId) {
		this.dingOrderId = dingOrderId;
	}
	public String getDingOrderId( ) {
		return this.dingOrderId;
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
