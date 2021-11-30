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

import com.dingtalk.api.response.OapiAppstoreInternalSkupageGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.internal.skupage.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAppstoreInternalSkupageGetRequest extends BaseTaobaoRequest<OapiAppstoreInternalSkupageGetResponse> {
	
	

	/** 
	* 回调页面(进行URLEncode处理)，微应用为页面URL，E应用为页面路径地址
	 */
	private String callbackPage;

	/** 
	* 与callbackPage配合使用。当用户从SKU页面下单并支付成功后，会跳转回ISV页面，此时将此参数原样回传。主要用于用户页面引导等操作，不能作为权益开通凭证。
	 */
	private String extendParam;

	/** 
	* 内购商品码
	 */
	private String goodsCode;

	/** 
	* 内购商品规格码，如果设置了规格码，页面会默认选中该规格码
	 */
	private String itemCode;

	public void setCallbackPage(String callbackPage) {
		this.callbackPage = callbackPage;
	}

	public String getCallbackPage() {
		return this.callbackPage;
	}

	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getExtendParam() {
		return this.extendParam;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.appstore.internal.skupage.get";
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
		txtParams.put("callback_page", this.callbackPage);
		txtParams.put("extend_param", this.extendParam);
		txtParams.put("goods_code", this.goodsCode);
		txtParams.put("item_code", this.itemCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAppstoreInternalSkupageGetResponse> getResponseClass() {
		return OapiAppstoreInternalSkupageGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(goodsCode, "goodsCode");
	}
	

}