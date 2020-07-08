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

import com.dingtalk.api.response.OapiCateringCoopDealBetaResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.coop.deal.beta request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.22
 */
public class OapiCateringCoopDealBetaRequest extends BaseTaobaoRequest<OapiCateringCoopDealBetaResponse> {
	
	

	/** 
	* 2同意申请，3拒绝申请，7已合作时解除合作
	 */
	private Long coopStatus;

	/** 
	* 申请企业的corpId
	 */
	private String corpEndCorpId;

	/** 
	* 商铺id
	 */
	private String shopId;

	public void setCoopStatus(Long coopStatus) {
		this.coopStatus = coopStatus;
	}

	public Long getCoopStatus() {
		return this.coopStatus;
	}

	public void setCorpEndCorpId(String corpEndCorpId) {
		this.corpEndCorpId = corpEndCorpId;
	}

	public String getCorpEndCorpId() {
		return this.corpEndCorpId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopId() {
		return this.shopId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.catering.coop.deal.beta";
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
		txtParams.put("coop_status", this.coopStatus);
		txtParams.put("corp_end_corp_id", this.corpEndCorpId);
		txtParams.put("shop_id", this.shopId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringCoopDealBetaResponse> getResponseClass() {
		return OapiCateringCoopDealBetaResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(coopStatus, "coopStatus");
		RequestCheckUtils.checkNotEmpty(corpEndCorpId, "corpEndCorpId");
		RequestCheckUtils.checkNotEmpty(shopId, "shopId");
	}
	

}