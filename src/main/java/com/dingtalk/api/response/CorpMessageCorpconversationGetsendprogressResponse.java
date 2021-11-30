package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.getsendprogress response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpMessageCorpconversationGetsendprogressResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3885535875197792161L;

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
	public static class AsyncSendProgress extends TaobaoObject {
		private static final long serialVersionUID = 5219252753923275315L;
		/**
		 * 取值 0-100，表示处理的百分比
		 */
		@ApiField("progress_in_percent")
		private Long progressInPercent;
		/**
		 * 任务执行状态,0=未开始,1=处理中,2=处理完毕
		 */
		@ApiField("status")
		private Long status;
	
		public Long getProgressInPercent() {
			return this.progressInPercent;
		}
		public void setProgressInPercent(Long progressInPercent) {
			this.progressInPercent = progressInPercent;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2793771261584877173L;
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
		@ApiField("progress")
		private AsyncSendProgress progress;
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
		public AsyncSendProgress getProgress() {
			return this.progress;
		}
		public void setProgress(AsyncSendProgress progress) {
			this.progress = progress;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
