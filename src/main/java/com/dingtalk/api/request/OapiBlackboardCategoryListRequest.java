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

import com.dingtalk.api.response.OapiBlackboardCategoryListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.category.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.29
 */
public class OapiBlackboardCategoryListRequest extends BaseTaobaoRequest<OapiBlackboardCategoryListResponse> {
	
	

	/** 
	* 操作人userId(必须是公告管理员)
	 */
	private String operationUserid;

	public void setOperationUserid(String operationUserid) {
		this.operationUserid = operationUserid;
	}

	public String getOperationUserid() {
		return this.operationUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.blackboard.category.list";
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
		txtParams.put("operation_userid", this.operationUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiBlackboardCategoryListResponse> getResponseClass() {
		return OapiBlackboardCategoryListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operationUserid, "operationUserid");
	}
	

}