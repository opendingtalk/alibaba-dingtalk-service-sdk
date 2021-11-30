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
import com.dingtalk.api.response.OapiRetailUserBindapplyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.user.bindapply request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.09
 */
public class OapiRetailUserBindapplyRequest extends BaseTaobaoRequest<OapiRetailUserBindapplyResponse> {
	
	

	/** 
	* 业务身份
	 */
	private String channel;

	/** 
	* 请求业务对象
	 */
	private String request;

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(UserBindParam request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.retail.user.bindapply";
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
		txtParams.put("channel", this.channel);
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRetailUserBindapplyResponse> getResponseClass() {
		return OapiRetailUserBindapplyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求业务对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserBindParam extends TaobaoObject {
		private static final long serialVersionUID = 1819114767489376942L;
		/**
		 * 扩展字段
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 主帐号ID
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * 主帐号名称
		 */
		@ApiField("outer_nick")
		private String outerNick;
		/**
		 * 子帐号ID
		 */
		@ApiField("sub_outer_id")
		private String subOuterId;
		/**
		 * 子帐号名称
		 */
		@ApiField("sub_outer_nick")
		private String subOuterNick;
		/**
		 * token
		 */
		@ApiField("token")
		private String token;
	
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getOuterId() {
			return this.outerId;
		}
		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}
		public String getOuterNick() {
			return this.outerNick;
		}
		public void setOuterNick(String outerNick) {
			this.outerNick = outerNick;
		}
		public String getSubOuterId() {
			return this.subOuterId;
		}
		public void setSubOuterId(String subOuterId) {
			this.subOuterId = subOuterId;
		}
		public String getSubOuterNick() {
			return this.subOuterNick;
		}
		public void setSubOuterNick(String subOuterNick) {
			this.subOuterNick = subOuterNick;
		}
		public String getToken() {
			return this.token;
		}
		public void setToken(String token) {
			this.token = token;
		}
	}
	

}