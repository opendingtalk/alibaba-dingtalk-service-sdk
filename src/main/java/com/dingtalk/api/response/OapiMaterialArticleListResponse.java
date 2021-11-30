package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.article.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMaterialArticleListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6167288486695343499L;

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
	 * 本页条数
	 */
	@ApiField("item_count")
	private Long itemCount;

	/** 
	 * 文章列表
	 */
	@ApiListField("items")
	@ApiField("article_d_t_o")
	private List<ArticleDTO> items;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;


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

	public void setItemCount(Long itemCount) {
		this.itemCount = itemCount;
	}
	public Long getItemCount( ) {
		return this.itemCount;
	}

	public void setItems(List<ArticleDTO> items) {
		this.items = items;
	}
	public List<ArticleDTO> getItems( ) {
		return this.items;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
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
		private static final long serialVersionUID = 6472251199191283812L;
		/**
		 * 文章id
		 */
		@ApiField("article_id")
		private Long articleId;
		/**
		 * 内容
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
		 * 链接
		 */
		@ApiField("url")
		private String url;
	
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
	}
	


}
