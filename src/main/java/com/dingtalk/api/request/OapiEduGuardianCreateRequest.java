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

import com.dingtalk.api.response.OapiEduGuardianCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.guardian.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.15
 */
public class OapiEduGuardianCreateRequest extends BaseTaobaoRequest<OapiEduGuardianCreateResponse> {
	
	

	/** 
	* 业务id
	 */
	private String bizId;

	/** 
	* 班级id
	 */
	private Long classId;

	/** 
	* 手机号码
	 */
	private String mobile;

	/** 
	* 钉钉企业管理员
	 */
	private String operator;

	/** 
	* 关系code；关系枚举如下：  F:爸爸  M：妈妈  GF:爷爷  GM:奶奶  GFA:外公  GMA:外婆  U:叔叔  A:阿姨  B：哥哥  S:姐姐  O:其他
	 */
	private String relation;

	/** 
	* 学生id
	 */
	private String stuId;

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

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuId() {
		return this.stuId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.guardian.create";
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
		txtParams.put("operator", this.operator);
		txtParams.put("relation", this.relation);
		txtParams.put("stu_id", this.stuId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduGuardianCreateResponse> getResponseClass() {
		return OapiEduGuardianCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(mobile, "mobile");
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(relation, "relation");
		RequestCheckUtils.checkNotEmpty(stuId, "stuId");
	}
	

}