package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.copy response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessCopyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2316293728455359566L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private ProcessVo result;


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

	public void setResult(ProcessVo result) {
		this.result = result;
	}
	public ProcessVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessVo extends TaobaoObject {
		private static final long serialVersionUID = 2466192425551547946L;
		/**
		 * bizCategoryId
		 */
		@ApiField("biz_category_id")
		private String bizCategoryId;
		/**
		 * description
		 */
		@ApiField("description")
		private String description;
		/**
		 * formContent
		 */
		@ApiField("form_content")
		private String formContent;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * processCode
		 */
		@ApiField("process_code")
		private String processCode;
	
		public String getBizCategoryId() {
			return this.bizCategoryId;
		}
		public void setBizCategoryId(String bizCategoryId) {
			this.bizCategoryId = bizCategoryId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getFormContent() {
			return this.formContent;
		}
		public void setFormContent(String formContent) {
			this.formContent = formContent;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	


}
