package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.sendmock response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpMessageCorpconversationSendmockResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4487143313598729181L;

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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AsyncSendResult extends TaobaoObject {
		private static final long serialVersionUID = 2176327338815825519L;
		/**
		 * failedUserIdList
		 */
		@ApiListField("failed_user_id_list")
		@ApiField("string")
		private List<String> failedUserIdList;
		/**
		 * forbiddenUserIdList
		 */
		@ApiListField("forbidden_user_id_list")
		@ApiField("string")
		private List<String> forbiddenUserIdList;
		/**
		 * invalidDeptIdList
		 */
		@ApiListField("invalid_dept_id_list")
		@ApiField("number")
		private List<Long> invalidDeptIdList;
		/**
		 * invalidUserIdList
		 */
		@ApiListField("invalid_user_id_list")
		@ApiField("string")
		private List<String> invalidUserIdList;
		/**
		 * readUserIdList
		 */
		@ApiListField("read_user_id_list")
		@ApiField("string")
		private List<String> readUserIdList;
		/**
		 * unreadUserIdList
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
		private static final long serialVersionUID = 4551929439584732683L;
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
		 * 返回结果
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
