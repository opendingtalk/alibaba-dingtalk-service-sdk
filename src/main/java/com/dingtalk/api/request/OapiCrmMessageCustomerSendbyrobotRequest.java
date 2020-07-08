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
import com.dingtalk.api.response.OapiCrmMessageCustomerSendbyrobotResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.message.customer.sendbyrobot request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.12
 */
public class OapiCrmMessageCustomerSendbyrobotRequest extends BaseTaobaoRequest<OapiCrmMessageCustomerSendbyrobotResponse> {
	
	

	/** 
	* 消息发送request
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(SendMessageRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.message.customer.sendbyrobot";
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

	public Class<OapiCrmMessageCustomerSendbyrobotResponse> getResponseClass() {
		return OapiCrmMessageCustomerSendbyrobotResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 消息发送request
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SendMessageRequest extends TaobaoObject {
		private static final long serialVersionUID = 6663136997148368157L;
		/**
		 * 发送类型 1:单聊，2:群聊
		 */
		@ApiField("chatType")
		private Long chatType;
		/**
		 * 客户id
		 */
		@ApiField("customerId")
		private String customerId;
		/**
		 * 消息模板id
		 */
		@ApiField("msgKey")
		private String msgKey;
		/**
		 * 消息参数map
		 */
		@ApiField("msgParam")
		private String msgParam;
		/**
		 * 幂等id
		 */
		@ApiField("uuid")
		private String uuid;
	
		public Long getChatType() {
			return this.chatType;
		}
		public void setChatType(Long chatType) {
			this.chatType = chatType;
		}
		public String getCustomerId() {
			return this.customerId;
		}
		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}
		public String getMsgKey() {
			return this.msgKey;
		}
		public void setMsgKey(String msgKey) {
			this.msgKey = msgKey;
		}
		public String getMsgParam() {
			return this.msgParam;
		}
		public void setMsgParam(String msgParam) {
			this.msgParam = msgParam;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	

}