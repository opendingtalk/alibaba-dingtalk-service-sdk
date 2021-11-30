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

import com.dingtalk.api.response.OapiCspaceAuthGenerateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.auth.generate request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.08
 */
public class OapiCspaceAuthGenerateRequest extends BaseTaobaoRequest<OapiCspaceAuthGenerateResponse> {
	
	

	/** 
	* 微应用的agentId
	 */
	private Long agentId;

	/** 
	* 被授权的应用appId
	 */
	private Long appId;

	/** 
	* 授权码有效期，单位为日，为空则表示永久授权
	 */
	private Long duration;

	/** 
	* 授权访问的文件id列表，id之间用英文逗号隔开，如"fileId1,fileId2", type=download时必须传递
	 */
	private String fileIds;

	/** 
	* 授权访问的路径，如授权访问所有文件传""，授权访问doc文件夹传"doc"，需要utf-8 urlEncode, type=add时必须传递
	 */
	private String path;

	/** 
	* 权限类型，目前支持上传和预览，上传请传add，预览请传download
	 */
	private String type;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setFileIds(String fileIds) {
		this.fileIds = fileIds;
	}

	public String getFileIds() {
		return this.fileIds;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.auth.generate";
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
		txtParams.put("app_id", this.appId);
		txtParams.put("duration", this.duration);
		txtParams.put("file_ids", this.fileIds);
		txtParams.put("path", this.path);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceAuthGenerateResponse> getResponseClass() {
		return OapiCspaceAuthGenerateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(appId, "appId");
		RequestCheckUtils.checkMaxListSize(fileIds, 20, "fileIds");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}