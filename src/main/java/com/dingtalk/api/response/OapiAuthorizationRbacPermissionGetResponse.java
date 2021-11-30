package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.permission.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAuthorizationRbacPermissionGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6211265249665641756L;

	/** 
	 * 服务端响应
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 通讯录范围约束
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenContactScopeVo extends TaobaoObject {
		private static final long serialVersionUID = 4195835995718144143L;
		/**
		 * 部门id列表
		 */
		@ApiListField("dept_ids")
		@ApiField("number")
		private List<Long> deptIds;
		/**
		 * 被授权人所在的部门
		 */
		@ApiField("include_member_depts")
		private Boolean includeMemberDepts;
		/**
		 * 被授权人所管理的部门
		 */
		@ApiField("include_self_manage_depts")
		private Boolean includeSelfManageDepts;
		/**
		 * 员工列表
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
	 * 权限的范围约束
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenConditionVo extends TaobaoObject {
		private static final long serialVersionUID = 4323948477528345199L;
		/**
		 * 通讯录范围约束
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
	 * action列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenActionResultVo extends TaobaoObject {
		private static final long serialVersionUID = 4181849691455432463L;
		/**
		 * actionId
		 */
		@ApiField("action_id")
		private String actionId;
		/**
		 * 权限的范围约束
		 */
		@ApiField("open_condition")
		private OpenConditionVo openCondition;
	
		public String getActionId() {
			return this.actionId;
		}
		public void setActionId(String actionId) {
			this.actionId = actionId;
		}
		public OpenConditionVo getOpenCondition() {
			return this.openCondition;
		}
		public void setOpenCondition(OpenConditionVo openCondition) {
			this.openCondition = openCondition;
		}
	}
	
	/**
	 * PermitResultVo
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PermitResultVo extends TaobaoObject {
		private static final long serialVersionUID = 5858671294941233722L;
		/**
		 * action列表
		 */
		@ApiListField("open_action_results")
		@ApiField("open_action_result_vo")
		private List<OpenActionResultVo> openActionResults;
		/**
		 * 是否有权限
		 */
		@ApiField("permit")
		private Boolean permit;
	
		public List<OpenActionResultVo> getOpenActionResults() {
			return this.openActionResults;
		}
		public void setOpenActionResults(List<OpenActionResultVo> openActionResults) {
			this.openActionResults = openActionResults;
		}
		public Boolean getPermit() {
			return this.permit;
		}
		public void setPermit(Boolean permit) {
			this.permit = permit;
		}
	}
	
	/**
	 * 服务端响应
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5214383923489698484L;
		/**
		 * errcode
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * errmsg
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * PermitResultVo
		 */
		@ApiField("result")
		private PermitResultVo result;
		/**
		 * 鉴权成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public PermitResultVo getResult() {
			return this.result;
		}
		public void setResult(PermitResultVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
