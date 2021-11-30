package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoUploadRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.FileItem;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiFileUploadSingleResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.file.upload.single request
 *
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiFileUploadSingleRequest extends BaseTaobaoRequest<OapiFileUploadSingleResponse> implements TaobaoUploadRequest<OapiFileUploadSingleResponse> {
	
	

	/** 
	* 微应用的agentId
	 */
	private String agentId;

	/** 
	* 文件内容
	 */
	private FileItem file;

	/** 
	* 文件大小
	 */
	private Long fileSize;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setFile(FileItem file) {
		this.file = file;
	}

	public FileItem getFile() {
		return this.file;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public Long getFileSize() {
		return this.fileSize;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.file.upload.single";
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

    public String getTopHttpMethod() {
        return DingTalkConstants.HTTP_METHOD_POST;
     }

	public Map<String, String> getTextParams() {
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agent_id", this.agentId);
		txtParams.put("file_size", this.fileSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFileUploadSingleResponse> getResponseClass() {
		return OapiFileUploadSingleResponse.class;
	}

	public void check() throws ApiRuleException {
	}

	public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file", this.file);
        return params;
    }


}