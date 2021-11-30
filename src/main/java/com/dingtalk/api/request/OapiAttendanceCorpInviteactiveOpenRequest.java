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

import com.dingtalk.api.response.OapiAttendanceCorpInviteactiveOpenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.corp.inviteactive.open request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAttendanceCorpInviteactiveOpenRequest extends BaseTaobaoRequest<OapiAttendanceCorpInviteactiveOpenResponse> {
	
	

	/** 
	* 姓名
	 */
	private String adminName;

	/** 
	* 手机号
	 */
	private String adminPhone;

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public String getAdminPhone() {
		return this.adminPhone;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.corp.inviteactive.open";
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
		txtParams.put("admin_name", this.adminName);
		txtParams.put("admin_phone", this.adminPhone);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceCorpInviteactiveOpenResponse> getResponseClass() {
		return OapiAttendanceCorpInviteactiveOpenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(adminName, "adminName");
		RequestCheckUtils.checkNotEmpty(adminPhone, "adminPhone");
	}
	

}