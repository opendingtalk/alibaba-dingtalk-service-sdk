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

import com.dingtalk.api.response.OapiWorkspaceTaskCleanResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.task.clean request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.23
 */
public class OapiWorkspaceTaskCleanRequest extends BaseTaobaoRequest<OapiWorkspaceTaskCleanResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long agentid;

	/** 
	* 企业corpId
	 */
	private String corpId;

	/** 
	* 操作者id
	 */
	private String operatorUserid;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.task.clean";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("operator_userid", this.operatorUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceTaskCleanResponse> getResponseClass() {
		return OapiWorkspaceTaskCleanResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpId, "corpId");
	}
	

}