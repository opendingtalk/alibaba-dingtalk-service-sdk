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

import com.dingtalk.api.response.OapiEduStudentCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.student.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.11.05
 */
public class OapiEduStudentCreateRequest extends BaseTaobaoRequest<OapiEduStudentCreateResponse> {
	
	

	/** 
	* 业务唯一id
	 */
	private String bizId;

	/** 
	* 班级id
	 */
	private Long classId;

	/** 
	* 学生手机号
	 */
	private String mobile;

	/** 
	* 学生名
	 */
	private String name;

	/** 
	* 钉钉企业管理员
	 */
	private String operator;

	/** 
	* 学号
	 */
	private String studentNo;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
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

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.student.create";
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
		txtParams.put("biz_id", this.bizId);
		txtParams.put("class_id", this.classId);
		txtParams.put("mobile", this.mobile);
		txtParams.put("name", this.name);
		txtParams.put("operator", this.operator);
		txtParams.put("student_no", this.studentNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduStudentCreateResponse> getResponseClass() {
		return OapiEduStudentCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkNotEmpty(operator, "operator");
	}
	

}