package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getusergroup response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetusergroupResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7255849512937695578L;

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
	private AtGroupFullForTopVo result;


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

	public void setResult(AtGroupFullForTopVo result) {
		this.result = result;
	}
	public AtGroupFullForTopVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 班次中上下班详情列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtTimeVo extends TaobaoObject {
		private static final long serialVersionUID = 5454777116982885899L;
		/**
		 * 打卡时间跨几天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 允许的最早提前打卡时间，分钟为单位
		 */
		@ApiField("begin_min")
		private Long beginMin;
		/**
		 * 打卡时间
		 */
		@ApiField("check_time")
		private Date checkTime;
		/**
		 * 打卡类型OnDuty：上班，OffDuty：下班
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 允许的最晚延后打卡时间，分钟为单位
		 */
		@ApiField("end_min")
		private Long endMin;
	
		public Long getAcross() {
			return this.across;
		}
		public void setAcross(Long across) {
			this.across = across;
		}
		public Long getBeginMin() {
			return this.beginMin;
		}
		public void setBeginMin(Long beginMin) {
			this.beginMin = beginMin;
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
		public Long getEndMin() {
			return this.endMin;
		}
		public void setEndMin(Long endMin) {
			this.endMin = endMin;
		}
	}
	
	/**
	 * 班次中上下班列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtSectionVo extends TaobaoObject {
		private static final long serialVersionUID = 6839589981619718448L;
		/**
		 * 班次中上下班详情列表
		 */
		@ApiListField("times")
		@ApiField("at_time_vo")
		private List<AtTimeVo> times;
	
		public List<AtTimeVo> getTimes() {
			return this.times;
		}
		public void setTimes(List<AtTimeVo> times) {
			this.times = times;
		}
	}
	
	/**
	 * 班次配置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClassSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 2486685243213278112L;
		/**
		 * 休息开始时间
		 */
		@ApiField("rest_begin_time")
		private AtTimeVo restBeginTime;
		/**
		 * 休息结束时间
		 */
		@ApiField("rest_end_time")
		private AtTimeVo restEndTime;
	
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
	}
	
	/**
	 * 考勤组中的班次列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtClassVo extends TaobaoObject {
		private static final long serialVersionUID = 6314975925334645486L;
		/**
		 * 班次id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班次名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 班次中上下班列表
		 */
		@ApiListField("sections")
		@ApiField("at_section_vo")
		private List<AtSectionVo> sections;
		/**
		 * 班次配置
		 */
		@ApiField("setting")
		private ClassSettingVo setting;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtGroupFullForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 6471713435579127759L;
		/**
		 * 考勤组中的班次列表
		 */
		@ApiListField("classes")
		@ApiField("at_class_vo")
		private List<AtClassVo> classes;
		/**
		 * 考勤组id
		 */
		@ApiField("group_id")
		private Long groupId;
		/**
		 * 考勤组名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 考勤组类型
		 */
		@ApiField("type")
		private String type;
	
		public List<AtClassVo> getClasses() {
			return this.classes;
		}
		public void setClasses(List<AtClassVo> classes) {
			this.classes = classes;
		}
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	


}
