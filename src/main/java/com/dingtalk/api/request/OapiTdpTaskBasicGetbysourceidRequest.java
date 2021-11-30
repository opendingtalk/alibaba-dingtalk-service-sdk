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

import com.dingtalk.api.response.OapiTdpTaskBasicGetbysourceidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.task.basic.getbysourceid request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.23
 */
public class OapiTdpTaskBasicGetbysourceidRequest extends BaseTaobaoRequest<OapiTdpTaskBasicGetbysourceidResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long agentId;

	/** 
	* 任务来源source
	 */
	private String source;

	/** 
	* 任务来源sourceId
	 */
	private String sourceId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
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
		return "dingtalk.oapi.tdp.task.basic.getbysourceid";
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
		txtParams.put("source", this.source);
		txtParams.put("source_id", this.sourceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpTaskBasicGetbysourceidResponse> getResponseClass() {
		return OapiTdpTaskBasicGetbysourceidResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(sourceId, "sourceId");
	}
	

}