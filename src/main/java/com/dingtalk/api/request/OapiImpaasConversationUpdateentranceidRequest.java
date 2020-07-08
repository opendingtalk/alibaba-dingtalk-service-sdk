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
import com.dingtalk.api.response.OapiImpaasConversationUpdateentranceidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.updateentranceid request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasConversationUpdateentranceidRequest extends BaseTaobaoRequest<OapiImpaasConversationUpdateentranceidResponse> {
	
	

	/** 
	* 参数结构体
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(UpdateEntranceIdRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.conversation.updateentranceid";
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

	public Class<OapiImpaasConversationUpdateentranceidResponse> getResponseClass() {
		return OapiImpaasConversationUpdateentranceidResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 要设置的用户列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 7372736253665676778L;
		/**
		 * 账号通道:eleme,hema等
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 账号ID
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号类型:channelUserstaff。当类型为channelUser时，填写app自己的账号，当类型为staff时，填写钉钉的staffid
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
	 * 参数结构体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateEntranceIdRequest extends TaobaoObject {
		private static final long serialVersionUID = 8317821972933829264L;
		/**
		 * 要设置的用户列表
		 */
		@ApiListField("accounts")
		@ApiField("account_info")
		private List<AccountInfo> accounts;
		/**
		 * 业务channel
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 会话id
		 */
		@ApiField("cid")
		private String cid;
		/**
		 * 入口id，数字
		 */
		@ApiField("entrance_id")
		private Long entranceId;
		/**
		 * 扩展信息，可选
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 该请求的唯一id，用于去重、打日志
		 */
		@ApiField("uuid")
		private String uuid;
	
		public List<AccountInfo> getAccounts() {
			return this.accounts;
		}
		public void setAccounts(List<AccountInfo> accounts) {
			this.accounts = accounts;
		}
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public Long getEntranceId() {
			return this.entranceId;
		}
		public void setEntranceId(Long entranceId) {
			this.entranceId = entranceId;
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