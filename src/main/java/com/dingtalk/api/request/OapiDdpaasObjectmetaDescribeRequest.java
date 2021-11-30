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

import com.dingtalk.api.response.OapiDdpaasObjectmetaDescribeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ddpaas.objectmeta.describe request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.28
 */
public class OapiDdpaasObjectmetaDescribeRequest extends BaseTaobaoRequest<OapiDdpaasObjectmetaDescribeResponse> {
	
	

	/** 
	* PaaS应用ID
	 */
	private String appUuid;

	/** 
	* 表单编号
	 */
	private String formCode;

	public void setAppUuid(String appUuid) {
		this.appUuid = appUuid;
	}

	public String getAppUuid() {
		return this.appUuid;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getFormCode() {
		return this.formCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ddpaas.objectmeta.describe";
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
		txtParams.put("form_code", this.formCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDdpaasObjectmetaDescribeResponse> getResponseClass() {
		return OapiDdpaasObjectmetaDescribeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(appUuid, "appUuid");
		RequestCheckUtils.checkNotEmpty(formCode, "formCode");
	}
	

}