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

import com.dingtalk.api.response.OapiImChatServicegroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.servicegroup.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.22
 */
public class OapiImChatServicegroupCreateRequest extends BaseTaobaoRequest<OapiImChatServicegroupCreateResponse> {
	
	

	/** 
	* 建群去重的业务id
	 */
	private String groupUniqId;

	/** 
	* 是否企业内部服务群
	 */
	private Boolean orgInnerGroup;

	/** 
	* 群主在钉钉组织内的userid
	 */
	private String ownerUserid;

	/** 
	* 群标题
	 */
	private String title;

	public void setGroupUniqId(String groupUniqId) {
		this.groupUniqId = groupUniqId;
	}

	public String getGroupUniqId() {
		return this.groupUniqId;
	}

	public void setOrgInnerGroup(Boolean orgInnerGroup) {
		this.orgInnerGroup = orgInnerGroup;
	}

	public Boolean getOrgInnerGroup() {
		return this.orgInnerGroup;
	}

	public void setOwnerUserid(String ownerUserid) {
		this.ownerUserid = ownerUserid;
	}

	public String getOwnerUserid() {
		return this.ownerUserid;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.servicegroup.create";
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
		txtParams.put("group_uniq_id", this.groupUniqId);
		txtParams.put("org_inner_group", this.orgInnerGroup);
		txtParams.put("owner_userid", this.ownerUserid);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatServicegroupCreateResponse> getResponseClass() {
		return OapiImChatServicegroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(ownerUserid, "ownerUserid");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkMaxLength(title, 256, "title");
	}
	

}