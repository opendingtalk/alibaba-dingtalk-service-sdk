package com.dingtalk.api.request;

import java.util.List;
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
import com.dingtalk.api.response.OapiSceneservicegroupMessageSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sceneservicegroup.message.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.21
 */
public class OapiSceneservicegroupMessageSendRequest extends BaseTaobaoRequest<OapiSceneservicegroupMessageSendResponse> {
	
	

	/** 
	* 根据dingtalkId设置at用户
	 */
	private String atDingtalkids;

	/** 
	* 根据手机号设置at用户
	 */
	private String atMobiles;

	/** 
	* 根据unionId设置at用户
	 */
	private String atUnionids;

	/** 
	* 业务方自身系统关联ID，与开放群ID二选一填入
	 */
	private String bizid;

	/** 
	* 0-按钮竖直排列，1-按钮横向排列
	 */
	private String btnOrientation;

	/** 
	* card按钮
	 */
	private String btns;

	/** 
	* 消息内容
	 */
	private String content;

	/** 
	* 是否at所有人
	 */
	private Boolean isAtAll;

	/** 
	* 消息类型
	 */
	private String messageType;

	/** 
	* 开放群ID
	 */
	private String openConversationid;

	/** 
	* 根据dingtalkId设置接收者
	 */
	private String receiverDingtalkids;

	/** 
	* 根据手机号设置接收者
	 */
	private String receiverMobiles;

	/** 
	* 根据unionId设置接收者
	 */
	private String receiverUnionids;

	/** 
	* 消息标题
	 */
	private String title;

	public void setAtDingtalkids(String atDingtalkids) {
		this.atDingtalkids = atDingtalkids;
	}

	public String getAtDingtalkids() {
		return this.atDingtalkids;
	}

	public void setAtMobiles(String atMobiles) {
		this.atMobiles = atMobiles;
	}

	public String getAtMobiles() {
		return this.atMobiles;
	}

	public void setAtUnionids(String atUnionids) {
		this.atUnionids = atUnionids;
	}

	public String getAtUnionids() {
		return this.atUnionids;
	}

	public void setBizid(String bizid) {
		this.bizid = bizid;
	}

	public String getBizid() {
		return this.bizid;
	}

	public void setBtnOrientation(String btnOrientation) {
		this.btnOrientation = btnOrientation;
	}

	public String getBtnOrientation() {
		return this.btnOrientation;
	}

	public void setBtns(String btns) {
		this.btns = btns;
	}

	public void setBtns(List<Btns> btns) {
		this.btns = new JSONWriter(false,false,true).write(btns);
	}

	public String getBtns() {
		return this.btns;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setIsAtAll(Boolean isAtAll) {
		this.isAtAll = isAtAll;
	}

	public Boolean getIsAtAll() {
		return this.isAtAll;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setOpenConversationid(String openConversationid) {
		this.openConversationid = openConversationid;
	}

	public String getOpenConversationid() {
		return this.openConversationid;
	}

	public void setReceiverDingtalkids(String receiverDingtalkids) {
		this.receiverDingtalkids = receiverDingtalkids;
	}

	public String getReceiverDingtalkids() {
		return this.receiverDingtalkids;
	}

	public void setReceiverMobiles(String receiverMobiles) {
		this.receiverMobiles = receiverMobiles;
	}

	public String getReceiverMobiles() {
		return this.receiverMobiles;
	}

	public void setReceiverUnionids(String receiverUnionids) {
		this.receiverUnionids = receiverUnionids;
	}

	public String getReceiverUnionids() {
		return this.receiverUnionids;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sceneservicegroup.message.send";
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
		txtParams.put("at_dingtalkids", this.atDingtalkids);
		txtParams.put("at_mobiles", this.atMobiles);
		txtParams.put("at_unionids", this.atUnionids);
		txtParams.put("bizid", this.bizid);
		txtParams.put("btn_orientation", this.btnOrientation);
		txtParams.put("btns", this.btns);
		txtParams.put("content", this.content);
		txtParams.put("is_at_all", this.isAtAll);
		txtParams.put("message_type", this.messageType);
		txtParams.put("open_conversationid", this.openConversationid);
		txtParams.put("receiver_dingtalkids", this.receiverDingtalkids);
		txtParams.put("receiver_mobiles", this.receiverMobiles);
		txtParams.put("receiver_unionids", this.receiverUnionids);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSceneservicegroupMessageSendResponse> getResponseClass() {
		return OapiSceneservicegroupMessageSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(atDingtalkids, 999, "atDingtalkids");
		RequestCheckUtils.checkMaxListSize(atMobiles, 999, "atMobiles");
		RequestCheckUtils.checkMaxListSize(atUnionids, 999, "atUnionids");
		RequestCheckUtils.checkObjectMaxListSize(btns, 999, "btns");
		RequestCheckUtils.checkNotEmpty(content, "content");
		RequestCheckUtils.checkNotEmpty(messageType, "messageType");
		RequestCheckUtils.checkMaxListSize(receiverDingtalkids, 999, "receiverDingtalkids");
		RequestCheckUtils.checkMaxListSize(receiverMobiles, 999, "receiverMobiles");
		RequestCheckUtils.checkMaxListSize(receiverUnionids, 999, "receiverUnionids");
		RequestCheckUtils.checkNotEmpty(title, "title");
	}
	
	/**
	 * card按钮
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Btns extends TaobaoObject {
		private static final long serialVersionUID = 1455244421537499838L;
		/**
		 * 按钮地址
		 */
		@ApiField("actionURL")
		private String actionURL;
		/**
		 * 按钮标题
		 */
		@ApiField("title")
		private String title;
	
		public String getActionURL() {
			return this.actionURL;
		}
		public void setActionURL(String actionURL) {
			this.actionURL = actionURL;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}