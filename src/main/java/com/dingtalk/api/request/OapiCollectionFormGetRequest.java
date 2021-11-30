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

import com.dingtalk.api.response.OapiCollectionFormGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.form.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.16
 */
public class OapiCollectionFormGetRequest extends BaseTaobaoRequest<OapiCollectionFormGetResponse> {
	
	

	/** 
	* 毫秒级时间戳
	 */
	private String actionDate;

	/** 
	* code
	 */
	private String formCode;

	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public String getActionDate() {
		return this.actionDate;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getFormCode() {
		return this.formCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.collection.form.get";
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
		txtParams.put("action_date", this.actionDate);
		txtParams.put("form_code", this.formCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCollectionFormGetResponse> getResponseClass() {
		return OapiCollectionFormGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionDate, "actionDate");
		RequestCheckUtils.checkNotEmpty(formCode, "formCode");
	}
	

}