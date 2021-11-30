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

import com.dingtalk.api.response.OapiRoleAddrolesforempsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.addrolesforemps request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiRoleAddrolesforempsRequest extends BaseTaobaoRequest<OapiRoleAddrolesforempsResponse> {
	
	

	/** 
	* 角色id list
	 */
	private String roleIds;

	/** 
	* 员工id list
	 */
	private String userIds;

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getRoleIds() {
		return this.roleIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.role.addrolesforemps";
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
		txtParams.put("roleIds", this.roleIds);
		txtParams.put("userIds", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRoleAddrolesforempsResponse> getResponseClass() {
		return OapiRoleAddrolesforempsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(roleIds, "roleIds");
		RequestCheckUtils.checkMaxListSize(roleIds, 20, "roleIds");
		RequestCheckUtils.checkNotEmpty(userIds, "userIds");
		RequestCheckUtils.checkMaxListSize(userIds, 20, "userIds");
	}
	

}