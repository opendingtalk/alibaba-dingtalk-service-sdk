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

import com.dingtalk.api.response.OapiCrmGroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.group.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.19
 */
public class OapiCrmGroupCreateRequest extends BaseTaobaoRequest<OapiCrmGroupCreateResponse> {
	
	

	/** 
	* 需要入群的同事userId列表
	 */
	private String colleagueUseridList;

	/** 
	* 联系人userId列表
	 */
	private String contactIdList;

	/** 
	* 客户归属的企业id
	 */
	private String customerCorpid;

	/** 
	* 客户id
	 */
	private String customerId;

	/** 
	* 群主userId
	 */
	private String groupOwner;

	public void setColleagueUseridList(String colleagueUseridList) {
		this.colleagueUseridList = colleagueUseridList;
	}

	public String getColleagueUseridList() {
		return this.colleagueUseridList;
	}

	public void setContactIdList(String contactIdList) {
		this.contactIdList = contactIdList;
	}

	public String getContactIdList() {
		return this.contactIdList;
	}

	public void setCustomerCorpid(String customerCorpid) {
		this.customerCorpid = customerCorpid;
	}

	public String getCustomerCorpid() {
		return this.customerCorpid;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setGroupOwner(String groupOwner) {
		this.groupOwner = groupOwner;
	}

	public String getGroupOwner() {
		return this.groupOwner;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.group.create";
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
		txtParams.put("colleague_userid_list", this.colleagueUseridList);
		txtParams.put("contact_id_list", this.contactIdList);
		txtParams.put("customer_corpid", this.customerCorpid);
		txtParams.put("customer_id", this.customerId);
		txtParams.put("group_owner", this.groupOwner);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmGroupCreateResponse> getResponseClass() {
		return OapiCrmGroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(colleagueUseridList, 20, "colleagueUseridList");
		RequestCheckUtils.checkMaxListSize(contactIdList, 20, "contactIdList");
		RequestCheckUtils.checkNotEmpty(customerCorpid, "customerCorpid");
		RequestCheckUtils.checkNotEmpty(customerId, "customerId");
		RequestCheckUtils.checkNotEmpty(groupOwner, "groupOwner");
	}
	

}