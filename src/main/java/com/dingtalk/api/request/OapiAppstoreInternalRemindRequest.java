package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAppstoreInternalRemindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.internal.remind request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAppstoreInternalRemindRequest extends BaseTaobaoRequest<OapiAppstoreInternalRemindResponse> {
	
	

	/** 
	* 商品码
	 */
	private String goodsCode;

	/** 
	* 试用审批单id
	 */
	private String processInstanceId;

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.appstore.internal.remind";
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
		txtParams.put("goods_code", this.goodsCode);
		txtParams.put("process_instance_id", this.processInstanceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAppstoreInternalRemindResponse> getResponseClass() {
		return OapiAppstoreInternalRemindResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}