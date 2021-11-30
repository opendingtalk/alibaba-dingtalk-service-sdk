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
import com.dingtalk.api.response.OapiMessageSendToSingleConversationResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.send_to_single_conversation request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiMessageSendToSingleConversationRequest extends BaseTaobaoRequest<OapiMessageSendToSingleConversationResponse> {
	
	

	/** 
	* 推送消息内容
	 */
	private String msg;

	/** 
	* 接收者userId
	 */
	private String receiverUserid;

	/** 
	* 发送者userId
	 */
	private String senderUserid;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setMsg(Msg msg) {
		this.msg = new JSONWriter(false,false,true).write(msg);
	}

	public String getMsg() {
		return this.msg;
	}

	public void setReceiverUserid(String receiverUserid) {
		this.receiverUserid = receiverUserid;
	}

	public String getReceiverUserid() {
		return this.receiverUserid;
	}

	public void setSenderUserid(String senderUserid) {
		this.senderUserid = senderUserid;
	}

	public String getSenderUserid() {
		return this.senderUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.send_to_single_conversation";
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
		txtParams.put("msg", this.msg);
		txtParams.put("receiver_userid", this.receiverUserid);
		txtParams.put("sender_userid", this.senderUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageSendToSingleConversationResponse> getResponseClass() {
		return OapiMessageSendToSingleConversationResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(receiverUserid, "receiverUserid");
		RequestCheckUtils.checkNotEmpty(senderUserid, "senderUserid");
	}
	
	/**
	 * markdown消息内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 3124569917621474444L;
		/**
		 * markdown消息内容
		 */
		@ApiField("text")
		private String text;
	
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
	
	/**
	 * 推送消息内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Msg extends TaobaoObject {
		private static final long serialVersionUID = 6247918947914958764L;
		/**
		 * markdown消息内容
		 */
		@ApiField("markdown")
		private Markdown markdown;
		/**
		 * 消息内容类型,目前只支持markdown
		 */
		@ApiField("msgtype")
		private String msgtype;
	
		public Markdown getMarkdown() {
			return this.markdown;
		}
		public void setMarkdown(Markdown markdown) {
			this.markdown = markdown;
		}
		public String getMsgtype() {
			return this.msgtype;
		}
		public void setMsgtype(String msgtype) {
			this.msgtype = msgtype;
		}
	}
	

}