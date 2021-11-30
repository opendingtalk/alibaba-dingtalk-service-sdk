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

import com.dingtalk.api.response.CorpChatbotUpdatebychatbotidResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.updatebychatbotid request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpChatbotUpdatebychatbotidRequest extends BaseTaobaoRequest<CorpChatbotUpdatebychatbotidResponse> {
	
	

	/** 
	* 机器人简单描述
	 */
	private String breif;

	/** 
	* 机器人id(钉钉分配)
	 */
	private String chatbotId;

	/** 
	* 机器人详细描述
	 */
	private String description;

	/** 
	* 机器人头像
	 */
	private String icon;

	/** 
	* 机器人名字
	 */
	private String name;

	/** 
	* 机器人预览图
	 */
	private String previewMediaId;

	/** 
	* 更新名字或头像时是否更新群里已添加机器人的名字或头像。         * 0-不更新群里机器人名字或头像         * 1-更新群里机器人名字或头像
	 */
	private Long updateType;

	public void setBreif(String breif) {
		this.breif = breif;
	}

	public String getBreif() {
		return this.breif;
	}

	public void setChatbotId(String chatbotId) {
		this.chatbotId = chatbotId;
	}

	public String getChatbotId() {
		return this.chatbotId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPreviewMediaId(String previewMediaId) {
		this.previewMediaId = previewMediaId;
	}

	public String getPreviewMediaId() {
		return this.previewMediaId;
	}

	public void setUpdateType(Long updateType) {
		this.updateType = updateType;
	}

	public Long getUpdateType() {
		return this.updateType;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.chatbot.updatebychatbotid";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("breif", this.breif);
		txtParams.put("chatbot_id", this.chatbotId);
		txtParams.put("description", this.description);
		txtParams.put("icon", this.icon);
		txtParams.put("name", this.name);
		txtParams.put("preview_media_id", this.previewMediaId);
		txtParams.put("update_type", this.updateType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpChatbotUpdatebychatbotidResponse> getResponseClass() {
		return CorpChatbotUpdatebychatbotidResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(updateType, "updateType");
	}
	

}