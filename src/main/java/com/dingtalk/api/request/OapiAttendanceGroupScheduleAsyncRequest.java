package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAttendanceGroupScheduleAsyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.schedule.async request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.27
 */
public class OapiAttendanceGroupScheduleAsyncRequest extends BaseTaobaoRequest<OapiAttendanceGroupScheduleAsyncResponse> {
	
	

	/** 
	* 考勤组id
	 */
	private Long groupId;

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 系统自动生成
	 */
	private String schedules;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setSchedules(String schedules) {
		this.schedules = schedules;
	}

	public void setSchedules(List<TopScheduleParam> schedules) {
		this.schedules = new JSONWriter(false,false,true).write(schedules);
	}

	public String getSchedules() {
		return this.schedules;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.schedule.async";
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
		txtParams.put("group_id", this.groupId);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("schedules", this.schedules);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupScheduleAsyncResponse> getResponseClass() {
		return OapiAttendanceGroupScheduleAsyncResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupId, "groupId");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkObjectMaxListSize(schedules, 201, "schedules");
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopScheduleParam extends TaobaoObject {
		private static final long serialVersionUID = 4492345734143811167L;
		/**
		 * 是否休息（true表示休息，shift_id传1）
		 */
		@ApiField("is_rest")
		private Boolean isRest;
		/**
		 * 班次id（休息班传1，清空班次传-2）
		 */
		@ApiField("shift_id")
		private Long shiftId;
		/**
		 * 人员userId
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 排班日期
		 */
		@ApiField("work_date")
		private Long workDate;
	
		public Boolean getIsRest() {
			return this.isRest;
		}
		public void setIsRest(Boolean isRest) {
			this.isRest = isRest;
		}
		public Long getShiftId() {
			return this.shiftId;
		}
		public void setShiftId(Long shiftId) {
			this.shiftId = shiftId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public Long getWorkDate() {
			return this.workDate;
		}
		public void setWorkDate(Long workDate) {
			this.workDate = workDate;
		}
	}
	

}