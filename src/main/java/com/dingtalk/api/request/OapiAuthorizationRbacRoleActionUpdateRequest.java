package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiAuthorizationRbacRoleActionUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.action.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.20
 */
public class OapiAuthorizationRbacRoleActionUpdateRequest extends BaseTaobaoRequest<OapiAuthorizationRbacRoleActionUpdateResponse> {
	
	

	/** 
	* 微应用agenId,需要联系权限平台配置
	 */
	private String agentId;

	/** 
	* action
	 */
	private String openAction;

	/** 
	* 管理组id
	 */
	private String openRoleId;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setOpenAction(String openAction) {
		this.openAction = openAction;
	}

	public void setOpenAction(OpenActionVo openAction) {
		this.openAction = new JSONWriter(false,false,true).write(openAction);
	}

	public String getOpenAction() {
		return this.openAction;
	}

	public void setOpenRoleId(String openRoleId) {
		this.openRoleId = openRoleId;
	}

	public String getOpenRoleId() {
		return this.openRoleId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.authorization.rbac.role.action.update";
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
		txtParams.put("open_action", this.openAction);
		txtParams.put("open_role_id", this.openRoleId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAuthorizationRbacRoleActionUpdateResponse> getResponseClass() {
		return OapiAuthorizationRbacRoleActionUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(openRoleId, "openRoleId");
	}
	
	/**
	 * 通讯录约束范围
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenContactScopeVo extends TaobaoObject {
		private static final long serialVersionUID = 6566224911563347419L;
		/**
		 * 可管理的部门id列表
		 */
		@ApiListField("dept_ids")
		@ApiField("number")
		private List<Long> deptIds;
		/**
		 * 是否包含所在的部门
		 */
		@ApiField("include_member_depts")
		private Boolean includeMemberDepts;
		/**
		 * 是否包含可管理的部门
		 */
		@ApiField("include_self_manage_depts")
		private Boolean includeSelfManageDepts;
		/**
		 * 员工id列表
		 */
		@ApiListField("userids")
		@ApiField("string")
		private List<String> userids;
	
		public List<Long> getDeptIds() {
			return this.deptIds;
		}
		public void setDeptIds(List<Long> deptIds) {
			this.deptIds = deptIds;
		}
		public Boolean getIncludeMemberDepts() {
			return this.includeMemberDepts;
		}
		public void setIncludeMemberDepts(Boolean includeMemberDepts) {
			this.includeMemberDepts = includeMemberDepts;
		}
		public Boolean getIncludeSelfManageDepts() {
			return this.includeSelfManageDepts;
		}
		public void setIncludeSelfManageDepts(Boolean includeSelfManageDepts) {
			this.includeSelfManageDepts = includeSelfManageDepts;
		}
		public List<String> getUserids() {
			return this.userids;
		}
		public void setUserids(List<String> userids) {
			this.userids = userids;
		}
	}
	
	/**
	 * condition
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenConditionVo extends TaobaoObject {
		private static final long serialVersionUID = 5835451971866715558L;
		/**
		 * 通讯录约束范围
		 */
		@ApiField("open_contact_scope")
		private OpenContactScopeVo openContactScope;
	
		public OpenContactScopeVo getOpenContactScope() {
			return this.openContactScope;
		}
		public void setOpenContactScope(OpenContactScopeVo openContactScope) {
			this.openContactScope = openContactScope;
		}
	}
	
	/**
	 * action
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenActionVo extends TaobaoObject {
		private static final long serialVersionUID = 3713828295829894295L;
		/**
		 * actionId列表
		 */
		@ApiListField("action_ids")
		@ApiField("string")
		private List<String> actionIds;
		/**
		 * condition
		 */
		@ApiField("open_condition")
		private OpenConditionVo openCondition;
	
		public List<String> getActionIds() {
			return this.actionIds;
		}
		public void setActionIds(List<String> actionIds) {
			this.actionIds = actionIds;
		}
		public OpenConditionVo getOpenCondition() {
			return this.openCondition;
		}
		public void setOpenCondition(OpenConditionVo openCondition) {
			this.openCondition = openCondition;
		}
	}
	

}