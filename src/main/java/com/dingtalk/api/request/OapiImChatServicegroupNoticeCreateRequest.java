package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImChatServicegroupNoticeCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.servicegroup.notice.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.04
 */
public class OapiImChatServicegroupNoticeCreateRequest extends BaseTaobaoRequest<OapiImChatServicegroupNoticeCreateResponse> {
	
	

	/** 
	* 要创建群公告的群id
	 */
	private String chatId;

	/** 
	* 是否发送ding提醒
	 */
	private Boolean sendDing;

	/** 
	* 是否置顶
	 */
	private Boolean sticky;

	/** 
	* 群公告内容
	 */
	private String textContent;

	/** 
	* 群公告标题
	 */
	private String title;

	/** 
	* 唯一性key，由调用方提供，避免重复操作。
	 */
	private String uniqueKey;

	/** 
	* 创建者id
	 */
	private String userid;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setSendDing(Boolean sendDing) {
		this.sendDing = sendDing;
	}

	public Boolean getSendDing() {
		return this.sendDing;
	}

	public void setSticky(Boolean sticky) {
		this.sticky = sticky;
	}

	public Boolean getSticky() {
		return this.sticky;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getTextContent() {
		return this.textContent;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	public String getUniqueKey() {
		return this.uniqueKey;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.servicegroup.notice.create";
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
		txtParams.put("chat_id", this.chatId);
		txtParams.put("send_ding", this.sendDing);
		txtParams.put("sticky", this.sticky);
		txtParams.put("text_content", this.textContent);
		txtParams.put("title", this.title);
		txtParams.put("unique_key", this.uniqueKey);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatServicegroupNoticeCreateResponse> getResponseClass() {
		return OapiImChatServicegroupNoticeCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatId, "chatId");
		RequestCheckUtils.checkNotEmpty(textContent, "textContent");
		RequestCheckUtils.checkMaxLength(textContent, 2000, "textContent");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkMaxLength(title, 200, "title");
		RequestCheckUtils.checkNotEmpty(uniqueKey, "uniqueKey");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}