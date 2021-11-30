package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.menu.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmMenuGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2694442845992343821L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private OnlineNavigationModel result;

	/** 
	 * 是否成功
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

	public void setResult(OnlineNavigationModel result) {
		this.result = result;
	}
	public OnlineNavigationModel getResult( ) {
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
	 * 子菜单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OnlineNavigationModel extends TaobaoObject {
		private static final long serialVersionUID = 6859343778821489992L;
		/**
		 * 表单id 如果非表单类菜单，可为空
		 */
		@ApiField("form_uuid")
		private String formUuid;
		/**
		 * 图标地址
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 是否新打开页面 0:不打开 1：新打开
		 */
		@ApiField("is_new")
		private Long isNew;
		/**
		 * 链接地址
		 */
		@ApiField("link_url")
		private String linkUrl;
		/**
		 * 菜单排序序号
		 */
		@ApiField("list_order")
		private Long listOrder;
		/**
		 * 1:隐藏 0：不隐藏
		 */
		@ApiField("mobile_hidden")
		private Long mobileHidden;
		/**
		 * 菜单名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 导航类型：sw_form：表单类到导航 group：分组类  outLinker：链接跳转
		 */
		@ApiField("nav_type")
		private String navType;
		/**
		 * 树形结构 父菜单id
		 */
		@ApiField("parent_id")
		private Long parentId;
		/**
		 * 1:隐藏 0：不隐藏
		 */
		@ApiField("pc_hidden")
		private Long pcHidden;
	
		public String getFormUuid() {
			return this.formUuid;
		}
		public void setFormUuid(String formUuid) {
			this.formUuid = formUuid;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public Long getIsNew() {
			return this.isNew;
		}
		public void setIsNew(Long isNew) {
			this.isNew = isNew;
		}
		public String getLinkUrl() {
			return this.linkUrl;
		}
		public void setLinkUrl(String linkUrl) {
			this.linkUrl = linkUrl;
		}
		public Long getListOrder() {
			return this.listOrder;
		}
		public void setListOrder(Long listOrder) {
			this.listOrder = listOrder;
		}
		public Long getMobileHidden() {
			return this.mobileHidden;
		}
		public void setMobileHidden(Long mobileHidden) {
			this.mobileHidden = mobileHidden;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNavType() {
			return this.navType;
		}
		public void setNavType(String navType) {
			this.navType = navType;
		}
		public Long getParentId() {
			return this.parentId;
		}
		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}
		public Long getPcHidden() {
			return this.pcHidden;
		}
		public void setPcHidden(Long pcHidden) {
			this.pcHidden = pcHidden;
		}
	}
	


}
