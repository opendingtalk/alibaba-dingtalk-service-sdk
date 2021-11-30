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

import com.dingtalk.api.response.OapiRhinoOrderDtechProcessListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.process.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.29
 */
public class OapiRhinoOrderDtechProcessListRequest extends BaseTaobaoRequest<OapiRhinoOrderDtechProcessListResponse> {
	
	

	/** 
	* 数字工艺平台工序编号
	 */
	private String bizIdProcessList;

	/** 
	* 用户id
	 */
	private String userId;

	public void setBizIdProcessList(String bizIdProcessList) {
		this.bizIdProcessList = bizIdProcessList;
	}

	public String getBizIdProcessList() {
		return this.bizIdProcessList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.dtech.process.list";
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
		txtParams.put("biz_id_process_list", this.bizIdProcessList);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoOrderDtechProcessListResponse> getResponseClass() {
		return OapiRhinoOrderDtechProcessListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizIdProcessList, "bizIdProcessList");
		RequestCheckUtils.checkMaxListSize(bizIdProcessList, 20, "bizIdProcessList");
	}
	

}