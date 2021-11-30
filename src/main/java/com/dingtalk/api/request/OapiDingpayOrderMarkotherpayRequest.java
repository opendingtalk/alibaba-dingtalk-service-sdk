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

import com.dingtalk.api.response.OapiDingpayOrderMarkotherpayResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.order.markotherpay request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiDingpayOrderMarkotherpayRequest extends BaseTaobaoRequest<OapiDingpayOrderMarkotherpayResponse> {
	
	

	/** 
	* 标记支付的操作员userId
	 */
	private String applyPayOperatorUserid;

	/** 
	* 扩展属性
	 */
	private String extension;

	/** 
	* 钉支付订单号
	 */
	private String orderNos;

	/** 
	* 真实支付宝UID
	 */
	private String payChannelPayerRealUid;

	public void setApplyPayOperatorUserid(String applyPayOperatorUserid) {
		this.applyPayOperatorUserid = applyPayOperatorUserid;
	}

	public String getApplyPayOperatorUserid() {
		return this.applyPayOperatorUserid;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setExtensionString(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setOrderNos(String orderNos) {
		this.orderNos = orderNos;
	}

	public String getOrderNos() {
		return this.orderNos;
	}

	public void setPayChannelPayerRealUid(String payChannelPayerRealUid) {
		this.payChannelPayerRealUid = payChannelPayerRealUid;
	}

	public String getPayChannelPayerRealUid() {
		return this.payChannelPayerRealUid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.order.markotherpay";
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
		txtParams.put("apply_pay_operator_userid", this.applyPayOperatorUserid);
		txtParams.put("extension", this.extension);
		txtParams.put("order_nos", this.orderNos);
		txtParams.put("pay_channel_payer_real_uid", this.payChannelPayerRealUid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayOrderMarkotherpayResponse> getResponseClass() {
		return OapiDingpayOrderMarkotherpayResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(orderNos, 20, "orderNos");
	}
	

}