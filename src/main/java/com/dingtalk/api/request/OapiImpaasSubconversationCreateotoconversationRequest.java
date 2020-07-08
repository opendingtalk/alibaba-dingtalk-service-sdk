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
import com.dingtalk.api.response.OapiImpaasSubconversationCreateotoconversationResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.subconversation.createotoconversation request
 * 
 * @author top auto create
 * @since 1.0, 2018.12.18
 */
public class OapiImpaasSubconversationCreateotoconversationRequest extends BaseTaobaoRequest<OapiImpaasSubconversationCreateotoconversationResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateOtoSubConversationRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.subconversation.createotoconversation";
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

	public Class<OapiImpaasSubconversationCreateotoconversationResponse> getResponseClass() {
		return OapiImpaasSubconversationCreateotoconversationResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 账号列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 7381163716936487337L;
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
	public static class CreateOtoSubConversationRequest extends TaobaoObject {
		private static final long serialVersionUID = 5714927979971458169L;
		/**
		 * 账号列表
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
		 * 入口id列表
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
		 * 用于去重和日志
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