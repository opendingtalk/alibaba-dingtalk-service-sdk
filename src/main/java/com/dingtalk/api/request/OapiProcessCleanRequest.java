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

import com.dingtalk.api.response.OapiProcessCleanResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.clean request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.26
 */
public class OapiProcessCleanRequest extends BaseTaobaoRequest<OapiProcessCleanResponse> {
	
	

	/** 
	* 企业id
	 */
	private String corpid;

	/** 
	* 模板唯一码
	 */
	private String processCode;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.clean";
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
		txtParams.put("process_code", this.processCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessCleanResponse> getResponseClass() {
		return OapiProcessCleanResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
	}
	

}