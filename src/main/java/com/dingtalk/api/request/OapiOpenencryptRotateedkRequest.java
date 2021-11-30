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
import com.dingtalk.api.response.OapiOpenencryptRotateedkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.openencrypt.rotateedk request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.09
 */
public class OapiOpenencryptRotateedkRequest extends BaseTaobaoRequest<OapiOpenencryptRotateedkResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String topEdkRotateManual;

	public void setTopEdkRotateManual(String topEdkRotateManual) {
		this.topEdkRotateManual = topEdkRotateManual;
	}

	public void setTopEdkRotateManual(TopEdkRotateManual topEdkRotateManual) {
		this.topEdkRotateManual = new JSONWriter(false,false,true).write(topEdkRotateManual);
	}

	public String getTopEdkRotateManual() {
		return this.topEdkRotateManual;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.openencrypt.rotateedk";
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
		txtParams.put("top_edk_rotate_manual", this.topEdkRotateManual);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOpenencryptRotateedkResponse> getResponseClass() {
		return OapiOpenencryptRotateedkResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopEdkRotateManual extends TaobaoObject {
		private static final long serialVersionUID = 6488323787363441395L;
		/**
		 * 企业内部应用id
		 */
		@ApiField("agentid")
		private Long agentid;
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