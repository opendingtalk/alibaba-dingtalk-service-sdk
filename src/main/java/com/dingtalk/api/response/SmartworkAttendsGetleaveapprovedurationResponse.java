package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.attends.getleaveapproveduration response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkAttendsGetleaveapprovedurationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8752834565427728727L;

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
	public static class ApproveDurationForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 7428647269119716245L;
		/**
		 * 请假时长（单位分钟）
		 */
		@ApiField("duration_in_minutes")
		private Long durationInMinutes;
	
		public Long getDurationInMinutes() {
			return this.durationInMinutes;
		}
		public void setDurationInMinutes(Long durationInMinutes) {
			this.durationInMinutes = durationInMinutes;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3787898262733484533L;
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
		@ApiField("result")
		private ApproveDurationForTopVo result;
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
		public ApproveDurationForTopVo getResult() {
			return this.result;
		}
		public void setResult(ApproveDurationForTopVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
