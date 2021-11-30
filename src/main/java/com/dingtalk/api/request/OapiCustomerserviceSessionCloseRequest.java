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
 * @since 1.0, 2021.03.29
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
		private static final long serialVersionUID = 8172274174287286379L;
		/**
		 * 客服所在bu
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 钉钉的corpId
		 */
		@ApiField("ding_corp_id")
		private String dingCorpId;
		/**
		 * 实例id
		 */
		@ApiField("open_instance_id")
		private String openInstanceId;
		/**
		 * 操作者id
		 */
		@ApiField("operator_id")
		private String operatorId;
		/**
		 * 4,小二；1，会员
		 */
		@ApiField("operator_type")
		private String operatorType;
		/**
		 * 1，智能客服；1001，经济体版本
		 */
		@ApiField("production_type")
		private Long productionType;
		/**
		 * 关闭原因，memberIsSilentheartBeatBreakmemberCloseTheSession
		 */
		@ApiField("reason")
		private String reason;
		/**
		 * 客服的id
		 */
		@ApiField("service_id")
		private String serviceId;
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
		public String getDingCorpId() {
			return this.dingCorpId;
		}
		public void setDingCorpId(String dingCorpId) {
			this.dingCorpId = dingCorpId;
		}
		public String getOpenInstanceId() {
			return this.openInstanceId;
		}
		public void setOpenInstanceId(String openInstanceId) {
			this.openInstanceId = openInstanceId;
		}
		public String getOperatorId() {
			return this.operatorId;
		}
		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}
		public String getOperatorType() {
			return this.operatorType;
		}
		public void setOperatorType(String operatorType) {
			this.operatorType = operatorType;
		}
		public Long getProductionType() {
			return this.productionType;
		}
		public void setProductionType(Long productionType) {
			this.productionType = productionType;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getServiceId() {
			return this.serviceId;
		}
		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
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