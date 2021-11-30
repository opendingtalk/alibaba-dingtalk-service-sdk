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
import com.dingtalk.api.response.OapiImpaasConverstionCreateo2oResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.converstion.createo2o request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasConverstionCreateo2oRequest extends BaseTaobaoRequest<OapiImpaasConverstionCreateo2oResponse> {
	
	

	/** 
	* 创建会话请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateConversationRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.converstion.createo2o";
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

	public Class<OapiImpaasConverstionCreateo2oResponse> getResponseClass() {
		return OapiImpaasConverstionCreateo2oResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 发送者
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ConversationAccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 6128518437158576817L;
		/**
		 * 创建者账号ID，类型由type字段决定
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号ID类型，当type=staff时，id填写staffid，当type=channelUser时，id字段填写channelUserId
		 */
		@ApiField("type")
		private String type;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 创建会话请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateConversationRequest extends TaobaoObject {
		private static final long serialVersionUID = 2545499368828952387L;
		/**
		 * 接入方channel信息，该值由接入方接入IMPaaS平台时，向IMPaaS平台申请，例如“hema”“eleme”等。
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 扩展数据,业务可以自定义，目前最大支持256B
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 接收者
		 */
		@ApiField("receiver")
		private ConversationAccountInfo receiver;
		/**
		 * 接收者二级会话入口ID
		 */
		@ApiField("receiver_entrance_id")
		private Long receiverEntranceId;
		/**
		 * 发送者
		 */
		@ApiField("sender")
		private ConversationAccountInfo sender;
		/**
		 * 发送者二级会话入口ID
		 */
		@ApiField("sender_entrance_id")
		private Long senderEntranceId;
		/**
		 * uuid, 用于防止弱网情况下超时导致重复创建, 一分钟内传递相同的uuid会返回同一个群，传空则不去重
		 */
		@ApiField("uuid")
		private String uuid;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public ConversationAccountInfo getReceiver() {
			return this.receiver;
		}
		public void setReceiver(ConversationAccountInfo receiver) {
			this.receiver = receiver;
		}
		public Long getReceiverEntranceId() {
			return this.receiverEntranceId;
		}
		public void setReceiverEntranceId(Long receiverEntranceId) {
			this.receiverEntranceId = receiverEntranceId;
		}
		public ConversationAccountInfo getSender() {
			return this.sender;
		}
		public void setSender(ConversationAccountInfo sender) {
			this.sender = sender;
		}
		public Long getSenderEntranceId() {
			return this.senderEntranceId;
		}
		public void setSenderEntranceId(Long senderEntranceId) {
			this.senderEntranceId = senderEntranceId;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	

}