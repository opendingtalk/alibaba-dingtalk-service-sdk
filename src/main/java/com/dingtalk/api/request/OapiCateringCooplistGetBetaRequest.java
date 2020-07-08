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

import com.dingtalk.api.response.OapiCateringCooplistGetBetaResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.cooplist.get.beta request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.23
 */
public class OapiCateringCooplistGetBetaRequest extends BaseTaobaoRequest<OapiCateringCooplistGetBetaResponse> {
	
	

	/** 
	* 合作状态：1-申请合作 2-已合作
	 */
	private Long coopStatus;

	/** 
	* 数据起始index
	 */
	private Long offSet;

	/** 
	* pageSize
	 */
	private Long pgSize;

	/** 
	* 店铺id
	 */
	private String shopId;

	public void setCoopStatus(Long coopStatus) {
		this.coopStatus = coopStatus;
	}

	public Long getCoopStatus() {
		return this.coopStatus;
	}

	public void setOffSet(Long offSet) {
		this.offSet = offSet;
	}

	public Long getOffSet() {
		return this.offSet;
	}

	public void setPgSize(Long pgSize) {
		this.pgSize = pgSize;
	}

	public Long getPgSize() {
		return this.pgSize;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopId() {
		return this.shopId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.catering.cooplist.get.beta";
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
		txtParams.put("off_set", this.offSet);
		txtParams.put("pg_size", this.pgSize);
		txtParams.put("shop_id", this.shopId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringCooplistGetBetaResponse> getResponseClass() {
		return OapiCateringCooplistGetBetaResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(coopStatus, "coopStatus");
		RequestCheckUtils.checkNotEmpty(offSet, "offSet");
		RequestCheckUtils.checkNotEmpty(pgSize, "pgSize");
		RequestCheckUtils.checkNotEmpty(shopId, "shopId");
	}
	

}