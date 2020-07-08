package com.dingtalk.api.request;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.21
 */
public class OapiUserCreateRequest extends BaseTaobaoRequest<OapiUserCreateResponse> {
	
	

	/** 
	* 数组类型，数组里面值为整型，成员所属部门id列表
	 */
	private String department;

	/** 
	* 邮箱。长度为0~64个字符。企业内必须唯一，不可重复
	 */
	private String email;

	/** 
	* 扩展属性，可以设置多种属性(但手机上最多只能显示10个扩展属性，具体显示哪些属性，请到OA管理后台->设置->通讯录信息设置和OA管理后台->设置->手机端显示信息设置)
	 */
	private String extattr;

	/** 
	* 入职时间
	 */
	private Long hiredDate;

	/** 
	* 是否号码隐藏, true表示隐藏, false表示不隐藏。隐藏手机号后，手机号在个人资料页隐藏，但仍可对其发DING、发起钉钉免费商务电话。
	 */
	private Boolean isHide;

	/** 
	* 是否高管模式，true表示是，false表示不是。开启后，手机号码对所有员工隐藏。普通员工无法对其发DING、发起钉钉免费商务电话。高管之间不受影响。
	 */
	private Boolean isSenior;

	/** 
	* 员工工号。对应显示到OA后台和客户端个人资料的工号栏目。长度为0~64个字符
	 */
	private String jobnumber;

	/** 
	* 手机号码，企业内必须唯一，不可重复
	 */
	private String mobile;

	/** 
	* 成员名称。长度为1~64个字符
	 */
	private String name;

	/** 
	* 在对应的部门中的排序, Map结构的json字符串, key是部门的Id, value是人员在这个部门的排序值
	 */
	private String orderInDepts;

	/** 
	* 员工的企业邮箱，员工的企业邮箱已开通，才能增加此字段， 否则会报错
	 */
	private String orgEmail;

	/** 
	* 职位信息。长度为0~64个字符
	 */
	private String position;

	/** 
	* 在对应的部门中的职位信息, Map结构的json字符串, key是部门的Id, value是人员在这个部门的职位
	 */
	private String positionInDepts;

	/** 
	* 备注，长度为0~1000个字符
	 */
	private String remark;

	/** 
	* 分机号，长度为0~50个字符，企业内必须唯一，不可重复
	 */
	private String tel;

	/** 
	* 员工唯一标识ID（不可修改），企业内必须唯一。长度为1~64个字符，如果不传，服务器将自动生成一个userid
	 */
	private String userid;

	/** 
	* 办公地点，长度为0~50个字符
	 */
	private String workPlace;

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setExtattr(String extattr) {
		this.extattr = extattr;
	}
	public void setExtattrString(String extattr) {
		this.extattr = extattr;
	}

	public String getExtattr() {
		return this.extattr;
	}

	public void setHiredDate(Long hiredDate) {
		this.hiredDate = hiredDate;
	}

	public Long getHiredDate() {
		return this.hiredDate;
	}

	public void setIsHide(Boolean isHide) {
		this.isHide = isHide;
	}

	public Boolean getIsHide() {
		return this.isHide;
	}

	public void setIsSenior(Boolean isSenior) {
		this.isSenior = isSenior;
	}

	public Boolean getIsSenior() {
		return this.isSenior;
	}

	public void setJobnumber(String jobnumber) {
		this.jobnumber = jobnumber;
	}

	public String getJobnumber() {
		return this.jobnumber;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOrderInDepts(String orderInDepts) {
		this.orderInDepts = orderInDepts;
	}
	public void setOrderInDeptsString(String orderInDepts) {
		this.orderInDepts = orderInDepts;
	}

	public String getOrderInDepts() {
		return this.orderInDepts;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public String getOrgEmail() {
		return this.orgEmail;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPositionInDepts(String positionInDepts) {
		this.positionInDepts = positionInDepts;
	}
	public void setPositionInDeptsString(String positionInDepts) {
		this.positionInDepts = positionInDepts;
	}

	public String getPositionInDepts() {
		return this.positionInDepts;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel() {
		return this.tel;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public String getWorkPlace() {
		return this.workPlace;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.create";
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
		txtParams.put("department", this.department);
		txtParams.put("email", this.email);
		txtParams.put("extattr", this.extattr);
		txtParams.put("hiredDate", this.hiredDate);
		txtParams.put("isHide", this.isHide);
		txtParams.put("isSenior", this.isSenior);
		txtParams.put("jobnumber", this.jobnumber);
		txtParams.put("mobile", this.mobile);
		txtParams.put("name", this.name);
		txtParams.put("orderInDepts", this.orderInDepts);
		txtParams.put("orgEmail", this.orgEmail);
		txtParams.put("position", this.position);
		txtParams.put("positionInDepts", this.positionInDepts);
		txtParams.put("remark", this.remark);
		txtParams.put("tel", this.tel);
		txtParams.put("userid", this.userid);
		txtParams.put("workPlace", this.workPlace);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserCreateResponse> getResponseClass() {
		return OapiUserCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}