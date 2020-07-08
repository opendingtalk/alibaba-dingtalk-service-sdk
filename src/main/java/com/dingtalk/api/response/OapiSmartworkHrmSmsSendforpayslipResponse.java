package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.sms.sendforpayslip response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmSmsSendforpayslipResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6853671354399517692L;

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
	 * 是否成功
	 */
	@ApiField("result")
	private SendSmsMessageResult result;

	/** 
	 * 调用结果
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

	public void setResult(SendSmsMessageResult result) {
		this.result = result;
	}
	public SendSmsMessageResult getResult( ) {
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
	 * 是否成功
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SendSmsMessageResult extends TaobaoObject {
		private static final long serialVersionUID = 6825468447354245821L;
		/**
		 * 失败的userids
		 */
		@ApiListField("failed_userid_list")
		@ApiField("string")
		private List<String> failedUseridList;
		/**
		 * 无效的userids
		 */
		@ApiListField("invalid_userid_list")
		@ApiField("string")
		private List<String> invalidUseridList;
		/**
		 * 成功的userids
		 */
		@ApiListField("success_userid_list")
		@ApiField("string")
		private List<String> successUseridList;
	
		public List<String> getFailedUseridList() {
			return this.failedUseridList;
		}
		public void setFailedUseridList(List<String> failedUseridList) {
			this.failedUseridList = failedUseridList;
		}
		public List<String> getInvalidUseridList() {
			return this.invalidUseridList;
		}
		public void setInvalidUseridList(List<String> invalidUseridList) {
			this.invalidUseridList = invalidUseridList;
		}
		public List<String> getSuccessUseridList() {
			return this.successUseridList;
		}
		public void setSuccessUseridList(List<String> successUseridList) {
			this.successUseridList = successUseridList;
		}
	}
	


}
