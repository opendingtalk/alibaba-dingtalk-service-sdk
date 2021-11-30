package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.cooperation.carrier.bindobj.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoCooperationCarrierBindobjQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4216515732732148178L;

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
	@ApiField("carrier_bind_obj_dto")
	private List<CarrierBindObjDto> model;

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

	public void setModel(List<CarrierBindObjDto> model) {
		this.model = model;
	}
	public List<CarrierBindObjDto> getModel( ) {
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
	public static class CarrierBindObjDto extends TaobaoObject {
		private static final long serialVersionUID = 1645574522176554787L;
		/**
		 * 载具所在实体id
		 */
		@ApiField("bind_obj_id")
		private String bindObjId;
		/**
		 * 绑定实体类型
		 */
		@ApiField("bind_obj_type")
		private String bindObjType;
		/**
		 * 载具code
		 */
		@ApiField("carrier_code")
		private String carrierCode;
		/**
		 * 载具id
		 */
		@ApiField("carrier_id")
		private Long carrierId;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public String getBindObjId() {
			return this.bindObjId;
		}
		public void setBindObjId(String bindObjId) {
			this.bindObjId = bindObjId;
		}
		public String getBindObjType() {
			return this.bindObjType;
		}
		public void setBindObjType(String bindObjType) {
			this.bindObjType = bindObjType;
		}
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
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
