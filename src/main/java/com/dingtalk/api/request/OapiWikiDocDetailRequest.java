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

import com.dingtalk.api.response.OapiWikiDocDetailResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.wiki.doc.detail request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.16
 */
public class OapiWikiDocDetailRequest extends BaseTaobaoRequest<OapiWikiDocDetailResponse> {
	
	

	/** 
	* 应用agentId
	 */
	private Long agentid;

	/** 
	* 知识页ID（加密后的值）
	 */
	private String docId;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocId() {
		return this.docId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.wiki.doc.detail";
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
		txtParams.put("doc_id", this.docId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWikiDocDetailResponse> getResponseClass() {
		return OapiWikiDocDetailResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
		RequestCheckUtils.checkNotEmpty(docId, "docId");
	}
	

}