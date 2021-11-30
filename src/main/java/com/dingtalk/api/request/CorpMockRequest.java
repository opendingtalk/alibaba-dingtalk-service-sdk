package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpMockResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.mock request
 * 
 * @author top auto create
 * @since 1.0, 2018.05.16
 */
public class CorpMockRequest extends BaseTaobaoRequest<CorpMockResponse> {
	
	

	/** 
	* 公司id
	 */
	private String corpId;

	/** 
	* 问候信息
	 */
	private String hello;

	/** 
	* 组织ID
	 */
	private Long orgId;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public String getHello() {
		return this.hello;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.mock";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("hello", this.hello);
		txtParams.put("org_id", this.orgId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpMockResponse> getResponseClass() {
		return CorpMockResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}