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

import com.dingtalk.api.response.OapiCrmObjectdataContactQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.contact.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.27
 */
public class OapiCrmObjectdataContactQueryRequest extends BaseTaobaoRequest<OapiCrmObjectdataContactQueryResponse> {
	
	

	/** 
	* 用户ID
	 */
	private String currentOperatorUserid;

	/** 
	* 分页游标
	 */
	private String cursor;

	/** 
	* 分页大小
	 */
	private Long pageSize;

	/** 
	* 服务商组织 id，自建应用可以传入
	 */
	private String providerCorpid;

	/** 
	* 查询条件
	 */
	private String queryDsl;

	public void setCurrentOperatorUserid(String currentOperatorUserid) {
		this.currentOperatorUserid = currentOperatorUserid;
	}

	public String getCurrentOperatorUserid() {
		return this.currentOperatorUserid;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setProviderCorpid(String providerCorpid) {
		this.providerCorpid = providerCorpid;
	}

	public String getProviderCorpid() {
		return this.providerCorpid;
	}

	public void setQueryDsl(String queryDsl) {
		this.queryDsl = queryDsl;
	}

	public String getQueryDsl() {
		return this.queryDsl;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.objectdata.contact.query";
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
		txtParams.put("current_operator_userid", this.currentOperatorUserid);
		txtParams.put("cursor", this.cursor);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("provider_corpid", this.providerCorpid);
		txtParams.put("query_dsl", this.queryDsl);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmObjectdataContactQueryResponse> getResponseClass() {
		return OapiCrmObjectdataContactQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}