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

import com.dingtalk.api.response.OapiAlitripBtripProjectDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.project.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.30
 */
public class OapiAlitripBtripProjectDeleteRequest extends BaseTaobaoRequest<OapiAlitripBtripProjectDeleteResponse> {
	
	

	/** 
	* 企业id
	 */
	private String corpid;

	/** 
	* 第三方项目ID
	 */
	private String thirdPartId;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setThirdPartId(String thirdPartId) {
		this.thirdPartId = thirdPartId;
	}

	public String getThirdPartId() {
		return this.thirdPartId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.project.delete";
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
		txtParams.put("corpid", this.corpid);
		txtParams.put("third_part_id", this.thirdPartId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripProjectDeleteResponse> getResponseClass() {
		return OapiAlitripBtripProjectDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpid, "corpid");
		RequestCheckUtils.checkNotEmpty(thirdPartId, "thirdPartId");
	}
	

}