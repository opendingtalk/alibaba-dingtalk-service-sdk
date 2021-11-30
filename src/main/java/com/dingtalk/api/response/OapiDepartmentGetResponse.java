package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDepartmentGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4378734316652372486L;

	/** 
	 * 当群已经创建后，是否有新人加入部门会自动加入该群, true表示是, false表示不是
	 */
	@ApiField("autoAddUser")
	private Boolean autoAddUser;

	/** 
	 * 是否同步创建一个关联此部门的企业群, true表示是, false表示不是
	 */
	@ApiField("createDeptGroup")
	private Boolean createDeptGroup;

	/** 
	 * 是否隐藏部门, true表示隐藏, false表示显示
	 */
	@ApiField("deptHiding")
	private Boolean deptHiding;

	/** 
	 * 部门的主管列表,取值为由主管的userid组成的字符串，不同的userid使用|符号进行分割
	 */
	@ApiField("deptManagerUseridList")
	private String deptManagerUseridList;

	/** 
	 * 可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用|符号进行分割
	 */
	@ApiField("deptPerimits")
	private String deptPerimits;

	/** 
	 * 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用|符号进行分割
	 */
	@ApiField("deptPermits")
	private String deptPermits;

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
	 * 部门群是否包含子部门
	 */
	@ApiField("groupContainSubDept")
	private Boolean groupContainSubDept;

	/** 
	 * 部门id
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 部门是否来自关联组织
	 */
	@ApiField("isFromUnionOrg")
	private Boolean isFromUnionOrg;

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
	 * 企业群群主
	 */
	@ApiField("orgDeptOwner")
	private String orgDeptOwner;

	/** 
	 * 是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己
	 */
	@ApiField("outerDept")
	private Boolean outerDept;

	/** 
	 * 本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割
	 */
	@ApiField("outerPermitDepts")
	private String outerPermitDepts;

	/** 
	 * 本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用| 符号进行分割
	 */
	@ApiField("outerPermitUsers")
	private String outerPermitUsers;

	/** 
	 * 父部门id，根部门为1
	 */
	@ApiField("parentid")
	private Long parentid;

	/** 
	 * 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射
	 */
	@ApiField("sourceIdentifier")
	private String sourceIdentifier;

	/** 
	 * 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用|符号进行分割
	 */
	@ApiField("userPerimits")
	private String userPerimits;

	/** 
	 * 可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用|符号进行分割
	 */
	@ApiField("userPermits")
	private String userPermits;


	public void setAutoAddUser(Boolean autoAddUser) {
		this.autoAddUser = autoAddUser;
	}
	public Boolean getAutoAddUser( ) {
		return this.autoAddUser;
	}

	public void setCreateDeptGroup(Boolean createDeptGroup) {
		this.createDeptGroup = createDeptGroup;
	}
	public Boolean getCreateDeptGroup( ) {
		return this.createDeptGroup;
	}

	public void setDeptHiding(Boolean deptHiding) {
		this.deptHiding = deptHiding;
	}
	public Boolean getDeptHiding( ) {
		return this.deptHiding;
	}

	public void setDeptManagerUseridList(String deptManagerUseridList) {
		this.deptManagerUseridList = deptManagerUseridList;
	}
	public String getDeptManagerUseridList( ) {
		return this.deptManagerUseridList;
	}

	public void setDeptPerimits(String deptPerimits) {
		this.deptPerimits = deptPerimits;
	}
	public String getDeptPerimits( ) {
		return this.deptPerimits;
	}

	public void setDeptPermits(String deptPermits) {
		this.deptPermits = deptPermits;
	}
	public String getDeptPermits( ) {
		return this.deptPermits;
	}

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

	public void setGroupContainSubDept(Boolean groupContainSubDept) {
		this.groupContainSubDept = groupContainSubDept;
	}
	public Boolean getGroupContainSubDept( ) {
		return this.groupContainSubDept;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setIsFromUnionOrg(Boolean isFromUnionOrg) {
		this.isFromUnionOrg = isFromUnionOrg;
	}
	public Boolean getIsFromUnionOrg( ) {
		return this.isFromUnionOrg;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOrder(Long order) {
		this.order = order;
	}
	public Long getOrder( ) {
		return this.order;
	}

	public void setOrgDeptOwner(String orgDeptOwner) {
		this.orgDeptOwner = orgDeptOwner;
	}
	public String getOrgDeptOwner( ) {
		return this.orgDeptOwner;
	}

	public void setOuterDept(Boolean outerDept) {
		this.outerDept = outerDept;
	}
	public Boolean getOuterDept( ) {
		return this.outerDept;
	}

	public void setOuterPermitDepts(String outerPermitDepts) {
		this.outerPermitDepts = outerPermitDepts;
	}
	public String getOuterPermitDepts( ) {
		return this.outerPermitDepts;
	}

	public void setOuterPermitUsers(String outerPermitUsers) {
		this.outerPermitUsers = outerPermitUsers;
	}
	public String getOuterPermitUsers( ) {
		return this.outerPermitUsers;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}
	public Long getParentid( ) {
		return this.parentid;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}
	public String getSourceIdentifier( ) {
		return this.sourceIdentifier;
	}

	public void setUserPerimits(String userPerimits) {
		this.userPerimits = userPerimits;
	}
	public String getUserPerimits( ) {
		return this.userPerimits;
	}

	public void setUserPermits(String userPermits) {
		this.userPermits = userPermits;
	}
	public String getUserPermits( ) {
		return this.userPermits;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
