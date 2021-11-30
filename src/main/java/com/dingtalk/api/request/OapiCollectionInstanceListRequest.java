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

import com.dingtalk.api.response.OapiCollectionInstanceListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.instance.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.16
 */
public class OapiCollectionInstanceListRequest extends BaseTaobaoRequest<OapiCollectionInstanceListResponse> {
	
	

	/** 
	* 时间，必须是YYYY-MM-DD的格式
	 */
	private String actionDate;

	/** 
	* 填表类型
	 */
	private Long bizType;

	/** 
	* 填表code
	 */
	private String formCode;

	/** 
	* 分页起始
	 */
	private Long offset;

	/** 
	* 分页大小，最大100
	 */
	private Long size;

	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}

	public String getActionDate() {
		return this.actionDate;
	}

	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getBizType() {
		return this.bizType;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getFormCode() {
		return this.formCode;
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
		return "dingtalk.oapi.collection.instance.list";
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
		txtParams.put("action_date", this.actionDate);
		txtParams.put("biz_type", this.bizType);
		txtParams.put("form_code", this.formCode);
		txtParams.put("offset", this.offset);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCollectionInstanceListResponse> getResponseClass() {
		return OapiCollectionInstanceListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(formCode, "formCode");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(size, "size");
	}
	

}