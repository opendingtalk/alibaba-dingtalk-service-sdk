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
 * @since 1.0, 2020.02.12
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
		private static final long serialVersionUID = 3616563546787226777L;
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