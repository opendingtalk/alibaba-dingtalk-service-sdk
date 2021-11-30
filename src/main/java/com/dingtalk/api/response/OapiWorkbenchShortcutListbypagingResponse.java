package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workbench.shortcut.listbypaging response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkbenchShortcutListbypagingResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8283226131497155871L;

	/** 
	 * 服务结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务结果描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private IsvOrgShortcutListDTO result;


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

	public void setResult(IsvOrgShortcutListDTO result) {
		this.result = result;
	}
	public IsvOrgShortcutListDTO getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 企业下指定应用已添加快捷方式列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvOrgShortcutDTO extends TaobaoObject {
		private static final long serialVersionUID = 1725223733486234832L;
		/**
		 * 业务单号,系统间交互唯一流水号
		 */
		@ApiField("biz_no")
		private String bizNo;
		/**
		 * 快捷方式图标
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 快捷方式名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * PC端快捷方式地址
		 */
		@ApiField("pc_shortcut_uri")
		private String pcShortcutUri;
		/**
		 * 移动端快捷方式地址(默认地址)
		 */
		@ApiField("shortcut_uri")
		private String shortcutUri;
	
		public String getBizNo() {
			return this.bizNo;
		}
		public void setBizNo(String bizNo) {
			this.bizNo = bizNo;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPcShortcutUri() {
			return this.pcShortcutUri;
		}
		public void setPcShortcutUri(String pcShortcutUri) {
			this.pcShortcutUri = pcShortcutUri;
		}
		public String getShortcutUri() {
			return this.shortcutUri;
		}
		public void setShortcutUri(String shortcutUri) {
			this.shortcutUri = shortcutUri;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvOrgShortcutListDTO extends TaobaoObject {
		private static final long serialVersionUID = 8812511548582672659L;
		/**
		 * 企业下指定应用已添加快捷方式列表
		 */
		@ApiListField("shortcut_list")
		@ApiField("isv_org_shortcut_d_t_o")
		private List<IsvOrgShortcutDTO> shortcutList;
	
		public List<IsvOrgShortcutDTO> getShortcutList() {
			return this.shortcutList;
		}
		public void setShortcutList(List<IsvOrgShortcutDTO> shortcutList) {
			this.shortcutList = shortcutList;
		}
	}
	


}
