package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.globaldevicemodel.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDeviceGlobaldevicemodelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2265896213768446472L;

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
	 * 扩展信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回数据
	 */
	@ApiListField("model")
	@ApiField("simple_model_info_response")
	private List<SimpleModelInfoResponse> model;

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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<SimpleModelInfoResponse> model) {
		this.model = model;
	}
	public List<SimpleModelInfoResponse> getModel( ) {
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
	 * 返回数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SimpleModelInfoResponse extends TaobaoObject {
		private static final long serialVersionUID = 1121561183394458199L;
		/**
		 * 设备类型名称
		 */
		@ApiField("device_type_name")
		private String deviceTypeName;
		/**
		 * 行业设备型号
		 */
		@ApiField("global_model_id")
		private String globalModelId;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * modelCode
		 */
		@ApiField("model_code")
		private String modelCode;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 设备种类id
		 */
		@ApiField("process_category_id")
		private Long processCategoryId;
		/**
		 * 设备种类名称
		 */
		@ApiField("process_category_name")
		private String processCategoryName;
		/**
		 * 是否生产设备
		 */
		@ApiField("production")
		private Boolean production;
		/**
		 * 子设备类型code
		 */
		@ApiField("sub_type_code")
		private String subTypeCode;
		/**
		 * 设备类型
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 设备类型code
		 */
		@ApiField("type_code")
		private String typeCode;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
	
		public String getDeviceTypeName() {
			return this.deviceTypeName;
		}
		public void setDeviceTypeName(String deviceTypeName) {
			this.deviceTypeName = deviceTypeName;
		}
		public String getGlobalModelId() {
			return this.globalModelId;
		}
		public void setGlobalModelId(String globalModelId) {
			this.globalModelId = globalModelId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getModelCode() {
			return this.modelCode;
		}
		public void setModelCode(String modelCode) {
			this.modelCode = modelCode;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getProcessCategoryId() {
			return this.processCategoryId;
		}
		public void setProcessCategoryId(Long processCategoryId) {
			this.processCategoryId = processCategoryId;
		}
		public String getProcessCategoryName() {
			return this.processCategoryName;
		}
		public void setProcessCategoryName(String processCategoryName) {
			this.processCategoryName = processCategoryName;
		}
		public Boolean getProduction() {
			return this.production;
		}
		public void setProduction(Boolean production) {
			this.production = production;
		}
		public String getSubTypeCode() {
			return this.subTypeCode;
		}
		public void setSubTypeCode(String subTypeCode) {
			this.subTypeCode = subTypeCode;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getTypeCode() {
			return this.typeCode;
		}
		public void setTypeCode(String typeCode) {
			this.typeCode = typeCode;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	


}
