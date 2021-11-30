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

import com.dingtalk.api.response.OapiWorkspaceCorpGroupBindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.corp.group.bind request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.15
 */
public class OapiWorkspaceCorpGroupBindRequest extends BaseTaobaoRequest<OapiWorkspaceCorpGroupBindResponse> {
	
	

	/** 
	* 群列表，只允许运营主体或归属企业的未绑定过的内部群
	 */
	private String chatIds;

	/** 
	* 目标组织id
	 */
	private String targetCorpId;

	public void setChatIds(String chatIds) {
		this.chatIds = chatIds;
	}

	public String getChatIds() {
		return this.chatIds;
	}

	public void setTargetCorpId(String targetCorpId) {
		this.targetCorpId = targetCorpId;
	}

	public String getTargetCorpId() {
		return this.targetCorpId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.corp.group.bind";
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
		txtParams.put("chat_ids", this.chatIds);
		txtParams.put("target_corp_id", this.targetCorpId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceCorpGroupBindResponse> getResponseClass() {
		return OapiWorkspaceCorpGroupBindResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatIds, "chatIds");
		RequestCheckUtils.checkMaxListSize(chatIds, 20, "chatIds");
		RequestCheckUtils.checkNotEmpty(targetCorpId, "targetCorpId");
	}
	

}