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

import com.dingtalk.api.response.OapiWorkspaceTasklistHidebyprojectResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.tasklist.hidebyproject request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.23
 */
public class OapiWorkspaceTasklistHidebyprojectRequest extends BaseTaobaoRequest<OapiWorkspaceTasklistHidebyprojectResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 操作者id
	 */
	private String operatorUserid;

	/** 
	* 任务所属项目(虚拟企业），基于项目空间的项目
	 */
	private String projectId;

	/** 
	* 用户id
	 */
	private String userid;

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

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.tasklist.hidebyproject";
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
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceTasklistHidebyprojectResponse> getResponseClass() {
		return OapiWorkspaceTasklistHidebyprojectResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operatorUserid, "operatorUserid");
		RequestCheckUtils.checkNotEmpty(projectId, "projectId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}