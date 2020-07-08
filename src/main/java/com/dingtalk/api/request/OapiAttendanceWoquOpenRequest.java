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

import com.dingtalk.api.response.OapiAttendanceWoquOpenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.woqu.open request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.28
 */
public class OapiAttendanceWoquOpenRequest extends BaseTaobaoRequest<OapiAttendanceWoquOpenResponse> {
	
	

	/** 
	* 操作人userId
	 */
	private String opUserId;

	/** 
	* 主管理员userId
	 */
	private String superAdminUserid;

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setSuperAdminUserid(String superAdminUserid) {
		this.superAdminUserid = superAdminUserid;
	}

	public String getSuperAdminUserid() {
		return this.superAdminUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.woqu.open";
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
		txtParams.put("super_admin_userid", this.superAdminUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceWoquOpenResponse> getResponseClass() {
		return OapiAttendanceWoquOpenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(superAdminUserid, "superAdminUserid");
	}
	

}