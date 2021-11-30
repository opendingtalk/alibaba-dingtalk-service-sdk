package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.23
 */
public class OapiUserUpdateRequest extends BaseTaobaoRequest<OapiUserUpdateResponse> {
	
	

	/** 
	* 部门列表
	 */
	private List<Long> department;

	/** 
	* 邮箱
	 */
	private String email;

	/** 
	* 扩展属性
	 */
	private String extattr;

	/** 
	* 入职时间
	 */
	private Long hiredDate;

	/** 
	* 是否号码隐藏
	 */
	private Boolean isHide;

	/** 
	* 是否高管模式
	 */
	private Boolean isSenior;

	/** 
	* 工号
	 */
	private String jobnumber;

	/** 
	* 通讯录语言(默认zh_CN另外支持en_US)
	 */
	private String lang;

	/** 
	* 主管
	 */
	private String managerUserid;

	/** 
	* 手机号
	 */
	private String mobile;

	/** 
	* 名字
	 */
	private String name;

	/** 
	* 实际是Map的序列化字符串
	 */
	private String orderInDepts;

	/** 
	* 公司邮箱
	 */
	private String orgEmail;

	/** 
	* 职位
	 */
	private String position;

	/** 
	* 实际是Map的序列化字符串
	 */
	private String positionInDepts;

	/** 
	* 备注
	 */
	private String remark;

	/** 
	* 分机号，长度为0~50个字符
	 */
	private String tel;

	/** 
	* 用户id
	 */
	private String userid;

	/** 
	* 工作地点
	 */
	private String workPlace;

	public void setDepartment(List<Long> department) {
		this.department = department;
	}

	public List<Long> getDepartment() {
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

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return this.lang;
	}

	public void setManagerUserid(String managerUserid) {
		this.managerUserid = managerUserid;
	}

	public String getManagerUserid() {
		return this.managerUserid;
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
		return "dingtalk.oapi.user.update";
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
		txtParams.put("department", TaobaoUtils.objectToJson(this.department));
		txtParams.put("email", this.email);
		txtParams.put("extattr", this.extattr);
		txtParams.put("hiredDate", this.hiredDate);
		txtParams.put("isHide", this.isHide);
		txtParams.put("isSenior", this.isSenior);
		txtParams.put("jobnumber", this.jobnumber);
		txtParams.put("lang", this.lang);
		txtParams.put("managerUserid", this.managerUserid);
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

	public Class<OapiUserUpdateResponse> getResponseClass() {
		return OapiUserUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}