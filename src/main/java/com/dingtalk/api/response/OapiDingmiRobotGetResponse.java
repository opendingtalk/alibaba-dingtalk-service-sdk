package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.robot.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingmiRobotGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5492657551887615342L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误MSG
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 机器人结果json
	 */
	@ApiField("result")
	private CustomCrowdRobotDTO result;

	/** 
	 * 服务调用结果
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

	public void setResult(CustomCrowdRobotDTO result) {
		this.result = result;
	}
	public CustomCrowdRobotDTO getResult( ) {
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
	 * 机器人结果json
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CustomCrowdRobotDTO extends TaobaoObject {
		private static final long serialVersionUID = 5794539342774646922L;
		/**
		 * 应用appid
		 */
		@ApiField("app_id")
		private String appId;
		/**
		 * 描述
		 */
		@ApiField("brief")
		private String brief;
		/**
		 * 机器人ID
		 */
		@ApiField("chat_bolt_id")
		private String chatBoltId;
		/**
		 * 机器人描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 头像URL
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 机器人名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 预览URL
		 */
		@ApiField("preview_media_url")
		private String previewMediaUrl;
	
		public String getAppId() {
			return this.appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public String getBrief() {
			return this.brief;
		}
		public void setBrief(String brief) {
			this.brief = brief;
		}
		public String getChatBoltId() {
			return this.chatBoltId;
		}
		public void setChatBoltId(String chatBoltId) {
			this.chatBoltId = chatBoltId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getIconUrl() {
			return this.iconUrl;
		}
		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPreviewMediaUrl() {
			return this.previewMediaUrl;
		}
		public void setPreviewMediaUrl(String previewMediaUrl) {
			this.previewMediaUrl = previewMediaUrl;
		}
	}
	


}
