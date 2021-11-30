package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.custom.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappCustomCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5898387268419241399L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 定制应用
	 */
	@ApiField("result")
	private CustomAppCreateResponseVo result;


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

	public void setResult(CustomAppCreateResponseVo result) {
		this.result = result;
	}
	public CustomAppCreateResponseVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 定制应用
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CustomAppCreateResponseVo extends TaobaoObject {
		private static final long serialVersionUID = 5648312411642167415L;
		/**
		 * 定制应用id
		 */
		@ApiField("agent_id")
		private Long agentId;
		/**
		 * 定制应用key
		 */
		@ApiField("custom_key")
		private String customKey;
		/**
		 * 定制应用secret
		 */
		@ApiField("custom_secret")
		private String customSecret;
	
		public Long getAgentId() {
			return this.agentId;
		}
		public void setAgentId(Long agentId) {
			this.agentId = agentId;
		}
		public String getCustomKey() {
			return this.customKey;
		}
		public void setCustomKey(String customKey) {
			this.customKey = customKey;
		}
		public String getCustomSecret() {
			return this.customSecret;
		}
		public void setCustomSecret(String customSecret) {
			this.customSecret = customSecret;
		}
	}
	


}
