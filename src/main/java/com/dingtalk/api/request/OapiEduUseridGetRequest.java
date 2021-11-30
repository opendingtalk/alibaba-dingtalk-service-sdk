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

import com.dingtalk.api.response.OapiEduUseridGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.userid.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.20
 */
public class OapiEduUseridGetRequest extends BaseTaobaoRequest<OapiEduUseridGetResponse> {
	
	

	/** 
	* 手机列表，最大不超过50个
	 */
	private String mobiles;

	/** 
	* 操作者id
	 */
	private String operator;

	public void setMobiles(String mobiles) {
		this.mobiles = mobiles;
	}

	public String getMobiles() {
		return this.mobiles;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.userid.get";
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
		txtParams.put("mobiles", this.mobiles);
		txtParams.put("operator", this.operator);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduUseridGetResponse> getResponseClass() {
		return OapiEduUseridGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mobiles, "mobiles");
		RequestCheckUtils.checkMaxListSize(mobiles, 999, "mobiles");
	}
	

}