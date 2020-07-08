package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.class.getClassByIdWithDeleted response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiClassGetClassByIdWithDeletedResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2532693886222788834L;

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

	/** 
	 * 是否成功
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

	public void setResult(AtClassForTopVo result) {
		this.result = result;
	}
	public AtClassForTopVo getResult( ) {
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
	 * 时间段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Times extends TaobaoObject {
		private static final long serialVersionUID = 2721417613273351128L;
		/**
		 * 是否跨天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 上班时间允许范围
		 */
		@ApiField("begin_min")
		private Long beginMin;
		/**
		 * 打卡时间
		 */
		@ApiField("check_time")
		private Long checkTime;
		/**
		 * 打卡类型
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 下班时间允许范围
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
		public Long getCheckTime() {
			return this.checkTime;
		}
		public void setCheckTime(Long checkTime) {
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
	 * 休息开始时间
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtTimeVo extends TaobaoObject {
		private static final long serialVersionUID = 3766466862822642823L;
		/**
		 * 是否跨天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 上班时间允许范围
		 */
		@ApiField("begin_min")
		private Long beginMin;
		/**
		 * 打卡时间
		 */
		@ApiField("check_time")
		private Long checkTime;
		/**
		 * 打卡类型
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 下班时间允许范围
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
		public Long getCheckTime() {
			return this.checkTime;
		}
		public void setCheckTime(Long checkTime) {
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
	 * 班次设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtClassSettingForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 8817698323669293199L;
		/**
		 * 班次ID
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 主键
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
	 * 排班时间段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Sections extends TaobaoObject {
		private static final long serialVersionUID = 7214486373188599688L;
		/**
		 * 班次设置
		 */
		@ApiField("class_setting")
		private AtClassSettingForTopVo classSetting;
		/**
		 * 时间段
		 */
		@ApiListField("times")
		@ApiField("times")
		private List<Times> times;
	
		public AtClassSettingForTopVo getClassSetting() {
			return this.classSetting;
		}
		public void setClassSetting(AtClassSettingForTopVo classSetting) {
			this.classSetting = classSetting;
		}
		public List<Times> getTimes() {
			return this.times;
		}
		public void setTimes(List<Times> times) {
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
		private static final long serialVersionUID = 4851514789724137675L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 班次id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 班次名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 排班时间段
		 */
		@ApiListField("sections")
		@ApiField("sections")
		private List<Sections> sections;
	
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
		public List<Sections> getSections() {
			return this.sections;
		}
		public void setSections(List<Sections> sections) {
			this.sections = sections;
		}
	}
	


}
