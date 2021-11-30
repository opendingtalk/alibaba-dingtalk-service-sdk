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

import com.dingtalk.api.response.OapiAttendanceShiftSearchResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.search request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.31
 */
public class OapiAttendanceShiftSearchRequest extends BaseTaobaoRequest<OapiAttendanceShiftSearchResponse> {
	
	

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 班次名称
	 */
	private String shiftName;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public String getShiftName() {
		return this.shiftName;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.shift.search";
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
		txtParams.put("shift_name", this.shiftName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceShiftSearchResponse> getResponseClass() {
		return OapiAttendanceShiftSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(shiftName, "shiftName");
	}
	

}