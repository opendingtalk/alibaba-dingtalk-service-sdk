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

import com.dingtalk.api.response.OapiWorkspaceProjectMemberRemoveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.member.remove request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.23
 */
public class OapiWorkspaceProjectMemberRemoveRequest extends BaseTaobaoRequest<OapiWorkspaceProjectMemberRemoveResponse> {
	
	

	/** 
	* 操作人工号
	 */
	private String operatorStaffId;

	/** 
	* 来源ID
	 */
	private String projectSourceId;

	/** 
	* 来源
	 */
	private String source;

	/** 
	* 待删除成员工号
	 */
	private String staffId;

	public void setOperatorStaffId(String operatorStaffId) {
		this.operatorStaffId = operatorStaffId;
	}

	public String getOperatorStaffId() {
		return this.operatorStaffId;
	}

	public void setProjectSourceId(String projectSourceId) {
		this.projectSourceId = projectSourceId;
	}

	public String getProjectSourceId() {
		return this.projectSourceId;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return this.source;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.project.member.remove";
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
		txtParams.put("operator_staff_id", this.operatorStaffId);
		txtParams.put("project_source_id", this.projectSourceId);
		txtParams.put("source", this.source);
		txtParams.put("staff_id", this.staffId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceProjectMemberRemoveResponse> getResponseClass() {
		return OapiWorkspaceProjectMemberRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operatorStaffId, "operatorStaffId");
		RequestCheckUtils.checkNotEmpty(projectSourceId, "projectSourceId");
		RequestCheckUtils.checkNotEmpty(staffId, "staffId");
	}
	

}