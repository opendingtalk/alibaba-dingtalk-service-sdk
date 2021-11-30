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

import com.dingtalk.api.response.OapiCspaceFilePresignedurlGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.file.presignedurl.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.18
 */
public class OapiCspaceFilePresignedurlGetRequest extends BaseTaobaoRequest<OapiCspaceFilePresignedurlGetResponse> {
	
	

	/** 
	* 钉盘文件ID
	 */
	private String dentryid;

	/** 
	* 签名URL的有效期，不传的话为默认值15分钟
	 */
	private Long expireSeconds;

	/** 
	* 是否为内部调用，统一传false
	 */
	private Boolean innerInvoke;

	/** 
	* 钉盘空间ID
	 */
	private Long spaceid;

	public void setDentryid(String dentryid) {
		this.dentryid = dentryid;
	}

	public String getDentryid() {
		return this.dentryid;
	}

	public void setExpireSeconds(Long expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	public Long getExpireSeconds() {
		return this.expireSeconds;
	}

	public void setInnerInvoke(Boolean innerInvoke) {
		this.innerInvoke = innerInvoke;
	}

	public Boolean getInnerInvoke() {
		return this.innerInvoke;
	}

	public void setSpaceid(Long spaceid) {
		this.spaceid = spaceid;
	}

	public Long getSpaceid() {
		return this.spaceid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.file.presignedurl.get";
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
		txtParams.put("dentryid", this.dentryid);
		txtParams.put("expire_seconds", this.expireSeconds);
		txtParams.put("inner_invoke", this.innerInvoke);
		txtParams.put("spaceid", this.spaceid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceFilePresignedurlGetResponse> getResponseClass() {
		return OapiCspaceFilePresignedurlGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dentryid, "dentryid");
		RequestCheckUtils.checkNotEmpty(spaceid, "spaceid");
	}
	

}