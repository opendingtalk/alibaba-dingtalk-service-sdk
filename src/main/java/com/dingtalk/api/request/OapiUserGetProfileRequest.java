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
import com.dingtalk.api.response.OapiUserGetProfileResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.get.profile request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.11
 */
public class OapiUserGetProfileRequest extends BaseTaobaoRequest<OapiUserGetProfileResponse> {
	
	

	/** 
	* 账号类型及账号id
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetProfileReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.get.profile";
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

	public Class<OapiUserGetProfileResponse> getResponseClass() {
		return OapiUserGetProfileResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 账号类型及账号id
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetProfileReq extends TaobaoObject {
		private static final long serialVersionUID = 6126154655586413718L;
		/**
		 * AccountType 0时有效
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * AccountType 对应的id
		 */
		@ApiField("id")
		private String id;
		/**
		 * AccountType, 0:channelUser 1:staff 2:member
		 */
		@ApiField("type")
		private Long type;
	
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
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	

}