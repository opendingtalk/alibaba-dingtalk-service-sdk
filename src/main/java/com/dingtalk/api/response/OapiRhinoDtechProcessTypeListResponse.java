package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.dtech.process.type.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDtechProcessTypeListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5242726742573642641L;

	/** 
	 * 错误码
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
	@ApiListField("model")
	@ApiField("model")
	private List<Model> model;

	/** 
	 * 是否成功
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

	public void setModel(List<Model> model) {
		this.model = model;
	}
	public List<Model> getModel( ) {
		return this.model;
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
	 * model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Model extends TaobaoObject {
		private static final long serialVersionUID = 3349227523849568765L;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 工序能力编码
		 */
		@ApiField("process_type_code")
		private String processTypeCode;
		/**
		 * 工序能力名称
		 */
		@ApiField("process_type_name")
		private String processTypeName;
		/**
		 * 春晓工厂id
		 */
		@ApiField("source_factory_id")
		private String sourceFactoryId;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getProcessTypeCode() {
			return this.processTypeCode;
		}
		public void setProcessTypeCode(String processTypeCode) {
			this.processTypeCode = processTypeCode;
		}
		public String getProcessTypeName() {
			return this.processTypeName;
		}
		public void setProcessTypeName(String processTypeName) {
			this.processTypeName = processTypeName;
		}
		public String getSourceFactoryId() {
			return this.sourceFactoryId;
		}
		public void setSourceFactoryId(String sourceFactoryId) {
			this.sourceFactoryId = sourceFactoryId;
		}
	}
	


}
