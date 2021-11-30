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
import com.dingtalk.api.response.OapiBipaasDiAgentResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.bipaas.di.agent request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.01
 */
public class OapiBipaasDiAgentRequest extends BaseTaobaoRequest<OapiBipaasDiAgentResponse> {
	
	

	/** 
	* 请求体
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(BaseAgentRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.bipaas.di.agent";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiBipaasDiAgentResponse> getResponseClass() {
		return OapiBipaasDiAgentResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseAgentRequest extends TaobaoObject {
		private static final long serialVersionUID = 8516175938923672411L;
		/**
		 * 参数
		 */
		@ApiField("params")
		private String params;
		/**
		 * 路径
		 */
		@ApiField("path")
		private String path;
	
		public String getParams() {
			return this.params;
		}
		public void setParams(String params) {
			this.params = params;
		}
		public void setParamsString(String params) {
			this.params = params;
		}
		
		public String getPath() {
			return this.path;
		}
		public void setPath(String path) {
			this.path = path;
		}
	}
	

}