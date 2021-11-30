package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.servicegroup.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImChatServicegroupQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5853894649647953921L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ServiceGroupQueryResponse result;

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

	public void setResult(ServiceGroupQueryResponse result) {
		this.result = result;
	}
	public ServiceGroupQueryResponse getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceGroupQueryResponse extends TaobaoObject {
		private static final long serialVersionUID = 8271391388287357981L;
		/**
		 * 管理员数量
		 */
		@ApiField("admin_count")
		private Long adminCount;
		/**
		 * 全部成员数量
		 */
		@ApiField("member_count")
		private Long memberCount;
		/**
		 * 开放的会话id
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
		/**
		 * 群标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 群链接
		 */
		@ApiField("url")
		private String url;
	
		public Long getAdminCount() {
			return this.adminCount;
		}
		public void setAdminCount(Long adminCount) {
			this.adminCount = adminCount;
		}
		public Long getMemberCount() {
			return this.memberCount;
		}
		public void setMemberCount(Long memberCount) {
			this.memberCount = memberCount;
		}
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
