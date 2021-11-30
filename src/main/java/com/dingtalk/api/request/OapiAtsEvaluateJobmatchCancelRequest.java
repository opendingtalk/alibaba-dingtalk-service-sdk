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

import com.dingtalk.api.response.OapiAtsEvaluateJobmatchCancelResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.evaluate.jobmatch.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.31
 */
public class OapiAtsEvaluateJobmatchCancelRequest extends BaseTaobaoRequest<OapiAtsEvaluateJobmatchCancelResponse> {
	
	

	/** 
	* 招聘业务标识
	 */
	private String bizCode;

	/** 
	* 请求扩展字段
	 */
	private String extData;

	/** 
	* 外部测评系统测评id，全局唯一
	 */
	private String outerEvaluateId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
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

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.evaluate.jobmatch.cancel";
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
		txtParams.put("ext_data", this.extData);
		txtParams.put("outer_evaluate_id", this.outerEvaluateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsEvaluateJobmatchCancelResponse> getResponseClass() {
		return OapiAtsEvaluateJobmatchCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(extData, "extData");
		RequestCheckUtils.checkNotEmpty(outerEvaluateId, "outerEvaluateId");
	}
	

}