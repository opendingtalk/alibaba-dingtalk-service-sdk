package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCspaceAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.add request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCspaceAddRequest extends BaseTaobaoRequest<OapiCspaceAddResponse> {
	
	

	/** 
	* 微应用的agentId
	 */
	private String agentId;

	/** 
	* 如果是微应用，code值为微应用免登授权码,如果是服务窗应用，code值为服务窗免登授权码。code为临时授权码，只能消费一次，下次请求需要重新获取新的code。
	 */
	private String code;

	/** 
	* 调用云盘选择控件后获取的用户钉盘空间ID
	 */
	private String folderId;

	/** 
	* 调用钉盘上传文件接口得到的mediaid, 需要utf-8 urlEncode
	 */
	private String mediaId;

	/** 
	* 上传文件的名称，不能包含非法字符，需要utf-8 urlEncode
	 */
	private String name;

	/** 
	* 遇到同名文件是否覆盖，若不覆盖，则会自动重命名本次新增的文件，默认为false
	 */
	private Boolean overwrite;

	/** 
	* 调用云盘选择控件后获取的用户钉盘文件夹ID
	 */
	private String spaceId;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	public String getFolderId() {
		return this.folderId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOverwrite(Boolean overwrite) {
		this.overwrite = overwrite;
	}

	public Boolean getOverwrite() {
		return this.overwrite;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

	public String getSpaceId() {
		return this.spaceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.add";
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
		txtParams.put("code", this.code);
		txtParams.put("folder_id", this.folderId);
		txtParams.put("media_id", this.mediaId);
		txtParams.put("name", this.name);
		txtParams.put("overwrite", this.overwrite);
		txtParams.put("space_id", this.spaceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceAddResponse> getResponseClass() {
		return OapiCspaceAddResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}