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

import com.dingtalk.api.response.OapiAttendanceVacationTypeListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.vacation.type.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.10
 */
public class OapiAttendanceVacationTypeListRequest extends BaseTaobaoRequest<OapiAttendanceVacationTypeListResponse> {
	
	

	/** 
	* 操作员ID
	 */
	private String opUserid;

	/** 
	* 空:开放接口定义假期类型;all:所有假期类型
	 */
	private String vacationSource;

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setVacationSource(String vacationSource) {
		this.vacationSource = vacationSource;
	}

	public String getVacationSource() {
		return this.vacationSource;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.vacation.type.list";
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
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("vacation_source", this.vacationSource);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceVacationTypeListResponse> getResponseClass() {
		return OapiAttendanceVacationTypeListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	

}