package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappSetVisibleScopesResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.set_visible_scopes request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappSetVisibleScopesRequest extends BaseTaobaoRequest<OapiMicroappSetVisibleScopesResponse> {
	
	

	/** 
	* 微应用实例化id
	 */
	private Long agentId;

	/** 
	* 设置可见的部门id列表，格式为JSON数组
	 */
	private List<Long> deptVisibleScopes;

	/** 
	* 是否仅限管理员可见，true代表仅限管理员可见
	 */
	private Boolean isHidden;

	/** 
	* 设置可见的员工id列表，格式为JSON数组
	 */
	private List<String> userVisibleScopes;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setDeptVisibleScopes(List<Long> deptVisibleScopes) {
		this.deptVisibleScopes = deptVisibleScopes;
	}

	public List<Long> getDeptVisibleScopes() {
		return this.deptVisibleScopes;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	public Boolean getIsHidden() {
		return this.isHidden;
	}

	public void setUserVisibleScopes(List<String> userVisibleScopes) {
		this.userVisibleScopes = userVisibleScopes;
	}

	public List<String> getUserVisibleScopes() {
		return this.userVisibleScopes;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.set_visible_scopes";
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
		txtParams.put("agentId", this.agentId);
		txtParams.put("deptVisibleScopes", TaobaoUtils.objectToJson(this.deptVisibleScopes));
		txtParams.put("isHidden", this.isHidden);
		txtParams.put("userVisibleScopes", TaobaoUtils.objectToJson(this.userVisibleScopes));
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappSetVisibleScopesResponse> getResponseClass() {
		return OapiMicroappSetVisibleScopesResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}