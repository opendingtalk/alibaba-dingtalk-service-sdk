package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAppstoreInternalOrderConsumeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.internal.order.consume request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAppstoreInternalOrderConsumeRequest extends BaseTaobaoRequest<OapiAppstoreInternalOrderConsumeResponse> {
	
	

	/** 
	* 内购商品订单号
	 */
	private Long bizOrderId;

	/** 
	* 订购商品核销数量
	 */
	private Long quantity;

	/** 
	* 核销请求Id，由ISV生成，用于请求幂等
	 */
	private String requestId;

	/** 
	* 员工在当前企业内的唯一标识，也称staffId
	 */
	private String userid;

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.appstore.internal.order.consume";
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
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("quantity", this.quantity);
		txtParams.put("request_id", this.requestId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAppstoreInternalOrderConsumeResponse> getResponseClass() {
		return OapiAppstoreInternalOrderConsumeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizOrderId, "bizOrderId");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
		RequestCheckUtils.checkNotEmpty(requestId, "requestId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}