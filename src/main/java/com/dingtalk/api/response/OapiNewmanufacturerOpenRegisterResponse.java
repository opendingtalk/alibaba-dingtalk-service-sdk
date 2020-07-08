package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.newmanufacturer.open.register response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiNewmanufacturerOpenRegisterResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2212396881712477234L;

	/** 
	 * 1
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
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RegisterResultDto extends TaobaoObject {
		private static final long serialVersionUID = 7622228491516731243L;
		/**
		 * 1
		 */
		@ApiField("description")
		private String description;
		/**
		 * 1
		 */
		@ApiField("id")
		private String id;
	
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4818214854429898592L;
		/**
		 * 1
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 1
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 1
		 */
		@ApiField("result")
		private RegisterResultDto result;
		/**
		 * 1
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
		public RegisterResultDto getResult() {
			return this.result;
		}
		public void setResult(RegisterResultDto result) {
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
