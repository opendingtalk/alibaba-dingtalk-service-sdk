package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.advanced.service.isbound response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceAdvancedServiceIsboundResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6414491621331788189L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果列表
	 */
	@ApiListField("result")
	@ApiField("advanced_service_instance_vo")
	private List<AdvancedServiceInstanceVo> result;

	/** 
	 * 成功标记
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

	public void setResult(List<AdvancedServiceInstanceVo> result) {
		this.result = result;
	}
	public List<AdvancedServiceInstanceVo> getResult( ) {
		return this.result;
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
	 * 结果列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AdvancedServiceInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 1524157352498679489L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 有效期结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 实体id
		 */
		@ApiField("entity_id")
		private String entityId;
		/**
		 * 实体类型，取值user, group, corp
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 绑定关系id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 是否删除，取值Y|N
		 */
		@ApiField("is_deleted")
		private String isDeleted;
		/**
		 * 绑定关系名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 服务id
		 */
		@ApiField("service_id")
		private Long serviceId;
		/**
		 * 有效期开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getEntityId() {
			return this.entityId;
		}
		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIsDeleted() {
			return this.isDeleted;
		}
		public void setIsDeleted(String isDeleted) {
			this.isDeleted = isDeleted;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getServiceId() {
			return this.serviceId;
		}
		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
	}
	


}
