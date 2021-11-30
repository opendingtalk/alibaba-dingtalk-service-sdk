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

import com.dingtalk.api.response.CorpBpmsProcessCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.bpms.process.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.09
 */
public class CorpBpmsProcessCreateRequest extends BaseTaobaoRequest<CorpBpmsProcessCreateResponse> {
	
	

	/** 
	* 企业微应用标识
	 */
	private Long agentId;

	/** 
	* 业务分类标识（建议采用JAVA包名的命名方式，）
	 */
	private String bizCategoryId;

	/** 
	* 审批流描述
	 */
	private String description;

	/** 
	* 审批流图标名称
	 */
	private String iconName;

	/** 
	* 审批流名称
	 */
	private String processName;

	/** 
	* ISV页面链接，发起审批、查看详情等均打开此页面
	 */
	private String url;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setBizCategoryId(String bizCategoryId) {
		this.bizCategoryId = bizCategoryId;
	}

	public String getBizCategoryId() {
		return this.bizCategoryId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	public String getIconName() {
		return this.iconName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.bpms.process.create";
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
		txtParams.put("agent_id", this.agentId);
		txtParams.put("biz_category_id", this.bizCategoryId);
		txtParams.put("description", this.description);
		txtParams.put("icon_name", this.iconName);
		txtParams.put("process_name", this.processName);
		txtParams.put("url", this.url);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpBpmsProcessCreateResponse> getResponseClass() {
		return CorpBpmsProcessCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkMaxLength(bizCategoryId, 64, "bizCategoryId");
		RequestCheckUtils.checkNotEmpty(iconName, "iconName");
		RequestCheckUtils.checkMaxLength(iconName, 64, "iconName");
		RequestCheckUtils.checkNotEmpty(processName, "processName");
		RequestCheckUtils.checkMaxLength(processName, 64, "processName");
		RequestCheckUtils.checkNotEmpty(url, "url");
	}
	

}