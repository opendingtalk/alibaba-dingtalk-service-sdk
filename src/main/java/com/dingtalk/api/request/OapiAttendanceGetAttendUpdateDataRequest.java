package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceGetAttendUpdateDataResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getAttendUpdateData request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAttendanceGetAttendUpdateDataRequest extends BaseTaobaoRequest<OapiAttendanceGetAttendUpdateDataResponse> {
	
	

	/** 
	* 用户id
	 */
	private String userid;

	/** 
	* 工作日
	 */
	private Date workDate;

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public Date getWorkDate() {
		return this.workDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.getAttendUpdateData";
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
		txtParams.put("userid", this.userid);
		txtParams.put("work_date", this.workDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGetAttendUpdateDataResponse> getResponseClass() {
		return OapiAttendanceGetAttendUpdateDataResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userid, "userid");
		RequestCheckUtils.checkNotEmpty(workDate, "workDate");
	}
	

}