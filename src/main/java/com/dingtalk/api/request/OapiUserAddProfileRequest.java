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
import com.dingtalk.api.response.OapiUserAddProfileResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.add.profile request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.11
 */
public class OapiUserAddProfileRequest extends BaseTaobaoRequest<OapiUserAddProfileResponse> {
	
	

	/** 
	* 添加的账号信息
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(AddProfileReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.add.profile";
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

	public Class<OapiUserAddProfileResponse> getResponseClass() {
		return OapiUserAddProfileResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 添加的账号信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddProfileReq extends TaobaoObject {
		private static final long serialVersionUID = 4874436296255464358L;
		/**
		 * 渠道
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 二方账号id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号nick
		 */
		@ApiField("nick")
		private String nick;
	
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
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
	}
	

}