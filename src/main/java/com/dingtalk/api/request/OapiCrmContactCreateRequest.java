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

import com.dingtalk.api.response.OapiCrmContactCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.contact.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.18
 */
public class OapiCrmContactCreateRequest extends BaseTaobaoRequest<OapiCrmContactCreateResponse> {
	
	

	/** 
	* 联系人姓名
	 */
	private String contactName;

	/** 
	* 联系人手机号
	 */
	private String contactPhone;

	/** 
	* 联系人职位
	 */
	private String contactPositionList;

	/** 
	* 创建人用户 ID
	 */
	private String creatorUserid;

	/** 
	* 所在客户实例 ID
	 */
	private String customerInstanceId;

	/** 
	* 服务商组织id, 特殊场景使用，丁税宝客户自建应用时传入对应的丁税宝服务商id用以生成 UnionId 关联自然人
	 */
	private String providerCorpid;

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPositionList(String contactPositionList) {
		this.contactPositionList = contactPositionList;
	}

	public String getContactPositionList() {
		return this.contactPositionList;
	}

	public void setCreatorUserid(String creatorUserid) {
		this.creatorUserid = creatorUserid;
	}

	public String getCreatorUserid() {
		return this.creatorUserid;
	}

	public void setCustomerInstanceId(String customerInstanceId) {
		this.customerInstanceId = customerInstanceId;
	}

	public String getCustomerInstanceId() {
		return this.customerInstanceId;
	}

	public void setProviderCorpid(String providerCorpid) {
		this.providerCorpid = providerCorpid;
	}

	public String getProviderCorpid() {
		return this.providerCorpid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.contact.create";
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
		txtParams.put("contact_name", this.contactName);
		txtParams.put("contact_phone", this.contactPhone);
		txtParams.put("contact_position_list", this.contactPositionList);
		txtParams.put("creator_userid", this.creatorUserid);
		txtParams.put("customer_instance_id", this.customerInstanceId);
		txtParams.put("provider_corpid", this.providerCorpid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmContactCreateResponse> getResponseClass() {
		return OapiCrmContactCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(contactName, "contactName");
		RequestCheckUtils.checkMaxLength(contactName, 20, "contactName");
		RequestCheckUtils.checkNotEmpty(contactPhone, "contactPhone");
		RequestCheckUtils.checkMaxLength(contactPhone, 15, "contactPhone");
		RequestCheckUtils.checkMaxListSize(contactPositionList, 999, "contactPositionList");
		RequestCheckUtils.checkNotEmpty(creatorUserid, "creatorUserid");
		RequestCheckUtils.checkNotEmpty(customerInstanceId, "customerInstanceId");
		RequestCheckUtils.checkMaxLength(customerInstanceId, 50, "customerInstanceId");
	}
	

}