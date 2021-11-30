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

import com.dingtalk.api.response.OapiCspaceGetDownloadUrlResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.get_download_url request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.23
 */
public class OapiCspaceGetDownloadUrlRequest extends BaseTaobaoRequest<OapiCspaceGetDownloadUrlResponse> {
	
	

	/** 
	* 应用id
	 */
	private Long agentid;

	/** 
	* 链接有效的时间，单位为秒，最小0，最大900
	 */
	private Long duration;

	/** 
	* 文件id
	 */
	private Long fileId;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public Long getFileId() {
		return this.fileId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.get_download_url";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("duration", this.duration);
		txtParams.put("file_id", this.fileId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceGetDownloadUrlResponse> getResponseClass() {
		return OapiCspaceGetDownloadUrlResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
		RequestCheckUtils.checkNotEmpty(fileId, "fileId");
	}
	

}