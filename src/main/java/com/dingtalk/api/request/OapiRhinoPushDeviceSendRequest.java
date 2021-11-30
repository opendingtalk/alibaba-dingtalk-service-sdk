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
import com.dingtalk.api.response.OapiRhinoPushDeviceSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.push.device.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.29
 */
public class OapiRhinoPushDeviceSendRequest extends BaseTaobaoRequest<OapiRhinoPushDeviceSendResponse> {
	
	

	/** 
	* 请求体
	 */
	private String paramPushMsgRequest;

	public void setParamPushMsgRequest(String paramPushMsgRequest) {
		this.paramPushMsgRequest = paramPushMsgRequest;
	}

	public void setParamPushMsgRequest(PushMsgRequest paramPushMsgRequest) {
		this.paramPushMsgRequest = new JSONWriter(false,false,true).write(paramPushMsgRequest);
	}

	public String getParamPushMsgRequest() {
		return this.paramPushMsgRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.push.device.send";
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
		txtParams.put("paramPushMsgRequest", this.paramPushMsgRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoPushDeviceSendResponse> getResponseClass() {
		return OapiRhinoPushDeviceSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PushMsgRequest extends TaobaoObject {
		private static final long serialVersionUID = 6868185623215587984L;
		/**
		 * 推送内容
		 */
		@ApiField("msg_body")
		private String msgBody;
		/**
		 * 推送TOPIC
		 */
		@ApiField("msg_body_topic_code")
		private String msgBodyTopicCode;
		/**
		 * 推送消息类型
		 */
		@ApiField("msg_event")
		private String msgEvent;
		/**
		 * 推送消息级别
		 */
		@ApiField("msg_event_level")
		private String msgEventLevel;
		/**
		 * 推送消息体类型
		 */
		@ApiField("msg_type")
		private String msgType;
		/**
		 * 发送者
		 */
		@ApiField("sender")
		private String sender;
		/**
		 * 来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 来源id
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 推送目标id
		 */
		@ApiField("target_id")
		private String targetId;
		/**
		 * 推送目标类型
		 */
		@ApiField("target_type")
		private String targetType;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public String getMsgBody() {
			return this.msgBody;
		}
		public void setMsgBody(String msgBody) {
			this.msgBody = msgBody;
		}
		public String getMsgBodyTopicCode() {
			return this.msgBodyTopicCode;
		}
		public void setMsgBodyTopicCode(String msgBodyTopicCode) {
			this.msgBodyTopicCode = msgBodyTopicCode;
		}
		public String getMsgEvent() {
			return this.msgEvent;
		}
		public void setMsgEvent(String msgEvent) {
			this.msgEvent = msgEvent;
		}
		public String getMsgEventLevel() {
			return this.msgEventLevel;
		}
		public void setMsgEventLevel(String msgEventLevel) {
			this.msgEventLevel = msgEventLevel;
		}
		public String getMsgType() {
			return this.msgType;
		}
		public void setMsgType(String msgType) {
			this.msgType = msgType;
		}
		public String getSender() {
			return this.sender;
		}
		public void setSender(String sender) {
			this.sender = sender;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getTargetId() {
			return this.targetId;
		}
		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}
		public String getTargetType() {
			return this.targetType;
		}
		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}