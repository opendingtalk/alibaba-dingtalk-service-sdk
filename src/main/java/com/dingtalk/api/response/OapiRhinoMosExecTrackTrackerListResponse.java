package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.track.tracker.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecTrackTrackerListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8417765978819489833L;

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
	 * 返回结果
	 */
	@ApiListField("model")
	@ApiField("track_record_d_t_o")
	private List<TrackRecordDTO> model;

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

	public void setModel(List<TrackRecordDTO> model) {
		this.model = model;
	}
	public List<TrackRecordDTO> getModel( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TrackRecordDTO extends TaobaoObject {
		private static final long serialVersionUID = 8275591891881949618L;
		/**
		 * 生效结束时间
		 */
		@ApiField("effect_end_time")
		private Date effectEndTime;
		/**
		 * 生效开始时间
		 */
		@ApiField("effect_start_time")
		private Date effectStartTime;
		/**
		 * 生效开始位置
		 */
		@ApiField("effect_start_workstation_code")
		private String effectStartWorkstationCode;
		/**
		 * 生效状态
		 */
		@ApiField("effect_status")
		private String effectStatus;
		/**
		 * 实体ID
		 */
		@ApiField("entity_id")
		private Long entityId;
		/**
		 * 实体类型
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 追踪ID
		 */
		@ApiField("track_id")
		private String trackId;
		/**
		 * 追踪类型
		 */
		@ApiField("track_type")
		private String trackType;
	
		public Date getEffectEndTime() {
			return this.effectEndTime;
		}
		public void setEffectEndTime(Date effectEndTime) {
			this.effectEndTime = effectEndTime;
		}
		public Date getEffectStartTime() {
			return this.effectStartTime;
		}
		public void setEffectStartTime(Date effectStartTime) {
			this.effectStartTime = effectStartTime;
		}
		public String getEffectStartWorkstationCode() {
			return this.effectStartWorkstationCode;
		}
		public void setEffectStartWorkstationCode(String effectStartWorkstationCode) {
			this.effectStartWorkstationCode = effectStartWorkstationCode;
		}
		public String getEffectStatus() {
			return this.effectStatus;
		}
		public void setEffectStatus(String effectStatus) {
			this.effectStatus = effectStatus;
		}
		public Long getEntityId() {
			return this.entityId;
		}
		public void setEntityId(Long entityId) {
			this.entityId = entityId;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getTrackId() {
			return this.trackId;
		}
		public void setTrackId(String trackId) {
			this.trackId = trackId;
		}
		public String getTrackType() {
			return this.trackType;
		}
		public void setTrackType(String trackType) {
			this.trackType = trackType;
		}
	}
	


}
