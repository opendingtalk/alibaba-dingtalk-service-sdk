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

import com.dingtalk.api.response.OapiRobotMessageGrouptaskQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.grouptask.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.03
 */
public class OapiRobotMessageGrouptaskQueryRequest extends BaseTaobaoRequest<OapiRobotMessageGrouptaskQueryResponse> {
	
	

	/** 
	* 用于查询发送进度的唯一标识
	 */
	private String processQueryKey;

	/** 
	* 群机器人webhook中的token
	 */
	private String token;

	public void setProcessQueryKey(String processQueryKey) {
		this.processQueryKey = processQueryKey;
	}

	public String getProcessQueryKey() {
		return this.processQueryKey;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.message.grouptask.query";
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
		txtParams.put("process_query_key", this.processQueryKey);
		txtParams.put("token", this.token);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotMessageGrouptaskQueryResponse> getResponseClass() {
		return OapiRobotMessageGrouptaskQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processQueryKey, "processQueryKey");
		RequestCheckUtils.checkNotEmpty(token, "token");
	}
	

}