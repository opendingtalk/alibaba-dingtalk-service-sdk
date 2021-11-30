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
import com.dingtalk.api.response.OapiImpaasOtoconversationCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.otoconversation.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasOtoconversationCreateRequest extends BaseTaobaoRequest<OapiImpaasOtoconversationCreateResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateO2OSubConversationRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.otoconversation.create";
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

	public Class<OapiImpaasOtoconversationCreateResponse> getResponseClass() {
		return OapiImpaasOtoconversationCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 账号列表，size=2。第一个表示自己，第二个表示对方
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 6396586758774471988L;
		/**
		 * channel名称
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * id
		 */
		@ApiField("id")
		private String id;
		/**
		 * id类型
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
	public static class CreateO2OSubConversationRequest extends TaobaoObject {
		private static final long serialVersionUID = 6224927831298928839L;
		/**
		 * 账号列表，size=2。第一个表示自己，第二个表示对方
		 */
		@ApiListField("account_info_list")
		@ApiField("account_info")
		private List<AccountInfo> accountInfoList;
		/**
		 * channel名称
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 入口id列表，size=2。普通会话填0，二级会话填entrnaceid
		 */
		@ApiListField("entrance_id_list")
		@ApiField("number")
		private List<Long> entranceIdList;
		/**
		 * 扩展信息
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 用于去重和追踪
		 */
		@ApiField("uuid")
		private String uuid;
	
		public List<AccountInfo> getAccountInfoList() {
			return this.accountInfoList;
		}
		public void setAccountInfoList(List<AccountInfo> accountInfoList) {
			this.accountInfoList = accountInfoList;
		}
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public List<Long> getEntranceIdList() {
			return this.entranceIdList;
		}
		public void setEntranceIdList(List<Long> entranceIdList) {
			this.entranceIdList = entranceIdList;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	

}