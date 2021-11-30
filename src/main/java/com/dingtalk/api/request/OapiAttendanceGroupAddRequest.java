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
 * @since 1.0, 2020.06.29
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
		private static final long serialVersionUID = 4278682733259666687L;
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
		private static final long serialVersionUID = 8452326745526699627L;
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
		private static final long serialVersionUID = 3885499485716219537L;
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
	 * 考勤组信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopGroupVo extends TaobaoObject {
		private static final long serialVersionUID = 3161478559829351761L;
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
		 * 考勤组id
		 */
		@ApiField("id")
		private Long id;
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
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
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
	}
	

}