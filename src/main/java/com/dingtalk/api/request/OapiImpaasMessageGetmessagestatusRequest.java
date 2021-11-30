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
import com.dingtalk.api.response.OapiImpaasMessageGetmessagestatusResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.message.getmessagestatus request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasMessageGetmessagestatusRequest extends BaseTaobaoRequest<OapiImpaasMessageGetmessagestatusResponse> {
	
	

	/** 
	* 根据异步发送时返回的taskid获取消息
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetMessageStatusRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.message.getmessagestatus";
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

	public Class<OapiImpaasMessageGetmessagestatusResponse> getResponseClass() {
		return OapiImpaasMessageGetmessagestatusResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 账号信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 3612489681317755669L;
		/**
		 * 账号的通道
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 账号ID
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号的类型
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
	 * 根据异步发送时返回的taskid获取消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetMessageStatusRequest extends TaobaoObject {
		private static final long serialVersionUID = 8789357695973163851L;
		/**
		 * 账号信息
		 */
		@ApiField("senderid")
		private AccountInfo senderid;
		/**
		 * 异步返回的任务ID
		 */
		@ApiField("taskid")
		private Long taskid;
	
		public AccountInfo getSenderid() {
			return this.senderid;
		}
		public void setSenderid(AccountInfo senderid) {
			this.senderid = senderid;
		}
		public Long getTaskid() {
			return this.taskid;
		}
		public void setTaskid(Long taskid) {
			this.taskid = taskid;
		}
	}
	

}