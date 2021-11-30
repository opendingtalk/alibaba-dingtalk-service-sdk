package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceVacationTypeCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.type.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAttendanceVacationTypeCreateRequest extends BaseTaobaoRequest<OapiAttendanceVacationTypeCreateResponse> {
	
	

	/** 
	* 假期类型，普通假期或者加班转调休假期。(general_leave、lieu_leave其中一种)
	 */
	private String bizType;

	/** 
	* 调休假有效期规则(validity_type:有效类型 absolute_time(绝对时间)、relative_time(相对时间)其中一种 validity_value:延长日期(当validity_type为absolute_time该值该值不为空且满足yy-mm格式 validity_type为relative_time该值为大于1的整数))
	 */
	private String extras;

	/** 
	* 每天折算的工作时长(百分之一 例如1天=10小时=1000)
	 */
	private Long hoursInPerDay;

	/** 
	* 假期名称
	 */
	private String leaveName;

	/** 
	* 请假单位，可以按照天半天或者小时请假。(day、halfday、hour其中一种)
	 */
	private String leaveViewUnit;

	/** 
	* 是否按照自然日统计请假时长，当为false的时候，用户发起请假时候会根据用户在请假时间段内的排班情况来计算请假时长
	 */
	private Boolean naturalDayLeave;

	/** 
	* 操作者ID
	 */
	private String opUserid;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	public String getExtras() {
		return this.extras;
	}

	public void setHoursInPerDay(Long hoursInPerDay) {
		this.hoursInPerDay = hoursInPerDay;
	}

	public Long getHoursInPerDay() {
		return this.hoursInPerDay;
	}

	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}

	public String getLeaveName() {
		return this.leaveName;
	}

	public void setLeaveViewUnit(String leaveViewUnit) {
		this.leaveViewUnit = leaveViewUnit;
	}

	public String getLeaveViewUnit() {
		return this.leaveViewUnit;
	}

	public void setNaturalDayLeave(Boolean naturalDayLeave) {
		this.naturalDayLeave = naturalDayLeave;
	}

	public Boolean getNaturalDayLeave() {
		return this.naturalDayLeave;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.vacation.type.create";
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
		txtParams.put("biz_type", this.bizType);
		txtParams.put("extras", this.extras);
		txtParams.put("hours_in_per_day", this.hoursInPerDay);
		txtParams.put("leave_name", this.leaveName);
		txtParams.put("leave_view_unit", this.leaveViewUnit);
		txtParams.put("natural_day_leave", this.naturalDayLeave);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceVacationTypeCreateResponse> getResponseClass() {
		return OapiAttendanceVacationTypeCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
		RequestCheckUtils.checkNotEmpty(hoursInPerDay, "hoursInPerDay");
		RequestCheckUtils.checkNotEmpty(leaveName, "leaveName");
		RequestCheckUtils.checkNotEmpty(leaveViewUnit, "leaveViewUnit");
		RequestCheckUtils.checkNotEmpty(naturalDayLeave, "naturalDayLeave");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	

}