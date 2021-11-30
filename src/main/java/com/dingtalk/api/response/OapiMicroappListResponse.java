package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3668883175146556228L;

	/** 
	 * appList
	 */
	@ApiListField("appList")
	@ApiField("applist")
	private List<Applist> appList;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setAppList(List<Applist> appList) {
		this.appList = appList;
	}
	public List<Applist> getAppList( ) {
		return this.appList;
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
	
	/**
	 * appList
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Applist extends TaobaoObject {
		private static final long serialVersionUID = 8823934424791671946L;
		/**
		 * 微应用实例化id
		 */
		@ApiField("agentId")
		private Long agentId;
		/**
		 * 微应用描述
		 */
		@ApiField("appDesc")
		private String appDesc;
		/**
		 * 微应用图标
		 */
		@ApiField("appIcon")
		private String appIcon;
		/**
		 * 三方应用id
		 */
		@ApiField("appId")
		private Long appId;
		/**
		 * 微应用状态，1表示启用，0表示停用
		 */
		@ApiField("appStatus")
		private Long appStatus;
		/**
		 * 微应用的移动端主页
		 */
		@ApiField("homepageLink")
		private String homepageLink;
		/**
		 * 表示是否是自建微应用
		 */
		@ApiField("isSelf")
		private Boolean isSelf;
		/**
		 * 微应用名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 微应用的OA后台管理主页
		 */
		@ApiField("ompLink")
		private String ompLink;
		/**
		 * 微应用的pc端主页
		 */
		@ApiField("pcHomepageLink")
		private String pcHomepageLink;
	
		public Long getAgentId() {
			return this.agentId;
		}
		public void setAgentId(Long agentId) {
			this.agentId = agentId;
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
		public Long getAppId() {
			return this.appId;
		}
		public void setAppId(Long appId) {
			this.appId = appId;
		}
		public Long getAppStatus() {
			return this.appStatus;
		}
		public void setAppStatus(Long appStatus) {
			this.appStatus = appStatus;
		}
		public String getHomepageLink() {
			return this.homepageLink;
		}
		public void setHomepageLink(String homepageLink) {
			this.homepageLink = homepageLink;
		}
		public Boolean getIsSelf() {
			return this.isSelf;
		}
		public void setIsSelf(Boolean isSelf) {
			this.isSelf = isSelf;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOmpLink() {
			return this.ompLink;
		}
		public void setOmpLink(String ompLink) {
			this.ompLink = ompLink;
		}
		public String getPcHomepageLink() {
			return this.pcHomepageLink;
		}
		public void setPcHomepageLink(String pcHomepageLink) {
			this.pcHomepageLink = pcHomepageLink;
		}
	}
	


}
