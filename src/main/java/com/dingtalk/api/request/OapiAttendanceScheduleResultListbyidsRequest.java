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

import com.dingtalk.api.response.OapiAttendanceScheduleResultListbyidsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.schedule.result.listbyids request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.10
 */
public class OapiAttendanceScheduleResultListbyidsRequest extends BaseTaobaoRequest<OapiAttendanceScheduleResultListbyidsResponse> {
	
	

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 排班ids
	 */
	private String scheduleIds;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setScheduleIds(String scheduleIds) {
		this.scheduleIds = scheduleIds;
	}

	public String getScheduleIds() {
		return this.scheduleIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.schedule.result.listbyids";
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
		txtParams.put("schedule_ids", this.scheduleIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceScheduleResultListbyidsResponse> getResponseClass() {
		return OapiAttendanceScheduleResultListbyidsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(scheduleIds, "scheduleIds");
		RequestCheckUtils.checkMaxListSize(scheduleIds, 100, "scheduleIds");
	}
	

}