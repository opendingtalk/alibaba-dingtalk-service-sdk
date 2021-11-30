package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.track.entitycondition.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecTrackEntityconditionListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2825568814723932656L;

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
	@ApiField("model")
	private PageResult model;

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

	public void setModel(PageResult model) {
		this.model = model;
	}
	public PageResult getModel( ) {
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
		private static final long serialVersionUID = 4863326225969164848L;
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
		 * 生效工位
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
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 2725573281157453747L;
		/**
		 * 当前起始位置
		 */
		@ApiField("current_start")
		private Long currentStart;
		/**
		 * 每页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 追踪记录
		 */
		@ApiListField("result")
		@ApiField("track_record_dto")
		private List<TrackRecordDto> result;
		/**
		 * 总数
		 */
		@ApiField("total")
		private Long total;
	
		public Long getCurrentStart() {
			return this.currentStart;
		}
		public void setCurrentStart(Long currentStart) {
			this.currentStart = currentStart;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public List<TrackRecordDto> getResult() {
			return this.result;
		}
		public void setResult(List<TrackRecordDto> result) {
			this.result = result;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	


}
