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

import com.dingtalk.api.response.OapiV2DepartmentCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.02
 */
public class OapiV2DepartmentCreateRequest extends BaseTaobaoRequest<OapiV2DepartmentCreateResponse> {
	
	

	/** 
	* 是否创建一个关联此部门的企业群，默认为false
	 */
	private Boolean createDeptGroup;

	/** 
	* 是否隐藏部门，true表示隐藏，false表示展示
	 */
	private Boolean deptHiding;

	/** 
	* 可以查看指定隐藏部门的其他部门id列表，如果部门隐藏，则此值生效。总数不能超过200
	 */
	private String deptPermits;

	/** 
	* 部门自定义字段，格式为文本类型的Json格式
	 */
	private String ext;

	/** 
	* 自定义部门ID，必须大于1且小于Long.MAX_VALUE，未对外公开字段
	 */
	private Long id;

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
	* outerDept为true时，可以配置该字段，为true时，表示只能看到所在部门及下级部门通讯录
	 */
	private Boolean outerDeptOnlySelf;

	/** 
	* outerDept为true时，可以配置额外可见部门id列表。总数不能超过200
	 */
	private String outerPermitDepts;

	/** 
	* outerDept为true时，可以配置额外可见人员userid列表，总数不能超过200
	 */
	private String outerPermitUsers;

	/** 
	* 是否优先使用父部门的预算 未对外公开字段
	 */
	private Boolean parentBalanceFirst;

	/** 
	* 父部门id，根部门id为1
	 */
	private Long parentId;

	/** 
	* 是否共享预算 未对外公开字段
	 */
	private Boolean shareBalance;

	/** 
	* 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射
	 */
	private String sourceIdentifier;

	/** 
	* 可以查看指定隐藏部门的其他人员userid列表，如果部门隐藏，则此值生效，总数不能超过20
	 */
	private String userPermits;

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
		txtParams.put("create_dept_group", this.createDeptGroup);
		txtParams.put("dept_hiding", this.deptHiding);
		txtParams.put("dept_permits", this.deptPermits);
		txtParams.put("ext", this.ext);
		txtParams.put("id", this.id);
		txtParams.put("name", this.name);
		txtParams.put("order", this.order);
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

	public Class<OapiV2DepartmentCreateResponse> getResponseClass() {
		return OapiV2DepartmentCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(deptPermits, 20, "deptPermits");
		RequestCheckUtils.checkMaxListSize(outerPermitDepts, 20, "outerPermitDepts");
		RequestCheckUtils.checkMaxListSize(outerPermitUsers, 20, "outerPermitUsers");
		RequestCheckUtils.checkMaxListSize(userPermits, 20, "userPermits");
	}
	

}