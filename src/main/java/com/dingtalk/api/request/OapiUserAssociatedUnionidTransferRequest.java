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

import com.dingtalk.api.response.OapiUserAssociatedUnionidTransferResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.associated_unionid.transfer request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.14
 */
public class OapiUserAssociatedUnionidTransferRequest extends BaseTaobaoRequest<OapiUserAssociatedUnionidTransferResponse> {
	
	

	/** 
	* 用户统一ID
	 */
	private String associatedUnionid;

	public void setAssociatedUnionid(String associatedUnionid) {
		this.associatedUnionid = associatedUnionid;
	}

	public String getAssociatedUnionid() {
		return this.associatedUnionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.associated_unionid.transfer";
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
		txtParams.put("associated_unionid", this.associatedUnionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserAssociatedUnionidTransferResponse> getResponseClass() {
		return OapiUserAssociatedUnionidTransferResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(associatedUnionid, "associatedUnionid");
	}
	

}