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

import com.dingtalk.api.response.OapiAttendanceCorpInviteactiveAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.corp.inviteactive.add request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAttendanceCorpInviteactiveAddRequest extends BaseTaobaoRequest<OapiAttendanceCorpInviteactiveAddResponse> {
	
	

	/** 
	* 管理员的手机号
	 */
	private String adminMobile;

	/** 
	* 被邀请员工的手机号
	 */
	private String invitedMobile;

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}

	public String getAdminMobile() {
		return this.adminMobile;
	}

	public void setInvitedMobile(String invitedMobile) {
		this.invitedMobile = invitedMobile;
	}

	public String getInvitedMobile() {
		return this.invitedMobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.corp.inviteactive.add";
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
		txtParams.put("admin_mobile", this.adminMobile);
		txtParams.put("invited_mobile", this.invitedMobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceCorpInviteactiveAddResponse> getResponseClass() {
		return OapiAttendanceCorpInviteactiveAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(adminMobile, "adminMobile");
		RequestCheckUtils.checkNotEmpty(invitedMobile, "invitedMobile");
	}
	

}