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

import com.dingtalk.api.response.OapiRhinoDtechMachineParamListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.dtech.machine.param.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.11
 */
public class OapiRhinoDtechMachineParamListRequest extends BaseTaobaoRequest<OapiRhinoDtechMachineParamListResponse> {
	
	

	/** 
	* 工序bizid列表
	 */
	private String bizIdProcessList;

	public void setBizIdProcessList(String bizIdProcessList) {
		this.bizIdProcessList = bizIdProcessList;
	}

	public String getBizIdProcessList() {
		return this.bizIdProcessList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.dtech.machine.param.list";
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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoDtechMachineParamListResponse> getResponseClass() {
		return OapiRhinoDtechMachineParamListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizIdProcessList, "bizIdProcessList");
		RequestCheckUtils.checkMaxListSize(bizIdProcessList, 20, "bizIdProcessList");
	}
	

}