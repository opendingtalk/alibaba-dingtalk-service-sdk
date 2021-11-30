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

import com.dingtalk.api.response.OapiAtsCandidateGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.candidate.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.30
 */
public class OapiAtsCandidateGetRequest extends BaseTaobaoRequest<OapiAtsCandidateGetResponse> {
	
	

	/** 
	* 招聘业务标识
	 */
	private String bizCode;

	/** 
	* 候选人id
	 */
	private String candidateId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateId() {
		return this.candidateId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.candidate.get";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("candidate_id", this.candidateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsCandidateGetResponse> getResponseClass() {
		return OapiAtsCandidateGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(candidateId, "candidateId");
	}
	

}