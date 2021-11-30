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

import com.dingtalk.api.response.OapiDingpayBillQuerytagResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.bill.querytag request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiDingpayBillQuerytagRequest extends BaseTaobaoRequest<OapiDingpayBillQuerytagResponse> {
	
	

	/** 
	* 业务代码
	 */
	private String bizCode;

	/** 
	* 查询最近几天的标签
	 */
	private Long dayRange;

	/** 
	* 标签来源应用ID
	 */
	private String sourceAppId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setDayRange(Long dayRange) {
		this.dayRange = dayRange;
	}

	public Long getDayRange() {
		return this.dayRange;
	}

	public void setSourceAppId(String sourceAppId) {
		this.sourceAppId = sourceAppId;
	}

	public String getSourceAppId() {
		return this.sourceAppId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.bill.querytag";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("day_range", this.dayRange);
		txtParams.put("source_app_id", this.sourceAppId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayBillQuerytagResponse> getResponseClass() {
		return OapiDingpayBillQuerytagResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(dayRange, "dayRange");
		RequestCheckUtils.checkNotEmpty(sourceAppId, "sourceAppId");
	}
	

}