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

import com.dingtalk.api.response.OapiCallbackFailrecordConfirmResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.callback.failrecord.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiCallbackFailrecordConfirmRequest extends BaseTaobaoRequest<OapiCallbackFailrecordConfirmResponse> {
	
	

	/** 
	* 失败记录id列表
	 */
	private String idList;

	public void setIdList(String idList) {
		this.idList = idList;
	}

	public String getIdList() {
		return this.idList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.callback.failrecord.confirm";
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
		txtParams.put("id_list", this.idList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCallbackFailrecordConfirmResponse> getResponseClass() {
		return OapiCallbackFailrecordConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(idList, "idList");
		RequestCheckUtils.checkMaxListSize(idList, 100, "idList");
	}
	

}