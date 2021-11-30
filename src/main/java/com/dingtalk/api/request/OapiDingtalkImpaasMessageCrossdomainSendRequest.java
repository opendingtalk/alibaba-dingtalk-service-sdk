package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiDingtalkImpaasMessageCrossdomainSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingtalk.impaas.message.crossdomain.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.01
 */
public class OapiDingtalkImpaasMessageCrossdomainSendRequest extends BaseTaobaoRequest<OapiDingtalkImpaasMessageCrossdomainSendResponse> {
	
	

	/** 
	* 互通消息结构
	 */
	private String crossdomainMessageSendModel;

	public void setCrossdomainMessageSendModel(String crossdomainMessageSendModel) {
		this.crossdomainMessageSendModel = crossdomainMessageSendModel;
	}

	public void setCrossdomainMessageSendModel(TopCrossDomainMessageSendModel crossdomainMessageSendModel) {
		this.crossdomainMessageSendModel = new JSONWriter(false,false,true).write(crossdomainMessageSendModel);
	}

	public String getCrossdomainMessageSendModel() {
		return this.crossdomainMessageSendModel;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingtalk.impaas.message.crossdomain.send";
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
		txtParams.put("crossdomain_message_send_model", this.crossdomainMessageSendModel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingtalkImpaasMessageCrossdomainSendResponse> getResponseClass() {
		return OapiDingtalkImpaasMessageCrossdomainSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 消息发送结构
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopSendMessageModel extends TaobaoObject {
		private static final long serialVersionUID = 8697458154693881642L;
		/**
		 * 会话ID
		 */
		@ApiField("cid")
		private String cid;
		/**
		 * 消息内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 消息内容类型1:文本 2:卡片
		 */
		@ApiField("content_type")
		private Long contentType;
		/**
		 * 会话类型
		 */
		@ApiField("conversation_type")
		private Long conversationType;
		/**
		 * UUID
		 */
		@ApiField("uuid")
		private String uuid;
	
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public void setContentString(String content) {
			this.content = content;
		}
		
		public Long getContentType() {
			return this.contentType;
		}
		public void setContentType(Long contentType) {
			this.contentType = contentType;
		}
		public Long getConversationType() {
			return this.conversationType;
		}
		public void setConversationType(Long conversationType) {
			this.conversationType = conversationType;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	
	/**
	 * 接收者结构体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MessageReceiverScopeModel extends TaobaoObject {
		private static final long serialVersionUID = 3642587745989664668L;
		/**
		 * 接收者
		 */
		@ApiListField("actual_receivers")
		@ApiField("string")
		private List<String> actualReceivers;
	
		public List<String> getActualReceivers() {
			return this.actualReceivers;
		}
		public void setActualReceivers(List<String> actualReceivers) {
			this.actualReceivers = actualReceivers;
		}
	}
	
	/**
	 * 互通消息结构
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopCrossDomainMessageSendModel extends TaobaoObject {
		private static final long serialVersionUID = 1228998886695735579L;
		/**
		 * 消息ID
		 */
		@ApiField("message_id")
		private String messageId;
		/**
		 * 接收者结构体
		 */
		@ApiField("message_receiver_scope_model")
		private MessageReceiverScopeModel messageReceiverScopeModel;
		/**
		 * 会话免打扰，不填或填false为能接收通知；true为开启会话免打扰
		 */
		@ApiField("new_conversation_notification_off")
		private Boolean newConversationNotificationOff;
		/**
		 * 消息发送结构
		 */
		@ApiField("send_message_model")
		private TopSendMessageModel sendMessageModel;
		/**
		 * 发送者
		 */
		@ApiField("sender")
		private String sender;
	
		public String getMessageId() {
			return this.messageId;
		}
		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}
		public MessageReceiverScopeModel getMessageReceiverScopeModel() {
			return this.messageReceiverScopeModel;
		}
		public void setMessageReceiverScopeModel(MessageReceiverScopeModel messageReceiverScopeModel) {
			this.messageReceiverScopeModel = messageReceiverScopeModel;
		}
		public Boolean getNewConversationNotificationOff() {
			return this.newConversationNotificationOff;
		}
		public void setNewConversationNotificationOff(Boolean newConversationNotificationOff) {
			this.newConversationNotificationOff = newConversationNotificationOff;
		}
		public TopSendMessageModel getSendMessageModel() {
			return this.sendMessageModel;
		}
		public void setSendMessageModel(TopSendMessageModel sendMessageModel) {
			this.sendMessageModel = sendMessageModel;
		}
		public String getSender() {
			return this.sender;
		}
		public void setSender(String sender) {
			this.sender = sender;
		}
	}
	

}