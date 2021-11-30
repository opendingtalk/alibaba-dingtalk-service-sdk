package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingpayOrderTerminateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.order.terminate request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiDingpayOrderTerminateRequest extends BaseTaobaoRequest<OapiDingpayOrderTerminateResponse> {
	
	

	/** 
	* 扩展信息
	 */
	private String extension;

	/** 
	* 操作者员工号
	 */
	private String operator;

	/** 
	* dingpay单号列表
	 */
	private String orderNos;

	/** 
	* 中止原因
	 */
	private String reason;

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setExtensionString(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOrderNos(String orderNos) {
		this.orderNos = orderNos;
	}

	public String getOrderNos() {
		return this.orderNos;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return this.reason;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.order.terminate";
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
		txtParams.put("extension", this.extension);
		txtParams.put("operator", this.operator);
		txtParams.put("order_nos", this.orderNos);
		txtParams.put("reason", this.reason);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayOrderTerminateResponse> getResponseClass() {
		return OapiDingpayOrderTerminateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(orderNos, "orderNos");
		RequestCheckUtils.checkMaxListSize(orderNos, 20, "orderNos");
		RequestCheckUtils.checkNotEmpty(reason, "reason");
	}
	

}