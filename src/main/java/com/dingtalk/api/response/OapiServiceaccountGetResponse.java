package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.serviceaccount.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceaccountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8192442979413746726L;

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
	 * 服务号详情
	 */
	@ApiField("service_account")
	private ServiceAccountDTO serviceAccount;


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

	public void setServiceAccount(ServiceAccountDTO serviceAccount) {
		this.serviceAccount = serviceAccount;
	}
	public ServiceAccountDTO getServiceAccount( ) {
		return this.serviceAccount;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 服务号详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceAccountDTO extends TaobaoObject {
		private static final long serialVersionUID = 4539918531396777154L;
		/**
		 * 头像图片mediaId
		 */
		@ApiField("avatar_media_id")
		private String avatarMediaId;
		/**
		 * 机器人管理列表中的简介，最多60个字符
		 */
		@ApiField("brief")
		private String brief;
		/**
		 * 机器人id
		 */
		@ApiField("chat_bot_id")
		private String chatBotId;
		/**
		 * 机器人主页中的服务号功能简介，最多200个字符
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 服务号名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 机器人主页中，消息预览图片的mediaId
		 */
		@ApiField("preview_media_id")
		private String previewMediaId;
		/**
		 * 状态，normal-正常，disabled-删除
		 */
		@ApiField("status")
		private String status;
		/**
		 * 服务号的unionid
		 */
		@ApiField("unionid")
		private String unionid;
	
		public String getAvatarMediaId() {
			return this.avatarMediaId;
		}
		public void setAvatarMediaId(String avatarMediaId) {
			this.avatarMediaId = avatarMediaId;
		}
		public String getBrief() {
			return this.brief;
		}
		public void setBrief(String brief) {
			this.brief = brief;
		}
		public String getChatBotId() {
			return this.chatBotId;
		}
		public void setChatBotId(String chatBotId) {
			this.chatBotId = chatBotId;
		}
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPreviewMediaId() {
			return this.previewMediaId;
		}
		public void setPreviewMediaId(String previewMediaId) {
			this.previewMediaId = previewMediaId;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
	}
	


}
