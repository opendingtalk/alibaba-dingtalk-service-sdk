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

import com.dingtalk.api.response.OapiRhinoMosExecPerformActiveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.active request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.22
 */
public class OapiRhinoMosExecPerformActiveRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformActiveResponse> {
	
	

	/** 
	* 系统参数,由TOP传入,表示当前token所属的企业对外开放的ID
	 */
	private String corpId;

	/** 
	* 工序执行ID列表
	 */
	private String ids;

	/** 
	* 系统参数,由TOP传入,当tokenGrantType=1时,isvOrgId才会被赋值,此值表示调用方是ISV时,ISV在钉钉上的企业ID
	 */
	private Long isvOrgId;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 系统参数,由TOP传入,表示当前token所属的企业ID
	 */
	private Long orgId;

	/** 
	* 系统参数,由TOP传入,此值表示调用方是ISV时,token是企业对ISV的哪个套件授权的
	 */
	private String suiteKey;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 系统参数,由TOP传入,代表token的类型
	 */
	private Long tokenGrantType;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userId;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getIds() {
		return this.ids;
	}

	public void setIsvOrgId(Long isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

	public Long getIsvOrgId() {
		return this.isvOrgId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
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

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTokenGrantType(Long tokenGrantType) {
		this.tokenGrantType = tokenGrantType;
	}

	public Long getTokenGrantType() {
		return this.tokenGrantType;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.active";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("ids", this.ids);
		txtParams.put("isv_org_id", this.isvOrgId);
		txtParams.put("order_id", this.orderId);
		txtParams.put("org_id", this.orgId);
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("token_grant_type", this.tokenGrantType);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformActiveResponse> getResponseClass() {
		return OapiRhinoMosExecPerformActiveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(ids, "ids");
		RequestCheckUtils.checkMaxListSize(ids, 500, "ids");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}