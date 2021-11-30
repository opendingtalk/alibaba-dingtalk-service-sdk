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

import com.dingtalk.api.response.OapiCrmObjectdataCustomerDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.customer.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.09
 */
public class OapiCrmObjectdataCustomerDeleteRequest extends BaseTaobaoRequest<OapiCrmObjectdataCustomerDeleteResponse> {
	
	

	/** 
	* 客户实例ID
	 */
	private String dataId;

	/** 
	* 操作人用户ID
	 */
	private String operatorUserid;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.objectdata.customer.delete";
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
		txtParams.put("data_id", this.dataId);
		txtParams.put("operator_userid", this.operatorUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmObjectdataCustomerDeleteResponse> getResponseClass() {
		return OapiCrmObjectdataCustomerDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dataId, "dataId");
		RequestCheckUtils.checkNotEmpty(operatorUserid, "operatorUserid");
	}
	

}