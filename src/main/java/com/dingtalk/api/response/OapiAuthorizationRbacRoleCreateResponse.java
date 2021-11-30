package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAuthorizationRbacRoleCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2757365561271141936L;

	/** 
	 * 系统自动生成
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
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7353867415482236915L;
		/**
		 * errcode
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * erromsg
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 管理组id
		 */
		@ApiField("result")
		private String result;
		/**
		 * 请求状态
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
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
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
