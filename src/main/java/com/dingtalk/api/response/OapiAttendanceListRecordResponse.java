package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.listRecord response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceListRecordResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5294383174826242165L;

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
		private static final long serialVersionUID = 2364283294414743522L;
		/**
		 * approveId
		 */
		@ApiField("approveId")
		private Long approveId;
		/**
		 * baseAccuracy
		 */
		@ApiField("baseAccuracy")
		private String baseAccuracy;
		/**
		 * baseAddress
		 */
		@ApiField("baseAddress")
		private String baseAddress;
		/**
		 * baseCheckTime
		 */
		@ApiField("baseCheckTime")
		private Date baseCheckTime;
		/**
		 * baseLatitude
		 */
		@ApiField("baseLatitude")
		private String baseLatitude;
		/**
		 * baseLongitude
		 */
		@ApiField("baseLongitude")
		private String baseLongitude;
		/**
		 * baseMacAddr
		 */
		@ApiField("baseMacAddr")
		private String baseMacAddr;
		/**
		 * baseSsid
		 */
		@ApiField("baseSsid")
		private String baseSsid;
		/**
		 * bizId
		 */
		@ApiField("bizId")
		private String bizId;
		/**
		 * checkType
		 */
		@ApiField("checkType")
		private String checkType;
		/**
		 * classId
		 */
		@ApiField("classId")
		private Long classId;
		/**
		 * deviceId
		 */
		@ApiField("deviceId")
		private String deviceId;
		/**
		 * deviceSN
		 */
		@ApiField("deviceSN")
		private String deviceSN;
		/**
		 * gmtCreate
		 */
		@ApiField("gmtCreate")
		private Date gmtCreate;
		/**
		 * gmtModified
		 */
		@ApiField("gmtModified")
		private Date gmtModified;
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
		 * invalidRecordMsg
		 */
		@ApiField("invalidRecordMsg")
		private String invalidRecordMsg;
		/**
		 * invalidRecordType
		 */
		@ApiField("invalidRecordType")
		private String invalidRecordType;
		/**
		 * isLegal
		 */
		@ApiField("isLegal")
		private String isLegal;
		/**
		 * locationMethod
		 */
		@ApiField("locationMethod")
		private String locationMethod;
		/**
		 * locationResult
		 */
		@ApiField("locationResult")
		private String locationResult;
		/**
		 * outsideRemark
		 */
		@ApiField("outsideRemark")
		private String outsideRemark;
		/**
		 * planCheckTime
		 */
		@ApiField("planCheckTime")
		private Date planCheckTime;
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
		 * userAccuracy
		 */
		@ApiField("userAccuracy")
		private String userAccuracy;
		/**
		 * userAddress
		 */
		@ApiField("userAddress")
		private String userAddress;
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
		 * userLatitude
		 */
		@ApiField("userLatitude")
		private String userLatitude;
		/**
		 * userLongitude
		 */
		@ApiField("userLongitude")
		private String userLongitude;
		/**
		 * userMacAddr
		 */
		@ApiField("userMacAddr")
		private String userMacAddr;
		/**
		 * userSsid
		 */
		@ApiField("userSsid")
		private String userSsid;
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
		public String getBaseAccuracy() {
			return this.baseAccuracy;
		}
		public void setBaseAccuracy(String baseAccuracy) {
			this.baseAccuracy = baseAccuracy;
		}
		public String getBaseAddress() {
			return this.baseAddress;
		}
		public void setBaseAddress(String baseAddress) {
			this.baseAddress = baseAddress;
		}
		public Date getBaseCheckTime() {
			return this.baseCheckTime;
		}
		public void setBaseCheckTime(Date baseCheckTime) {
			this.baseCheckTime = baseCheckTime;
		}
		public String getBaseLatitude() {
			return this.baseLatitude;
		}
		public void setBaseLatitude(String baseLatitude) {
			this.baseLatitude = baseLatitude;
		}
		public String getBaseLongitude() {
			return this.baseLongitude;
		}
		public void setBaseLongitude(String baseLongitude) {
			this.baseLongitude = baseLongitude;
		}
		public String getBaseMacAddr() {
			return this.baseMacAddr;
		}
		public void setBaseMacAddr(String baseMacAddr) {
			this.baseMacAddr = baseMacAddr;
		}
		public String getBaseSsid() {
			return this.baseSsid;
		}
		public void setBaseSsid(String baseSsid) {
			this.baseSsid = baseSsid;
		}
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getCheckType() {
			return this.checkType;
		}
		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
		public String getDeviceSN() {
			return this.deviceSN;
		}
		public void setDeviceSN(String deviceSN) {
			this.deviceSN = deviceSN;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
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
		public String getInvalidRecordMsg() {
			return this.invalidRecordMsg;
		}
		public void setInvalidRecordMsg(String invalidRecordMsg) {
			this.invalidRecordMsg = invalidRecordMsg;
		}
		public String getInvalidRecordType() {
			return this.invalidRecordType;
		}
		public void setInvalidRecordType(String invalidRecordType) {
			this.invalidRecordType = invalidRecordType;
		}
		public String getIsLegal() {
			return this.isLegal;
		}
		public void setIsLegal(String isLegal) {
			this.isLegal = isLegal;
		}
		public String getLocationMethod() {
			return this.locationMethod;
		}
		public void setLocationMethod(String locationMethod) {
			this.locationMethod = locationMethod;
		}
		public String getLocationResult() {
			return this.locationResult;
		}
		public void setLocationResult(String locationResult) {
			this.locationResult = locationResult;
		}
		public String getOutsideRemark() {
			return this.outsideRemark;
		}
		public void setOutsideRemark(String outsideRemark) {
			this.outsideRemark = outsideRemark;
		}
		public Date getPlanCheckTime() {
			return this.planCheckTime;
		}
		public void setPlanCheckTime(Date planCheckTime) {
			this.planCheckTime = planCheckTime;
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
		public String getUserAccuracy() {
			return this.userAccuracy;
		}
		public void setUserAccuracy(String userAccuracy) {
			this.userAccuracy = userAccuracy;
		}
		public String getUserAddress() {
			return this.userAddress;
		}
		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
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
		public String getUserLatitude() {
			return this.userLatitude;
		}
		public void setUserLatitude(String userLatitude) {
			this.userLatitude = userLatitude;
		}
		public String getUserLongitude() {
			return this.userLongitude;
		}
		public void setUserLongitude(String userLongitude) {
			this.userLongitude = userLongitude;
		}
		public String getUserMacAddr() {
			return this.userMacAddr;
		}
		public void setUserMacAddr(String userMacAddr) {
			this.userMacAddr = userMacAddr;
		}
		public String getUserSsid() {
			return this.userSsid;
		}
		public void setUserSsid(String userSsid) {
			this.userSsid = userSsid;
		}
		public Date getWorkDate() {
			return this.workDate;
		}
		public void setWorkDate(Date workDate) {
			this.workDate = workDate;
		}
	}
	


}
