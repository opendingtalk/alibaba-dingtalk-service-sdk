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

import com.dingtalk.api.response.OapiAuthorizationRbacRoleResourceUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.resource.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.20
 */
public class OapiAuthorizationRbacRoleResourceUpdateRequest extends BaseTaobaoRequest<OapiAuthorizationRbacRoleResourceUpdateResponse> {
	
	

	/** 
	* 微应用agenId,需要联系权限平台配置
	 */
	private String agentId;

	/** 
	* 授权的资源列表
	 */
	private String openResources;

	/** 
	* 管理组id
	 */
	private String openRoleId;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setOpenResources(String openResources) {
		this.openResources = openResources;
	}

	public String getOpenResources() {
		return this.openResources;
	}

	public void setOpenRoleId(String openRoleId) {
		this.openRoleId = openRoleId;
	}

	public String getOpenRoleId() {
		return this.openRoleId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.authorization.rbac.role.resource.update";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("open_resources", this.openResources);
		txtParams.put("open_role_id", this.openRoleId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAuthorizationRbacRoleResourceUpdateResponse> getResponseClass() {
		return OapiAuthorizationRbacRoleResourceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(openResources, "openResources");
		RequestCheckUtils.checkMaxListSize(openResources, 999, "openResources");
		RequestCheckUtils.checkNotEmpty(openRoleId, "openRoleId");
	}
	

}