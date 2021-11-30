package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiFileUploadTransactionResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.file.upload.transaction request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiFileUploadTransactionRequest extends BaseTaobaoRequest<OapiFileUploadTransactionResponse> {
	
	

	/** 
	* 微应用的agentId
	 */
	private String agentId;

	/** 
	* 文件总块数
	 */
	private Long chunkNumbers;

	/** 
	* 文件大小
	 */
	private Long fileSize;

	/** 
	* 上传事务id 需要utf-8 urlEncode
	 */
	private String uploadId;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setChunkNumbers(Long chunkNumbers) {
		this.chunkNumbers = chunkNumbers;
	}

	public Long getChunkNumbers() {
		return this.chunkNumbers;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public Long getFileSize() {
		return this.fileSize;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

	public String getUploadId() {
		return this.uploadId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.file.upload.transaction";
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

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_GET;

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
		txtParams.put("chunk_numbers", this.chunkNumbers);
		txtParams.put("file_size", this.fileSize);
		txtParams.put("upload_id", this.uploadId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiFileUploadTransactionResponse> getResponseClass() {
		return OapiFileUploadTransactionResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}