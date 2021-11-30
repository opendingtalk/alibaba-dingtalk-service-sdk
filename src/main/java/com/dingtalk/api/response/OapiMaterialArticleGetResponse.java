package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.article.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMaterialArticleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3444763368757988261L;

	/** 
	 * 文章id
	 */
	@ApiField("article_id")
	private Long articleId;

	/** 
	 * html码
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 创建时间
	 */
	@ApiField("create_time")
	private Long createTime;

	/** 
	 * 摘要
	 */
	@ApiField("digest")
	private String digest;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 发布状态
	 */
	@ApiField("publish_status")
	private Long publishStatus;

	/** 
	 * 发布时间
	 */
	@ApiField("publish_time")
	private Long publishTime;

	/** 
	 * 封面图
	 */
	@ApiField("thumb_media_id")
	private String thumbMediaId;

	/** 
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 更新时间
	 */
	@ApiField("update_time")
	private Long updateTime;

	/** 
	 * 跳转链接
	 */
	@ApiField("url")
	private String url;


	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	public Long getArticleId( ) {
		return this.articleId;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getCreateTime( ) {
		return this.createTime;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getDigest( ) {
		return this.digest;
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

	public void setPublishStatus(Long publishStatus) {
		this.publishStatus = publishStatus;
	}
	public Long getPublishStatus( ) {
		return this.publishStatus;
	}

	public void setPublishTime(Long publishTime) {
		this.publishTime = publishTime;
	}
	public Long getPublishTime( ) {
		return this.publishTime;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	public String getThumbMediaId( ) {
		return this.thumbMediaId;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	public Long getUpdateTime( ) {
		return this.updateTime;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
