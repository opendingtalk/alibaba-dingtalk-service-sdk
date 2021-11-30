package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCspaceGrantCustomSpaceResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.grant_custom_space request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCspaceGrantCustomSpaceRequest extends BaseTaobaoRequest<OapiCspaceGrantCustomSpaceResponse> {
	
	

	/** 
	* ISV调用时传入，授权访问指定微应用的自定义空间
	 */
	private String agentId;

	/** 
	* 权限类型，目前支持上传和下载，上传请传add，下载请传download
	 */
	private String domain;

	/** 
	* 权限有效时间，有效范围为0~3600秒，超出此范围或不传默认为30秒
	 */
	private Long duration;

	/** 
	* 授权访问的文件id列表，id之间用英文逗号隔开，如“fileId1,fileId2”
	 */
	private String fileids;

	/** 
	* 授权访问的路径，如授权访问所有文件传“”，授权访问doc文件夹传“doc” 需要utf-8 urlEncode
	 */
	private String path;

	/** 
	* 企业调用时传入，授权访问该domain的自定义空间
	 */
	private String type;

	/** 
	* 企业用户userid
	 */
	private String userid;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setFileids(String fileids) {
		this.fileids = fileids;
	}

	public String getFileids() {
		return this.fileids;
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

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.grant_custom_space";
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
		txtParams.put("domain", this.domain);
		txtParams.put("duration", this.duration);
		txtParams.put("fileids", this.fileids);
		txtParams.put("path", this.path);
		txtParams.put("type", this.type);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceGrantCustomSpaceResponse> getResponseClass() {
		return OapiCspaceGrantCustomSpaceResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}