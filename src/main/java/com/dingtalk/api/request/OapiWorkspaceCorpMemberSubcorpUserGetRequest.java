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

import com.dingtalk.api.response.OapiWorkspaceCorpMemberSubcorpUserGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.corp.member.subcorp.user.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.15
 */
public class OapiWorkspaceCorpMemberSubcorpUserGetRequest extends BaseTaobaoRequest<OapiWorkspaceCorpMemberSubcorpUserGetResponse> {
	
	

	/** 
	* 来自于归属企业的userid列表
	 */
	private String belongOrgUserids;

	/** 
	* 目标组织的corpId
	 */
	private String targetCorpId;

	public void setBelongOrgUserids(String belongOrgUserids) {
		this.belongOrgUserids = belongOrgUserids;
	}

	public String getBelongOrgUserids() {
		return this.belongOrgUserids;
	}

	public void setTargetCorpId(String targetCorpId) {
		this.targetCorpId = targetCorpId;
	}

	public String getTargetCorpId() {
		return this.targetCorpId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.corp.member.subcorp.user.get";
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
		txtParams.put("belong_org_userids", this.belongOrgUserids);
		txtParams.put("target_corp_id", this.targetCorpId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceCorpMemberSubcorpUserGetResponse> getResponseClass() {
		return OapiWorkspaceCorpMemberSubcorpUserGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(belongOrgUserids, "belongOrgUserids");
		RequestCheckUtils.checkMaxListSize(belongOrgUserids, 999, "belongOrgUserids");
		RequestCheckUtils.checkNotEmpty(targetCorpId, "targetCorpId");
	}
	

}