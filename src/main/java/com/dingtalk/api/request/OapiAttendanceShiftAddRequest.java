package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
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
 * @since 1.0, 2020.06.24
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
		private static final long serialVersionUID = 5317446516523991152L;
		/**
		 * 是否跨天
		 */
		@ApiField("across")
		private Long across;
		/**
		 * check时间
		 */
		@ApiField("check_time")
		private Date checkTime;
		/**
		 * 类型
		 */
		@ApiField("check_type")
		private String checkType;
		/**
		 * 调整时间
		 */
		@ApiField("end_min")
		private Long endMin;
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
		private static final long serialVersionUID = 4466413913876445724L;
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
		private static final long serialVersionUID = 6239146659394136146L;
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
	}
	
	/**
	 * 班次
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAtClassVo extends TaobaoObject {
		private static final long serialVersionUID = 7555541469775295485L;
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
		public TopAtClassSettingVo getSetting() {
			return this.setting;
		}
		public void setSetting(TopAtClassSettingVo setting) {
			this.setting = setting;
		}
	}
	

}