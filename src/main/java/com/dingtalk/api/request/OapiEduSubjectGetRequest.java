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

import com.dingtalk.api.response.OapiEduSubjectGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.subject.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.15
 */
public class OapiEduSubjectGetRequest extends BaseTaobaoRequest<OapiEduSubjectGetResponse> {
	
	

	/** 
	* 用户id
	 */
	private String operatorUserid;

	/** 
	* 学段编码
	 */
	private String periodCode;

	/** 
	* 学科编码
	 */
	private String subjectCode;

	/** 
	* 学科名称
	 */
	private String subjectName;

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}

	public String getPeriodCode() {
		return this.periodCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectCode() {
		return this.subjectCode;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.subject.get";
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
		txtParams.put("operator_userid", this.operatorUserid);
		txtParams.put("period_code", this.periodCode);
		txtParams.put("subject_code", this.subjectCode);
		txtParams.put("subject_name", this.subjectName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduSubjectGetResponse> getResponseClass() {
		return OapiEduSubjectGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operatorUserid, "operatorUserid");
		RequestCheckUtils.checkNotEmpty(periodCode, "periodCode");
	}
	

}