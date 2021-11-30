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

import com.dingtalk.api.response.OapiImChatScenegroupTemplateApplyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.scenegroup.template.apply request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.24
 */
public class OapiImChatScenegroupTemplateApplyRequest extends BaseTaobaoRequest<OapiImChatScenegroupTemplateApplyResponse> {
	
	

	/** 
	* 启用模式
	 */
	private Long applyMode;

	/** 
	* 加密cid,必填
	 */
	private String openConversationId;

	/** 
	* 群主userid
	 */
	private String ownerUserId;

	/** 
	* 群模板ID
	 */
	private String templateId;

	public void setApplyMode(Long applyMode) {
		this.applyMode = applyMode;
	}

	public Long getApplyMode() {
		return this.applyMode;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.scenegroup.template.apply";
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
		txtParams.put("apply_mode", this.applyMode);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("owner_user_id", this.ownerUserId);
		txtParams.put("template_id", this.templateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatScenegroupTemplateApplyResponse> getResponseClass() {
		return OapiImChatScenegroupTemplateApplyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkNotEmpty(ownerUserId, "ownerUserId");
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
	}
	

}