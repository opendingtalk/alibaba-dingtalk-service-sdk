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

import com.dingtalk.api.response.OapiRoleScopeUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.scope.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.13
 */
public class OapiRoleScopeUpdateRequest extends BaseTaobaoRequest<OapiRoleScopeUpdateResponse> {
	
	

	/** 
	* 部门ID列表数
	 */
	private String deptIds;

	/** 
	* 角色ID
	 */
	private Long roleId;

	/** 
	* 员工在企业中的ID
	 */
	private String userid;

	public void setDeptIds(String deptIds) {
		this.deptIds = deptIds;
	}

	public String getDeptIds() {
		return this.deptIds;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.role.scope.update";
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
		txtParams.put("dept_ids", this.deptIds);
		txtParams.put("role_id", this.roleId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRoleScopeUpdateResponse> getResponseClass() {
		return OapiRoleScopeUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deptIds, 200, "deptIds");
		RequestCheckUtils.checkNotEmpty(roleId, "roleId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}