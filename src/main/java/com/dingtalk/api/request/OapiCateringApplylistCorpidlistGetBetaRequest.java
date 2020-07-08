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

import com.dingtalk.api.response.OapiCateringApplylistCorpidlistGetBetaResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.applylist.corpidlist.get.beta request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.24
 */
public class OapiCateringApplylistCorpidlistGetBetaRequest extends BaseTaobaoRequest<OapiCateringApplylistCorpidlistGetBetaResponse> {
	
	

	/** 
	* 店铺id列表
	 */
	private String shopIdList;

	public void setShopIdList(String shopIdList) {
		this.shopIdList = shopIdList;
	}

	public String getShopIdList() {
		return this.shopIdList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.catering.applylist.corpidlist.get.beta";
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
		txtParams.put("shop_id_list", this.shopIdList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringApplylistCorpidlistGetBetaResponse> getResponseClass() {
		return OapiCateringApplylistCorpidlistGetBetaResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(shopIdList, "shopIdList");
		RequestCheckUtils.checkMaxListSize(shopIdList, 20, "shopIdList");
	}
	

}