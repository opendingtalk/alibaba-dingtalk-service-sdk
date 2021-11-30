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

import com.dingtalk.api.response.OapiProcessinstanceFileDownloadResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.file.download request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.03
 */
public class OapiProcessinstanceFileDownloadRequest extends BaseTaobaoRequest<OapiProcessinstanceFileDownloadResponse> {
	
	

	/** 
	* 企业应用标识
	 */
	private Long agentId;

	/** 
	* 文件id
	 */
	private String fileId;

	/** 
	* 流程实例id
	 */
	private String processInstanceId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.file.download";
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
		txtParams.put("file_id", this.fileId);
		txtParams.put("process_instance_id", this.processInstanceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessinstanceFileDownloadResponse> getResponseClass() {
		return OapiProcessinstanceFileDownloadResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(fileId, "fileId");
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
	}
	

}