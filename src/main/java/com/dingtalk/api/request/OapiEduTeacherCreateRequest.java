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

import com.dingtalk.api.response.OapiEduTeacherCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.teacher.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.15
 */
public class OapiEduTeacherCreateRequest extends BaseTaobaoRequest<OapiEduTeacherCreateResponse> {
	
	

	/** 
	* 是否班主任；1:班主任；0:非班主任
	 */
	private Long adviser;

	/** 
	* 业务id
	 */
	private String bizId;

	/** 
	* 班级id
	 */
	private Long classId;

	/** 
	* 钉钉企业管理员
	 */
	private String operator;

	/** 
	* 老师id
	 */
	private String userid;

	public void setAdviser(Long adviser) {
		this.adviser = adviser;
	}

	public Long getAdviser() {
		return this.adviser;
	}

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

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.teacher.create";
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
		txtParams.put("adviser", this.adviser);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("class_id", this.classId);
		txtParams.put("operator", this.operator);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduTeacherCreateResponse> getResponseClass() {
		return OapiEduTeacherCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(adviser, "adviser");
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}