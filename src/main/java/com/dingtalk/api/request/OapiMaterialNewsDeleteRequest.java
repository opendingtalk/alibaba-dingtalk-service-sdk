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

import com.dingtalk.api.response.OapiMaterialNewsDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.news.delete request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.04
 */
public class OapiMaterialNewsDeleteRequest extends BaseTaobaoRequest<OapiMaterialNewsDeleteResponse> {
	
	

	/** 
	* 消息卡片素材id
	 */
	private String mediaId;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.material.news.delete";
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
		txtParams.put("media_id", this.mediaId);
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMaterialNewsDeleteResponse> getResponseClass() {
		return OapiMaterialNewsDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mediaId, "mediaId");
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
	}
	

}