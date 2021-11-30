package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.calendar.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpCalendarCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3611993653733867454L;

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
	public static class CorpCalendarCreateResult extends TaobaoObject {
		private static final long serialVersionUID = 5872888795268745697L;
		/**
		 * dingtalkCalendarId
		 */
		@ApiField("dingtalk_calendar_id")
		private String dingtalkCalendarId;
		/**
		 * invalidUser
		 */
		@ApiListField("invalid_userids")
		@ApiField("string")
		private List<String> invalidUserids;
	
		public String getDingtalkCalendarId() {
			return this.dingtalkCalendarId;
		}
		public void setDingtalkCalendarId(String dingtalkCalendarId) {
			this.dingtalkCalendarId = dingtalkCalendarId;
		}
		public List<String> getInvalidUserids() {
			return this.invalidUserids;
		}
		public void setInvalidUserids(List<String> invalidUserids) {
			this.invalidUserids = invalidUserids;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 1187738935452728643L;
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
		private CorpCalendarCreateResult result;
		/**
		 * 创建结果
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
		public CorpCalendarCreateResult getResult() {
			return this.result;
		}
		public void setResult(CorpCalendarCreateResult result) {
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
