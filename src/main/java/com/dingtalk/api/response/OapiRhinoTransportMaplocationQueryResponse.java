package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.transport.maplocation.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoTransportMaplocationQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4763367739542536489L;

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
	 * 其它信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回结果
	 */
	@ApiListField("model")
	@ApiField("map_location_detail_result")
	private List<MapLocationDetailResult> model;

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

	public void setModel(List<MapLocationDetailResult> model) {
		this.model = model;
	}
	public List<MapLocationDetailResult> getModel( ) {
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
	 * config信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Configs extends TaobaoObject {
		private static final long serialVersionUID = 6467374953394274811L;
		/**
		 * 位置id
		 */
		@ApiField("location_id")
		private Long locationId;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 执行code
		 */
		@ApiField("trans_cmd_code")
		private String transCmdCode;
		/**
		 * 运输类型
		 */
		@ApiField("trans_type_code")
		private String transTypeCode;
	
		public Long getLocationId() {
			return this.locationId;
		}
		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getTransCmdCode() {
			return this.transCmdCode;
		}
		public void setTransCmdCode(String transCmdCode) {
			this.transCmdCode = transCmdCode;
		}
		public String getTransTypeCode() {
			return this.transTypeCode;
		}
		public void setTransTypeCode(String transTypeCode) {
			this.transTypeCode = transTypeCode;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MapLocationDetailResult extends TaobaoObject {
		private static final long serialVersionUID = 8293618346887545273L;
		/**
		 * config信息
		 */
		@ApiListField("configs")
		@ApiField("configs")
		private List<Configs> configs;
		/**
		 * 位置id
		 */
		@ApiField("location_id")
		private Long locationId;
		/**
		 * poi编码
		 */
		@ApiField("own_poi_code")
		private String ownPoiCode;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
	
		public List<Configs> getConfigs() {
			return this.configs;
		}
		public void setConfigs(List<Configs> configs) {
			this.configs = configs;
		}
		public Long getLocationId() {
			return this.locationId;
		}
		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}
		public String getOwnPoiCode() {
			return this.ownPoiCode;
		}
		public void setOwnPoiCode(String ownPoiCode) {
			this.ownPoiCode = ownPoiCode;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}
	


}
