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

import com.dingtalk.api.response.OapiPbpInstanceEnableResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.enable request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.19
 */
public class OapiPbpInstanceEnableRequest extends BaseTaobaoRequest<OapiPbpInstanceEnableResponse> {
	
	

	/** 
	* 业务唯一标识
	 */
	private String bizId;

	/** 
	* 业务实例唯一标识
	 */
	private String bizInstId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizInstId(String bizInstId) {
		this.bizInstId = bizInstId;
	}

	public String getBizInstId() {
		return this.bizInstId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.instance.enable";
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
		txtParams.put("biz_id", this.bizId);
		txtParams.put("biz_inst_id", this.bizInstId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpInstanceEnableResponse> getResponseClass() {
		return OapiPbpInstanceEnableResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkNotEmpty(bizInstId, "bizInstId");
	}
	

}