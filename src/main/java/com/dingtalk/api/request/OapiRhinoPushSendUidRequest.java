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
import com.dingtalk.api.response.OapiRhinoPushSendUidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.push.send.uid request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.29
 */
public class OapiRhinoPushSendUidRequest extends BaseTaobaoRequest<OapiRhinoPushSendUidResponse> {
	
	

	/** 
	* 请求体
	 */
	private String paramSendImMsgRequest;

	public void setParamSendImMsgRequest(String paramSendImMsgRequest) {
		this.paramSendImMsgRequest = paramSendImMsgRequest;
	}

	public void setParamSendImMsgRequest(SendImMsgRequest paramSendImMsgRequest) {
		this.paramSendImMsgRequest = new JSONWriter(false,false,true).write(paramSendImMsgRequest);
	}

	public String getParamSendImMsgRequest() {
		return this.paramSendImMsgRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.push.send.uid";
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
		txtParams.put("param_send_im_msg_request", this.paramSendImMsgRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoPushSendUidResponse> getResponseClass() {
		return OapiRhinoPushSendUidResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SendImMsgRequest extends TaobaoObject {
		private static final long serialVersionUID = 2212236692239976875L;
		/**
		 * 消息内容
		 */
		@ApiField("msg_body")
		private String msgBody;
		/**
		 * 推送的topic
		 */
		@ApiField("msg_body_topic_code")
		private String msgBodyTopicCode;
		/**
		 * 事件类型
		 */
		@ApiField("msg_event")
		private String msgEvent;
		/**
		 * 事件级别
		 */
		@ApiField("msg_event_level")
		private String msgEventLevel;
		/**
		 * 内容类型
		 */
		@ApiField("msg_type")
		private String msgType;
		/**
		 * 发送者的id
		 */
		@ApiField("sender")
		private String sender;
		/**
		 * 发送方来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 发送方的来源id
		 */
		@ApiField("source_id")
		private String sourceId;
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
		/**
		 * 目标用户id
		 */
		@ApiField("uic_id")
		private Long uicId;
	
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
		public Long getUicId() {
			return this.uicId;
		}
		public void setUicId(Long uicId) {
			this.uicId = uicId;
		}
	}
	

}