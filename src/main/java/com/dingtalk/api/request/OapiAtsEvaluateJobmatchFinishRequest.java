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

import com.dingtalk.api.response.OapiAtsEvaluateJobmatchFinishResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.evaluate.jobmatch.finish request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.10
 */
public class OapiAtsEvaluateJobmatchFinishRequest extends BaseTaobaoRequest<OapiAtsEvaluateJobmatchFinishResponse> {
	
	

	/** 
	* 招聘业务标识
	 */
	private String bizCode;

	/** 
	* 测评结论
	 */
	private String conclusion;

	/** 
	* 请求扩展字段
	 */
	private String extData;

	/** 
	* 外部测评系统测评记录id，全局唯一
	 */
	private String outerEvaluateId;

	/** 
	* 公网可以下载，不需要鉴权的评测报告下载地址，最大长度1024
	 */
	private String reportDownloadUrl;

	/** 
	* json格式的测评结果
	 */
	private String result;

	/** 
	* 岗位匹配得分，小数点后保留2位
	 */
	private String score;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getExtData() {
		return this.extData;
	}

	public void setOuterEvaluateId(String outerEvaluateId) {
		this.outerEvaluateId = outerEvaluateId;
	}

	public String getOuterEvaluateId() {
		return this.outerEvaluateId;
	}

	public void setReportDownloadUrl(String reportDownloadUrl) {
		this.reportDownloadUrl = reportDownloadUrl;
	}

	public String getReportDownloadUrl() {
		return this.reportDownloadUrl;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return this.result;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScore() {
		return this.score;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.evaluate.jobmatch.finish";
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
		txtParams.put("conclusion", this.conclusion);
		txtParams.put("ext_data", this.extData);
		txtParams.put("outer_evaluate_id", this.outerEvaluateId);
		txtParams.put("report_download_url", this.reportDownloadUrl);
		txtParams.put("result", this.result);
		txtParams.put("score", this.score);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsEvaluateJobmatchFinishResponse> getResponseClass() {
		return OapiAtsEvaluateJobmatchFinishResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(conclusion, "conclusion");
		RequestCheckUtils.checkNotEmpty(extData, "extData");
		RequestCheckUtils.checkNotEmpty(outerEvaluateId, "outerEvaluateId");
		RequestCheckUtils.checkNotEmpty(reportDownloadUrl, "reportDownloadUrl");
		RequestCheckUtils.checkNotEmpty(result, "result");
		RequestCheckUtils.checkNotEmpty(score, "score");
	}
	

}