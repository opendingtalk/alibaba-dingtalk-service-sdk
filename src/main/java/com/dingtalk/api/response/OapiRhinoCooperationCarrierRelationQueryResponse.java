package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.cooperation.carrier.relation.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoCooperationCarrierRelationQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2592992436447722615L;

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
	@ApiField("carrier_dto")
	private List<CarrierDto> model;

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

	public void setModel(List<CarrierDto> model) {
		this.model = model;
	}
	public List<CarrierDto> getModel( ) {
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
	public static class CarrierDto extends TaobaoObject {
		private static final long serialVersionUID = 6142894375937255964L;
		/**
		 * 载具编号
		 */
		@ApiField("carrier_code")
		private String carrierCode;
		/**
		 * 载具id
		 */
		@ApiField("carrier_id")
		private Long carrierId;
		/**
		 * 载具名称
		 */
		@ApiField("carrier_name")
		private String carrierName;
		/**
		 * 载具类型
		 */
		@ApiField("carrier_type")
		private Long carrierType;
		/**
		 * 载具类型名称
		 */
		@ApiField("carrier_type_name")
		private String carrierTypeName;
		/**
		 * 是否可用
		 */
		@ApiField("enabled")
		private Boolean enabled;
		/**
		 * 状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public String getCarrierCode() {
			return this.carrierCode;
		}
		public void setCarrierCode(String carrierCode) {
			this.carrierCode = carrierCode;
		}
		public Long getCarrierId() {
			return this.carrierId;
		}
		public void setCarrierId(Long carrierId) {
			this.carrierId = carrierId;
		}
		public String getCarrierName() {
			return this.carrierName;
		}
		public void setCarrierName(String carrierName) {
			this.carrierName = carrierName;
		}
		public Long getCarrierType() {
			return this.carrierType;
		}
		public void setCarrierType(Long carrierType) {
			this.carrierType = carrierType;
		}
		public String getCarrierTypeName() {
			return this.carrierTypeName;
		}
		public void setCarrierTypeName(String carrierTypeName) {
			this.carrierTypeName = carrierTypeName;
		}
		public Boolean getEnabled() {
			return this.enabled;
		}
		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
