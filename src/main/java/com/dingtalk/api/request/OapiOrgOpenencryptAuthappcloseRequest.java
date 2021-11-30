package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiOrgOpenencryptAuthappcloseResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.openencrypt.authappclose request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.23
 */
public class OapiOrgOpenencryptAuthappcloseRequest extends BaseTaobaoRequest<OapiOrgOpenencryptAuthappcloseResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String topAuthMicroAppClose;

	public void setTopAuthMicroAppClose(String topAuthMicroAppClose) {
		this.topAuthMicroAppClose = topAuthMicroAppClose;
	}

	public void setTopAuthMicroAppClose(TopAuthMicroAppClose topAuthMicroAppClose) {
		this.topAuthMicroAppClose = new JSONWriter(false,false,true).write(topAuthMicroAppClose);
	}

	public String getTopAuthMicroAppClose() {
		return this.topAuthMicroAppClose;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.openencrypt.authappclose";
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
		txtParams.put("top_auth_micro_app_close", this.topAuthMicroAppClose);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgOpenencryptAuthappcloseResponse> getResponseClass() {
		return OapiOrgOpenencryptAuthappcloseResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopAuthMicroAppClose extends TaobaoObject {
		private static final long serialVersionUID = 6719494938122528998L;
		/**
		 * 企业内部应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 授权码
		 */
		@ApiField("authcode")
		private String authcode;
		/**
		 * 请求id
		 */
		@ApiField("requestid")
		private String requestid;
		/**
		 * 资源路径
		 */
		@ApiField("resource")
		private String resource;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getAuthcode() {
			return this.authcode;
		}
		public void setAuthcode(String authcode) {
			this.authcode = authcode;
		}
		public String getRequestid() {
			return this.requestid;
		}
		public void setRequestid(String requestid) {
			this.requestid = requestid;
		}
		public String getResource() {
			return this.resource;
		}
		public void setResource(String resource) {
			this.resource = resource;
		}
	}
	

}