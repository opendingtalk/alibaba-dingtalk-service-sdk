package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiImpaasSubconversationSetsubconversationResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.subconversation.setsubconversation request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.22
 */
public class OapiImpaasSubconversationSetsubconversationRequest extends BaseTaobaoRequest<OapiImpaasSubconversationSetsubconversationResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(SetSubConversationRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.subconversation.setsubconversation";
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

	public Class<OapiImpaasSubconversationSetsubconversationResponse> getResponseClass() {
		return OapiImpaasSubconversationSetsubconversationResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 3675899527868255456L;
		/**
		 * channel
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * id
		 */
		@ApiField("id")
		private String id;
		/**
		 * type
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
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SetSubConversationRequest extends TaobaoObject {
		private static final long serialVersionUID = 8459468126892685817L;
		/**
		 * chatId
		 */
		@ApiField("chat_id")
		private String chatId;
		/**
		 * entranceId
		 */
		@ApiField("entrance_id")
		private String entranceId;
		/**
		 * isGroup
		 */
		@ApiField("is_group")
		private Boolean isGroup;
		/**
		 * 成员列表
		 */
		@ApiListField("members")
		@ApiField("account_info")
		private List<AccountInfo> members;
	
		public String getChatId() {
			return this.chatId;
		}
		public void setChatId(String chatId) {
			this.chatId = chatId;
		}
		public String getEntranceId() {
			return this.entranceId;
		}
		public void setEntranceId(String entranceId) {
			this.entranceId = entranceId;
		}
		public Boolean getIsGroup() {
			return this.isGroup;
		}
		public void setIsGroup(Boolean isGroup) {
			this.isGroup = isGroup;
		}
		public List<AccountInfo> getMembers() {
			return this.members;
		}
		public void setMembers(List<AccountInfo> members) {
			this.members = members;
		}
	}
	

}