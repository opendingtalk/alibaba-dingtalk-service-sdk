package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.app.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmAppUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2692461937261678957L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * GetCrmMicroAppResponse
	 */
	@ApiField("result")
	private GetCrmMicroAppResponse result;


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

	public void setResult(GetCrmMicroAppResponse result) {
		this.result = result;
	}
	public GetCrmMicroAppResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * GetCrmMicroAppResponse
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetCrmMicroAppResponse extends TaobaoObject {
		private static final long serialVersionUID = 4154817915591214126L;
		/**
		 * agentid
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * app_desc
		 */
		@ApiField("app_desc")
		private String appDesc;
		/**
		 * app_icon
		 */
		@ApiField("app_icon")
		private String appIcon;
		/**
		 * app_key
		 */
		@ApiField("app_key")
		private String appKey;
		/**
		 * app_secret
		 */
		@ApiField("app_secret")
		private String appSecret;
		/**
		 * crm_dsb
		 */
		@ApiField("biz_key")
		private String bizKey;
		/**
		 * homepage
		 */
		@ApiField("homepage")
		private String homepage;
		/**
		 * ip_white_list
		 */
		@ApiField("ip_white_list")
		private String ipWhiteList;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * pc_homepage
		 */
		@ApiField("pc_homepage")
		private String pcHomepage;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getAppDesc() {
			return this.appDesc;
		}
		public void setAppDesc(String appDesc) {
			this.appDesc = appDesc;
		}
		public String getAppIcon() {
			return this.appIcon;
		}
		public void setAppIcon(String appIcon) {
			this.appIcon = appIcon;
		}
		public String getAppKey() {
			return this.appKey;
		}
		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}
		public String getAppSecret() {
			return this.appSecret;
		}
		public void setAppSecret(String appSecret) {
			this.appSecret = appSecret;
		}
		public String getBizKey() {
			return this.bizKey;
		}
		public void setBizKey(String bizKey) {
			this.bizKey = bizKey;
		}
		public String getHomepage() {
			return this.homepage;
		}
		public void setHomepage(String homepage) {
			this.homepage = homepage;
		}
		public String getIpWhiteList() {
			return this.ipWhiteList;
		}
		public void setIpWhiteList(String ipWhiteList) {
			this.ipWhiteList = ipWhiteList;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPcHomepage() {
			return this.pcHomepage;
		}
		public void setPcHomepage(String pcHomepage) {
			this.pcHomepage = pcHomepage;
		}
	}
	


}
