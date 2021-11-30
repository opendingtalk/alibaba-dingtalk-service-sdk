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
import com.dingtalk.api.response.OapiAttendanceGroupModifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.modify request
 * 
 * @author top auto create
 * @since 1.0, 2021.06.10
 */
public class OapiAttendanceGroupModifyRequest extends BaseTaobaoRequest<OapiAttendanceGroupModifyResponse> {
	
	

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
		return "dingtalk.oapi.attendance.group.modify";
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

	public Class<OapiAttendanceGroupModifyResponse> getResponseClass() {
		return OapiAttendanceGroupModifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	
	/**
	 * 班次信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopShiftVo extends TaobaoObject {
		private static final long serialVersionUID = 2821762499455683391L;
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
	 * 考勤地址
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopPositionVo extends TaobaoObject {
		private static final long serialVersionUID = 7153459194721755752L;
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
		 * corpid
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
	 * 子管理员权限范围（w表示可管理，r表示可读）
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Resourcepermissionmap extends TaobaoObject {
		private static final long serialVersionUID = 1498853668619938559L;
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
	 * 考勤组信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopGroupVo extends TaobaoObject {
		private static final long serialVersionUID = 2177167744113923333L;
		/**
		 * 休息日打卡需审批(true表示必须审批)
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
		 * 是否可以外勤打卡
		 */
		@ApiField("enable_outside_check")
		private Boolean enableOutsideCheck;
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
		 * 考勤组主管理员
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
		private Resourcepermissionmap resourcePermissionMap;
		/**
		 * 班次信息
		 */
		@ApiListField("shift_vo_list")
		@ApiField("top_shift_vo")
		private List<TopShiftVo> shiftVoList;
		/**
		 * 休息日自动排休
		 */
		@ApiField("skip_holidays")
		private Boolean skipHolidays;
		/**
		 * 周班次列表
		 */
		@ApiListField("workday_class_list")
		@ApiField("number")
		private List<Long> workdayClassList;
	
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
		public Boolean getEnableOutsideCheck() {
			return this.enableOutsideCheck;
		}
		public void setEnableOutsideCheck(Boolean enableOutsideCheck) {
			this.enableOutsideCheck = enableOutsideCheck;
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
		public Resourcepermissionmap getResourcePermissionMap() {
			return this.resourcePermissionMap;
		}
		public void setResourcePermissionMap(Resourcepermissionmap resourcePermissionMap) {
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
		public List<Long> getWorkdayClassList() {
			return this.workdayClassList;
		}
		public void setWorkdayClassList(List<Long> workdayClassList) {
			this.workdayClassList = workdayClassList;
		}
	}
	

}