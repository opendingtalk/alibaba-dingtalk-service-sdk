package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.baseinfo.relateddevice.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoDeviceBaseinfoRelateddeviceListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6877958447179759542L;

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
	@ApiField("related_device_resp")
	private List<RelatedDeviceResp> model;

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

	public void setModel(List<RelatedDeviceResp> model) {
		this.model = model;
	}
	public List<RelatedDeviceResp> getModel( ) {
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
	public static class RelatedDeviceResp extends TaobaoObject {
		private static final long serialVersionUID = 7649533647594225631L;
		/**
		 * 占地面积
		 */
		@ApiField("area")
		private Long area;
		/**
		 * 设备类型code
		 */
		@ApiField("device_type_code")
		private String deviceTypeCode;
		/**
		 * 行业设备型号
		 */
		@ApiField("global_model_id")
		private String globalModelId;
		/**
		 * 是否iot能力
		 */
		@ApiField("has_iot_ability")
		private Boolean hasIotAbility;
		/**
		 * 设备id
		 */
		@ApiField("instance_id")
		private Long instanceId;
		/**
		 * 行业设备型号名称
		 */
		@ApiField("model_name")
		private String modelName;
		/**
		 * 是否在线
		 */
		@ApiField("online")
		private Boolean online;
		/**
		 * 设备种类
		 */
		@ApiField("process_category_id")
		private Long processCategoryId;
		/**
		 * 是否生产
		 */
		@ApiField("production")
		private Boolean production;
		/**
		 * 设备子类型
		 */
		@ApiField("sub_device_type_code")
		private String subDeviceTypeCode;
		/**
		 * uniqueCode
		 */
		@ApiField("unique_code")
		private String uniqueCode;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
	
		public Long getArea() {
			return this.area;
		}
		public void setArea(Long area) {
			this.area = area;
		}
		public String getDeviceTypeCode() {
			return this.deviceTypeCode;
		}
		public void setDeviceTypeCode(String deviceTypeCode) {
			this.deviceTypeCode = deviceTypeCode;
		}
		public String getGlobalModelId() {
			return this.globalModelId;
		}
		public void setGlobalModelId(String globalModelId) {
			this.globalModelId = globalModelId;
		}
		public Boolean getHasIotAbility() {
			return this.hasIotAbility;
		}
		public void setHasIotAbility(Boolean hasIotAbility) {
			this.hasIotAbility = hasIotAbility;
		}
		public Long getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}
		public String getModelName() {
			return this.modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public Boolean getOnline() {
			return this.online;
		}
		public void setOnline(Boolean online) {
			this.online = online;
		}
		public Long getProcessCategoryId() {
			return this.processCategoryId;
		}
		public void setProcessCategoryId(Long processCategoryId) {
			this.processCategoryId = processCategoryId;
		}
		public Boolean getProduction() {
			return this.production;
		}
		public void setProduction(Boolean production) {
			this.production = production;
		}
		public String getSubDeviceTypeCode() {
			return this.subDeviceTypeCode;
		}
		public void setSubDeviceTypeCode(String subDeviceTypeCode) {
			this.subDeviceTypeCode = subDeviceTypeCode;
		}
		public String getUniqueCode() {
			return this.uniqueCode;
		}
		public void setUniqueCode(String uniqueCode) {
			this.uniqueCode = uniqueCode;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	


}
