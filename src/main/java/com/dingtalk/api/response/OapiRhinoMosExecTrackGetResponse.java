package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.track.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecTrackGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6256975546641476624L;

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
	 * 额外错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 追踪记录
	 */
	@ApiListField("model")
	@ApiField("track_record_dto")
	private List<TrackRecordDto> model;

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

	public void setModel(List<TrackRecordDto> model) {
		this.model = model;
	}
	public List<TrackRecordDto> getModel( ) {
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
	 * 追踪记录
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TrackRecordDto extends TaobaoObject {
		private static final long serialVersionUID = 8898593981843574261L;
		/**
		 * 开始时间
		 */
		@ApiField("effectEndTime")
		private Date effectEndTime;
		/**
		 * 结束时间
		 */
		@ApiField("effectStartTime")
		private Date effectStartTime;
		/**
		 * 生效状态
		 */
		@ApiField("effectStatus")
		private String effectStatus;
		/**
		 * 实体id
		 */
		@ApiField("entityId")
		private Long entityId;
		/**
		 * 实体类型
		 */
		@ApiField("entityType")
		private String entityType;
		/**
		 * 租户id
		 */
		@ApiField("tenantId")
		private String tenantId;
		/**
		 * 追踪id
		 */
		@ApiField("trackId")
		private String trackId;
		/**
		 * 追踪类型
		 */
		@ApiField("trackType")
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
