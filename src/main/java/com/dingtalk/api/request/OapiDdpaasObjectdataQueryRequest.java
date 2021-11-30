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

import com.dingtalk.api.response.OapiDdpaasObjectdataQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ddpaas.objectdata.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.28
 */
public class OapiDdpaasObjectdataQueryRequest extends BaseTaobaoRequest<OapiDdpaasObjectdataQueryResponse> {
	
	

	/** 
	* 钉钉PaaS 应用 ID
	 */
	private String appUuid;

	/** 
	* 用户ID
	 */
	private String currentOperatorUserid;

	/** 
	* 查询游标
	 */
	private String cursor;

	/** 
	* 钉钉 PaaS 表单编号
	 */
	private String formCode;

	/** 
	* 查询条件DSL
	 */
	private String queryDsl;

	/** 
	* 分页限制
	 */
	private Long size;

	public void setAppUuid(String appUuid) {
		this.appUuid = appUuid;
	}

	public String getAppUuid() {
		return this.appUuid;
	}

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

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getFormCode() {
		return this.formCode;
	}

	public void setQueryDsl(String queryDsl) {
		this.queryDsl = queryDsl;
	}

	public String getQueryDsl() {
		return this.queryDsl;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ddpaas.objectdata.query";
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
		txtParams.put("app_uuid", this.appUuid);
		txtParams.put("current_operator_userid", this.currentOperatorUserid);
		txtParams.put("cursor", this.cursor);
		txtParams.put("form_code", this.formCode);
		txtParams.put("query_dsl", this.queryDsl);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDdpaasObjectdataQueryResponse> getResponseClass() {
		return OapiDdpaasObjectdataQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appUuid, "appUuid");
		RequestCheckUtils.checkNotEmpty(formCode, "formCode");
	}
	

}