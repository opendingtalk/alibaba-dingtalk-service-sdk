package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.bizflow.start response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiHireBizflowStartResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2695167135133912448L;

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
	 * 发起应聘流程结果
	 */
	@ApiField("result")
	private TopStartBizFlowResult result;


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

	public void setResult(TopStartBizFlowResult result) {
		this.result = result;
	}
	public TopStartBizFlowResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 发起应聘流程结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopStartBizFlowResult extends TaobaoObject {
		private static final long serialVersionUID = 8283593679139664222L;
		/**
		 * 移动端跳转地址
		 */
		@ApiField("mobile_jump_url")
		private String mobileJumpUrl;
		/**
		 * pc端跳转地址
		 */
		@ApiField("pc_jump_url")
		private String pcJumpUrl;
		/**
		 * pc端重定向地址
		 */
		@ApiField("pc_redirect_url")
		private String pcRedirectUrl;
	
		public String getMobileJumpUrl() {
			return this.mobileJumpUrl;
		}
		public void setMobileJumpUrl(String mobileJumpUrl) {
			this.mobileJumpUrl = mobileJumpUrl;
		}
		public String getPcJumpUrl() {
			return this.pcJumpUrl;
		}
		public void setPcJumpUrl(String pcJumpUrl) {
			this.pcJumpUrl = pcJumpUrl;
		}
		public String getPcRedirectUrl() {
			return this.pcRedirectUrl;
		}
		public void setPcRedirectUrl(String pcRedirectUrl) {
			this.pcRedirectUrl = pcRedirectUrl;
		}
	}
	


}
