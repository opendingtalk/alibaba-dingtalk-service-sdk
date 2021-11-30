package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.class.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceClassGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2212646814926767444L;

	/** 
	 * 异常错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 异常信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回对象
	 */
	@ApiField("result")
	private AtClassForTopVo result;


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

	public void setResult(AtClassForTopVo result) {
		this.result = result;
	}
	public AtClassForTopVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 休息开始时间
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtTimeVo extends TaobaoObject {
		private static final long serialVersionUID = 8226377457396734172L;
		/**
		 * 是否跨天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 允许开始分钟
		 */
		@ApiField("begin_min")
		private Long beginMin;
		/**
		 * 时间
		 */
		@ApiField("check_time")
		private Date checkTime;
		/**
		 * 打卡类型枚举（Onduty和OffDuty）
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 允许结束分钟
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
	 * 考勤组班次配置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtClassSettingForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 8819116321524192686L;
		/**
		 * classId
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * classSettingId
		 */
		@ApiField("id")
		private Long id;
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
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
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
	}
	
	/**
	 * 班次打卡时间段,最多
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtSectionVo extends TaobaoObject {
		private static final long serialVersionUID = 5865267219428391192L;
		/**
		 * 时间段列表
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
	 * 返回对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtClassForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 3655786142521777617L;
		/**
		 * 考勤组班次配置
		 */
		@ApiField("class_setting")
		private AtClassSettingForTopVo classSetting;
		/**
		 * 组织id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * classid
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 组织名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 班次打卡时间段,最多
		 */
		@ApiListField("sections")
		@ApiField("at_section_vo")
		private List<AtSectionVo> sections;
		/**
		 * 固定班次的工作日班次
		 */
		@ApiListField("work_days")
		@ApiField("number")
		private List<Long> workDays;
	
		public AtClassSettingForTopVo getClassSetting() {
			return this.classSetting;
		}
		public void setClassSetting(AtClassSettingForTopVo classSetting) {
			this.classSetting = classSetting;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public List<Long> getWorkDays() {
			return this.workDays;
		}
		public void setWorkDays(List<Long> workDays) {
			this.workDays = workDays;
		}
	}
	


}
