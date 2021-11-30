package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2DepartmentGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6758969981718486563L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 部门详情
	 */
	@ApiField("result")
	private DeptGetResponse result;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(DeptGetResponse result) {
		this.result = result;
	}
	public DeptGetResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 部门详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptGetResponse extends TaobaoObject {
		private static final long serialVersionUID = 3329659224714181317L;
		/**
		 * 当群已经创建后，是否有新人加入部门会自动加入该群
		 */
		@ApiField("auto_add_user")
		private Boolean autoAddUser;
		/**
		 * 开启后，加入该部门的申请将默认同意
		 */
		@ApiField("auto_approve_apply")
		private Boolean autoApproveApply;
		/**
		 * 部门简介
		 */
		@ApiField("brief")
		private String brief;
		/**
		 * 是否同步创建一个关联此部门的企业群, true表示是, false表示不是
		 */
		@ApiField("create_dept_group")
		private Boolean createDeptGroup;
		/**
		 * 部门群ID
		 */
		@ApiField("dept_group_chat_id")
		private String deptGroupChatId;
		/**
		 * 部门ID
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门的主管列表
		 */
		@ApiListField("dept_manager_userid_list")
		@ApiField("string")
		private List<String> deptManagerUseridList;
		/**
		 * 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的数组
		 */
		@ApiListField("dept_permits")
		@ApiField("number")
		private List<Long> deptPermits;
		/**
		 * 扩展字段
		 */
		@ApiField("extention")
		private String extention;
		/**
		 * 部门是否来自关联组织
		 */
		@ApiField("from_union_org")
		private Boolean fromUnionOrg;
		/**
		 * 部门群是否包含子部门
		 */
		@ApiField("group_contain_sub_dept")
		private Boolean groupContainSubDept;
		/**
		 * 是否隐藏部门, true表示隐藏, false表示显示
		 */
		@ApiField("hide_dept")
		private Boolean hideDept;
		/**
		 * 部门名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 在父部门中的次序值
		 */
		@ApiField("order")
		private Long order;
		/**
		 * 企业群群主ID
		 */
		@ApiField("org_dept_owner")
		private String orgDeptOwner;
		/**
		 * 是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己
		 */
		@ApiField("outer_dept")
		private Boolean outerDept;
		/**
		 * 本部门的员工仅可见员工自己为true时，可以配置额外可见部门
		 */
		@ApiListField("outer_permit_depts")
		@ApiField("number")
		private List<Long> outerPermitDepts;
		/**
		 * 本部门的员工仅可见员工自己为true时，可以配置额外可见人员
		 */
		@ApiListField("outer_permit_users")
		@ApiField("string")
		private List<String> outerPermitUsers;
		/**
		 * 父部门id，根部门为1
		 */
		@ApiField("parent_id")
		private Long parentId;
		/**
		 * 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射
		 */
		@ApiField("source_identifier")
		private String sourceIdentifier;
		/**
		 * 教育行业部门类型，包括campus,period,grade,class.
		 */
		@ApiField("tags")
		private String tags;
		/**
		 * 联系方式（手机号码或座机号码）
		 */
		@ApiField("telephone")
		private String telephone;
		/**
		 * 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的数组
		 */
		@ApiListField("user_permits")
		@ApiField("string")
		private List<String> userPermits;
	
		public Boolean getAutoAddUser() {
			return this.autoAddUser;
		}
		public void setAutoAddUser(Boolean autoAddUser) {
			this.autoAddUser = autoAddUser;
		}
		public Boolean getAutoApproveApply() {
			return this.autoApproveApply;
		}
		public void setAutoApproveApply(Boolean autoApproveApply) {
			this.autoApproveApply = autoApproveApply;
		}
		public String getBrief() {
			return this.brief;
		}
		public void setBrief(String brief) {
			this.brief = brief;
		}
		public Boolean getCreateDeptGroup() {
			return this.createDeptGroup;
		}
		public void setCreateDeptGroup(Boolean createDeptGroup) {
			this.createDeptGroup = createDeptGroup;
		}
		public String getDeptGroupChatId() {
			return this.deptGroupChatId;
		}
		public void setDeptGroupChatId(String deptGroupChatId) {
			this.deptGroupChatId = deptGroupChatId;
		}
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public List<String> getDeptManagerUseridList() {
			return this.deptManagerUseridList;
		}
		public void setDeptManagerUseridList(List<String> deptManagerUseridList) {
			this.deptManagerUseridList = deptManagerUseridList;
		}
		public List<Long> getDeptPermits() {
			return this.deptPermits;
		}
		public void setDeptPermits(List<Long> deptPermits) {
			this.deptPermits = deptPermits;
		}
		public String getExtention() {
			return this.extention;
		}
		public void setExtention(String extention) {
			this.extention = extention;
		}
		public Boolean getFromUnionOrg() {
			return this.fromUnionOrg;
		}
		public void setFromUnionOrg(Boolean fromUnionOrg) {
			this.fromUnionOrg = fromUnionOrg;
		}
		public Boolean getGroupContainSubDept() {
			return this.groupContainSubDept;
		}
		public void setGroupContainSubDept(Boolean groupContainSubDept) {
			this.groupContainSubDept = groupContainSubDept;
		}
		public Boolean getHideDept() {
			return this.hideDept;
		}
		public void setHideDept(Boolean hideDept) {
			this.hideDept = hideDept;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
		}
		public String getOrgDeptOwner() {
			return this.orgDeptOwner;
		}
		public void setOrgDeptOwner(String orgDeptOwner) {
			this.orgDeptOwner = orgDeptOwner;
		}
		public Boolean getOuterDept() {
			return this.outerDept;
		}
		public void setOuterDept(Boolean outerDept) {
			this.outerDept = outerDept;
		}
		public List<Long> getOuterPermitDepts() {
			return this.outerPermitDepts;
		}
		public void setOuterPermitDepts(List<Long> outerPermitDepts) {
			this.outerPermitDepts = outerPermitDepts;
		}
		public List<String> getOuterPermitUsers() {
			return this.outerPermitUsers;
		}
		public void setOuterPermitUsers(List<String> outerPermitUsers) {
			this.outerPermitUsers = outerPermitUsers;
		}
		public Long getParentId() {
			return this.parentId;
		}
		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}
		public String getSourceIdentifier() {
			return this.sourceIdentifier;
		}
		public void setSourceIdentifier(String sourceIdentifier) {
			this.sourceIdentifier = sourceIdentifier;
		}
		public String getTags() {
			return this.tags;
		}
		public void setTags(String tags) {
			this.tags = tags;
		}
		public String getTelephone() {
			return this.telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public List<String> getUserPermits() {
			return this.userPermits;
		}
		public void setUserPermits(List<String> userPermits) {
			this.userPermits = userPermits;
		}
	}
	


}
