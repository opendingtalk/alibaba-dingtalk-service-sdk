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

import com.dingtalk.api.response.OapiMaterialArticlePublishResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.article.publish request
 * 
 * @author top auto create
 * @since 1.0, 2019.06.28
 */
public class OapiMaterialArticlePublishRequest extends BaseTaobaoRequest<OapiMaterialArticlePublishResponse> {
	
	

	/** 
	* 文章id
	 */
	private Long articleId;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public Long getArticleId() {
		return this.articleId;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.material.article.publish";
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
		txtParams.put("article_id", this.articleId);
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMaterialArticlePublishResponse> getResponseClass() {
		return OapiMaterialArticlePublishResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(articleId, "articleId");
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
	}
	

}