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

import com.dingtalk.api.response.SmartworkBpmsProcessCopyruleResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.process.copyrule request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.09
 */
public class SmartworkBpmsProcessCopyruleRequest extends BaseTaobaoRequest<SmartworkBpmsProcessCopyruleResponse> {
	
	

	/** 
	* 企业微应用标识
	 */
	private Long agentId;

	/** 
	* 业务分类标识(建议采用JAVA包名的命名方式)，最大长度：64
	 */
	private String bizCategoryId;

	/** 
	* 审批流描述
	 */
	private String description;

	/** 
	* 审批流名称，最大长度：64
	 */
	private String name;

	/** 
	* 审批流的唯一码
	 */
	private String processCode;

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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.bpms.process.copyrule";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

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
		txtParams.put("name", this.name);
		txtParams.put("process_code", this.processCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkBpmsProcessCopyruleResponse> getResponseClass() {
		return SmartworkBpmsProcessCopyruleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
	}
	

}