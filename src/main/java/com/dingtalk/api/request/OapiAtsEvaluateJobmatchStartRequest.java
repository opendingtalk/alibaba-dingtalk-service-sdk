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

import com.dingtalk.api.response.OapiAtsEvaluateJobmatchStartResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.evaluate.jobmatch.start request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.09
 */
public class OapiAtsEvaluateJobmatchStartRequest extends BaseTaobaoRequest<OapiAtsEvaluateJobmatchStartResponse> {
	
	

	/** 
	* 招聘业务标识
	 */
	private String bizCode;

	/** 
	* 候选人id
	 */
	private String candidateId;

	/** 
	* 职位类型码，调用时请申请职位类型码表
	 */
	private String category;

	/** 
	* json格式的字符串，存放请求扩展信息
	 */
	private String extData;

	/** 
	* 邀请填写测评的url
	 */
	private String inviteUrl;

	/** 
	* 候选人id
	 */
	private String jobId;

	/** 
	* 外部测评系统的具体某一次测评的id，全局唯一
	 */
	private String outerEvaluateId;

	/** 
	* 测评结果的url
	 */
	private String resultUrl;

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

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return this.category;
	}

	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getExtData() {
		return this.extData;
	}

	public void setInviteUrl(String inviteUrl) {
		this.inviteUrl = inviteUrl;
	}

	public String getInviteUrl() {
		return this.inviteUrl;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setOuterEvaluateId(String outerEvaluateId) {
		this.outerEvaluateId = outerEvaluateId;
	}

	public String getOuterEvaluateId() {
		return this.outerEvaluateId;
	}

	public void setResultUrl(String resultUrl) {
		this.resultUrl = resultUrl;
	}

	public String getResultUrl() {
		return this.resultUrl;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.evaluate.jobmatch.start";
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
		txtParams.put("category", this.category);
		txtParams.put("ext_data", this.extData);
		txtParams.put("invite_url", this.inviteUrl);
		txtParams.put("job_id", this.jobId);
		txtParams.put("outer_evaluate_id", this.outerEvaluateId);
		txtParams.put("result_url", this.resultUrl);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsEvaluateJobmatchStartResponse> getResponseClass() {
		return OapiAtsEvaluateJobmatchStartResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(candidateId, "candidateId");
		RequestCheckUtils.checkNotEmpty(category, "category");
		RequestCheckUtils.checkNotEmpty(extData, "extData");
		RequestCheckUtils.checkNotEmpty(inviteUrl, "inviteUrl");
		RequestCheckUtils.checkNotEmpty(jobId, "jobId");
		RequestCheckUtils.checkNotEmpty(outerEvaluateId, "outerEvaluateId");
		RequestCheckUtils.checkNotEmpty(resultUrl, "resultUrl");
	}
	

}