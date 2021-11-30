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
import com.dingtalk.api.response.OapiImpaasUserSubaccountDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.subaccount.delete request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiImpaasUserSubaccountDeleteRequest extends BaseTaobaoRequest<OapiImpaasUserSubaccountDeleteResponse> {
	
	

	/** 
	* 删除子账号入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(DelSubAccountReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.user.subaccount.delete";
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

	public Class<OapiImpaasUserSubaccountDeleteResponse> getResponseClass() {
		return OapiImpaasUserSubaccountDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 删除子账号入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DelSubAccountReq extends TaobaoObject {
		private static final long serialVersionUID = 5831584888571646326L;
		/**
		 * 主账号id
		 */
		@ApiField("adminaccount_id")
		private String adminaccountId;
		/**
		 * 业务方channel
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 子账号id
		 */
		@ApiField("subaccount_id")
		private String subaccountId;
	
		public String getAdminaccountId() {
			return this.adminaccountId;
		}
		public void setAdminaccountId(String adminaccountId) {
			this.adminaccountId = adminaccountId;
		}
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getSubaccountId() {
			return this.subaccountId;
		}
		public void setSubaccountId(String subaccountId) {
			this.subaccountId = subaccountId;
		}
	}
	

}