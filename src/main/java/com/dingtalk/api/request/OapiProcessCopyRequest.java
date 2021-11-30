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

import com.dingtalk.api.response.OapiProcessCopyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.copy request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiProcessCopyRequest extends BaseTaobaoRequest<OapiProcessCopyResponse> {
	
	

	/** 
	* 企业微应用标识
	 */
	private Long agentId;

	/** 
	* 业务分类标识（建议采用JAVA包名的命名方式，）
	 */
	private String bizCategoryId;

	/** 
	* 复制类型，1 不包含流程信息，2 包含流程信息且审批中员工可见。默认为1
	 */
	private Long copyType;

	/** 
	* 审批流描述
	 */
	private String description;

	/** 
	* 审批流的唯一码
	 */
	private String processCode;

	/** 
	* 审批流名称
	 */
	private String processName;

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

	public void setCopyType(Long copyType) {
		this.copyType = copyType;
	}

	public Long getCopyType() {
		return this.copyType;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessName() {
		return this.processName;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.copy";
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
		txtParams.put("biz_category_id", this.bizCategoryId);
		txtParams.put("copy_type", this.copyType);
		txtParams.put("description", this.description);
		txtParams.put("process_code", this.processCode);
		txtParams.put("process_name", this.processName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessCopyResponse> getResponseClass() {
		return OapiProcessCopyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkMaxLength(bizCategoryId, 64, "bizCategoryId");
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
		RequestCheckUtils.checkMaxLength(processName, 64, "processName");
	}
	

}