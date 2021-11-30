package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiAttendanceShiftAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.30
 */
public class OapiAttendanceShiftAddRequest extends BaseTaobaoRequest<OapiAttendanceShiftAddResponse> {
	
	

	/** 
	* 操作人
	 */
	private String opUserId;

	/** 
	* 班次
	 */
	private String shift;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public void setShift(TopAtClassVo shift) {
		this.shift = new JSONWriter(false,false,true).write(shift);
	}

	public String getShift() {
		return this.shift;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.shift.add";
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
		txtParams.put("shift", this.shift);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceShiftAddResponse> getResponseClass() {
		return OapiAttendanceShiftAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	
	/**
	 * times
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAtTimeVo extends TaobaoObject {
		private static final long serialVersionUID = 7771193666727498584L;
		/**
		 * 是否跨天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * 允许的最早提前打卡时间，分钟为单位
		 */
		@ApiField("begin_min")
		private Long beginMin;
		/**
		 * check时间
		 */
		@ApiField("check_time")
		private Date checkTime;
		/**
		 * 类型(OnDuty上班，OffDuty下班)
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 允许的最玩打卡时间，分钟为单位（-1表示不限制）
		 */
		@ApiField("end_min")
		private Long endMin;
		/**
		 * 当前卡点允许弹性调整范围
		 */
		@ApiListField("flex_minutes")
		@ApiField("number")
		private List<Long> flexMinutes;
		/**
		 * 是否免打卡
		 */
		@ApiField("free_check")
		private Boolean freeCheck;
	
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
		public List<Long> getFlexMinutes() {
			return this.flexMinutes;
		}
		public void setFlexMinutes(List<Long> flexMinutes) {
			this.flexMinutes = flexMinutes;
		}
		public Boolean getFreeCheck() {
			return this.freeCheck;
		}
		public void setFreeCheck(Boolean freeCheck) {
			this.freeCheck = freeCheck;
		}
	}
	
	/**
	 * sections
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAtSectionVo extends TaobaoObject {
		private static final long serialVersionUID = 4239456149226518584L;
		/**
		 * times
		 */
		@ApiListField("times")
		@ApiField("top_at_time_vo")
		private List<TopAtTimeVo> times;
	
		public List<TopAtTimeVo> getTimes() {
			return this.times;
		}
		public void setTimes(List<TopAtTimeVo> times) {
			this.times = times;
		}
	}
	
	/**
	 * 设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAtClassSettingVo extends TaobaoObject {
		private static final long serialVersionUID = 4829638877366757379L;
		/**
		 * 旷工迟到分钟数
		 */
		@ApiField("absenteeism_late_minutes")
		private Long absenteeismLateMinutes;
		/**
		 * 班次id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 固定时长弹性班次设置的工作时长
		 */
		@ApiField("demand_work_time_minutes")
		private Long demandWorkTimeMinutes;
		/**
		 * 班次设置扩展字段（非临时班次无需填写）
		 */
		@ApiField("extras")
		private String extras;
		/**
		 * 是否删除
		 */
		@ApiField("is_deleted")
		private String isDeleted;
		/**
		 * 是否弹性
		 */
		@ApiField("is_flexible")
		private Boolean isFlexible;
		/**
		 * 休息开始
		 */
		@ApiField("rest_begin_time")
		private TopAtTimeVo restBeginTime;
		/**
		 * 休息结束
		 */
		@ApiField("rest_end_time")
		private TopAtTimeVo restEndTime;
		/**
		 * 严重迟到分钟数
		 */
		@ApiField("serious_late_minutes")
		private Long seriousLateMinutes;
		/**
		 * 班次tags（非临时班次无需填写）
		 */
		@ApiField("tags")
		private String tags;
	
		public Long getAbsenteeismLateMinutes() {
			return this.absenteeismLateMinutes;
		}
		public void setAbsenteeismLateMinutes(Long absenteeismLateMinutes) {
			this.absenteeismLateMinutes = absenteeismLateMinutes;
		}
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getDemandWorkTimeMinutes() {
			return this.demandWorkTimeMinutes;
		}
		public void setDemandWorkTimeMinutes(Long demandWorkTimeMinutes) {
			this.demandWorkTimeMinutes = demandWorkTimeMinutes;
		}
		public String getExtras() {
			return this.extras;
		}
		public void setExtras(String extras) {
			this.extras = extras;
		}
		public void setExtrasString(String extras) {
			this.extras = extras;
		}
		
		public String getIsDeleted() {
			return this.isDeleted;
		}
		public void setIsDeleted(String isDeleted) {
			this.isDeleted = isDeleted;
		}
		public Boolean getIsFlexible() {
			return this.isFlexible;
		}
		public void setIsFlexible(Boolean isFlexible) {
			this.isFlexible = isFlexible;
		}
		public TopAtTimeVo getRestBeginTime() {
			return this.restBeginTime;
		}
		public void setRestBeginTime(TopAtTimeVo restBeginTime) {
			this.restBeginTime = restBeginTime;
		}
		public TopAtTimeVo getRestEndTime() {
			return this.restEndTime;
		}
		public void setRestEndTime(TopAtTimeVo restEndTime) {
			this.restEndTime = restEndTime;
		}
		public Long getSeriousLateMinutes() {
			return this.seriousLateMinutes;
		}
		public void setSeriousLateMinutes(Long seriousLateMinutes) {
			this.seriousLateMinutes = seriousLateMinutes;
		}
		public String getTags() {
			return this.tags;
		}
		public void setTags(String tags) {
			this.tags = tags;
		}
	}
	
	/**
	 * 班次
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAtClassVo extends TaobaoObject {
		private static final long serialVersionUID = 2737957734655441653L;
		/**
		 * 班次组名
		 */
		@ApiField("class_group_name")
		private String classGroupName;
		/**
		 * corpId
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
		 * 班次owner
		 */
		@ApiField("owner")
		private String owner;
		/**
		 * sections
		 */
		@ApiListField("sections")
		@ApiField("top_at_section_vo")
		private List<TopAtSectionVo> sections;
		/**
		 * 高级排班绑定服务id（非临时班次无需填写）
		 */
		@ApiField("service_id")
		private Long serviceId;
		/**
		 * 设置
		 */
		@ApiField("setting")
		private TopAtClassSettingVo setting;
	
		public String getClassGroupName() {
			return this.classGroupName;
		}
		public void setClassGroupName(String classGroupName) {
			this.classGroupName = classGroupName;
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
		public String getOwner() {
			return this.owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public List<TopAtSectionVo> getSections() {
			return this.sections;
		}
		public void setSections(List<TopAtSectionVo> sections) {
			this.sections = sections;
		}
		public Long getServiceId() {
			return this.serviceId;
		}
		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}
		public TopAtClassSettingVo getSetting() {
			return this.setting;
		}
		public void setSetting(TopAtClassSettingVo setting) {
			this.setting = setting;
		}
	}
	

}