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

import com.dingtalk.api.response.OapiProcessSyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.sync request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiProcessSyncRequest extends BaseTaobaoRequest<OapiProcessSyncResponse> {
	
	

	/** 
	* 企业微应用标识
	 */
	private Long agentId;

	/** 
	* 业务分类标识（建议采用JAVA包名的命名方式,如:com.alibaba）
	 */
	private String bizCategoryId;

	/** 
	* 审批流名称
	 */
	private String processName;

	/** 
	* 源审批流的唯一码
	 */
	private String srcProcessCode;

	/** 
	* 目标审批流的唯一码
	 */
	private String targetProcessCode;

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

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setSrcProcessCode(String srcProcessCode) {
		this.srcProcessCode = srcProcessCode;
	}

	public String getSrcProcessCode() {
		return this.srcProcessCode;
	}

	public void setTargetProcessCode(String targetProcessCode) {
		this.targetProcessCode = targetProcessCode;
	}

	public String getTargetProcessCode() {
		return this.targetProcessCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.process.sync";
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
		txtParams.put("process_name", this.processName);
		txtParams.put("src_process_code", this.srcProcessCode);
		txtParams.put("target_process_code", this.targetProcessCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessSyncResponse> getResponseClass() {
		return OapiProcessSyncResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkMaxLength(bizCategoryId, 64, "bizCategoryId");
		RequestCheckUtils.checkMaxLength(processName, 64, "processName");
		RequestCheckUtils.checkNotEmpty(srcProcessCode, "srcProcessCode");
		RequestCheckUtils.checkNotEmpty(targetProcessCode, "targetProcessCode");
	}
	

}