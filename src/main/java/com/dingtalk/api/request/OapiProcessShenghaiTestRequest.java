package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiProcessShenghaiTestResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.shenghai.test request
 * 
 * @author top auto create
 * @since 1.0, 2019.11.29
 */
public class OapiProcessShenghaiTestRequest extends BaseTaobaoRequest<OapiProcessShenghaiTestResponse> {
	
	

	/** 
	* rr
	 */
	private Long userType;

	/** 
	* 44
	 */
	private String workId;

	public void setUserType(Long userType) {
		this.userType = userType;
	}

	public Long getUserType() {
		return this.userType;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getWorkId() {
		return this.workId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.shenghai.test";
	}

	private String topResponseType ;

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
		txtParams.put("user_type", this.userType);
		txtParams.put("work_id", this.workId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessShenghaiTestResponse> getResponseClass() {
		return OapiProcessShenghaiTestResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}