package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: dingtalk.hammer.bi.oneservice.aaa response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DingtalkHammerBiOneserviceAaaResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2383797347243317578L;

	/** 
	 * alinkappserver系统返回的通用结果类
	 */
	@ApiField("result")
	private ServiceResult result;


	public void setResult(ServiceResult result) {
		this.result = result;
	}
	public ServiceResult getResult( ) {
		return this.result;
	}
	
	/**
 * alinkappserver系统返回的通用结果类
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ServiceResult extends TaobaoObject {

	private static final long serialVersionUID = 3652787964595798982L;

	/**
		 * f
		 */
		@ApiListField("arguments")
		@ApiField("json")
		private List<String> arguments;
		/**
		 * f
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * f
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * f
		 */
		@ApiField("result")
		private String result;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	

	public List<String> getArguments() {
			return this.arguments;
		}
		public void setArguments(List<String> arguments) {
			this.arguments = arguments;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public void setResultString(String result) {
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
