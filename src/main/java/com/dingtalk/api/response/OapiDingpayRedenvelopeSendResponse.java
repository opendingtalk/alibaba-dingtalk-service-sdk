package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.redenvelope.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayRedenvelopeSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6562474252381547653L;

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
	 * 红包发送结果
	 */
	@ApiField("result")
	private RedEnvelopeGetResult result;


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

	public void setResult(RedEnvelopeGetResult result) {
		this.result = result;
	}
	public RedEnvelopeGetResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 红包发送结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RedEnvelopeGetResult extends TaobaoObject {
		private static final long serialVersionUID = 3472587561886674422L;
		/**
		 * 企业订单号
		 */
		@ApiField("corp_biz_no")
		private String corpBizNo;
		/**
		 * 订单订单号
		 */
		@ApiField("order_no")
		private String orderNo;
	
		public String getCorpBizNo() {
			return this.corpBizNo;
		}
		public void setCorpBizNo(String corpBizNo) {
			this.corpBizNo = corpBizNo;
		}
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
	}
	


}
