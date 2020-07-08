package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.baseinfo.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessBaseinfoListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4247148319252828871L;

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
	 * 模板对象列表
	 */
	@ApiListField("result")
	@ApiField("process_top_vo")
	private List<ProcessTopVo> result;

	/** 
	 * 成功标识
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

	public void setResult(List<ProcessTopVo> result) {
		this.result = result;
	}
	public List<ProcessTopVo> getResult( ) {
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
	 * 模板对象列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5728255896316721215L;
		/**
		 * 业务套件bizType
		 */
		@ApiField("biz_category_id")
		private String bizCategoryId;
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 管理员userId列表
		 */
		@ApiListField("manager_user_ids")
		@ApiField("string")
		private List<String> managerUserIds;
		/**
		 * 模板名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否开启自定义打印
		 */
		@ApiField("open_custom_print")
		private Boolean openCustomPrint;
		/**
		 * 模板code
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
		public List<String> getManagerUserIds() {
			return this.managerUserIds;
		}
		public void setManagerUserIds(List<String> managerUserIds) {
			this.managerUserIds = managerUserIds;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getOpenCustomPrint() {
			return this.openCustomPrint;
		}
		public void setOpenCustomPrint(Boolean openCustomPrint) {
			this.openCustomPrint = openCustomPrint;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	


}
