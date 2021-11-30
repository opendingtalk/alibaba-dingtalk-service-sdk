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

import com.dingtalk.api.response.OapiImChatScenegroupMemberDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scenegroup.member.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.26
 */
public class OapiImChatScenegroupMemberDeleteRequest extends BaseTaobaoRequest<OapiImChatScenegroupMemberDeleteResponse> {
	
	

	/** 
	* 客户联系人staffId
	 */
	private String contactStaffIds;

	/** 
	* 开放群id
	 */
	private String openConversationId;

	/** 
	* 员工userid
	 */
	private String userIds;

	public void setContactStaffIds(String contactStaffIds) {
		this.contactStaffIds = contactStaffIds;
	}

	public String getContactStaffIds() {
		return this.contactStaffIds;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.scenegroup.member.delete";
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
		txtParams.put("contact_staff_ids", this.contactStaffIds);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("user_ids", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScenegroupMemberDeleteResponse> getResponseClass() {
		return OapiImChatScenegroupMemberDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(contactStaffIds, 999, "contactStaffIds");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkMaxListSize(userIds, 999, "userIds");
	}
	

}