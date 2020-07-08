package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.openservice.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOpenserviceQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3379298513394959933L;

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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 8765771612318332214L;
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
		private Date gmtCreate;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * ID
		 */
		@ApiField("id")
		private Long id;
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
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
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
		private static final long serialVersionUID = 8445865968122147149L;
		/**
		 * code
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * message
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 返回结果
		 */
		@ApiListField("model")
		@ApiField("model")
		private List<Model> model;
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
		public List<Model> getModel() {
			return this.model;
		}
		public void setModel(List<Model> model) {
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
