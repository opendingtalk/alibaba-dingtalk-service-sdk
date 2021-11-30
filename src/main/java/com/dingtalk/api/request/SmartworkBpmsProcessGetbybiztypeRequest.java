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

import com.dingtalk.api.response.SmartworkBpmsProcessGetbybiztypeResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.process.getbybiztype request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class SmartworkBpmsProcessGetbybiztypeRequest extends BaseTaobaoRequest<SmartworkBpmsProcessGetbybiztypeResponse> {
	
	

	/** 
	* 套件开发时与审批约定的业务标识
	 */
	private String bizType;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.bpms.process.getbybiztype";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("biz_type", this.bizType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkBpmsProcessGetbybiztypeResponse> getResponseClass() {
		return SmartworkBpmsProcessGetbybiztypeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
	}
	

}