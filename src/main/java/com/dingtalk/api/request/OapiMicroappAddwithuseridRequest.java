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

import com.dingtalk.api.response.OapiMicroappAddwithuseridResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.addwithuserid request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiMicroappAddwithuseridRequest extends BaseTaobaoRequest<OapiMicroappAddwithuseridResponse> {
	
	

	/** 
	* 微应用实例化id，表示企业和微应用的唯一关系
	 */
	private Long agentId;

	/** 
	* 用户id列表，最多10个
	 */
	private String userids;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setUserids(String userids) {
		this.userids = userids;
	}

	public String getUserids() {
		return this.userids;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.addwithuserid";
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
		txtParams.put("userids", this.userids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappAddwithuseridResponse> getResponseClass() {
		return OapiMicroappAddwithuseridResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(userids, "userids");
		RequestCheckUtils.checkMaxListSize(userids, 20, "userids");
	}
	

}