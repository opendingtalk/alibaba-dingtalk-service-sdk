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

import com.dingtalk.api.response.OapiAuthorizationRbacRoleQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.01
 */
public class OapiAuthorizationRbacRoleQueryRequest extends BaseTaobaoRequest<OapiAuthorizationRbacRoleQueryResponse> {
	
	

	/** 
	* 微应用agenId,需要联系权限平台配置
	 */
	private String agentId;

	/** 
	* 管理组id
	 */
	private String openRoleIds;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setOpenRoleIds(String openRoleIds) {
		this.openRoleIds = openRoleIds;
	}

	public String getOpenRoleIds() {
		return this.openRoleIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.authorization.rbac.role.query";
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
		txtParams.put("open_role_ids", this.openRoleIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAuthorizationRbacRoleQueryResponse> getResponseClass() {
		return OapiAuthorizationRbacRoleQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(openRoleIds, "openRoleIds");
		RequestCheckUtils.checkMaxListSize(openRoleIds, 999, "openRoleIds");
	}
	

}