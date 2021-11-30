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

import com.dingtalk.api.response.OapiCallCalluserResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.call.calluser request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiCallCalluserRequest extends BaseTaobaoRequest<OapiCallCalluserResponse> {
	
	

	/** 
	* 授权isv套件企业的corpid
	 */
	private String authedCorpId;

	/** 
	* 授权isv套件企业的员工userid
	 */
	private String authedStaffId;

	/** 
	* isv套件所属企业下的员工userid
	 */
	private String staffId;

	public void setAuthedCorpId(String authedCorpId) {
		this.authedCorpId = authedCorpId;
	}

	public String getAuthedCorpId() {
		return this.authedCorpId;
	}

	public void setAuthedStaffId(String authedStaffId) {
		this.authedStaffId = authedStaffId;
	}

	public String getAuthedStaffId() {
		return this.authedStaffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.call.calluser";
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
		txtParams.put("authed_corp_id", this.authedCorpId);
		txtParams.put("authed_staff_id", this.authedStaffId);
		txtParams.put("staff_id", this.staffId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCallCalluserResponse> getResponseClass() {
		return OapiCallCalluserResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(authedCorpId, "authedCorpId");
		RequestCheckUtils.checkNotEmpty(authedStaffId, "authedStaffId");
		RequestCheckUtils.checkNotEmpty(staffId, "staffId");
	}
	

}