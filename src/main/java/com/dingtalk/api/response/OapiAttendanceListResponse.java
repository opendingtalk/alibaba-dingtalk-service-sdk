package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7869654178266213579L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * hasMore
	 */
	@ApiField("hasMore")
	private Boolean hasMore;

	/** 
	 * recordresult
	 */
	@ApiListField("recordresult")
	@ApiField("recordresult")
	private List<Recordresult> recordresult;


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

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setRecordresult(List<Recordresult> recordresult) {
		this.recordresult = recordresult;
	}
	public List<Recordresult> getRecordresult( ) {
		return this.recordresult;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * recordresult
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Recordresult extends TaobaoObject {
		private static final long serialVersionUID = 2558639362721773636L;
		/**
		 * approveId
		 */
		@ApiField("approveId")
		private Long approveId;
		/**
		 * baseCheckTime
		 */
		@ApiField("baseCheckTime")
		private Date baseCheckTime;
		/**
		 * checkType
		 */
		@ApiField("checkType")
		private String checkType;
		/**
		 * groupId
		 */
		@ApiField("groupId")
		private Long groupId;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * locationResult
		 */
		@ApiField("locationResult")
		private String locationResult;
		/**
		 * planId
		 */
		@ApiField("planId")
		private Long planId;
		/**
		 * procInstId
		 */
		@ApiField("procInstId")
		private String procInstId;
		/**
		 * recordId
		 */
		@ApiField("recordId")
		private Long recordId;
		/**
		 * sourceType
		 */
		@ApiField("sourceType")
		private String sourceType;
		/**
		 * timeResult
		 */
		@ApiField("timeResult")
		private String timeResult;
		/**
		 * userCheckTime
		 */
		@ApiField("userCheckTime")
		private Date userCheckTime;
		/**
		 * userId
		 */
		@ApiField("userId")
		private String userId;
		/**
		 * workDate
		 */
		@ApiField("workDate")
		private Date workDate;
	
		public Long getApproveId() {
			return this.approveId;
		}
		public void setApproveId(Long approveId) {
			this.approveId = approveId;
		}
		public Date getBaseCheckTime() {
			return this.baseCheckTime;
		}
		public void setBaseCheckTime(Date baseCheckTime) {
			this.baseCheckTime = baseCheckTime;
		}
		public String getCheckType() {
			return this.checkType;
		}
		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getLocationResult() {
			return this.locationResult;
		}
		public void setLocationResult(String locationResult) {
			this.locationResult = locationResult;
		}
		public Long getPlanId() {
			return this.planId;
		}
		public void setPlanId(Long planId) {
			this.planId = planId;
		}
		public String getProcInstId() {
			return this.procInstId;
		}
		public void setProcInstId(String procInstId) {
			this.procInstId = procInstId;
		}
		public Long getRecordId() {
			return this.recordId;
		}
		public void setRecordId(Long recordId) {
			this.recordId = recordId;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
		public String getTimeResult() {
			return this.timeResult;
		}
		public void setTimeResult(String timeResult) {
			this.timeResult = timeResult;
		}
		public Date getUserCheckTime() {
			return this.userCheckTime;
		}
		public void setUserCheckTime(Date userCheckTime) {
			this.userCheckTime = userCheckTime;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public Date getWorkDate() {
			return this.workDate;
		}
		public void setWorkDate(Date workDate) {
			this.workDate = workDate;
		}
	}
	


}
