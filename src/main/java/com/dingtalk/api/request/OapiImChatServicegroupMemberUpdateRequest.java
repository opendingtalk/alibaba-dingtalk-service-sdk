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

import com.dingtalk.api.response.OapiImChatServicegroupMemberUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.servicegroup.member.update request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImChatServicegroupMemberUpdateRequest extends BaseTaobaoRequest<OapiImChatServicegroupMemberUpdateResponse> {
	
	

	/** 
	* 更新类型，REMOVE 移除、SET_ADMIN设为管理员、SET_NORMAL 设为普通成员
	 */
	private String action;

	/** 
	* 开放的chatId
	 */
	private String chatId;

	/** 
	* 成员的ID列表，英文逗号分隔
	 */
	private String memberDingtalkIds;

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setMemberDingtalkIds(String memberDingtalkIds) {
		this.memberDingtalkIds = memberDingtalkIds;
	}

	public String getMemberDingtalkIds() {
		return this.memberDingtalkIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.servicegroup.member.update";
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
		txtParams.put("action", this.action);
		txtParams.put("chat_id", this.chatId);
		txtParams.put("member_dingtalk_ids", this.memberDingtalkIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatServicegroupMemberUpdateResponse> getResponseClass() {
		return OapiImChatServicegroupMemberUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(action, "action");
		RequestCheckUtils.checkNotEmpty(chatId, "chatId");
		RequestCheckUtils.checkNotEmpty(memberDingtalkIds, "memberDingtalkIds");
		RequestCheckUtils.checkMaxListSize(memberDingtalkIds, 20, "memberDingtalkIds");
	}
	

}