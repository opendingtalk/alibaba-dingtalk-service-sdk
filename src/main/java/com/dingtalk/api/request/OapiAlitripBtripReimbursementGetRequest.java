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

import com.dingtalk.api.response.OapiAlitripBtripReimbursementGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.reimbursement.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.15
 */
public class OapiAlitripBtripReimbursementGetRequest extends BaseTaobaoRequest<OapiAlitripBtripReimbursementGetResponse> {
	
	

	/** 
	* corp id
	 */
	private String corpid;

	/** 
	* 第三方流程id
	 */
	private String thirdpartyFlowId;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setThirdpartyFlowId(String thirdpartyFlowId) {
		this.thirdpartyFlowId = thirdpartyFlowId;
	}

	public String getThirdpartyFlowId() {
		return this.thirdpartyFlowId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.reimbursement.get";
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
		txtParams.put("corpid", this.corpid);
		txtParams.put("thirdparty_flow_id", this.thirdpartyFlowId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripReimbursementGetResponse> getResponseClass() {
		return OapiAlitripBtripReimbursementGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpid, "corpid");
		RequestCheckUtils.checkNotEmpty(thirdpartyFlowId, "thirdpartyFlowId");
	}
	

}