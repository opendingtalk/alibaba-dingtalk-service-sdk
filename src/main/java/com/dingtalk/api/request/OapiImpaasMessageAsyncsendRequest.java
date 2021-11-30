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
import com.dingtalk.api.response.OapiImpaasMessageAsyncsendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.message.asyncsend request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasMessageAsyncsendRequest extends BaseTaobaoRequest<OapiImpaasMessageAsyncsendResponse> {
	
	

	/** 
	* 发送消息的结构
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(AsyncSendMessageRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.message.asyncsend";
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

	public Class<OapiImpaasMessageAsyncsendResponse> getResponseClass() {
		return OapiImpaasMessageAsyncsendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 发送者，暂不支持，可不填
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 4874667511444588768L;
		/**
		 * 账号通道:eleme,hema等
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 账号ID
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号类型:channelUserstaff。当类型为channelUser时，填写app自己的账号，当类型为staff时，填写钉钉的staffid
		 */
		@ApiField("type")
		private String type;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
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
	 * 推送信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class XpnContentModel extends TaobaoObject {
		private static final long serialVersionUID = 4643114929323178137L;
		/**
		 * 推送文案
		 */
		@ApiField("alert_content")
		private String alertContent;
		/**
		 * 推送参数，透传
		 */
		@ApiField("params")
		private String params;
	
		public String getAlertContent() {
			return this.alertContent;
		}
		public void setAlertContent(String alertContent) {
			this.alertContent = alertContent;
		}
		public String getParams() {
			return this.params;
		}
		public void setParams(String params) {
			this.params = params;
		}
		public void setParamsString(String params) {
			this.params = params;
		}
		
	}
	
	/**
	 * 发送消息的结构
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AsyncSendMessageRequest extends TaobaoObject {
		private static final long serialVersionUID = 5376984396228658577L;
		/**
		 * 群ID
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 消息内容，根据msgtype不同，解析方式不同
		 */
		@ApiField("msg_content")
		private String msgContent;
		/**
		 * 消息的可扩展字段，透传
		 */
		@ApiField("msg_extension")
		private String msgExtension;
		/**
		 * 消息的特性：静默消息，系统消息
		 */
		@ApiField("msg_feature")
		private String msgFeature;
		/**
		 * 消息类型：text，image，user-defined
		 */
		@ApiField("msg_type")
		private String msgType;
		/**
		 * 接受者，暂不支持，可不填
		 */
		@ApiListField("receiverid_list")
		@ApiField("json")
		private List<String> receiveridList;
		/**
		 * 发送者，暂不支持，可不填
		 */
		@ApiField("senderid")
		private AccountInfo senderid;
		/**
		 * 推送信息
		 */
		@ApiField("xpn_model")
		private XpnContentModel xpnModel;
	
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public String getMsgContent() {
			return this.msgContent;
		}
		public void setMsgContent(String msgContent) {
			this.msgContent = msgContent;
		}
		public void setMsgContentString(String msgContent) {
			this.msgContent = msgContent;
		}
		
		public String getMsgExtension() {
			return this.msgExtension;
		}
		public void setMsgExtension(String msgExtension) {
			this.msgExtension = msgExtension;
		}
		public void setMsgExtensionString(String msgExtension) {
			this.msgExtension = msgExtension;
		}
		
		public String getMsgFeature() {
			return this.msgFeature;
		}
		public void setMsgFeature(String msgFeature) {
			this.msgFeature = msgFeature;
		}
		public void setMsgFeatureString(String msgFeature) {
			this.msgFeature = msgFeature;
		}
		
		public String getMsgType() {
			return this.msgType;
		}
		public void setMsgType(String msgType) {
			this.msgType = msgType;
		}
		public List<String> getReceiveridList() {
			return this.receiveridList;
		}
		public void setReceiveridList(List<String> receiveridList) {
			this.receiveridList = receiveridList;
		}
		public AccountInfo getSenderid() {
			return this.senderid;
		}
		public void setSenderid(AccountInfo senderid) {
			this.senderid = senderid;
		}
		public XpnContentModel getXpnModel() {
			return this.xpnModel;
		}
		public void setXpnModel(XpnContentModel xpnModel) {
			this.xpnModel = xpnModel;
		}
	}
	

}