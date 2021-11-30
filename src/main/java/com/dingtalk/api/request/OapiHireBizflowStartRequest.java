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

import com.dingtalk.api.response.OapiHireBizflowStartResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.bizflow.start request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.21
 */
public class OapiHireBizflowStartRequest extends BaseTaobaoRequest<OapiHireBizflowStartResponse> {
	
	

	/** 
	* 职位id
	 */
	private String jobId;

	/** 
	* 操作人userId
	 */
	private String opUserid;

	/** 
	* 简历id
	 */
	private String resumeId;

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}

	public String getResumeId() {
		return this.resumeId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.hire.bizflow.start";
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
		txtParams.put("job_id", this.jobId);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("resume_id", this.resumeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHireBizflowStartResponse> getResponseClass() {
		return OapiHireBizflowStartResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(jobId, "jobId");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(resumeId, "resumeId");
	}
	

}