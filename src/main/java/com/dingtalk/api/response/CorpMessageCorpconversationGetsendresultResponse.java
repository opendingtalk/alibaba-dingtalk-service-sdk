package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.getsendresult response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpMessageCorpconversationGetsendresultResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6113265917119324232L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AsyncSendResult extends TaobaoObject {
		private static final long serialVersionUID = 1475681388652913272L;
		/**
		 * 发送失败的用户id
		 */
		@ApiListField("failed_user_id_list")
		@ApiField("string")
		private List<String> failedUserIdList;
		/**
		 * 因发送消息过于频繁或超量而被流控过滤后实际未发送的userid。未被限流的接收者仍会被成功发送。限流规则包括：1、给同一用户发相同内容消息一天仅允许一次；2、如果是ISV接入方式，给同一用户发消息一天不得超过100次；如果是企业接入方式，此上限为500。
		 */
		@ApiListField("forbidden_user_id_list")
		@ApiField("string")
		private List<String> forbiddenUserIdList;
		/**
		 * 无效的部门id
		 */
		@ApiListField("invalid_dept_id_list")
		@ApiField("number")
		private List<Long> invalidDeptIdList;
		/**
		 * 无效的用户id
		 */
		@ApiListField("invalid_user_id_list")
		@ApiField("string")
		private List<String> invalidUserIdList;
		/**
		 * 已读消息的用户id
		 */
		@ApiListField("read_user_id_list")
		@ApiField("string")
		private List<String> readUserIdList;
		/**
		 * 未读消息的用户id
		 */
		@ApiListField("unread_user_id_list")
		@ApiField("string")
		private List<String> unreadUserIdList;
	
		public List<String> getFailedUserIdList() {
			return this.failedUserIdList;
		}
		public void setFailedUserIdList(List<String> failedUserIdList) {
			this.failedUserIdList = failedUserIdList;
		}
		public List<String> getForbiddenUserIdList() {
			return this.forbiddenUserIdList;
		}
		public void setForbiddenUserIdList(List<String> forbiddenUserIdList) {
			this.forbiddenUserIdList = forbiddenUserIdList;
		}
		public List<Long> getInvalidDeptIdList() {
			return this.invalidDeptIdList;
		}
		public void setInvalidDeptIdList(List<Long> invalidDeptIdList) {
			this.invalidDeptIdList = invalidDeptIdList;
		}
		public List<String> getInvalidUserIdList() {
			return this.invalidUserIdList;
		}
		public void setInvalidUserIdList(List<String> invalidUserIdList) {
			this.invalidUserIdList = invalidUserIdList;
		}
		public List<String> getReadUserIdList() {
			return this.readUserIdList;
		}
		public void setReadUserIdList(List<String> readUserIdList) {
			this.readUserIdList = readUserIdList;
		}
		public List<String> getUnreadUserIdList() {
			return this.unreadUserIdList;
		}
		public void setUnreadUserIdList(List<String> unreadUserIdList) {
			this.unreadUserIdList = unreadUserIdList;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7338252539853749195L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("send_result")
		private AsyncSendResult sendResult;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public AsyncSendResult getSendResult() {
			return this.sendResult;
		}
		public void setSendResult(AsyncSendResult sendResult) {
			this.sendResult = sendResult;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
