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
import com.dingtalk.api.response.OapiAuthorizationRbacRoleCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.20
 */
public class OapiAuthorizationRbacRoleCreateRequest extends BaseTaobaoRequest<OapiAuthorizationRbacRoleCreateResponse> {
	
	

	/** 
	* 微应用agenId,需要联系权限平台配置
	 */
	private String agentId;

	/** 
	* 管理组详情
	 */
	private String openRoleCreate;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setOpenRoleCreate(String openRoleCreate) {
		this.openRoleCreate = openRoleCreate;
	}

	public void setOpenRoleCreate(OpenRoleCreateVo openRoleCreate) {
		this.openRoleCreate = new JSONWriter(false,false,true).write(openRoleCreate);
	}

	public String getOpenRoleCreate() {
		return this.openRoleCreate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.authorization.rbac.role.create";
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
		txtParams.put("open_role_create", this.openRoleCreate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAuthorizationRbacRoleCreateResponse> getResponseClass() {
		return OapiAuthorizationRbacRoleCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
	}
	
	/**
	 * contactScope
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenContactScopeVo extends TaobaoObject {
		private static final long serialVersionUID = 3338287528536446337L;
		/**
		 * 可管理的指定部门
		 */
		@ApiListField("dept_ids")
		@ApiField("number")
		private List<Long> deptIds;
		/**
		 * 员工所在的部门
		 */
		@ApiField("include_member_depts")
		private Boolean includeMemberDepts;
		/**
		 * 主管能管理的部门
		 */
		@ApiField("include_self_manage_depts")
		private Boolean includeSelfManageDepts;
		/**
		 * 可管理的员工列表
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
	 * conditon
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenConditionVo extends TaobaoObject {
		private static final long serialVersionUID = 7835769589671777834L;
		/**
		 * contactScope
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
	 * aciton列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenActionVo extends TaobaoObject {
		private static final long serialVersionUID = 6337847579112758419L;
		/**
		 * acitonId列表
		 */
		@ApiListField("action_ids")
		@ApiField("string")
		private List<String> actionIds;
		/**
		 * conditon
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
	
	/**
	 * 成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberVo extends TaobaoObject {
		private static final long serialVersionUID = 4695651611491895753L;
		/**
		 * member所属组织
		 */
		@ApiField("belong_corpid")
		private String belongCorpid;
		/**
		 * 成员id
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * 成员类型
		 */
		@ApiField("member_type")
		private String memberType;
		/**
		 * 操作人userid
		 */
		@ApiField("operate_userid")
		private String operateUserid;
	
		public String getBelongCorpid() {
			return this.belongCorpid;
		}
		public void setBelongCorpid(String belongCorpid) {
			this.belongCorpid = belongCorpid;
		}
		public String getMemberId() {
			return this.memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public String getMemberType() {
			return this.memberType;
		}
		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}
		public String getOperateUserid() {
			return this.operateUserid;
		}
		public void setOperateUserid(String operateUserid) {
			this.operateUserid = operateUserid;
		}
	}
	
	/**
	 * 管理组详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRoleCreateVo extends TaobaoObject {
		private static final long serialVersionUID = 7772918184455881782L;
		/**
		 * aciton列表
		 */
		@ApiField("open_action")
		private OpenActionVo openAction;
		/**
		 * 成员列表
		 */
		@ApiListField("open_members")
		@ApiField("open_member_vo")
		private List<OpenMemberVo> openMembers;
		/**
		 * 资源列表
		 */
		@ApiListField("open_resources")
		@ApiField("string")
		private List<String> openResources;
		/**
		 * 管理组id,注意:创建的时候不要填写
		 */
		@ApiField("open_role_id")
		private String openRoleId;
		/**
		 * 管理组名
		 */
		@ApiField("open_role_name")
		private String openRoleName;
	
		public OpenActionVo getOpenAction() {
			return this.openAction;
		}
		public void setOpenAction(OpenActionVo openAction) {
			this.openAction = openAction;
		}
		public List<OpenMemberVo> getOpenMembers() {
			return this.openMembers;
		}
		public void setOpenMembers(List<OpenMemberVo> openMembers) {
			this.openMembers = openMembers;
		}
		public List<String> getOpenResources() {
			return this.openResources;
		}
		public void setOpenResources(List<String> openResources) {
			this.openResources = openResources;
		}
		public String getOpenRoleId() {
			return this.openRoleId;
		}
		public void setOpenRoleId(String openRoleId) {
			this.openRoleId = openRoleId;
		}
		public String getOpenRoleName() {
			return this.openRoleName;
		}
		public void setOpenRoleName(String openRoleName) {
			this.openRoleName = openRoleName;
		}
	}
	

}