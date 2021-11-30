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

import com.dingtalk.api.response.OapiExtcontactListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.extcontact.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.09
 */
public class OapiExtcontactListRequest extends BaseTaobaoRequest<OapiExtcontactListResponse> {
	
	

	/** 
	* 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量，偏移量从0开始。
	 */
	private Long offset;

	/** 
	* 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，最大100。
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
		return "dingtalk.oapi.extcontact.list";
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

	public Class<OapiExtcontactListResponse> getResponseClass() {
		return OapiExtcontactListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMinValue(offset, 0L, "offset");
		RequestCheckUtils.checkMaxValue(size, 100L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
	}
	

}