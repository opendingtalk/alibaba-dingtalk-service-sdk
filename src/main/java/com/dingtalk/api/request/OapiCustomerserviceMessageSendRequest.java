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
import com.dingtalk.api.response.OapiCustomerserviceMessageSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.29
 */
public class OapiCustomerserviceMessageSendRequest extends BaseTaobaoRequest<OapiCustomerserviceMessageSendResponse> {
	
	

	/** 
	* 消息对象
	 */
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessage(MessageDTO message) {
		this.message = new JSONWriter(false,false,true).write(message);
	}

	public String getMessage() {
		return this.message;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.message.send";
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
		txtParams.put("message", this.message);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceMessageSendResponse> getResponseClass() {
		return OapiCustomerserviceMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 消息对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MessageDTO extends TaobaoObject {
		private static final long serialVersionUID = 4683984837428594385L;
		/**
		 * 会员所属组织
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 会员id
		 */
		@ApiField("cms_id")
		private String cmsId;
		/**
		 * 消息内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * **      * 文本      *     TEXT(1),      **      * 图片      *     IMAGE(2),      **      * 视频      *     VIDEO(3),      **      * 链接      *     LINK(4),      **      * 语音      *     VOICE(5),      **      * markdown      *     MARK_DOWN(6),      **      * 交互式卡片      *     ACTION_CARD(7),      **      * 富文本      *     RICH_TEXT(8),      **      * 文件      *     FILE(9),      **      * 消息已读      *     MSG_READ(10)
		 */
		@ApiField("content_type")
		private Long contentType;
		/**
		 * 钉钉的企业id
		 */
		@ApiField("ding_corp_id")
		private String dingCorpId;
		/**
		 * 消息生成时间
		 */
		@ApiField("message_create_at")
		private Long messageCreateAt;
		/**
		 * 消息id
		 */
		@ApiField("message_id")
		private String messageId;
		/**
		 * 实例id
		 */
		@ApiField("open_instance_id")
		private String openInstanceId;
		/**
		 * 1，智能客服；1001，经济体智能客服
		 */
		@ApiField("production_type")
		private Long productionType;
		/**
		 * 小二serviceId，或者会员的cmsId
		 */
		@ApiField("sender_id")
		private String senderId;
		/**
		 * 4，小二；1，会员
		 */
		@ApiField("sender_type")
		private String senderType;
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
		public String getCmsId() {
			return this.cmsId;
		}
		public void setCmsId(String cmsId) {
			this.cmsId = cmsId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Long getContentType() {
			return this.contentType;
		}
		public void setContentType(Long contentType) {
			this.contentType = contentType;
		}
		public String getDingCorpId() {
			return this.dingCorpId;
		}
		public void setDingCorpId(String dingCorpId) {
			this.dingCorpId = dingCorpId;
		}
		public Long getMessageCreateAt() {
			return this.messageCreateAt;
		}
		public void setMessageCreateAt(Long messageCreateAt) {
			this.messageCreateAt = messageCreateAt;
		}
		public String getMessageId() {
			return this.messageId;
		}
		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}
		public String getOpenInstanceId() {
			return this.openInstanceId;
		}
		public void setOpenInstanceId(String openInstanceId) {
			this.openInstanceId = openInstanceId;
		}
		public Long getProductionType() {
			return this.productionType;
		}
		public void setProductionType(Long productionType) {
			this.productionType = productionType;
		}
		public String getSenderId() {
			return this.senderId;
		}
		public void setSenderId(String senderId) {
			this.senderId = senderId;
		}
		public String getSenderType() {
			return this.senderType;
		}
		public void setSenderType(String senderType) {
			this.senderType = senderType;
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