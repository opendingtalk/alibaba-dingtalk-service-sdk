package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserBatchdeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.batchdelete request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiUserBatchdeleteRequest extends BaseTaobaoRequest<OapiUserBatchdeleteResponse> {
	
	

	/** 
	* 员工UserID列表。列表长度在1到20之间
	 */
	private List<String> useridlist;

	public void setUseridlist(List<String> useridlist) {
		this.useridlist = useridlist;
	}

	public List<String> getUseridlist() {
		return this.useridlist;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.batchdelete";
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
		txtParams.put("useridlist", TaobaoUtils.objectToJson(this.useridlist));
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserBatchdeleteResponse> getResponseClass() {
		return OapiUserBatchdeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}