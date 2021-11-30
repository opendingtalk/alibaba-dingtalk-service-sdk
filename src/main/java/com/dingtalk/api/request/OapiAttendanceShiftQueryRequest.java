package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceShiftQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.11.26
 */
public class OapiAttendanceShiftQueryRequest extends BaseTaobaoRequest<OapiAttendanceShiftQueryResponse> {
	
	

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 班次id
	 */
	private Long shiftId;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setShiftId(Long shiftId) {
		this.shiftId = shiftId;
	}

	public Long getShiftId() {
		return this.shiftId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.shift.query";
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
		txtParams.put("shift_id", this.shiftId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceShiftQueryResponse> getResponseClass() {
		return OapiAttendanceShiftQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}