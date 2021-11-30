package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.processinstance.execute response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkBpmsProcessinstanceExecuteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8179274668332214844L;

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
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4363426649558799815L;
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
		 * success
		 */
		@ApiField("is_success")
		private Boolean isSuccess;
		/**
		 * 操作结果，true为通过，false为失败
		 */
		@ApiField("result")
		private Boolean result;
	
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
		public Boolean getIsSuccess() {
			return this.isSuccess;
		}
		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
		public Boolean getResult() {
			return this.result;
		}
		public void setResult(Boolean result) {
			this.result = result;
		}
	}
	


}
