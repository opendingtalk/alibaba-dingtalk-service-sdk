package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.app.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmAppGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8288435379565191247L;

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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetCrmMicroAppResponse extends TaobaoObject {
		private static final long serialVersionUID = 5471334489435794435L;
		/**
		 * 应用AgentId
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 微应用描述
		 */
		@ApiField("app_desc")
		private String appDesc;
		/**
		 * mediaId
		 */
		@ApiField("app_icon")
		private String appIcon;
		/**
		 * app账号
		 */
		@ApiField("app_key")
		private String appKey;
		/**
		 * app秘钥
		 */
		@ApiField("app_secret")
		private String appSecret;
		/**
		 * 业务自定义扩展key
		 */
		@ApiField("biz_key")
		private String bizKey;
		/**
		 * 移动端地址
		 */
		@ApiField("homepage")
		private String homepage;
		/**
		 * ip_white_list
		 */
		@ApiField("ip_white_list")
		private String ipWhiteList;
		/**
		 * 微应用名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * pc端地址
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
