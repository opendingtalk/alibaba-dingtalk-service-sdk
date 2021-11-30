package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.bind.taobao.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripBindTaobaoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8724224392651159775L;

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
	 * 结果对象
	 */
	@ApiField("result")
	private UserTaoBaoInfo result;

	/** 
	 * 成功标识
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(UserTaoBaoInfo result) {
		this.result = result;
	}
	public UserTaoBaoInfo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserTaoBaoInfo extends TaobaoObject {
		private static final long serialVersionUID = 2814327185712476775L;
		/**
		 * 关联的支付宝帐号
		 */
		@ApiField("alipay_info")
		private String alipayInfo;
		/**
		 * 淘宝帐号
		 */
		@ApiField("taobao_info")
		private String taobaoInfo;
	
		public String getAlipayInfo() {
			return this.alipayInfo;
		}
		public void setAlipayInfo(String alipayInfo) {
			this.alipayInfo = alipayInfo;
		}
		public String getTaobaoInfo() {
			return this.taobaoInfo;
		}
		public void setTaobaoInfo(String taobaoInfo) {
			this.taobaoInfo = taobaoInfo;
		}
	}
	


}
