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

import com.dingtalk.api.response.OapiCateringCoopcontactGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.coopcontact.get request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.13
 */
public class OapiCateringCoopcontactGetRequest extends BaseTaobaoRequest<OapiCateringCoopcontactGetResponse> {
	
	

	/** 
	* 呼叫方的userId
	 */
	private String callerUserid;

	/** 
	* 合作企业的corpId
	 */
	private String corpEndCorpId;

	/** 
	* 店铺id
	 */
	private String shopId;

	public void setCallerUserid(String callerUserid) {
		this.callerUserid = callerUserid;
	}

	public String getCallerUserid() {
		return this.callerUserid;
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
		return "dingtalk.oapi.catering.coopcontact.get";
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
		txtParams.put("caller_userid", this.callerUserid);
		txtParams.put("corp_end_corp_id", this.corpEndCorpId);
		txtParams.put("shop_id", this.shopId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCateringCoopcontactGetResponse> getResponseClass() {
		return OapiCateringCoopcontactGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(callerUserid, "callerUserid");
		RequestCheckUtils.checkNotEmpty(corpEndCorpId, "corpEndCorpId");
		RequestCheckUtils.checkNotEmpty(shopId, "shopId");
	}
	

}