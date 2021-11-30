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

import com.dingtalk.api.response.OapiAttendanceApproveDurationCalculateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.approve.duration.calculate request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.25
 */
public class OapiAttendanceApproveDurationCalculateRequest extends BaseTaobaoRequest<OapiAttendanceApproveDurationCalculateResponse> {
	
	

	/** 
	* 审批单类型1：加班，2：出差，3：请假
	 */
	private Long bizType;

	/** 
	* 计算方法，0：按自然日计算，1：按工作日计算
	 */
	private Long calculateModel;

	/** 
	* 时长单位，支持的day,halfDay,hour，biz_type为1时仅支持hour。时间格式必须与时长单位对应，2019-08-15对应day，2019-08-15  AM对应halfDay，2019-08-15 12:43对应hour
	 */
	private String durationUnit;

	/** 
	* 开始时间，支持的时间格式 2019-08-152019-08-15 AM2019-08-15 12:43。开始时间不能早于当前时间前31天
	 */
	private String fromTime;

	/** 
	* 结束时间，支持的时间格式 2019-08-152019-08-15 AM2019-08-15 12:43。结束时间减去开始时间的天数不能超过31天。biz_type为1时结束时间减去开始时间不能超过1天
	 */
	private String toTime;

	/** 
	* 员工的user_id
	 */
	private String userid;

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getBizType() {
		return this.bizType;
	}

	public void setCalculateModel(Long calculateModel) {
		this.calculateModel = calculateModel;
	}

	public Long getCalculateModel() {
		return this.calculateModel;
	}

	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}

	public String getDurationUnit() {
		return this.durationUnit;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getFromTime() {
		return this.fromTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getToTime() {
		return this.toTime;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.approve.duration.calculate";
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
		txtParams.put("calculate_model", this.calculateModel);
		txtParams.put("duration_unit", this.durationUnit);
		txtParams.put("from_time", this.fromTime);
		txtParams.put("to_time", this.toTime);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceApproveDurationCalculateResponse> getResponseClass() {
		return OapiAttendanceApproveDurationCalculateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
		RequestCheckUtils.checkNotEmpty(calculateModel, "calculateModel");
		RequestCheckUtils.checkNotEmpty(durationUnit, "durationUnit");
		RequestCheckUtils.checkNotEmpty(fromTime, "fromTime");
		RequestCheckUtils.checkNotEmpty(toTime, "toTime");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}