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

import com.dingtalk.api.response.OapiTdpTasklistHiddenCancelResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.tdp.tasklist.hidden.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.23
 */
public class OapiTdpTasklistHiddenCancelRequest extends BaseTaobaoRequest<OapiTdpTasklistHiddenCancelResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long agentid;

	/** 
	* 操作者id
	 */
	private String operatorUserid;

	/** 
	* 用户id
	 */
	private String userid;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.tdp.tasklist.hidden.cancel";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("operator_userid", this.operatorUserid);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTdpTasklistHiddenCancelResponse> getResponseClass() {
		return OapiTdpTasklistHiddenCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operatorUserid, "operatorUserid");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}