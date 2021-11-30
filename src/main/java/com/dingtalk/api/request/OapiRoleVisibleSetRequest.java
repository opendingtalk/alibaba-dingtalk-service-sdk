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

import com.dingtalk.api.response.OapiRoleVisibleSetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.visible.set request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.18
 */
public class OapiRoleVisibleSetRequest extends BaseTaobaoRequest<OapiRoleVisibleSetResponse> {
	
	

	/** 
	* roleId
	 */
	private Long roleId;

	/** 
	* roleId可见的roleIdList
	 */
	private String visibleRoleIds;

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setVisibleRoleIds(String visibleRoleIds) {
		this.visibleRoleIds = visibleRoleIds;
	}

	public String getVisibleRoleIds() {
		return this.visibleRoleIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.role.visible.set";
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
		txtParams.put("role_id", this.roleId);
		txtParams.put("visible_role_ids", this.visibleRoleIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRoleVisibleSetResponse> getResponseClass() {
		return OapiRoleVisibleSetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(roleId, "roleId");
		RequestCheckUtils.checkNotEmpty(visibleRoleIds, "visibleRoleIds");
		RequestCheckUtils.checkMaxListSize(visibleRoleIds, 50, "visibleRoleIds");
	}
	

}