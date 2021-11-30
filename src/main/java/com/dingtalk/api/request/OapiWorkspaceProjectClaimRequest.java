package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiWorkspaceProjectClaimResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.project.claim request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.10
 */
public class OapiWorkspaceProjectClaimRequest extends BaseTaobaoRequest<OapiWorkspaceProjectClaimResponse> {
	
	

	/** 
	* 当tokenGrantType=1时,isvOrgId才会被赋值,此值表示调用方是ISV时,ISV在钉钉上的企业ID
	 */
	private Long isvOrgId;

	/** 
	* 用户手机号码
	 */
	private String mobileNo;

	/** 
	* 项目圈子归属组织
	 */
	private Long orgId;

	/** 
	* 当tokenGrantType=1时,suiteKey才会被赋值,此值表示调用方是ISV时,token是企业对ISV的哪个套件授权的
	 */
	private String suiteKey;

	/** 
	* 目标组织
	 */
	private String targetCorpId;

	/** 
	* 代表token的类型,0为证书类型,表示当前token是企业自己的,本次调用方是企业;1为授权类型,表示当前token是企业授权给ISV的,本次调用方是ISV。      *                         假如你的接口只想让企业自身调用，可以在代码里强制写上tokenGrantType必须为0的逻辑
	 */
	private Long tokenGrantType;

	public void setIsvOrgId(Long isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

	public Long getIsvOrgId() {
		return this.isvOrgId;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public void setTargetCorpId(String targetCorpId) {
		this.targetCorpId = targetCorpId;
	}

	public String getTargetCorpId() {
		return this.targetCorpId;
	}

	public void setTokenGrantType(Long tokenGrantType) {
		this.tokenGrantType = tokenGrantType;
	}

	public Long getTokenGrantType() {
		return this.tokenGrantType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.project.claim";
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
		txtParams.put("isvOrgId", this.isvOrgId);
		txtParams.put("mobileNo", this.mobileNo);
		txtParams.put("orgId", this.orgId);
		txtParams.put("suiteKey", this.suiteKey);
		txtParams.put("targetCorpId", this.targetCorpId);
		txtParams.put("tokenGrantType", this.tokenGrantType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceProjectClaimResponse> getResponseClass() {
		return OapiWorkspaceProjectClaimResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}