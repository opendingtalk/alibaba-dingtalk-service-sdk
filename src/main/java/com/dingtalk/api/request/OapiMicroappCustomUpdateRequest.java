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

import com.dingtalk.api.response.OapiMicroappCustomUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.custom.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.30
 */
public class OapiMicroappCustomUpdateRequest extends BaseTaobaoRequest<OapiMicroappCustomUpdateResponse> {
	
	

	/** 
	* 定制应用Id
	 */
	private Long agentId;

	/** 
	* 应用所属企业corpId
	 */
	private String appCorpId;

	/** 
	* 应用描述
	 */
	private String desc;

	/** 
	* 移动端首页地址
	 */
	private String homepageLink;

	/** 
	* 微应用图标
	 */
	private String icon;

	/** 
	* 出口IP白名单
	 */
	private String ipWhiteList;

	/** 
	* 应用名称
	 */
	private String name;

	/** 
	* 管理后台地址
	 */
	private String ompLink;

	/** 
	* PC端首页地址
	 */
	private String pcHomepageLink;

	/** 
	* 应用所属组织的顶级关联组织corpId
	 */
	private String topRelatedCorpId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAppCorpId(String appCorpId) {
		this.appCorpId = appCorpId;
	}

	public String getAppCorpId() {
		return this.appCorpId;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setHomepageLink(String homepageLink) {
		this.homepageLink = homepageLink;
	}

	public String getHomepageLink() {
		return this.homepageLink;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIpWhiteList(String ipWhiteList) {
		this.ipWhiteList = ipWhiteList;
	}

	public String getIpWhiteList() {
		return this.ipWhiteList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOmpLink(String ompLink) {
		this.ompLink = ompLink;
	}

	public String getOmpLink() {
		return this.ompLink;
	}

	public void setPcHomepageLink(String pcHomepageLink) {
		this.pcHomepageLink = pcHomepageLink;
	}

	public String getPcHomepageLink() {
		return this.pcHomepageLink;
	}

	public void setTopRelatedCorpId(String topRelatedCorpId) {
		this.topRelatedCorpId = topRelatedCorpId;
	}

	public String getTopRelatedCorpId() {
		return this.topRelatedCorpId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.custom.update";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("app_corp_id", this.appCorpId);
		txtParams.put("desc", this.desc);
		txtParams.put("homepage_link", this.homepageLink);
		txtParams.put("icon", this.icon);
		txtParams.put("ip_white_list", this.ipWhiteList);
		txtParams.put("name", this.name);
		txtParams.put("omp_link", this.ompLink);
		txtParams.put("pc_homepage_link", this.pcHomepageLink);
		txtParams.put("top_related_corp_id", this.topRelatedCorpId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappCustomUpdateResponse> getResponseClass() {
		return OapiMicroappCustomUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(appCorpId, "appCorpId");
		RequestCheckUtils.checkNotEmpty(desc, "desc");
		RequestCheckUtils.checkNotEmpty(ipWhiteList, "ipWhiteList");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkNotEmpty(topRelatedCorpId, "topRelatedCorpId");
	}
	

}