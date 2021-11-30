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

import com.dingtalk.api.response.OapiCollectionFormListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.form.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.16
 */
public class OapiCollectionFormListRequest extends BaseTaobaoRequest<OapiCollectionFormListResponse> {
	
	

	/** 
	* 填表类型。0表示通用填表，1表示教育版填表
	 */
	private Long bizType;

	/** 
	* 填表创建人userid
	 */
	private String creator;

	/** 
	* 分页游标，从0开始。后续取返回结果中next_cursor的值
	 */
	private Long offset;

	/** 
	* 分页大小，最大200
	 */
	private Long size;

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getBizType() {
		return this.bizType;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreator() {
		return this.creator;
	}

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
		return "dingtalk.oapi.collection.form.list";
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
		txtParams.put("biz_type", this.bizType);
		txtParams.put("creator", this.creator);
		txtParams.put("offset", this.offset);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCollectionFormListResponse> getResponseClass() {
		return OapiCollectionFormListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}