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
import com.dingtalk.api.response.CorpChatbotInstallResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.install request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class CorpChatbotInstallRequest extends BaseTaobaoRequest<CorpChatbotInstallResponse> {
	
	

	/** 
	* 安装的机器人信息
	 */
	private String chatbotVo;

	public void setChatbotVo(String chatbotVo) {
		this.chatbotVo = chatbotVo;
	}

	public void setChatbotVo(ChatbotVo chatbotVo) {
		this.chatbotVo = new JSONWriter(false,true).write(chatbotVo);
	}

	public String getChatbotVo() {
		return this.chatbotVo;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.chatbot.install";
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
		txtParams.put("chatbot_vo", this.chatbotVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpChatbotInstallResponse> getResponseClass() {
		return CorpChatbotInstallResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 安装的机器人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ChatbotVo extends TaobaoObject {
		private static final long serialVersionUID = 8311341314213998312L;
		/**
		 * 0-正常，1-只服务端可管理
		 */
		@ApiField("authority")
		private Long authority;
		/**
		 * 2-企业对内机器人，3-企业对外机器人
		 */
		@ApiField("bot_type")
		private Long botType;
		/**
		 * 机器人简介
		 */
		@ApiField("breif")
		private String breif;
		/**
		 * 机器人id(钉钉分配)
		 */
		@ApiField("chatbot_id")
		private String chatbotId;
		/**
		 * 机器详细介绍
		 */
		@ApiField("description")
		private String description;
		/**
		 * INCOMING = 1,OUTGOING  = 2,INOUT     = 3
		 */
		@ApiField("function")
		private Long function;
		/**
		 * 机器人头像mediaId
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 向群添加机器人时是否可改头像：0-不可必，1-可改
		 */
		@ApiField("icon_mdify")
		private Long iconMdify;
		/**
		 * 机器人在群里可以添加的最大个数
		 */
		@ApiField("instance_cnt")
		private Long instanceCnt;
		/**
		 * 手机端是否能添加机器人：0-移动端不能加，1-移动端能添加
		 */
		@ApiField("mobile_switch")
		private Long mobileSwitch;
		/**
		 * 机器人的名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 向群添加机器人时是否可改名字：0-不可必，1-可改
		 */
		@ApiField("name_modify")
		private Long nameModify;
		/**
		 * 是否支持单聊：0-不要单聊，1需要单聊
		 */
		@ApiField("oto_support")
		private Long otoSupport;
		/**
		 * 机器人消息回调时在header中添加的token,用于对钉钉鉴权
		 */
		@ApiField("outgoing_token")
		private String outgoingToken;
		/**
		 * 机器人回调URL
		 */
		@ApiField("outgoing_url")
		private String outgoingUrl;
		/**
		 * 机器人预览图
		 */
		@ApiField("preview_media_id")
		private String previewMediaId;
	
		public Long getAuthority() {
			return this.authority;
		}
		public void setAuthority(Long authority) {
			this.authority = authority;
		}
		public Long getBotType() {
			return this.botType;
		}
		public void setBotType(Long botType) {
			this.botType = botType;
		}
		public String getBreif() {
			return this.breif;
		}
		public void setBreif(String breif) {
			this.breif = breif;
		}
		public String getChatbotId() {
			return this.chatbotId;
		}
		public void setChatbotId(String chatbotId) {
			this.chatbotId = chatbotId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getFunction() {
			return this.function;
		}
		public void setFunction(Long function) {
			this.function = function;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public Long getIconMdify() {
			return this.iconMdify;
		}
		public void setIconMdify(Long iconMdify) {
			this.iconMdify = iconMdify;
		}
		public Long getInstanceCnt() {
			return this.instanceCnt;
		}
		public void setInstanceCnt(Long instanceCnt) {
			this.instanceCnt = instanceCnt;
		}
		public Long getMobileSwitch() {
			return this.mobileSwitch;
		}
		public void setMobileSwitch(Long mobileSwitch) {
			this.mobileSwitch = mobileSwitch;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getNameModify() {
			return this.nameModify;
		}
		public void setNameModify(Long nameModify) {
			this.nameModify = nameModify;
		}
		public Long getOtoSupport() {
			return this.otoSupport;
		}
		public void setOtoSupport(Long otoSupport) {
			this.otoSupport = otoSupport;
		}
		public String getOutgoingToken() {
			return this.outgoingToken;
		}
		public void setOutgoingToken(String outgoingToken) {
			this.outgoingToken = outgoingToken;
		}
		public String getOutgoingUrl() {
			return this.outgoingUrl;
		}
		public void setOutgoingUrl(String outgoingUrl) {
			this.outgoingUrl = outgoingUrl;
		}
		public String getPreviewMediaId() {
			return this.previewMediaId;
		}
		public void setPreviewMediaId(String previewMediaId) {
			this.previewMediaId = previewMediaId;
		}
	}
	

}