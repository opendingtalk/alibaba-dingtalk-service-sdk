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
import com.dingtalk.api.response.OapiOrgOpenencryptHeartbeatResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.openencrypt.heartbeat request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.09
 */
public class OapiOrgOpenencryptHeartbeatRequest extends BaseTaobaoRequest<OapiOrgOpenencryptHeartbeatResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String topKmsHeartbeat;

	public void setTopKmsHeartbeat(String topKmsHeartbeat) {
		this.topKmsHeartbeat = topKmsHeartbeat;
	}

	public void setTopKmsHeartbeat(TopKMSHeartbeat topKmsHeartbeat) {
		this.topKmsHeartbeat = new JSONWriter(false,false,true).write(topKmsHeartbeat);
	}

	public String getTopKmsHeartbeat() {
		return this.topKmsHeartbeat;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.openencrypt.heartbeat";
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
		txtParams.put("top_kms_heartbeat", this.topKmsHeartbeat);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgOpenencryptHeartbeatResponse> getResponseClass() {
		return OapiOrgOpenencryptHeartbeatResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopKMSHeartbeat extends TaobaoObject {
		private static final long serialVersionUID = 5617723937357634645L;
		/**
		 * 企业内部应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 附加数据，json格式
		 */
		@ApiField("payload")
		private String payload;
		/**
		 * 请求id
		 */
		@ApiField("requestid")
		private String requestid;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getPayload() {
			return this.payload;
		}
		public void setPayload(String payload) {
			this.payload = payload;
		}
		public String getRequestid() {
			return this.requestid;
		}
		public void setRequestid(String requestid) {
			this.requestid = requestid;
		}
	}
	

}