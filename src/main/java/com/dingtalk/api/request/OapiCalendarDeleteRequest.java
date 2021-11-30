package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCalendarDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.calendar.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.20
 */
public class OapiCalendarDeleteRequest extends BaseTaobaoRequest<OapiCalendarDeleteResponse> {
	
	

	/** 
	* 日程id
	 */
	private String calendarId;

	/** 
	* 员工id
	 */
	private String userid;

	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	public String getCalendarId() {
		return this.calendarId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.calendar.delete";
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
		txtParams.put("calendar_id", this.calendarId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCalendarDeleteResponse> getResponseClass() {
		return OapiCalendarDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}