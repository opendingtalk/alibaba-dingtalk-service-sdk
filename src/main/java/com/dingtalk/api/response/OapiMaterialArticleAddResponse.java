package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.article.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMaterialArticleAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4717631845643419154L;

	/** 
	 * 文章id
	 */
	@ApiField("article_id")
	private Long articleId;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	public Long getArticleId( ) {
		return this.articleId;
	}

	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
