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
import com.dingtalk.api.response.OapiImpaasMessageGetmessageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.message.getmessage request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.03
 */
public class OapiImpaasMessageGetmessageRequest extends BaseTaobaoRequest<OapiImpaasMessageGetmessageResponse> {
	
	

	/** 
	* 请求信息
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetMessageRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.message.getmessage";
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

	public Class<OapiImpaasMessageGetmessageResponse> getResponseClass() {
		return OapiImpaasMessageGetmessageResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 单聊消息时使用，暂时不支持，可以不填
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 1153165199922255932L;
		/**
		 * 业务对应的通道信息
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 根据type类型确定
		 */
		@ApiField("id")
		private String id;
		/**
		 * staff:表示使用钉钉的员工账号，channelUser：表示业务自己的账号
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
	 * 请求信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetMessageRequest extends TaobaoObject {
		private static final long serialVersionUID = 5751883286939438596L;
		/**
		 * 从什么时候开始查，utc时间，单位毫秒
		 */
		@ApiField("beg_time")
		private Long begTime;
		/**
		 * 群id
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 获取的消息数量，总的数量小于需要获取的数量时，返回实际的消息数量.1-20之间
		 */
		@ApiField("limit_num")
		private Long limitNum;
		/**
		 * 单聊消息时使用，暂时不支持，可以不填
		 */
		@ApiField("receiver_id")
		private AccountInfo receiverId;
		/**
		 * 单聊消息时使用，暂时不支持，可以不填
		 */
		@ApiField("sender_id")
		private AccountInfo senderId;
	
		public Long getBegTime() {
			return this.begTime;
		}
		public void setBegTime(Long begTime) {
			this.begTime = begTime;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public Long getLimitNum() {
			return this.limitNum;
		}
		public void setLimitNum(Long limitNum) {
			this.limitNum = limitNum;
		}
		public AccountInfo getReceiverId() {
			return this.receiverId;
		}
		public void setReceiverId(AccountInfo receiverId) {
			this.receiverId = receiverId;
		}
		public AccountInfo getSenderId() {
			return this.senderId;
		}
		public void setSenderId(AccountInfo senderId) {
			this.senderId = senderId;
		}
	}
	

}