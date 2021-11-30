package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.group.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingmiGroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2473766961222173418L;

	/** 
	 * 结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 结果码消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private GroupChatDataResult result;

	/** 
	 * 服务是否成功
	 */
	@ApiField("success")
	private String success;


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

	public void setResult(GroupChatDataResult result) {
		this.result = result;
	}
	public GroupChatDataResult getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 活跃数据对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberChatData extends TaobaoObject {
		private static final long serialVersionUID = 8155627644669771613L;
		/**
		 * 聊天记录数
		 */
		@ApiField("chat_cnt")
		private String chatCnt;
		/**
		 * 客户类型
		 */
		@ApiField("custom_flag")
		private String customFlag;
		/**
		 * 发送者staffid
		 */
		@ApiField("sender_staffid")
		private String senderStaffid;
	
		public String getChatCnt() {
			return this.chatCnt;
		}
		public void setChatCnt(String chatCnt) {
			this.chatCnt = chatCnt;
		}
		public String getCustomFlag() {
			return this.customFlag;
		}
		public void setCustomFlag(String customFlag) {
			this.customFlag = customFlag;
		}
		public String getSenderStaffid() {
			return this.senderStaffid;
		}
		public void setSenderStaffid(String senderStaffid) {
			this.senderStaffid = senderStaffid;
		}
	}
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupChatDataResult extends TaobaoObject {
		private static final long serialVersionUID = 4799776245654323863L;
		/**
		 * 是否来自缓存
		 */
		@ApiField("from_cache")
		private Boolean fromCache;
		/**
		 * 是否被限流
		 */
		@ApiField("is_block")
		private Boolean isBlock;
		/**
		 * 活跃数据对象
		 */
		@ApiListField("rawset")
		@ApiField("group_member_chat_data")
		private List<GroupMemberChatData> rawset;
		/**
		 * 执行时间
		 */
		@ApiField("runtime")
		private Long runtime;
	
		public Boolean getFromCache() {
			return this.fromCache;
		}
		public void setFromCache(Boolean fromCache) {
			this.fromCache = fromCache;
		}
		public Boolean getIsBlock() {
			return this.isBlock;
		}
		public void setIsBlock(Boolean isBlock) {
			this.isBlock = isBlock;
		}
		public List<GroupMemberChatData> getRawset() {
			return this.rawset;
		}
		public void setRawset(List<GroupMemberChatData> rawset) {
			this.rawset = rawset;
		}
		public Long getRuntime() {
			return this.runtime;
		}
		public void setRuntime(Long runtime) {
			this.runtime = runtime;
		}
	}
	


}
