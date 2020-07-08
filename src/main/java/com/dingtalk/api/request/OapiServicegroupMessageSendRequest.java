package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiServicegroupMessageSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.servicegroup.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.17
 */
public class OapiServicegroupMessageSendRequest extends BaseTaobaoRequest<OapiServicegroupMessageSendResponse> {
	
	

	/** 
	* 消息对象
	 */
	private String conversationMessage;

	/** 
	* 订单id
	 */
	private Long orderId;

	public void setConversationMessage(String conversationMessage) {
		this.conversationMessage = conversationMessage;
	}

	public void setConversationMessage(ConversationMessage conversationMessage) {
		this.conversationMessage = new JSONWriter(false,false,true).write(conversationMessage);
	}

	public String getConversationMessage() {
		return this.conversationMessage;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.servicegroup.message.send";
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
		txtParams.put("conversation_message", this.conversationMessage);
		txtParams.put("order_id", this.orderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServicegroupMessageSendResponse> getResponseClass() {
		return OapiServicegroupMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
	}
	
	/**
	 * 消息对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ConversationMessage extends TaobaoObject {
		private static final long serialVersionUID = 1646389621725716668L;
		/**
		 * 内容
		 */
		@ApiField("text")
		private String text;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}