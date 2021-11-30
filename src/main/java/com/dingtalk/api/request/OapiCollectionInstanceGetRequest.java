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

import com.dingtalk.api.response.OapiCollectionInstanceGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.instance.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.01
 */
public class OapiCollectionInstanceGetRequest extends BaseTaobaoRequest<OapiCollectionInstanceGetResponse> {
	
	

	/** 
	* 0表示通用填表，1表示教育版填表
	 */
	private Long bizType;

	/** 
	* 实例id
	 */
	private String formInstanceId;

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getBizType() {
		return this.bizType;
	}

	public void setFormInstanceId(String formInstanceId) {
		this.formInstanceId = formInstanceId;
	}

	public String getFormInstanceId() {
		return this.formInstanceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.collection.instance.get";
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
		txtParams.put("biz_type", this.bizType);
		txtParams.put("formInstance_id", this.formInstanceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCollectionInstanceGetResponse> getResponseClass() {
		return OapiCollectionInstanceGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(formInstanceId, "formInstanceId");
	}
	

}