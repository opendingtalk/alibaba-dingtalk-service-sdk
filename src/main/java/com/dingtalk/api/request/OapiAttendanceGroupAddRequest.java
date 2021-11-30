package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiAttendanceGroupAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.add request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.03
 */
public class OapiAttendanceGroupAddRequest extends BaseTaobaoRequest<OapiAttendanceGroupAddResponse> {
	
	

	/** 
	* 操作人id
	 */
	private String opUserId;

	/** 
	* 考勤组信息
	 */
	private String topGroup;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setTopGroup(String topGroup) {
		this.topGroup = topGroup;
	}

	public void setTopGroup(TopGroupVo topGroup) {
		this.topGroup = new JSONWriter(false,false,true).write(topGroup);
	}

	public String getTopGroup() {
		return this.topGroup;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.add";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("top_group", this.topGroup);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupAddResponse> getResponseClass() {
		return OapiAttendanceGroupAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	
	/**
	 * 考勤地址
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopPositionVo extends TaobaoObject {
		private static final long serialVersionUID = 8678957477311142657L;
		/**
		 * 精度
		 */
		@ApiField("accuracy")
		private String accuracy;
		/**
		 * 地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 纬度
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 经度
		 */
		@ApiField("longitude")
		private String longitude;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public String getAccuracy() {
			return this.accuracy;
		}
		public void setAccuracy(String accuracy) {
			this.accuracy = accuracy;
		}
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getLatitude() {
			return this.latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return this.longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 班次信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopShiftVo extends TaobaoObject {
		private static final long serialVersionUID = 8738943942362982981L;
		/**
		 * 班次id
		 */
		@ApiField("id")
		private Long id;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	
	/**
	 * 考勤组成员
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopMemberVo extends TaobaoObject {
		private static final long serialVersionUID = 8365587896728514433L;
		/**
		 * corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 角色
		 */
		@ApiField("role")
		private String role;
		/**
		 * 类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 用户id
		 */
		@ApiField("user_id")
		private String userId;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
	}
	
	/**
	 * 子管理员权限范围（w表示可管理，r表示可读）
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopGroupManageRolePermissionVo extends TaobaoObject {
		private static final long serialVersionUID = 3681156732729929684L;
		/**
		 * 设置拍照打卡规则
		 */
		@ApiField("camera_check")
		private String cameraCheck;
		/**
		 * 设置打卡方式
		 */
		@ApiField("check_position_type")
		private String checkPositionType;
		/**
		 * 设置考勤时间
		 */
		@ApiField("check_time")
		private String checkTime;
		/**
		 * 设置参与考勤人员
		 */
		@ApiField("group_member")
		private String groupMember;
		/**
		 * 设置考勤类型
		 */
		@ApiField("group_type")
		private String groupType;
		/**
		 * 设置外勤打卡
		 */
		@ApiField("out_side_check")
		private String outSideCheck;
		/**
		 * 设置加班规则
		 */
		@ApiField("over_time_rule")
		private String overTimeRule;
		/**
		 * 员工排班
		 */
		@ApiField("schedule")
		private String schedule;
	
		public String getCameraCheck() {
			return this.cameraCheck;
		}
		public void setCameraCheck(String cameraCheck) {
			this.cameraCheck = cameraCheck;
		}
		public String getCheckPositionType() {
			return this.checkPositionType;
		}
		public void setCheckPositionType(String checkPositionType) {
			this.checkPositionType = checkPositionType;
		}
		public String getCheckTime() {
			return this.checkTime;
		}
		public void setCheckTime(String checkTime) {
			this.checkTime = checkTime;
		}
		public String getGroupMember() {
			return this.groupMember;
		}
		public void setGroupMember(String groupMember) {
			this.groupMember = groupMember;
		}
		public String getGroupType() {
			return this.groupType;
		}
		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}
		public String getOutSideCheck() {
			return this.outSideCheck;
		}
		public void setOutSideCheck(String outSideCheck) {
			this.outSideCheck = outSideCheck;
		}
		public String getOverTimeRule() {
			return this.overTimeRule;
		}
		public void setOverTimeRule(String overTimeRule) {
			this.overTimeRule = overTimeRule;
		}
		public String getSchedule() {
			return this.schedule;
		}
		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}
	}
	
	/**
	 * 考勤wifi打卡
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopWifiVo extends TaobaoObject {
		private static final long serialVersionUID = 1152496298383142686L;
		/**
		 * 企业corpid
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * mac地址
		 */
		@ApiField("mac_addr")
		private String macAddr;
		/**
		 * wifi的ssid
		 */
		@ApiField("ssid")
		private String ssid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getMacAddr() {
			return this.macAddr;
		}
		public void setMacAddr(String macAddr) {
			this.macAddr = macAddr;
		}
		public String getSsid() {
			return this.ssid;
		}
		public void setSsid(String ssid) {
			this.ssid = ssid;
		}
	}
	
	/**
	 * 蓝牙打卡信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAtBleDeviceVO extends TaobaoObject {
		private static final long serialVersionUID = 6851895458728977413L;
		/**
		 * 设备id
		 */
		@ApiField("device_id")
		private Long deviceId;
	
		public Long getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(Long deviceId) {
			this.deviceId = deviceId;
		}
	}
	
	/**
	 * 考勤组信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopGroupVo extends TaobaoObject {
		private static final long serialVersionUID = 8792525444618447895L;
		/**
		 * 蓝牙打卡信息
		 */
		@ApiListField("ble_device_list")
		@ApiField("top_at_ble_device_v_o")
		private List<TopAtBleDeviceVO> bleDeviceList;
		/**
		 * 打卡是否需要健康码
		 */
		@ApiField("check_need_healthy_code")
		private Boolean checkNeedHealthyCode;
		/**
		 * corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 默认班次id（固定班制必填）
		 */
		@ApiField("default_class_id")
		private Long defaultClassId;
		/**
		 * 休息日打卡是否需审批。true：需要  false：不需要
		 */
		@ApiField("disable_check_when_rest")
		private Boolean disableCheckWhenRest;
		/**
		 * 未排班时是否禁止员工打卡
		 */
		@ApiField("disable_check_without_schedule")
		private Boolean disableCheckWithoutSchedule;
		/**
		 * 是否开启拍照打卡
		 */
		@ApiField("enable_camera_check")
		private Boolean enableCameraCheck;
		/**
		 * 未排班时允许员工选择班次打卡
		 */
		@ApiField("enable_emp_select_class")
		private Boolean enableEmpSelectClass;
		/**
		 * 是否开启人脸检测
		 */
		@ApiField("enable_face_check")
		private Boolean enableFaceCheck;
		/**
		 * 是否第二天生效
		 */
		@ApiField("enable_next_day")
		private Boolean enableNextDay;
		/**
		 * 是否开启外勤打卡必须拍照
		 */
		@ApiField("enable_outside_camera_check")
		private Boolean enableOutsideCameraCheck;
		/**
		 * 是否可以外勤打卡
		 */
		@ApiField("enable_outside_check")
		private Boolean enableOutsideCheck;
		/**
		 * 是否启用蓝牙定位
		 */
		@ApiField("enable_position_ble")
		private Boolean enablePositionBle;
		/**
		 * 自由工时考勤组考勤开始时间与当天0点偏移分钟数（如：240表示4:00）
		 */
		@ApiField("freecheck_day_start_min_offset")
		private Long freecheckDayStartMinOffset;
		/**
		 * 自由工时考勤组工作日（1表示周一，0表示周日）
		 */
		@ApiListField("freecheck_work_days")
		@ApiField("number")
		private List<Long> freecheckWorkDays;
		/**
		 * 考勤组id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 考勤组子管理员userid列表
		 */
		@ApiListField("manager_list")
		@ApiField("string")
		private List<String> managerList;
		/**
		 * 考勤组成员
		 */
		@ApiListField("members")
		@ApiField("top_member_vo")
		private List<TopMemberVo> members;
		/**
		 * 是否有修改考勤组成员相关信息
		 */
		@ApiField("modify_member")
		private Boolean modifyMember;
		/**
		 * 考勤组名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 考勤范围
		 */
		@ApiField("offset")
		private Long offset;
		/**
		 * 考勤组owner
		 */
		@ApiField("owner")
		private String owner;
		/**
		 * 考勤地址
		 */
		@ApiListField("positions")
		@ApiField("top_position_vo")
		private List<TopPositionVo> positions;
		/**
		 * 子管理员权限范围（w表示可管理，r表示可读）
		 */
		@ApiField("resource_permission_map")
		private TopGroupManageRolePermissionVo resourcePermissionMap;
		/**
		 * 班次信息
		 */
		@ApiListField("shift_vo_list")
		@ApiField("top_shift_vo")
		private List<TopShiftVo> shiftVoList;
		/**
		 * 是否跳过节假日
		 */
		@ApiField("skip_holidays")
		private Boolean skipHolidays;
		/**
		 * 特殊日期配置
		 */
		@ApiField("special_days")
		private String specialDays;
		/**
		 * 考勤组类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 考勤wifi打卡
		 */
		@ApiListField("wifis")
		@ApiField("top_wifi_vo")
		private List<TopWifiVo> wifis;
		/**
		 * 周班次列表（固定班制必填，0表示休息）
		 */
		@ApiListField("workday_class_list")
		@ApiField("number")
		private List<Long> workdayClassList;
	
		public List<TopAtBleDeviceVO> getBleDeviceList() {
			return this.bleDeviceList;
		}
		public void setBleDeviceList(List<TopAtBleDeviceVO> bleDeviceList) {
			this.bleDeviceList = bleDeviceList;
		}
		public Boolean getCheckNeedHealthyCode() {
			return this.checkNeedHealthyCode;
		}
		public void setCheckNeedHealthyCode(Boolean checkNeedHealthyCode) {
			this.checkNeedHealthyCode = checkNeedHealthyCode;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getDefaultClassId() {
			return this.defaultClassId;
		}
		public void setDefaultClassId(Long defaultClassId) {
			this.defaultClassId = defaultClassId;
		}
		public Boolean getDisableCheckWhenRest() {
			return this.disableCheckWhenRest;
		}
		public void setDisableCheckWhenRest(Boolean disableCheckWhenRest) {
			this.disableCheckWhenRest = disableCheckWhenRest;
		}
		public Boolean getDisableCheckWithoutSchedule() {
			return this.disableCheckWithoutSchedule;
		}
		public void setDisableCheckWithoutSchedule(Boolean disableCheckWithoutSchedule) {
			this.disableCheckWithoutSchedule = disableCheckWithoutSchedule;
		}
		public Boolean getEnableCameraCheck() {
			return this.enableCameraCheck;
		}
		public void setEnableCameraCheck(Boolean enableCameraCheck) {
			this.enableCameraCheck = enableCameraCheck;
		}
		public Boolean getEnableEmpSelectClass() {
			return this.enableEmpSelectClass;
		}
		public void setEnableEmpSelectClass(Boolean enableEmpSelectClass) {
			this.enableEmpSelectClass = enableEmpSelectClass;
		}
		public Boolean getEnableFaceCheck() {
			return this.enableFaceCheck;
		}
		public void setEnableFaceCheck(Boolean enableFaceCheck) {
			this.enableFaceCheck = enableFaceCheck;
		}
		public Boolean getEnableNextDay() {
			return this.enableNextDay;
		}
		public void setEnableNextDay(Boolean enableNextDay) {
			this.enableNextDay = enableNextDay;
		}
		public Boolean getEnableOutsideCameraCheck() {
			return this.enableOutsideCameraCheck;
		}
		public void setEnableOutsideCameraCheck(Boolean enableOutsideCameraCheck) {
			this.enableOutsideCameraCheck = enableOutsideCameraCheck;
		}
		public Boolean getEnableOutsideCheck() {
			return this.enableOutsideCheck;
		}
		public void setEnableOutsideCheck(Boolean enableOutsideCheck) {
			this.enableOutsideCheck = enableOutsideCheck;
		}
		public Boolean getEnablePositionBle() {
			return this.enablePositionBle;
		}
		public void setEnablePositionBle(Boolean enablePositionBle) {
			this.enablePositionBle = enablePositionBle;
		}
		public Long getFreecheckDayStartMinOffset() {
			return this.freecheckDayStartMinOffset;
		}
		public void setFreecheckDayStartMinOffset(Long freecheckDayStartMinOffset) {
			this.freecheckDayStartMinOffset = freecheckDayStartMinOffset;
		}
		public List<Long> getFreecheckWorkDays() {
			return this.freecheckWorkDays;
		}
		public void setFreecheckWorkDays(List<Long> freecheckWorkDays) {
			this.freecheckWorkDays = freecheckWorkDays;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<String> getManagerList() {
			return this.managerList;
		}
		public void setManagerList(List<String> managerList) {
			this.managerList = managerList;
		}
		public List<TopMemberVo> getMembers() {
			return this.members;
		}
		public void setMembers(List<TopMemberVo> members) {
			this.members = members;
		}
		public Boolean getModifyMember() {
			return this.modifyMember;
		}
		public void setModifyMember(Boolean modifyMember) {
			this.modifyMember = modifyMember;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getOffset() {
			return this.offset;
		}
		public void setOffset(Long offset) {
			this.offset = offset;
		}
		public String getOwner() {
			return this.owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public List<TopPositionVo> getPositions() {
			return this.positions;
		}
		public void setPositions(List<TopPositionVo> positions) {
			this.positions = positions;
		}
		public TopGroupManageRolePermissionVo getResourcePermissionMap() {
			return this.resourcePermissionMap;
		}
		public void setResourcePermissionMap(TopGroupManageRolePermissionVo resourcePermissionMap) {
			this.resourcePermissionMap = resourcePermissionMap;
		}
		public List<TopShiftVo> getShiftVoList() {
			return this.shiftVoList;
		}
		public void setShiftVoList(List<TopShiftVo> shiftVoList) {
			this.shiftVoList = shiftVoList;
		}
		public Boolean getSkipHolidays() {
			return this.skipHolidays;
		}
		public void setSkipHolidays(Boolean skipHolidays) {
			this.skipHolidays = skipHolidays;
		}
		public String getSpecialDays() {
			return this.specialDays;
		}
		public void setSpecialDays(String specialDays) {
			this.specialDays = specialDays;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public List<TopWifiVo> getWifis() {
			return this.wifis;
		}
		public void setWifis(List<TopWifiVo> wifis) {
			this.wifis = wifis;
		}
		public List<Long> getWorkdayClassList() {
			return this.workdayClassList;
		}
		public void setWorkdayClassList(List<Long> workdayClassList) {
			this.workdayClassList = workdayClassList;
		}
	}
	

}