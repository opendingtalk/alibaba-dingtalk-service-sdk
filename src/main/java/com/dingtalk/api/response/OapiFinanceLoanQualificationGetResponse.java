package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.loan.qualification.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceLoanQualificationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3716498321319967561L;

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
	 * 开放平台布点查询用户客户切分模型
	 */
	@ApiField("result")
	private CustomerInfo result;

	/** 
	 * true 成功，false 异常
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

	public void setResult(CustomerInfo result) {
		this.result = result;
	}
	public CustomerInfo getResult( ) {
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
	 * 开放平台布点查询用户客户切分模型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CustomerInfo extends TaobaoObject {
		private static final long serialVersionUID = 5519159616769745875L;
		/**
		 * 显示不显示入口
		 */
		@ApiField("enable")
		private String enable;
		/**
		 * 临时动态url，该url会302到真正的借款入口url
		 */
		@ApiField("url")
		private String url;
	
		public String getEnable() {
			return this.enable;
		}
		public void setEnable(String enable) {
			this.enable = enable;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
