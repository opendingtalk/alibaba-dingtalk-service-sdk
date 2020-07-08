package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.chat.summary.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavChatSummaryGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1689671226195773581L;

	/** 
	 * 结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 提示信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private ImSummaryResponse result;


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

	public void setResult(ImSummaryResponse result) {
		this.result = result;
	}
	public ImSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ImSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 6853573298663327515L;
		/**
		 * 活跃群数（当日）
		 */
		@ApiField("active_group_count")
		private Long activeGroupCount;
		/**
		 * 单聊用户数
		 */
		@ApiField("chat_user_count")
		private Long chatUserCount;
		/**
		 * 群聊用户数
		 */
		@ApiField("group_chat_user_count")
		private Long groupChatUserCount;
		/**
		 * 总群数
		 */
		@ApiField("group_count")
		private Long groupCount;
		/**
		 * 消息数
		 */
		@ApiField("message_total_count")
		private Long messageTotalCount;
		/**
		 * 聊天用户数
		 */
		@ApiField("message_user_count")
		private Long messageUserCount;
		/**
		 * 新增群数（当日）
		 */
		@ApiField("new_group_count")
		private Long newGroupCount;
	
		public Long getActiveGroupCount() {
			return this.activeGroupCount;
		}
		public void setActiveGroupCount(Long activeGroupCount) {
			this.activeGroupCount = activeGroupCount;
		}
		public Long getChatUserCount() {
			return this.chatUserCount;
		}
		public void setChatUserCount(Long chatUserCount) {
			this.chatUserCount = chatUserCount;
		}
		public Long getGroupChatUserCount() {
			return this.groupChatUserCount;
		}
		public void setGroupChatUserCount(Long groupChatUserCount) {
			this.groupChatUserCount = groupChatUserCount;
		}
		public Long getGroupCount() {
			return this.groupCount;
		}
		public void setGroupCount(Long groupCount) {
			this.groupCount = groupCount;
		}
		public Long getMessageTotalCount() {
			return this.messageTotalCount;
		}
		public void setMessageTotalCount(Long messageTotalCount) {
			this.messageTotalCount = messageTotalCount;
		}
		public Long getMessageUserCount() {
			return this.messageUserCount;
		}
		public void setMessageUserCount(Long messageUserCount) {
			this.messageUserCount = messageUserCount;
		}
		public Long getNewGroupCount() {
			return this.newGroupCount;
		}
		public void setNewGroupCount(Long newGroupCount) {
			this.newGroupCount = newGroupCount;
		}
	}
	


}
