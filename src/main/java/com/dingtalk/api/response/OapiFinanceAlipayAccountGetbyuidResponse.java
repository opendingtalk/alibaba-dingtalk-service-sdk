package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.alipay.account.getbyuid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceAlipayAccountGetbyuidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7863755414171153668L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private AlipayUserVo result;


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

	public void setResult(AlipayUserVo result) {
		this.result = result;
	}
	public AlipayUserVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AlipayUserVo extends TaobaoObject {
		private static final long serialVersionUID = 2497266273273811665L;
		/**
		 * 用户支付宝uid
		 */
		@ApiField("alipay_user_id")
		private String alipayUserId;
	
		public String getAlipayUserId() {
			return this.alipayUserId;
		}
		public void setAlipayUserId(String alipayUserId) {
			this.alipayUserId = alipayUserId;
		}
	}
	


}
