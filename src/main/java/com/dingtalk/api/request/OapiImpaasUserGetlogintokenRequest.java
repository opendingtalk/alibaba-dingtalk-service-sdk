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
import com.dingtalk.api.response.OapiImpaasUserGetlogintokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.getlogintoken request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiImpaasUserGetlogintokenRequest extends BaseTaobaoRequest<OapiImpaasUserGetlogintokenResponse> {
	
	

	/** 
	* 获取logintoken入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetLoginTokenReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.user.getlogintoken";
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

	public Class<OapiImpaasUserGetlogintokenResponse> getResponseClass() {
		return OapiImpaasUserGetlogintokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 获取logintoken入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetLoginTokenReq extends TaobaoObject {
		private static final long serialVersionUID = 7871485912922585598L;
		/**
		 * type为channelUser时有效。接入方channel信息，该值由接入方接入IMPaaS平台时，向IMPaaS平台申请，例如“hema”“eleme”等。
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * channelUserId
		 */
		@ApiField("id")
		private String id;
	
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
	}
	

}