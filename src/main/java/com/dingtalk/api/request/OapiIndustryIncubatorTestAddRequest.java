package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiIndustryIncubatorTestAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.incubator.test.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.30
 */
public class OapiIndustryIncubatorTestAddRequest extends BaseTaobaoRequest<OapiIndustryIncubatorTestAddResponse> {
	
	

	/** 
	* 1
	 */
	private String alipayContext;

	/** 
	* 1
	 */
	private Long docId;

	/** 
	* 1
	 */
	private String type;

	public void setAlipayContext(String alipayContext) {
		this.alipayContext = alipayContext;
	}

	public String getAlipayContext() {
		return this.alipayContext;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public Long getDocId() {
		return this.docId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.industry.incubator.test.add";
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
		txtParams.put("alipayContext", this.alipayContext);
		txtParams.put("docId", this.docId);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiIndustryIncubatorTestAddResponse> getResponseClass() {
		return OapiIndustryIncubatorTestAddResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}