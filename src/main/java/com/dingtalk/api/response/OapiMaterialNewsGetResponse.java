package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.news.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMaterialNewsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4641858265913689144L;

	/** 
	 * 文章列表
	 */
	@ApiListField("articles")
	@ApiField("article_d_t_o")
	private List<ArticleDTO> articles;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 卡片素材id
	 */
	@ApiField("media_id")
	private String mediaId;

	/** 
	 * 消息卡片更新时间
	 */
	@ApiField("update_time")
	private Long updateTime;


	public void setArticles(List<ArticleDTO> articles) {
		this.articles = articles;
	}
	public List<ArticleDTO> getArticles( ) {
		return this.articles;
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

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getMediaId( ) {
		return this.mediaId;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	public Long getUpdateTime( ) {
		return this.updateTime;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 文章列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ArticleDTO extends TaobaoObject {
		private static final long serialVersionUID = 8848684666581487951L;
		/**
		 * 文章id
		 */
		@ApiField("article_id")
		private Long articleId;
		/**
		 * 文章内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 文章创建时间
		 */
		@ApiField("create_time")
		private Long createTime;
		/**
		 * 摘要
		 */
		@ApiField("digest")
		private String digest;
		/**
		 * publish_status，发布状态，0 未发布，1 已发布。文章第一次发布后，状态置为1，已发布文章支持修改，修改后此状态保持为1，每次修改文章后需要再次发布内容才会生效。
		 */
		@ApiField("publish_status")
		private Long publishStatus;
		/**
		 * 发布时间
		 */
		@ApiField("publish_time")
		private Long publishTime;
		/**
		 * 封面图片的素材id
		 */
		@ApiField("thumb_media_id")
		private String thumbMediaId;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 阅读次数
		 */
		@ApiField("total_view_count")
		private Long totalViewCount;
		/**
		 * 文章更新时间
		 */
		@ApiField("update_time")
		private Long updateTime;
		/**
		 * 文章链接
		 */
		@ApiField("url")
		private String url;
		/**
		 * 已读用户数
		 */
		@ApiField("user_view_count")
		private Long userViewCount;
	
		public Long getArticleId() {
			return this.articleId;
		}
		public void setArticleId(Long articleId) {
			this.articleId = articleId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Long getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
		public String getDigest() {
			return this.digest;
		}
		public void setDigest(String digest) {
			this.digest = digest;
		}
		public Long getPublishStatus() {
			return this.publishStatus;
		}
		public void setPublishStatus(Long publishStatus) {
			this.publishStatus = publishStatus;
		}
		public Long getPublishTime() {
			return this.publishTime;
		}
		public void setPublishTime(Long publishTime) {
			this.publishTime = publishTime;
		}
		public String getThumbMediaId() {
			return this.thumbMediaId;
		}
		public void setThumbMediaId(String thumbMediaId) {
			this.thumbMediaId = thumbMediaId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getTotalViewCount() {
			return this.totalViewCount;
		}
		public void setTotalViewCount(Long totalViewCount) {
			this.totalViewCount = totalViewCount;
		}
		public Long getUpdateTime() {
			return this.updateTime;
		}
		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public Long getUserViewCount() {
			return this.userViewCount;
		}
		public void setUserViewCount(Long userViewCount) {
			this.userViewCount = userViewCount;
		}
	}
	


}
