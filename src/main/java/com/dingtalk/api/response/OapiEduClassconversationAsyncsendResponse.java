package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.classconversation.asyncsend response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduClassconversationAsyncsendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5789218632269258484L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 系统错误
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * response
	 */
	@ApiField("result")
	private TopSendConversationMsgResponse result;

	/** 
	 * 调用是否成功
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

	public void setResult(TopSendConversationMsgResponse result) {
		this.result = result;
	}
	public TopSendConversationMsgResponse getResult( ) {
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
	 * response
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopSendConversationMsgResponse extends TaobaoObject {
		private static final long serialVersionUID = 3483959619886916159L;
		/**
		 * 异步任务id
		 */
		@ApiField("task_id")
		private String taskId;
	
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}
	


}
