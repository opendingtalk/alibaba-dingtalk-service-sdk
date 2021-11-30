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

import com.dingtalk.api.response.OapiTdpProjectMemberBatchremoveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.project.member.batchremove request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.23
 */
public class OapiTdpProjectMemberBatchremoveRequest extends BaseTaobaoRequest<OapiTdpProjectMemberBatchremoveResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 操作者id
	 */
	private String operatorUserid;

	/** 
	* 项目ID
	 */
	private String projectId;

	/** 
	* 用户ID列表
	 */
	private String userids;

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setUserids(String userids) {
		this.userids = userids;
	}

	public String getUserids() {
		return this.userids;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.tdp.project.member.batchremove";
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
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("operator_userid", this.operatorUserid);
		txtParams.put("project_id", this.projectId);
		txtParams.put("userids", this.userids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpProjectMemberBatchremoveResponse> getResponseClass() {
		return OapiTdpProjectMemberBatchremoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operatorUserid, "operatorUserid");
		RequestCheckUtils.checkNotEmpty(projectId, "projectId");
		RequestCheckUtils.checkMaxListSize(userids, 1000, "userids");
	}
	

}