package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.openservice.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOpenserviceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3273534795349197612L;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	
	
	/**
	 * model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 3798666578611122416L;
		/**
		 * 应用
		 */
		@ApiField("app")
		private String app;
		/**
		 * 编码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 创建人
		 */
		@ApiField("creator")
		private String creator;
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private String gmtCreate;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private String gmtModified;
		/**
		 * ID
		 */
		@ApiField("id")
		private String id;
		/**
		 * 修改人
		 */
		@ApiField("modifier")
		private String modifier;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 类型
		 */
		@ApiField("type")
		private String type;
	
		public String getApp() {
			return this.app;
		}
		public void setApp(String app) {
			this.app = app;
		}
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getCreator() {
			return this.creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getModifier() {
			return this.modifier;
		}
		public void setModifier(String modifier) {
			this.modifier = modifier;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 接口返回model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 6879289195278654889L;
		/**
		 * 结果编码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * message
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * model
		 */
		@ApiField("model")
		private Model model;
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
		public Model getModel() {
			return this.model;
		}
		public void setModel(Model model) {
			this.model = model;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
