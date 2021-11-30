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

import com.dingtalk.api.response.OapiAttendanceShiftHistoryQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.shift.history.query request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.31
 */
public class OapiAttendanceShiftHistoryQueryRequest extends BaseTaobaoRequest<OapiAttendanceShiftHistoryQueryResponse> {
	
	

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 班次id
	 */
	private Long shiftId;

	/** 
	* 班次版本
	 */
	private Long version;

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

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getVersion() {
		return this.version;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.shift.history.query";
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
		txtParams.put("version", this.version);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceShiftHistoryQueryResponse> getResponseClass() {
		return OapiAttendanceShiftHistoryQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(shiftId, "shiftId");
		RequestCheckUtils.checkNotEmpty(version, "version");
	}
	

}