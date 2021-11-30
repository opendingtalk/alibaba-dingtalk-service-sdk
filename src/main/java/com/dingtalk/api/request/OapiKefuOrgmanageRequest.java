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

import com.dingtalk.api.response.OapiKefuOrgmanageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kefu.orgmanage request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.09
 */
public class OapiKefuOrgmanageRequest extends BaseTaobaoRequest<OapiKefuOrgmanageResponse> {
	
	

	/** 
	* 请求类型1标识开启
	 */
	private Long reqtype;

	/** 
	* 客服服务id
	 */
	private Long serviceid;

	/** 
	* 服务类型，自动回复
	 */
	private Long servicetype;

	public void setReqtype(Long reqtype) {
		this.reqtype = reqtype;
	}

	public Long getReqtype() {
		return this.reqtype;
	}

	public void setServiceid(Long serviceid) {
		this.serviceid = serviceid;
	}

	public Long getServiceid() {
		return this.serviceid;
	}

	public void setServicetype(Long servicetype) {
		this.servicetype = servicetype;
	}

	public Long getServicetype() {
		return this.servicetype;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kefu.orgmanage";
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
		txtParams.put("reqtype", this.reqtype);
		txtParams.put("serviceid", this.serviceid);
		txtParams.put("servicetype", this.servicetype);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKefuOrgmanageResponse> getResponseClass() {
		return OapiKefuOrgmanageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(reqtype, "reqtype");
		RequestCheckUtils.checkNotEmpty(serviceid, "serviceid");
		RequestCheckUtils.checkNotEmpty(servicetype, "servicetype");
	}
	

}