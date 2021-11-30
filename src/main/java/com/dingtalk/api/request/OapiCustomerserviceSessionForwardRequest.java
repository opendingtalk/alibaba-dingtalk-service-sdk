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
import com.dingtalk.api.response.OapiCustomerserviceSessionForwardResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.session.forward request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.26
 */
public class OapiCustomerserviceSessionForwardRequest extends BaseTaobaoRequest<OapiCustomerserviceSessionForwardResponse> {
	
	

	/** 
	* 转交会话
	 */
	private String forwardSession;

	public void setForwardSession(String forwardSession) {
		this.forwardSession = forwardSession;
	}

	public void setForwardSession(ForwardSessionDTO forwardSession) {
		this.forwardSession = new JSONWriter(false,false,true).write(forwardSession);
	}

	public String getForwardSession() {
		return this.forwardSession;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.session.forward";
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
		txtParams.put("forward_session", this.forwardSession);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceSessionForwardResponse> getResponseClass() {
		return OapiCustomerserviceSessionForwardResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 转交会话
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ForwardSessionDTO extends TaobaoObject {
		private static final long serialVersionUID = 7392257299298681529L;
		/**
		 * 客服所在的组织id
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 操作人id
		 */
		@ApiField("operator_id")
		private String operatorId;
		/**
		 * 转交备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 客服id
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
		public String getOperatorId() {
			return this.operatorId;
		}
		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
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