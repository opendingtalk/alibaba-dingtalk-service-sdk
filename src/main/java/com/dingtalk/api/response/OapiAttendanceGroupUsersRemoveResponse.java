package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.users.remove response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupUsersRemoveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5186186676473742126L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private Result result;

	/** 
	 * 是否成功
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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
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
	 * 错误列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ErrorInfo extends TaobaoObject {
		private static final long serialVersionUID = 2498417196543941454L;
		/**
		 * 错误码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 失败列表
		 */
		@ApiListField("failure_list")
		@ApiField("string")
		private List<String> failureList;
		/**
		 * 错误描述
		 */
		@ApiField("msg")
		private String msg;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public List<String> getFailureList() {
			return this.failureList;
		}
		public void setFailureList(List<String> failureList) {
			this.failureList = failureList;
		}
		public String getMsg() {
			return this.msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 5176113447915671466L;
		/**
		 * 错误列表
		 */
		@ApiListField("error_info_list")
		@ApiField("error_info")
		private List<ErrorInfo> errorInfoList;
		/**
		 * 成功列表
		 */
		@ApiListField("success_list")
		@ApiField("string")
		private List<String> successList;
	
		public List<ErrorInfo> getErrorInfoList() {
			return this.errorInfoList;
		}
		public void setErrorInfoList(List<ErrorInfo> errorInfoList) {
			this.errorInfoList = errorInfoList;
		}
		public List<String> getSuccessList() {
			return this.successList;
		}
		public void setSuccessList(List<String> successList) {
			this.successList = successList;
		}
	}
	


}
