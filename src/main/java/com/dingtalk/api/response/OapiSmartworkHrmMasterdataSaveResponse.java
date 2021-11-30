package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.masterdata.save response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmMasterdataSaveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5146865648842454878L;

	/** 
	 * 参数返回值
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
	 * 参数返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2453869416897131679L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误描述信息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 返回结果
		 */
		@ApiField("result")
		private Boolean result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public Boolean getResult() {
			return this.result;
		}
		public void setResult(Boolean result) {
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
