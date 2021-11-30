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

import com.dingtalk.api.response.OapiSmartworkHrmMasterCheckResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.master.check request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.17
 */
public class OapiSmartworkHrmMasterCheckRequest extends BaseTaobaoRequest<OapiSmartworkHrmMasterCheckResponse> {
	
	

	/** 
	* 业务UK唯一确定一条流水
	 */
	private String bizUk;

	/** 
	* 业务方id(由系统统一分配)
	 */
	private Long tenantid;

	public void setBizUk(String bizUk) {
		this.bizUk = bizUk;
	}

	public String getBizUk() {
		return this.bizUk;
	}

	public void setTenantid(Long tenantid) {
		this.tenantid = tenantid;
	}

	public Long getTenantid() {
		return this.tenantid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.master.check";
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
		txtParams.put("biz_uk", this.bizUk);
		txtParams.put("tenantid", this.tenantid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmMasterCheckResponse> getResponseClass() {
		return OapiSmartworkHrmMasterCheckResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizUk, "bizUk");
		RequestCheckUtils.checkMaxListSize(bizUk, 20, "bizUk");
		RequestCheckUtils.checkNotEmpty(tenantid, "tenantid");
	}
	

}