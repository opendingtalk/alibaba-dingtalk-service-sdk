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
import com.dingtalk.api.response.OapiImpaasUserGetprofileResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.getprofile request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiImpaasUserGetprofileRequest extends BaseTaobaoRequest<OapiImpaasUserGetprofileResponse> {
	
	

	/** 
	* 获取用户属性入参
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
		return "dingtalk.oapi.impaas.user.getprofile";
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

	public Class<OapiImpaasUserGetprofileResponse> getResponseClass() {
		return OapiImpaasUserGetprofileResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 用户信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 5176333868871339198L;
		/**
		 * type为channelUser时有效。接入方channel信息，该值由接入方接入IMPaaS平台时，向IMPaaS平台申请，例如“hema”“eleme”等。
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 待操作成员id，ID类型由type字段确定。当type为“staff”时，本字段填写staffid，当type为“channelUser”时，本字段填写channelUserId。
		 */
		@ApiField("id")
		private String id;
		/**
		 * 代操作成员ID类型，目前支持“staff” “channelUser”两种类型
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
	 * 获取用户属性入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetProfileReq extends TaobaoObject {
		private static final long serialVersionUID = 1548523936218133421L;
		/**
		 * 用户信息
		 */
		@ApiField("accountInfo")
		private AccountInfo accountInfo;
	
		public AccountInfo getAccountInfo() {
			return this.accountInfo;
		}
		public void setAccountInfo(AccountInfo accountInfo) {
			this.accountInfo = accountInfo;
		}
	}
	

}