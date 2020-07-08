package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.message.getmessagestatus response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasMessageGetmessagestatusResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6251493813492883735L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private GetMessageStatusResponse result;


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

	public void setResult(GetMessageStatusResponse result) {
		this.result = result;
	}
	public GetMessageStatusResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetMessageStatusResponse extends TaobaoObject {
		private static final long serialVersionUID = 8853254488632193417L;
		/**
		 * 消息任务执行返回码 0表示成功
		 */
		@ApiField("task_code")
		private Long taskCode;
		/**
		 * 错误信息
		 */
		@ApiField("task_msg")
		private String taskMsg;
		/**
		 * 消息任务执行状态 0：初始化，刚提交时的状态 3：处理中 4：处理完成 5：撤销
		 */
		@ApiField("task_status")
		private Long taskStatus;
	
		public Long getTaskCode() {
			return this.taskCode;
		}
		public void setTaskCode(Long taskCode) {
			this.taskCode = taskCode;
		}
		public String getTaskMsg() {
			return this.taskMsg;
		}
		public void setTaskMsg(String taskMsg) {
			this.taskMsg = taskMsg;
		}
		public Long getTaskStatus() {
			return this.taskStatus;
		}
		public void setTaskStatus(Long taskStatus) {
			this.taskStatus = taskStatus;
		}
	}
	


}
