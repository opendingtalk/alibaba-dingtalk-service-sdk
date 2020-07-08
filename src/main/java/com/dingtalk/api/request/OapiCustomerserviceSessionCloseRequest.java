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
import com.dingtalk.api.response.OapiCustomerserviceSessionCloseResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.session.close request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.12
 */
public class OapiCustomerserviceSessionCloseRequest extends BaseTaobaoRequest<OapiCustomerserviceSessionCloseResponse> {
	
	

	/** 
	* 关闭会话
	 */
	private String closeSession;

	public void setCloseSession(String closeSession) {
		this.closeSession = closeSession;
	}

	public void setCloseSession(CloseSessionDTO closeSession) {
		this.closeSession = new JSONWriter(false,false,true).write(closeSession);
	}

	public String getCloseSession() {
		return this.closeSession;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.session.close";
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
		txtParams.put("close_session", this.closeSession);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceSessionCloseResponse> getResponseClass() {
		return OapiCustomerserviceSessionCloseResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 关闭会话
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CloseSessionDTO extends TaobaoObject {
		private static final long serialVersionUID = 6285928981236437529L;
		/**
		 * 客服所在bu
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 操作者id
		 */
		@ApiField("operator_id")
		private String operatorId;
		/**
		 * 关闭原因，memberIsSilentheartBeatBreakmemberCloseTheSession
		 */
		@ApiField("reason")
		private String reason;
		/**
		 * 会话来源
		 */
		@ApiField("session_source")
		private String sessionSource;
		/**
		 * 会话id
		 */
		@ApiField("sid")
		private String sid;
	
		public String getBuId() {
			return this.buId;
		}
		public void setBuId(String buId) {
			this.buId = buId;
		}
		public String getOperatorId() {
			return this.operatorId;
		}
		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getSessionSource() {
			return this.sessionSource;
		}
		public void setSessionSource(String sessionSource) {
			this.sessionSource = sessionSource;
		}
		public String getSid() {
			return this.sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
	}
	

}