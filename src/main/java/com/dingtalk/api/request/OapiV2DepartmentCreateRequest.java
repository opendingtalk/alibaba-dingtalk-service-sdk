package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiV2DepartmentCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.08.25
 */
public class OapiV2DepartmentCreateRequest extends BaseTaobaoRequest<OapiV2DepartmentCreateResponse> {
	
	

	/** 
	* 开启后，加入该部门的申请将默认同意
	 */
	private Boolean autoApproveApply;

	/** 
	* 部门简介
	 */
	private String brief;

	/** 
	* 是否创建一个关联此部门的企业群，默认为false
	 */
	private Boolean createDeptGroup;

	/** 
	* 可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效。总数不能超过200。
	 */
	private String deptPermits;

	/** 
	* 扩展字段，JSON格式
	 */
	private String extension;

	/** 
	* 是否隐藏部门， true表示隐藏 false表示显示
	 */
	private Boolean hideDept;

	/** 
	* 部门名称，长度限制为1~64个字符，不允许包含字符‘-’‘，’以及‘,’
	 */
	private String name;

	/** 
	* 在父部门中的排序值，order值小的排序靠前
	 */
	private Long order;

	/** 
	* 限制本部门成员查看通讯录，限制开启后，本部门成员只能看到限定范围内的通讯录。true表示限制开启
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
	* 本部门的员工仅可见员工自己为true时，可以配置额外可见人员，userid列表，总数不能超过200。
	 */
	private String outerPermitUsers;

	/** 
	* 父部门id，根部门id为1
	 */
	private Long parentId;

	/** 
	* 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射
	 */
	private String sourceIdentifier;

	/** 
	* 部门联系方式
	 */
	private String telephone;

	/** 
	* 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，总数不能超过200。
	 */
	private String userPermits;

	public void setAutoApproveApply(Boolean autoApproveApply) {
		this.autoApproveApply = autoApproveApply;
	}

	public Boolean getAutoApproveApply() {
		return this.autoApproveApply;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getBrief() {
		return this.brief;
	}

	public void setCreateDeptGroup(Boolean createDeptGroup) {
		this.createDeptGroup = createDeptGroup;
	}

	public Boolean getCreateDeptGroup() {
		return this.createDeptGroup;
	}

	public void setDeptPermits(String deptPermits) {
		this.deptPermits = deptPermits;
	}

	public String getDeptPermits() {
		return this.deptPermits;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setExtensionString(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setHideDept(Boolean hideDept) {
		this.hideDept = hideDept;
	}

	public Boolean getHideDept() {
		return this.hideDept;
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

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public String getSourceIdentifier() {
		return this.sourceIdentifier;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setUserPermits(String userPermits) {
		this.userPermits = userPermits;
	}

	public String getUserPermits() {
		return this.userPermits;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.v2.department.create";
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
		txtParams.put("auto_approve_apply", this.autoApproveApply);
		txtParams.put("brief", this.brief);
		txtParams.put("create_dept_group", this.createDeptGroup);
		txtParams.put("dept_permits", this.deptPermits);
		txtParams.put("extension", this.extension);
		txtParams.put("hide_dept", this.hideDept);
		txtParams.put("name", this.name);
		txtParams.put("order", this.order);
		txtParams.put("outer_dept", this.outerDept);
		txtParams.put("outer_dept_only_self", this.outerDeptOnlySelf);
		txtParams.put("outer_permit_depts", this.outerPermitDepts);
		txtParams.put("outer_permit_users", this.outerPermitUsers);
		txtParams.put("parent_id", this.parentId);
		txtParams.put("source_identifier", this.sourceIdentifier);
		txtParams.put("telephone", this.telephone);
		txtParams.put("user_permits", this.userPermits);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiV2DepartmentCreateResponse> getResponseClass() {
		return OapiV2DepartmentCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(brief, 255, "brief");
		RequestCheckUtils.checkMaxListSize(deptPermits, 200, "deptPermits");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 64, "name");
		RequestCheckUtils.checkMaxListSize(outerPermitDepts, 200, "outerPermitDepts");
		RequestCheckUtils.checkMaxListSize(outerPermitUsers, 200, "outerPermitUsers");
		RequestCheckUtils.checkNotEmpty(parentId, "parentId");
		RequestCheckUtils.checkMaxLength(telephone, 50, "telephone");
		RequestCheckUtils.checkMaxListSize(userPermits, 200, "userPermits");
	}
	

}