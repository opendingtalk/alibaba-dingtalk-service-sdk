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
import com.dingtalk.api.response.OapiIsvOpenencryptHeartbeatResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.isv.openencrypt.heartbeat request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.09
 */
public class OapiIsvOpenencryptHeartbeatRequest extends BaseTaobaoRequest<OapiIsvOpenencryptHeartbeatResponse> {
	
	

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
		return "dingtalk.oapi.isv.openencrypt.heartbeat";
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

	public Class<OapiIsvOpenencryptHeartbeatResponse> getResponseClass() {
		return OapiIsvOpenencryptHeartbeatResponse.class;
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
		private static final long serialVersionUID = 1644339774434218893L;
		/**
		 * 微应用id
		 */
		@ApiField("appid")
		private Long appid;
		/**
		 * 附加数据
		 */
		@ApiField("payload")
		private String payload;
		/**
		 * 请求id
		 */
		@ApiField("requestid")
		private String requestid;
	
		public Long getAppid() {
			return this.appid;
		}
		public void setAppid(Long appid) {
			this.appid = appid;
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