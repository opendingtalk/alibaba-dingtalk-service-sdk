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

import com.dingtalk.api.response.OapiAppstoreInternalUnfinishedorderListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.internal.unfinishedorder.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiAppstoreInternalUnfinishedorderListRequest extends BaseTaobaoRequest<OapiAppstoreInternalUnfinishedorderListResponse> {
	
	

	/** 
	* 商品规格码
	 */
	private String itemCode;

	/** 
	* 分页查询页码，其实页码为1
	 */
	private Long page;

	/** 
	* 分页查询每页大小，最大限制100
	 */
	private Long pageSize;

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.appstore.internal.unfinishedorder.list";
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
		txtParams.put("item_code", this.itemCode);
		txtParams.put("page", this.page);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAppstoreInternalUnfinishedorderListResponse> getResponseClass() {
		return OapiAppstoreInternalUnfinishedorderListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(page, "page");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}