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

import com.dingtalk.api.response.OapiServiceaccountAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.serviceaccount.add request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.04
 */
public class OapiServiceaccountAddRequest extends BaseTaobaoRequest<OapiServiceaccountAddResponse> {
	
	

	/** 
	* 头像图片mediaId
	 */
	private String avatarMediaId;

	/** 
	* 机器人管理列表中的简介
	 */
	private String brief;

	/** 
	* 机器人主页中的服务号功能简介，最多200个字符
	 */
	private String desc;

	/** 
	* 服务号名称
	 */
	private String name;

	/** 
	* 机器人主页中，消息预览图片的mediaId
	 */
	private String previewMediaId;

	public void setAvatarMediaId(String avatarMediaId) {
		this.avatarMediaId = avatarMediaId;
	}

	public String getAvatarMediaId() {
		return this.avatarMediaId;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getBrief() {
		return this.brief;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPreviewMediaId(String previewMediaId) {
		this.previewMediaId = previewMediaId;
	}

	public String getPreviewMediaId() {
		return this.previewMediaId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.serviceaccount.add";
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
		txtParams.put("avatar_media_id", this.avatarMediaId);
		txtParams.put("brief", this.brief);
		txtParams.put("desc", this.desc);
		txtParams.put("name", this.name);
		txtParams.put("preview_media_id", this.previewMediaId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceaccountAddResponse> getResponseClass() {
		return OapiServiceaccountAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(avatarMediaId, "avatarMediaId");
		RequestCheckUtils.checkMaxLength(brief, 60, "brief");
		RequestCheckUtils.checkNotEmpty(desc, "desc");
		RequestCheckUtils.checkMaxLength(desc, 200, "desc");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 30, "name");
		RequestCheckUtils.checkNotEmpty(previewMediaId, "previewMediaId");
	}
	

}