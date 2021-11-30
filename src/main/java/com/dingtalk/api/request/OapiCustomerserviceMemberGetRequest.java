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

import com.dingtalk.api.response.OapiCustomerserviceMemberGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.member.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.29
 */
public class OapiCustomerserviceMemberGetRequest extends BaseTaobaoRequest<OapiCustomerserviceMemberGetResponse> {
	
	

	/** 
	* 钉钉企业id
	 */
	private String dingCorpId;

	/** 
	* 实例id
	 */
	private String openInstanceId;

	/** 
	* 1，智能客服
	 */
	private Long productionType;

	/** 
	* 三方租户id
	 */
	private String thirdTenantId;

	/** 
	* 账号id
	 */
	private String userId;

	/** 
	* 账号来源
	 */
	private String userSourceId;

	public void setDingCorpId(String dingCorpId) {
		this.dingCorpId = dingCorpId;
	}

	public String getDingCorpId() {
		return this.dingCorpId;
	}

	public void setOpenInstanceId(String openInstanceId) {
		this.openInstanceId = openInstanceId;
	}

	public String getOpenInstanceId() {
		return this.openInstanceId;
	}

	public void setProductionType(Long productionType) {
		this.productionType = productionType;
	}

	public Long getProductionType() {
		return this.productionType;
	}

	public void setThirdTenantId(String thirdTenantId) {
		this.thirdTenantId = thirdTenantId;
	}

	public String getThirdTenantId() {
		return this.thirdTenantId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserSourceId(String userSourceId) {
		this.userSourceId = userSourceId;
	}

	public String getUserSourceId() {
		return this.userSourceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.member.get";
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
		txtParams.put("ding_corp_id", this.dingCorpId);
		txtParams.put("open_instance_id", this.openInstanceId);
		txtParams.put("production_type", this.productionType);
		txtParams.put("third_tenant_id", this.thirdTenantId);
		txtParams.put("user_id", this.userId);
		txtParams.put("user_source_id", this.userSourceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceMemberGetResponse> getResponseClass() {
		return OapiCustomerserviceMemberGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(thirdTenantId, "thirdTenantId");
		RequestCheckUtils.checkNotEmpty(userId, "userId");
		RequestCheckUtils.checkNotEmpty(userSourceId, "userSourceId");
	}
	

}