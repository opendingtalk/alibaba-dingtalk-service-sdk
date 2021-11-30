package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiAtsMessageCorpSystemaccountSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.message.corp.systemaccount.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.01
 */
public class OapiAtsMessageCorpSystemaccountSendRequest extends BaseTaobaoRequest<OapiAtsMessageCorpSystemaccountSendResponse> {
	
	

	/** 
	* 业务标识
	 */
	private String bizCode;

	/** 
	* 系统账号发送消息参数
	 */
	private String param;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(SystemAccountSendMessageParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.message.corp.systemaccount.send";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsMessageCorpSystemaccountSendResponse> getResponseClass() {
		return OapiAtsMessageCorpSystemaccountSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
	}
	
	/**
	 * 系统账号发送消息参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SystemAccountSendMessageParam extends TaobaoObject {
		private static final long serialVersionUID = 7744722219199664796L;
		/**
		 * 系统账号标识
		 */
		@ApiField("account_key")
		private String accountKey;
		/**
		 * 消息模版标识
		 */
		@ApiField("message_key")
		private String messageKey;
		/**
		 * 消息接收者userId列表
		 */
		@ApiListField("receiver_user_id_list")
		@ApiField("string")
		private List<String> receiverUserIdList;
		/**
		 * 消息模版填充值
		 */
		@ApiField("value_map")
		private String valueMap;
	
		public String getAccountKey() {
			return this.accountKey;
		}
		public void setAccountKey(String accountKey) {
			this.accountKey = accountKey;
		}
		public String getMessageKey() {
			return this.messageKey;
		}
		public void setMessageKey(String messageKey) {
			this.messageKey = messageKey;
		}
		public List<String> getReceiverUserIdList() {
			return this.receiverUserIdList;
		}
		public void setReceiverUserIdList(List<String> receiverUserIdList) {
			this.receiverUserIdList = receiverUserIdList;
		}
		public String getValueMap() {
			return this.valueMap;
		}
		public void setValueMap(String valueMap) {
			this.valueMap = valueMap;
		}
		public void setValueMapString(String valueMap) {
			this.valueMap = valueMap;
		}
		
	}
	

}