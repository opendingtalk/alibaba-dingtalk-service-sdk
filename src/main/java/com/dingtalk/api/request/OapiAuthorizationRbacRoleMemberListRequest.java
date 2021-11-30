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

import com.dingtalk.api.response.OapiAuthorizationRbacRoleMemberListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.member.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.21
 */
public class OapiAuthorizationRbacRoleMemberListRequest extends BaseTaobaoRequest<OapiAuthorizationRbacRoleMemberListResponse> {
	
	

	/** 
	* 微应用agenId,需要联系权限平台配置
	 */
	private String agentId;

	/** 
	* 分页游标
	 */
	private Long cursor;

	/** 
	* 管理组id
	 */
	private String openRoleId;

	/** 
	* 分页size
	 */
	private Long size;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setOpenRoleId(String openRoleId) {
		this.openRoleId = openRoleId;
	}

	public String getOpenRoleId() {
		return this.openRoleId;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.authorization.rbac.role.member.list";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("open_role_id", this.openRoleId);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAuthorizationRbacRoleMemberListResponse> getResponseClass() {
		return OapiAuthorizationRbacRoleMemberListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(openRoleId, "openRoleId");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 20L, "size");
	}
	

}