package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.uniquecode.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDeviceUniquecodeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1576654974194734518L;

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
	@ApiField("model")
	private MosDeviceTenantDto model;

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

	public void setModel(MosDeviceTenantDto model) {
		this.model = model;
	}
	public MosDeviceTenantDto getModel( ) {
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
	public static class MosDeviceTenantDto extends TaobaoObject {
		private static final long serialVersionUID = 4843299452521395573L;
		/**
		 * 属性值
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 是否已删除
		 */
		@ApiField("deleted")
		private Boolean deleted;
		/**
		 * 行业设备型号
		 */
		@ApiField("global_model_id")
		private String globalModelId;
		/**
		 * 设备id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 设备instanceId
		 */
		@ApiField("instance_id")
		private String instanceId;
		/**
		 * 行业设备型号id
		 */
		@ApiField("model_id")
		private Long modelId;
		/**
		 * 厂商设备型号id
		 */
		@ApiField("supplier_model_id")
		private Long supplierModelId;
		/**
		 * 厂商SN
		 */
		@ApiField("supplier_sn")
		private String supplierSn;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
	
		public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public void setAttributesString(String attributes) {
			this.attributes = attributes;
		}
		
		public Boolean getDeleted() {
			return this.deleted;
		}
		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
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
		public String getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
		public Long getModelId() {
			return this.modelId;
		}
		public void setModelId(Long modelId) {
			this.modelId = modelId;
		}
		public Long getSupplierModelId() {
			return this.supplierModelId;
		}
		public void setSupplierModelId(Long supplierModelId) {
			this.supplierModelId = supplierModelId;
		}
		public String getSupplierSn() {
			return this.supplierSn;
		}
		public void setSupplierSn(String supplierSn) {
			this.supplierSn = supplierSn;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	


}
