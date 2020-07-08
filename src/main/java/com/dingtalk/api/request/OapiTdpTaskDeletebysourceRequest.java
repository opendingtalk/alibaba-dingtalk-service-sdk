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

import com.dingtalk.api.response.OapiTdpTaskDeletebysourceResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.task.deletebysource request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.01
 */
public class OapiTdpTaskDeletebysourceRequest extends BaseTaobaoRequest<OapiTdpTaskDeletebysourceResponse> {
	
	

	/** 
	* 应用token
	 */
	private String accessToken;

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 操作者id
	 */
	private String operatorId;

	/** 
	* 来源
	 */
	private String source;

	/** 
	* 来源id
	 */
	private String sourceId;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return this.source;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.tdp.task.deletebysource";
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
		txtParams.put("accessToken", this.accessToken);
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("operatorId", this.operatorId);
		txtParams.put("source", this.source);
		txtParams.put("sourceId", this.sourceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpTaskDeletebysourceResponse> getResponseClass() {
		return OapiTdpTaskDeletebysourceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(microappAgentId, "microappAgentId");
	}
	

}