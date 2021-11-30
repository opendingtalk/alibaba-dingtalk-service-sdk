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

import com.dingtalk.api.response.OapiDingpayOrderApplypayResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.order.applypay request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.12
 */
public class OapiDingpayOrderApplypayRequest extends BaseTaobaoRequest<OapiDingpayOrderApplypayResponse> {
	
	

	/** 
	* 发起支付操作员userId
	 */
	private String applyPayOperatorUserid;

	/** 
	* 扩展属性
	 */
	private String extension;

	/** 
	* 订单号
	 */
	private String orderNos;

	/** 
	* 支付渠道
	 */
	private String payChannel;

	/** 
	* 支付渠道方付款者真实出资UID
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

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPayChannel() {
		return this.payChannel;
	}

	public void setPayChannelPayerRealUid(String payChannelPayerRealUid) {
		this.payChannelPayerRealUid = payChannelPayerRealUid;
	}

	public String getPayChannelPayerRealUid() {
		return this.payChannelPayerRealUid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.order.applypay";
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
		txtParams.put("pay_channel", this.payChannel);
		txtParams.put("pay_channel_payer_real_uid", this.payChannelPayerRealUid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayOrderApplypayResponse> getResponseClass() {
		return OapiDingpayOrderApplypayResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(applyPayOperatorUserid, "applyPayOperatorUserid");
		RequestCheckUtils.checkNotEmpty(orderNos, "orderNos");
		RequestCheckUtils.checkMaxListSize(orderNos, 20, "orderNos");
		RequestCheckUtils.checkNotEmpty(payChannel, "payChannel");
	}
	

}