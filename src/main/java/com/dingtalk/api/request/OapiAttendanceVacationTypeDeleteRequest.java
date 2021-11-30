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

import com.dingtalk.api.response.OapiAttendanceVacationTypeDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.type.delete request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAttendanceVacationTypeDeleteRequest extends BaseTaobaoRequest<OapiAttendanceVacationTypeDeleteResponse> {
	
	

	/** 
	* 假期类型唯一标识
	 */
	private String leaveCode;

	/** 
	* 操作员ID
	 */
	private String opUserid;

	public void setLeaveCode(String leaveCode) {
		this.leaveCode = leaveCode;
	}

	public String getLeaveCode() {
		return this.leaveCode;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.vacation.type.delete";
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
		txtParams.put("leave_code", this.leaveCode);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceVacationTypeDeleteResponse> getResponseClass() {
		return OapiAttendanceVacationTypeDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(leaveCode, "leaveCode");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	

}