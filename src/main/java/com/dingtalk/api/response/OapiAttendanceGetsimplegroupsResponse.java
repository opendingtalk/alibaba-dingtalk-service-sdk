package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getsimplegroups response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetsimplegroupsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1156638895386756258L;

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
	 * result
	 */
	@ApiField("result")
	private AtGroupListForTopVo result;


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

	public void setResult(AtGroupListForTopVo result) {
		this.result = result;
	}
	public AtGroupListForTopVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 休息开始时间，只有一个时间段的班次有
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtTimeVo extends TaobaoObject {
		private static final long serialVersionUID = 8575778966446498323L;
		/**
		 * 开始时间
		 */
		@ApiField("check_time")
		private Date checkTime;
	
		public Date getCheckTime() {
			return this.checkTime;
		}
		public void setCheckTime(Date checkTime) {
			this.checkTime = checkTime;
		}
	}
	
	/**
	 * 考勤组班次配置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClassSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 3411219986786555562L;
		/**
		 * 旷工迟到时长,单位分钟
		 */
		@ApiField("absenteeism_late_minutes")
		private Long absenteeismLateMinutes;
		/**
		 * 考勤组班次id
		 */
		@ApiField("class_setting_id")
		private Long classSettingId;
		/**
		 * Y表示下班不强制打卡,N表示下班强制打卡
		 */
		@ApiField("is_off_duty_free_check")
		private String isOffDutyFreeCheck;
		/**
		 * 允许迟到时长，单位分钟
		 */
		@ApiField("permit_late_minutes")
		private Long permitLateMinutes;
		/**
		 * 休息开始时间，只有一个时间段的班次有
		 */
		@ApiField("rest_begin_time")
		private AtTimeVo restBeginTime;
		/**
		 * 休息结束时间，只有一个时间段的班次有
		 */
		@ApiField("rest_end_time")
		private AtTimeVo restEndTime;
		/**
		 * 严重迟到时长,单位分钟
		 */
		@ApiField("serious_late_minutes")
		private Long seriousLateMinutes;
		/**
		 * 工作时长，单位分钟，-1表示关闭该功能
		 */
		@ApiField("work_time_minutes")
		private Long workTimeMinutes;
	
		public Long getAbsenteeismLateMinutes() {
			return this.absenteeismLateMinutes;
		}
		public void setAbsenteeismLateMinutes(Long absenteeismLateMinutes) {
			this.absenteeismLateMinutes = absenteeismLateMinutes;
		}
		public Long getClassSettingId() {
			return this.classSettingId;
		}
		public void setClassSettingId(Long classSettingId) {
			this.classSettingId = classSettingId;
		}
		public String getIsOffDutyFreeCheck() {
			return this.isOffDutyFreeCheck;
		}
		public void setIsOffDutyFreeCheck(String isOffDutyFreeCheck) {
			this.isOffDutyFreeCheck = isOffDutyFreeCheck;
		}
		public Long getPermitLateMinutes() {
			return this.permitLateMinutes;
		}
		public void setPermitLateMinutes(Long permitLateMinutes) {
			this.permitLateMinutes = permitLateMinutes;
		}
		public AtTimeVo getRestBeginTime() {
			return this.restBeginTime;
		}
		public void setRestBeginTime(AtTimeVo restBeginTime) {
			this.restBeginTime = restBeginTime;
		}
		public AtTimeVo getRestEndTime() {
			return this.restEndTime;
		}
		public void setRestEndTime(AtTimeVo restEndTime) {
			this.restEndTime = restEndTime;
		}
		public Long getSeriousLateMinutes() {
			return this.seriousLateMinutes;
		}
		public void setSeriousLateMinutes(Long seriousLateMinutes) {
			this.seriousLateMinutes = seriousLateMinutes;
		}
		public Long getWorkTimeMinutes() {
			return this.workTimeMinutes;
		}
		public void setWorkTimeMinutes(Long workTimeMinutes) {
			this.workTimeMinutes = workTimeMinutes;
		}
	}
	
	/**
	 * 时间段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SetionTimeVO extends TaobaoObject {
		private static final long serialVersionUID = 4597717755242687688L;
		/**
		 * 打卡时间跨度
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 打卡时间
		 */
		@ApiField("check_time")
		private Date checkTime;
		/**
		 * 打卡类型枚举（Onduty和OffDuty）
		 */
		@ApiField("check_type")
		private String checkType;
	
		public Long getAcross() {
			return this.across;
		}
		public void setAcross(Long across) {
			this.across = across;
		}
		public Date getCheckTime() {
			return this.checkTime;
		}
		public void setCheckTime(Date checkTime) {
			this.checkTime = checkTime;
		}
		public String getCheckType() {
			return this.checkType;
		}
		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}
	}
	
	/**
	 * 班次打卡时间段,最多
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtSectionVo extends TaobaoObject {
		private static final long serialVersionUID = 8798285331823257798L;
		/**
		 * 时间段列表
		 */
		@ApiListField("times")
		@ApiField("setion_time_v_o")
		private List<SetionTimeVO> times;
	
		public List<SetionTimeVO> getTimes() {
			return this.times;
		}
		public void setTimes(List<SetionTimeVO> times) {
			this.times = times;
		}
	}
	
	/**
	 * 考勤组对应的考勤班次列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtClassVo extends TaobaoObject {
		private static final long serialVersionUID = 6447235757596275752L;
		/**
		 * 考勤班次id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 考勤班次名称
		 */
		@ApiField("class_name")
		private String className;
		/**
		 * 班次打卡时间段,最多
		 */
		@ApiListField("sections")
		@ApiField("at_section_vo")
		private List<AtSectionVo> sections;
		/**
		 * 考勤组班次配置
		 */
		@ApiField("setting")
		private ClassSettingVo setting;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getClassName() {
			return this.className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public List<AtSectionVo> getSections() {
			return this.sections;
		}
		public void setSections(List<AtSectionVo> sections) {
			this.sections = sections;
		}
		public ClassSettingVo getSetting() {
			return this.setting;
		}
		public void setSetting(ClassSettingVo setting) {
			this.setting = setting;
		}
	}
	
	/**
	 * 考勤组列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtGroupForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 4175972877367735318L;
		/**
		 * 一周的班次时间展示列表。["周一、二 班次A:09:00-18:00", "周六、周日 休息"]
		 */
		@ApiListField("classes_list")
		@ApiField("string")
		private List<String> classesList;
		/**
		 * 默认班次id
		 */
		@ApiField("default_class_id")
		private Long defaultClassId;
		/**
		 * 考勤组添加的部门Id列表
		 */
		@ApiListField("dept_ids")
		@ApiField("number")
		private List<Long> deptIds;
		/**
		 * 关联的部门
		 */
		@ApiListField("dept_name_list")
		@ApiField("string")
		private List<String> deptNameList;
		/**
		 * 考勤组id
		 */
		@ApiField("group_id")
		private Long groupId;
		/**
		 * 考勤组名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 是否默认考勤组
		 */
		@ApiField("is_default")
		private Boolean isDefault;
		/**
		 * 考勤组负责人
		 */
		@ApiListField("manager_list")
		@ApiField("string")
		private List<String> managerList;
		/**
		 * 成员人数
		 */
		@ApiField("member_count")
		private Long memberCount;
		/**
		 * 考勤组主负责人
		 */
		@ApiField("owner_user_id")
		private String ownerUserId;
		/**
		 * 考勤组对应的考勤班次列表
		 */
		@ApiListField("selected_class")
		@ApiField("at_class_vo")
		private List<AtClassVo> selectedClass;
		/**
		 * 考勤类型，FIXED为固定排班，TURN为轮班排班，NONE为无班次
		 */
		@ApiField("type")
		private String type;
		/**
		 * 考勤组里按照人添加的人
		 */
		@ApiListField("user_ids")
		@ApiField("string")
		private List<String> userIds;
		/**
		 * 固定班次的工作日班次
		 */
		@ApiListField("work_day_list")
		@ApiField("string")
		private List<String> workDayList;
	
		public List<String> getClassesList() {
			return this.classesList;
		}
		public void setClassesList(List<String> classesList) {
			this.classesList = classesList;
		}
		public Long getDefaultClassId() {
			return this.defaultClassId;
		}
		public void setDefaultClassId(Long defaultClassId) {
			this.defaultClassId = defaultClassId;
		}
		public List<Long> getDeptIds() {
			return this.deptIds;
		}
		public void setDeptIds(List<Long> deptIds) {
			this.deptIds = deptIds;
		}
		public List<String> getDeptNameList() {
			return this.deptNameList;
		}
		public void setDeptNameList(List<String> deptNameList) {
			this.deptNameList = deptNameList;
		}
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Boolean getIsDefault() {
			return this.isDefault;
		}
		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}
		public List<String> getManagerList() {
			return this.managerList;
		}
		public void setManagerList(List<String> managerList) {
			this.managerList = managerList;
		}
		public Long getMemberCount() {
			return this.memberCount;
		}
		public void setMemberCount(Long memberCount) {
			this.memberCount = memberCount;
		}
		public String getOwnerUserId() {
			return this.ownerUserId;
		}
		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}
		public List<AtClassVo> getSelectedClass() {
			return this.selectedClass;
		}
		public void setSelectedClass(List<AtClassVo> selectedClass) {
			this.selectedClass = selectedClass;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public List<String> getUserIds() {
			return this.userIds;
		}
		public void setUserIds(List<String> userIds) {
			this.userIds = userIds;
		}
		public List<String> getWorkDayList() {
			return this.workDayList;
		}
		public void setWorkDayList(List<String> workDayList) {
			this.workDayList = workDayList;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtGroupListForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 6238976457294617488L;
		/**
		 * 考勤组列表
		 */
		@ApiListField("groups")
		@ApiField("at_group_for_top_vo")
		private List<AtGroupForTopVo> groups;
		/**
		 * 分页用，表示是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
	
		public List<AtGroupForTopVo> getGroups() {
			return this.groups;
		}
		public void setGroups(List<AtGroupForTopVo> groups) {
			this.groups = groups;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
	}
	


}
