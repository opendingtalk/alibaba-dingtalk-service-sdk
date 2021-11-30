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

import com.dingtalk.api.response.OapiSmartdeviceApplyoutidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartdevice.applyoutid request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiSmartdeviceApplyoutidRequest extends BaseTaobaoRequest<OapiSmartdeviceApplyoutidResponse> {
	
	

	/** 
	* 设备类型id
	 */
	private Long devServId;

	/** 
	* 设备序列号
	 */
	private String sn;

	public void setDevServId(Long devServId) {
		this.devServId = devServId;
	}

	public Long getDevServId() {
		return this.devServId;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSn() {
		return this.sn;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartdevice.applyoutid";
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
		txtParams.put("dev_serv_id", this.devServId);
		txtParams.put("sn", this.sn);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartdeviceApplyoutidResponse> getResponseClass() {
		return OapiSmartdeviceApplyoutidResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(devServId, "devServId");
		RequestCheckUtils.checkNotEmpty(sn, "sn");
	}
	

}