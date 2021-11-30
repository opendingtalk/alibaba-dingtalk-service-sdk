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

import com.dingtalk.api.response.OapiWikiResourceAuthResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.wiki.resource.auth request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.28
 */
public class OapiWikiResourceAuthRequest extends BaseTaobaoRequest<OapiWikiResourceAuthResponse> {
	
	

	/** 
	* 应用agentId
	 */
	private Long agentid;

	/** 
	* 个人授权信息
	 */
	private String authCode;

	/** 
	* 是否是公开发布的知识库
	 */
	private Boolean isPublic;

	/** 
	* 请求授权的资源列表
	 */
	private String resourceList;

	/** 
	* 1:知识库，2:知识本，3:知识页
	 */
	private Long resourceType;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setResourceList(String resourceList) {
		this.resourceList = resourceList;
	}

	public String getResourceList() {
		return this.resourceList;
	}

	public void setResourceType(Long resourceType) {
		this.resourceType = resourceType;
	}

	public Long getResourceType() {
		return this.resourceType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.wiki.resource.auth";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("auth_code", this.authCode);
		txtParams.put("is_public", this.isPublic);
		txtParams.put("resource_list", this.resourceList);
		txtParams.put("resource_type", this.resourceType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWikiResourceAuthResponse> getResponseClass() {
		return OapiWikiResourceAuthResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
		RequestCheckUtils.checkNotEmpty(authCode, "authCode");
		RequestCheckUtils.checkNotEmpty(isPublic, "isPublic");
		RequestCheckUtils.checkNotEmpty(resourceList, "resourceList");
		RequestCheckUtils.checkMaxListSize(resourceList, 999, "resourceList");
		RequestCheckUtils.checkNotEmpty(resourceType, "resourceType");
	}
	

}