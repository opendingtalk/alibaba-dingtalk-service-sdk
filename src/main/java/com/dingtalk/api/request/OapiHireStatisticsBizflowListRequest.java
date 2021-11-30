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

import com.dingtalk.api.response.OapiHireStatisticsBizflowListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.statistics.bizflow.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.21
 */
public class OapiHireStatisticsBizflowListRequest extends BaseTaobaoRequest<OapiHireStatisticsBizflowListResponse> {
	
	

	/** 
	* 分页游标位置，不传默认第一页
	 */
	private String cursor;

	/** 
	* 分页大小，最大200
	 */
	private Long size;

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.hire.statistics.bizflow.list";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHireStatisticsBizflowListResponse> getResponseClass() {
		return OapiHireStatisticsBizflowListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 200L, "size");
	}
	

}