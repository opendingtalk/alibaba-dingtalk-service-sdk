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

	private static final long serialVersionUID = 8257428992454356961L;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 流水明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Recordresult extends TaobaoObject {
		private static final long serialVersionUID = 3456219883811643963L;
		/**
		 * 审批单id
		 */
		@ApiField("approveId")
		private Long approveId;
		/**
		 * 基准准确率
		 */
		@ApiField("baseAccuracy")
		private String baseAccuracy;
		/**
		 * 基准地址
		 */
		@ApiField("baseAddress")
		private String baseAddress;
		/**
		 * 基础打卡时间
		 */
		@ApiField("baseCheckTime")
		private Date baseCheckTime;
		/**
		 * 基准纬度
		 */
		@ApiField("baseLatitude")
		private String baseLatitude;
		/**
		 * 基准经度
		 */
		@ApiField("baseLongitude")
		private String baseLongitude;
		/**
		 * 基准mac地址
		 */
		@ApiField("baseMacAddr")
		private String baseMacAddr;
		/**
		 * 基准ssid
		 */
		@ApiField("baseSsid")
		private String baseSsid;
		/**
		 * 流水的业务id
		 */
		@ApiField("bizId")
		private String bizId;
		/**
		 * 上班
		 */
		@ApiField("checkType")
		private String checkType;
		/**
		 * 班次id
		 */
		@ApiField("classId")
		private Long classId;
		/**
		 * 设备id
		 */
		@ApiField("deviceId")
		private String deviceId;
		/**
		 * 创建时间
		 */
		@ApiField("gmtCreate")
		private Date gmtCreate;
		/**
		 * 最后修改时间
		 */
		@ApiField("gmtModified")
		private Date gmtModified;
		/**
		 * 考勤组id
		 */
		@ApiField("groupId")
		private Long groupId;
		/**
		 * 流水id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 无效打卡消息
		 */
		@ApiField("invalidRecordMsg")
		private String invalidRecordMsg;
		/**
		 * 无效打卡类型
		 */
		@ApiField("invalidRecordType")
		private String invalidRecordType;
		/**
		 * 是否合法
		 */
		@ApiField("isLegal")
		private String isLegal;
		/**
		 * 定位方法
		 */
		@ApiField("locationMethod")
		private String locationMethod;
		/**
		 * 地理位置结果
		 */
		@ApiField("locationResult")
		private String locationResult;
		/**
		 * 外勤打卡备注
		 */
		@ApiField("outsideRemark")
		private String outsideRemark;
		/**
		 * 排班打卡时间
		 */
		@ApiField("planCheckTime")
		private Date planCheckTime;
		/**
		 * 排班id
		 */
		@ApiField("planId")
		private Long planId;
		/**
		 * 审批单实例id
		 */
		@ApiField("procInstId")
		private String procInstId;
		/**
		 * 打卡来源，考勤机等
		 */
		@ApiField("sourceType")
		private String sourceType;
		/**
		 * 时间结果
		 */
		@ApiField("timeResult")
		private String timeResult;
		/**
		 * 用户打卡定位精度
		 */
		@ApiField("userAccuracy")
		private String userAccuracy;
		/**
		 * 用户打卡地址
		 */
		@ApiField("userAddress")
		private String userAddress;
		/**
		 * 用户打卡时间
		 */
		@ApiField("userCheckTime")
		private Date userCheckTime;
		/**
		 * 用户的user id
		 */
		@ApiField("userId")
		private String userId;
		/**
		 * 用户打卡纬度
		 */
		@ApiField("userLatitude")
		private String userLatitude;
		/**
		 * 用户打卡精度
		 */
		@ApiField("userLongitude")
		private String userLongitude;
		/**
		 * 用户mac地址
		 */
		@ApiField("userMacAddr")
		private String userMacAddr;
		/**
		 * 用户ssid
		 */
		@ApiField("userSsid")
		private String userSsid;
		/**
		 * 工作日期
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
	
	/**
	 * 接口返回model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 5689256321996511342L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误消息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 流水明细
		 */
		@ApiListField("recordresult")
		@ApiField("recordresult")
		private List<Recordresult> recordresult;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public List<Recordresult> getRecordresult() {
			return this.recordresult;
		}
		public void setRecordresult(List<Recordresult> recordresult) {
			this.recordresult = recordresult;
		}
	}
	


}
