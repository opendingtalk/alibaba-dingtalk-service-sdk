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

import com.dingtalk.api.response.OapiV2DepartmentUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.03
 */
public class OapiV2DepartmentUpdateRequest extends BaseTaobaoRequest<OapiV2DepartmentUpdateResponse> {
	
	

	/** 
	* 如果有新人加入部门是否会自动加入部门群
	 */
	private Boolean autoAddUser;

	/** 
	* 是否自动更新排序, 设置主管会自动把主管排序靠前, 设置为false关闭这个自动排序 未公开字段
	 */
	private Boolean autoReorderManager;

	/** 
	* 是否创建一个关联此部门的企业群，默认为false
	 */
	private Boolean createDeptGroup;

	/** 
	* 是否隐藏部门, true表示隐藏, false表示显示
	 */
	private Boolean deptHiding;

	/** 
	* 部门的主管列表，主管的userid列表
	 */
	private String deptManagerUseridList;

	/** 
	* 可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效。总数不能超过200。
	 */
	private String deptPermits;

	/** 
	* 扩展字段，JSON格式
	 */
	private String ext;

	/** 
	* 部门群是否包含隐藏部门
	 */
	private Boolean groupContainHiddenDept;

	/** 
	* 部门群是否包含外包部门
	 */
	private Boolean groupContainOuterDept;

	/** 
	* 本门群是否包含子部门
	 */
	private Boolean groupContainSubDept;

	/** 
	* 要修改的部门ID
	 */
	private Long id;

	/** 
	* 部门名称。长度限制为1~64个字符。不允许包含字符‘-’‘，’以及‘,’
	 */
	private String name;

	/** 
	* 在父部门中的次序值。order值小的排序靠前
	 */
	private Long order;

	/** 
	* 指定部门owner的userid
	 */
	private String orgDeptOwner;

	/** 
	* 是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己
	 */
	private Boolean outerDept;

	/** 
	* 是否只能看到所在部门及下级部门通讯录
	 */
	private Boolean outerDeptOnlySelf;

	/** 
	* 本部门的员工仅可见员工自己为true时，可以配置额外可见部门，departmentId列表，总数不能超过200。
	 */
	private String outerPermitDepts;

	/** 
	* 本门群是否包含子部门
	 */
	private String outerPermitUsers;

	/** 
	* 是否优先使用父部门的预算
	 */
	private Boolean parentBalanceFirst;

	/** 
	* 本门群是否包含子部门
	 */
	private Long parentId;

	/** 
	* 是否共享预算
	 */
	private Boolean shareBalance;

	/** 
	* 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射
	 */
	private String sourceIdentifier;

	/** 
	* 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，总数不能超过200。
	 */
	private String userPermits;

	public void setAutoAddUser(Boolean autoAddUser) {
		this.autoAddUser = autoAddUser;
	}

	public Boolean getAutoAddUser() {
		return this.autoAddUser;
	}

	public void setAutoReorderManager(Boolean autoReorderManager) {
		this.autoReorderManager = autoReorderManager;
	}

	public Boolean getAutoReorderManager() {
		return this.autoReorderManager;
	}

	public void setCreateDeptGroup(Boolean createDeptGroup) {
		this.createDeptGroup = createDeptGroup;
	}

	public Boolean getCreateDeptGroup() {
		return this.createDeptGroup;
	}

	public void setDeptHiding(Boolean deptHiding) {
		this.deptHiding = deptHiding;
	}

	public Boolean getDeptHiding() {
		return this.deptHiding;
	}

	public void setDeptManagerUseridList(String deptManagerUseridList) {
		this.deptManagerUseridList = deptManagerUseridList;
	}

	public String getDeptManagerUseridList() {
		return this.deptManagerUseridList;
	}

	public void setDeptPermits(String deptPermits) {
		this.deptPermits = deptPermits;
	}

	public String getDeptPermits() {
		return this.deptPermits;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return this.ext;
	}

	public void setGroupContainHiddenDept(Boolean groupContainHiddenDept) {
		this.groupContainHiddenDept = groupContainHiddenDept;
	}

	public Boolean getGroupContainHiddenDept() {
		return this.groupContainHiddenDept;
	}

	public void setGroupContainOuterDept(Boolean groupContainOuterDept) {
		this.groupContainOuterDept = groupContainOuterDept;
	}

	public Boolean getGroupContainOuterDept() {
		return this.groupContainOuterDept;
	}

	public void setGroupContainSubDept(Boolean groupContainSubDept) {
		this.groupContainSubDept = groupContainSubDept;
	}

	public Boolean getGroupContainSubDept() {
		return this.groupContainSubDept;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public Long getOrder() {
		return this.order;
	}

	public void setOrgDeptOwner(String orgDeptOwner) {
		this.orgDeptOwner = orgDeptOwner;
	}

	public String getOrgDeptOwner() {
		return this.orgDeptOwner;
	}

	public void setOuterDept(Boolean outerDept) {
		this.outerDept = outerDept;
	}

	public Boolean getOuterDept() {
		return this.outerDept;
	}

	public void setOuterDeptOnlySelf(Boolean outerDeptOnlySelf) {
		this.outerDeptOnlySelf = outerDeptOnlySelf;
	}

	public Boolean getOuterDeptOnlySelf() {
		return this.outerDeptOnlySelf;
	}

	public void setOuterPermitDepts(String outerPermitDepts) {
		this.outerPermitDepts = outerPermitDepts;
	}

	public String getOuterPermitDepts() {
		return this.outerPermitDepts;
	}

	public void setOuterPermitUsers(String outerPermitUsers) {
		this.outerPermitUsers = outerPermitUsers;
	}

	public String getOuterPermitUsers() {
		return this.outerPermitUsers;
	}

	public void setParentBalanceFirst(Boolean parentBalanceFirst) {
		this.parentBalanceFirst = parentBalanceFirst;
	}

	public Boolean getParentBalanceFirst() {
		return this.parentBalanceFirst;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setShareBalance(Boolean shareBalance) {
		this.shareBalance = shareBalance;
	}

	public Boolean getShareBalance() {
		return this.shareBalance;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public String getSourceIdentifier() {
		return this.sourceIdentifier;
	}

	public void setUserPermits(String userPermits) {
		this.userPermits = userPermits;
	}

	public String getUserPermits() {
		return this.userPermits;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.v2.department.update";
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
		txtParams.put("auto_add_user", this.autoAddUser);
		txtParams.put("auto_reorder_manager", this.autoReorderManager);
		txtParams.put("create_dept_group", this.createDeptGroup);
		txtParams.put("dept_hiding", this.deptHiding);
		txtParams.put("dept_manager_userid_list", this.deptManagerUseridList);
		txtParams.put("dept_permits", this.deptPermits);
		txtParams.put("ext", this.ext);
		txtParams.put("group_contain_hidden_dept", this.groupContainHiddenDept);
		txtParams.put("group_contain_outer_dept", this.groupContainOuterDept);
		txtParams.put("group_contain_sub_dept", this.groupContainSubDept);
		txtParams.put("id", this.id);
		txtParams.put("name", this.name);
		txtParams.put("order", this.order);
		txtParams.put("org_dept_owner", this.orgDeptOwner);
		txtParams.put("outer_dept", this.outerDept);
		txtParams.put("outer_dept_only_self", this.outerDeptOnlySelf);
		txtParams.put("outer_permit_depts", this.outerPermitDepts);
		txtParams.put("outer_permit_users", this.outerPermitUsers);
		txtParams.put("parent_balance_first", this.parentBalanceFirst);
		txtParams.put("parent_id", this.parentId);
		txtParams.put("share_balance", this.shareBalance);
		txtParams.put("source_identifier", this.sourceIdentifier);
		txtParams.put("user_permits", this.userPermits);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiV2DepartmentUpdateResponse> getResponseClass() {
		return OapiV2DepartmentUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deptManagerUseridList, 20, "deptManagerUseridList");
		RequestCheckUtils.checkMaxListSize(deptPermits, 20, "deptPermits");
		RequestCheckUtils.checkMaxListSize(outerPermitDepts, 20, "outerPermitDepts");
		RequestCheckUtils.checkMaxListSize(outerPermitUsers, 20, "outerPermitUsers");
		RequestCheckUtils.checkMaxListSize(userPermits, 20, "userPermits");
	}
	

}