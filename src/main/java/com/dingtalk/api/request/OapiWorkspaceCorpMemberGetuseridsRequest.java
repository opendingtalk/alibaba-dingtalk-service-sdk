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

import com.dingtalk.api.response.OapiWorkspaceCorpMemberGetuseridsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.corp.member.getuserids request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.25
 */
public class OapiWorkspaceCorpMemberGetuseridsRequest extends BaseTaobaoRequest<OapiWorkspaceCorpMemberGetuseridsResponse> {
	
	

	/** 
	* 小圈corpId
	 */
	private String sourceCorpId;

	/** 
	* 小圈的userid列表
	 */
	private String userids;

	public void setSourceCorpId(String sourceCorpId) {
		this.sourceCorpId = sourceCorpId;
	}

	public String getSourceCorpId() {
		return this.sourceCorpId;
	}

	public void setUserids(String userids) {
		this.userids = userids;
	}

	public String getUserids() {
		return this.userids;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.corp.member.getuserids";
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
		txtParams.put("source_corp_id", this.sourceCorpId);
		txtParams.put("userids", this.userids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceCorpMemberGetuseridsResponse> getResponseClass() {
		return OapiWorkspaceCorpMemberGetuseridsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(sourceCorpId, "sourceCorpId");
		RequestCheckUtils.checkNotEmpty(userids, "userids");
		RequestCheckUtils.checkMaxListSize(userids, 20, "userids");
	}
	

}