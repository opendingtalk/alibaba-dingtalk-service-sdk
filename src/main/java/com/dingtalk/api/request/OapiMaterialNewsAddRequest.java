package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiMaterialNewsAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.news.add request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.04
 */
public class OapiMaterialNewsAddRequest extends BaseTaobaoRequest<OapiMaterialNewsAddResponse> {
	
	

	/** 
	* 文章列表
	 */
	private String articles;

	/** 
	* 服务号的unionid
	 */
	private String unionid;

	public void setArticles(String articles) {
		this.articles = articles;
	}

	public void setArticles(List<ArticleDTO> articles) {
		this.articles = new JSONWriter(false,false,true).write(articles);
	}

	public String getArticles() {
		return this.articles;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.material.news.add";
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
		txtParams.put("articles", this.articles);
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMaterialNewsAddResponse> getResponseClass() {
		return OapiMaterialNewsAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(articles, 20, "articles");
		RequestCheckUtils.checkNotEmpty(unionid, "unionid");
	}
	
	/**
	 * 文章列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ArticleDTO extends TaobaoObject {
		private static final long serialVersionUID = 7535921298793433563L;
		/**
		 * 文章id
		 */
		@ApiField("article_id")
		private Long articleId;
	
		public Long getArticleId() {
			return this.articleId;
		}
		public void setArticleId(Long articleId) {
			this.articleId = articleId;
		}
	}
	

}