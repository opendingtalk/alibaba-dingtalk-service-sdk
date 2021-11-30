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

import com.dingtalk.api.response.OapiAttendanceScheduleListbydayResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.schedule.listbyday request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.14
 */
public class OapiAttendanceScheduleListbydayRequest extends BaseTaobaoRequest<OapiAttendanceScheduleListbydayResponse> {
	
	

	/** 
	* 查询那天的数据
	 */
	private Long dateTime;

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 用户userId
	 */
	private String userId;

	public void setDateTime(Long dateTime) {
		this.dateTime = dateTime;
	}

	public Long getDateTime() {
		return this.dateTime;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.schedule.listbyday";
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
		txtParams.put("date_time", this.dateTime);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceScheduleListbydayResponse> getResponseClass() {
		return OapiAttendanceScheduleListbydayResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dateTime, "dateTime");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(userId, "userId");
	}
	

}