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

import com.dingtalk.api.response.OapiServiceaccountListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.serviceaccount.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.16
 */
public class OapiServiceaccountListRequest extends BaseTaobaoRequest<OapiServiceaccountListResponse> {
	
	

	/** 
	* 每页条数
	 */
	private Long pageSize;

	/** 
	* 页码，第几页，从1开始算
	 */
	private Long pageStart;

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getPageStart() {
		return this.pageStart;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.serviceaccount.list";
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
		txtParams.put("pageSize", this.pageSize);
		txtParams.put("pageStart", this.pageStart);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceaccountListResponse> getResponseClass() {
		return OapiServiceaccountListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
		RequestCheckUtils.checkMinValue(pageStart, 1L, "pageStart");
	}
	

}