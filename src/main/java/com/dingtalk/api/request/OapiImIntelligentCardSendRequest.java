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

import com.dingtalk.api.response.OapiImIntelligentCardSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.intelligent.card.send request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.26
 */
public class OapiImIntelligentCardSendRequest extends BaseTaobaoRequest<OapiImIntelligentCardSendResponse> {
	
	

	/** 
	* 群助理的biz类型
	 */
	private Long bizType;

	/** 
	* 加密的群id
	 */
	private String openConversationId;

	/** 
	* 动态卡片的json格式模板
	 */
	private String templateData;

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getBizType() {
		return this.bizType;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	public String getTemplateData() {
		return this.templateData;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.intelligent.card.send";
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
		txtParams.put("biz_type", this.bizType);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("template_data", this.templateData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImIntelligentCardSendResponse> getResponseClass() {
		return OapiImIntelligentCardSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkNotEmpty(templateData, "templateData");
	}
	

}