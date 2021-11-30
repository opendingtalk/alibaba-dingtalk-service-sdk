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

import com.dingtalk.api.response.OapiSmartworkHrmEmployeeQuerydimissionResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.querydimission request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.09
 */
public class OapiSmartworkHrmEmployeeQuerydimissionRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeQuerydimissionResponse> {
	
	

	/** 
	* 分页游标，从0开始。根据返回结果里的next_cursor是否为空来判断是否还有下一页，且再次调用时offset设置成next_cursor的值
	 */
	private Long offset;

	/** 
	* 分页大小，最大50
	 */
	private Long size;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.querydimission";
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
		txtParams.put("offset", this.offset);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeQuerydimissionResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeQuerydimissionResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkMinValue(offset, 0L, "offset");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 50L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
	}
	

}