package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.authorization.rbac.role.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAuthorizationRbacRoleQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1126152881813734732L;

	/** 
	 * 响应结果
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
	 * 通讯录约束条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenContactScopeVo extends TaobaoObject {
		private static final long serialVersionUID = 8855169163812269627L;
		/**
		 * 被授权人可管理的部门列表
		 */
		@ApiListField("dept_ids")
		@ApiField("number")
		private List<Long> deptIds;
		/**
		 * 被授权人所在部门
		 */
		@ApiField("include_member_depts")
		private Boolean includeMemberDepts;
		/**
		 * 被授权人所能管理的部门
		 */
		@ApiField("include_self_manage_depts")
		private Boolean includeSelfManageDepts;
		/**
		 * 被授权人可管理的员工列表
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
	 * 约束条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenConditionVo extends TaobaoObject {
		private static final long serialVersionUID = 5385757178944173937L;
		/**
		 * 通讯录约束条件
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
	 * openAction
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenActionVo extends TaobaoObject {
		private static final long serialVersionUID = 2663819788969882668L;
		/**
		 * actionIds
		 */
		@ApiListField("action_ids")
		@ApiField("string")
		private List<String> actionIds;
		/**
		 * 约束条件
		 */
		@ApiField("open_conditon")
		private OpenConditionVo openConditon;
	
		public List<String> getActionIds() {
			return this.actionIds;
		}
		public void setActionIds(List<String> actionIds) {
			this.actionIds = actionIds;
		}
		public OpenConditionVo getOpenConditon() {
			return this.openConditon;
		}
		public void setOpenConditon(OpenConditionVo openConditon) {
			this.openConditon = openConditon;
		}
	}
	
	/**
	 * openMemberVO
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenMemberVo extends TaobaoObject {
		private static final long serialVersionUID = 8292442122651455391L;
		/**
		 * member所属组织corpid
		 */
		@ApiField("belong_corpid")
		private String belongCorpid;
		/**
		 * member id
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * member类型
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
	 * 响应结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEamRoleVo extends TaobaoObject {
		private static final long serialVersionUID = 1556996961529312314L;
		/**
		 * openAction
		 */
		@ApiField("open_action")
		private OpenActionVo openAction;
		/**
		 * openMemberVO
		 */
		@ApiListField("open_members")
		@ApiField("open_member_vo")
		private List<OpenMemberVo> openMembers;
		/**
		 * 管理组授权的资源
		 */
		@ApiListField("open_resources")
		@ApiField("string")
		private List<String> openResources;
		/**
		 * 管理组id
		 */
		@ApiField("open_role_id")
		private String openRoleId;
		/**
		 * 管理组名称
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
	
	/**
	 * 响应结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3261651427618365785L;
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
		 * 响应结果
		 */
		@ApiListField("result")
		@ApiField("open_eam_role_vo")
		private List<OpenEamRoleVo> result;
		/**
		 * 调用是否成功
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
		public List<OpenEamRoleVo> getResult() {
			return this.result;
		}
		public void setResult(List<OpenEamRoleVo> result) {
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
