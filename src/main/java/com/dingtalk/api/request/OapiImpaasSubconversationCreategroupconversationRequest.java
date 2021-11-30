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
import com.dingtalk.api.response.OapiImpaasSubconversationCreategroupconversationResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.subconversation.creategroupconversation request
 * 
 * @author top auto create
 * @since 1.0, 2018.11.29
 */
public class OapiImpaasSubconversationCreategroupconversationRequest extends BaseTaobaoRequest<OapiImpaasSubconversationCreategroupconversationResponse> {
	
	

	/** 
	* request
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateGroupSubConversationRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.subconversation.creategroupconversation";
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

	public Class<OapiImpaasSubconversationCreategroupconversationResponse> getResponseClass() {
		return OapiImpaasSubconversationCreategroupconversationResponse.class;
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
		private static final long serialVersionUID = 6319119675474763353L;
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
	 * request
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateGroupSubConversationRequest extends TaobaoObject {
		private static final long serialVersionUID = 3898381634842181662L;
		/**
		 * 成员列表
		 */
		@ApiListField("account_list")
		@ApiField("account_info")
		private List<AccountInfo> accountList;
		/**
		 * 入口会话id
		 */
		@ApiField("entrance_id")
		private String entranceId;
		/**
		 * 群名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 群主
		 */
		@ApiField("owner")
		private AccountInfo owner;
	
		public List<AccountInfo> getAccountList() {
			return this.accountList;
		}
		public void setAccountList(List<AccountInfo> accountList) {
			this.accountList = accountList;
		}
		public String getEntranceId() {
			return this.entranceId;
		}
		public void setEntranceId(String entranceId) {
			this.entranceId = entranceId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public AccountInfo getOwner() {
			return this.owner;
		}
		public void setOwner(AccountInfo owner) {
			this.owner = owner;
		}
	}
	

}