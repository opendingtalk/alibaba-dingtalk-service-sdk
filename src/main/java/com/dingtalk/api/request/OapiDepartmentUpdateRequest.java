package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDepartmentUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.18
 */
public class OapiDepartmentUpdateRequest extends BaseTaobaoRequest<OapiDepartmentUpdateResponse> {
	
	

	/** 
	* 如果有新人加入部门是否会自动加入部门群
	 */
	private Boolean autoAddUser;

	/** 
	* 是否创建一个关联此部门的企业群
	 */
	private Boolean createDeptGroup;

	/** 
	* 是否隐藏部门, true表示隐藏, false表示显示
	 */
	private Boolean deptHiding;

	/** 
	* 部门的主管列表,取值为由主管的userid组成的字符串，不同的userid使用’| 符号进行分割
	 */
	private String deptManagerUseridList;

	/** 
	* 可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用 | 符号进行分割。总数不能超过200。
	 */
	private String deptPerimits;

	/** 
	* 可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用 | 符号进行分割。总数不能超过200。
	 */
	private String deptPermits;

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
	* 部门id
	 */
	private Long id;

	/** 
	* 通讯录语言(默认zh_CN另外支持en_US)
	 */
	private String lang;

	/** 
	* 部门名称。长度限制为1~64个字符。不允许包含字符‘-’‘，’以及‘,’。
	 */
	private String name;

	/** 
	* 在父部门中的次序值。order值小的排序靠前
	 */
	private String order;

	/** 
	* 企业群群主
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
	* 本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割。总数不能超过200。
	 */
	private String outerPermitDepts;

	/** 
	* 本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用|符号进行分割。总数不能超过200。
	 */
	private String outerPermitUsers;

	/** 
	* 父部门id。根部门id为1
	 */
	private String parentid;

	/** 
	* 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射
	 */
	private String sourceIdentifier;

	/** 
	* 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割。总数不能超过200。
	 */
	private String userPerimits;

	/** 
	* 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割。总数不能超过200。
	 */
	private String userPermits;

	public void setAutoAddUser(Boolean autoAddUser) {
		this.autoAddUser = autoAddUser;
	}

	public Boolean getAutoAddUser() {
		return this.autoAddUser;
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

	public void setDeptPerimits(String deptPerimits) {
		this.deptPerimits = deptPerimits;
	}

	public String getDeptPerimits() {
		return this.deptPerimits;
	}

	public void setDeptPermits(String deptPermits) {
		this.deptPermits = deptPermits;
	}

	public String getDeptPermits() {
		return this.deptPermits;
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

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return this.lang;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrder() {
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

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getParentid() {
		return this.parentid;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public String getSourceIdentifier() {
		return this.sourceIdentifier;
	}

	public void setUserPerimits(String userPerimits) {
		this.userPerimits = userPerimits;
	}

	public String getUserPerimits() {
		return this.userPerimits;
	}

	public void setUserPermits(String userPermits) {
		this.userPermits = userPermits;
	}

	public String getUserPermits() {
		return this.userPermits;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.department.update";
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
		txtParams.put("autoAddUser", this.autoAddUser);
		txtParams.put("createDeptGroup", this.createDeptGroup);
		txtParams.put("deptHiding", this.deptHiding);
		txtParams.put("deptManagerUseridList", this.deptManagerUseridList);
		txtParams.put("deptPerimits", this.deptPerimits);
		txtParams.put("deptPermits", this.deptPermits);
		txtParams.put("groupContainHiddenDept", this.groupContainHiddenDept);
		txtParams.put("groupContainOuterDept", this.groupContainOuterDept);
		txtParams.put("groupContainSubDept", this.groupContainSubDept);
		txtParams.put("id", this.id);
		txtParams.put("lang", this.lang);
		txtParams.put("name", this.name);
		txtParams.put("order", this.order);
		txtParams.put("orgDeptOwner", this.orgDeptOwner);
		txtParams.put("outerDept", this.outerDept);
		txtParams.put("outerDeptOnlySelf", this.outerDeptOnlySelf);
		txtParams.put("outerPermitDepts", this.outerPermitDepts);
		txtParams.put("outerPermitUsers", this.outerPermitUsers);
		txtParams.put("parentid", this.parentid);
		txtParams.put("sourceIdentifier", this.sourceIdentifier);
		txtParams.put("userPerimits", this.userPerimits);
		txtParams.put("userPermits", this.userPermits);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDepartmentUpdateResponse> getResponseClass() {
		return OapiDepartmentUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}