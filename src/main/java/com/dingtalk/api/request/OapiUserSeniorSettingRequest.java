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

import com.dingtalk.api.response.OapiUserSeniorSettingResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.senior.setting request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.07
 */
public class OapiUserSeniorSettingRequest extends BaseTaobaoRequest<OapiUserSeniorSettingResponse> {
	
	

	/** 
	* 高管模式是否开启
	 */
	private Boolean open;

	/** 
	* 高管联系人白名单
	 */
	private String permitStaffIds;

	/** 
	* 高管保护开关，例如DING_SMS，保护高管不受短信DING打扰
	 */
	private String protectScenes;

	/** 
	* 高管工号
	 */
	private String seniorStaffId;

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Boolean getOpen() {
		return this.open;
	}

	public void setPermitStaffIds(String permitStaffIds) {
		this.permitStaffIds = permitStaffIds;
	}

	public String getPermitStaffIds() {
		return this.permitStaffIds;
	}

	public void setProtectScenes(String protectScenes) {
		this.protectScenes = protectScenes;
	}

	public String getProtectScenes() {
		return this.protectScenes;
	}

	public void setSeniorStaffId(String seniorStaffId) {
		this.seniorStaffId = seniorStaffId;
	}

	public String getSeniorStaffId() {
		return this.seniorStaffId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.senior.setting";
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
		txtParams.put("open", this.open);
		txtParams.put("permit_staffIds", this.permitStaffIds);
		txtParams.put("protect_scenes", this.protectScenes);
		txtParams.put("senior_staffId", this.seniorStaffId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserSeniorSettingResponse> getResponseClass() {
		return OapiUserSeniorSettingResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(permitStaffIds, 999, "permitStaffIds");
		RequestCheckUtils.checkMaxListSize(protectScenes, 999, "protectScenes");
	}
	

}