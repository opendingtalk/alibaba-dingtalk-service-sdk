package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiVillageScreenGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.village.screen.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.28
 */
public class OapiVillageScreenGetRequest extends BaseTaobaoRequest<OapiVillageScreenGetResponse> {
	
	

	/** 
	* -
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(DataVScreenRequest req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.village.screen.get";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiVillageScreenGetResponse> getResponseClass() {
		return OapiVillageScreenGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * -
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DataVScreenRequest extends TaobaoObject {
		private static final long serialVersionUID = 2422887257449217295L;
		/**
		 * -
		 */
		@ApiField("params")
		private String params;
	
		public String getParams() {
			return this.params;
		}
		public void setParams(String params) {
			this.params = params;
		}
		public void setParamsString(String params) {
			this.params = params;
		}
		
	}
	

}