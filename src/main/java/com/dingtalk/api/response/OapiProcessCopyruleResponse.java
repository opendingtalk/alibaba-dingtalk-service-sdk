package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.copyrule response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessCopyruleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4258323445478691899L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private ProcessTopVo result;


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

	public void setResult(ProcessTopVo result) {
		this.result = result;
	}
	public ProcessTopVo getResult( ) {
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
	public static class ProcessTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5239519373192983682L;
		/**
		 * 业务分类标识
		 */
		@ApiField("biz_category_id")
		private String bizCategoryId;
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 表单内容
		 */
		@ApiField("form_content")
		private String formContent;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 审批流的唯一码
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
