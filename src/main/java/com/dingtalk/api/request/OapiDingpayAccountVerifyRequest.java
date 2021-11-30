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
import com.dingtalk.api.response.OapiDingpayAccountVerifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.account.verify request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.06
 */
public class OapiDingpayAccountVerifyRequest extends BaseTaobaoRequest<OapiDingpayAccountVerifyResponse> {
	
	

	/** 
	* 账户校验参数
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(AccountValidateOpenRequest param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.account.verify";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayAccountVerifyResponse> getResponseClass() {
		return OapiDingpayAccountVerifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 账户校验参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountValidateOpenRequest extends TaobaoObject {
		private static final long serialVersionUID = 3222533885636699265L;
		/**
		 * 账户信息，json字符串
		 */
		@ApiField("accountInfo")
		private String accountInfo;
		/**
		 * 账户类型（DA：钉钉账户、AA：支付宝账户、BC：银行卡）
		 */
		@ApiField("accountType")
		private String accountType;
	
		public String getAccountInfo() {
			return this.accountInfo;
		}
		public void setAccountInfo(String accountInfo) {
			this.accountInfo = accountInfo;
		}
		public String getAccountType() {
			return this.accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
	}
	

}