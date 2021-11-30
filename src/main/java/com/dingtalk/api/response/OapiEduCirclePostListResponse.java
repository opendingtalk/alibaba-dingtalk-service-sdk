package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.circle.post.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCirclePostListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3276555294212643511L;

	/** 
	 * 1
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 系统自动生成
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 系统自动生成
	 */
	@ApiField("result")
	private OpenCircleTopicResponse result;

	/** 
	 * 系统自动生成
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(OpenCircleTopicResponse result) {
		this.result = result;
	}
	public OpenCircleTopicResponse getResult( ) {
		return this.result;
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
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgUserDto extends TaobaoObject {
		private static final long serialVersionUID = 1537156366233471273L;
		/**
		 * 1
		 */
		@ApiField("show_name")
		private String showName;
		/**
		 * 1
		 */
		@ApiField("staff_id")
		private String staffId;
	
		public String getShowName() {
			return this.showName;
		}
		public void setShowName(String showName) {
			this.showName = showName;
		}
		public String getStaffId() {
			return this.staffId;
		}
		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Comments extends TaobaoObject {
		private static final long serialVersionUID = 1146439843191347838L;
		/**
		 * 1
		 */
		@ApiField("comment_id")
		private Long commentId;
		/**
		 * 1
		 */
		@ApiField("content")
		private String content;
		/**
		 * 1
		 */
		@ApiField("origin_user")
		private OrgUserDto originUser;
	
		public Long getCommentId() {
			return this.commentId;
		}
		public void setCommentId(Long commentId) {
			this.commentId = commentId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public OrgUserDto getOriginUser() {
			return this.originUser;
		}
		public void setOriginUser(OrgUserDto originUser) {
			this.originUser = originUser;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Author extends TaobaoObject {
		private static final long serialVersionUID = 6615186953462926999L;
		/**
		 * 1
		 */
		@ApiField("avatar_media_id")
		private String avatarMediaId;
		/**
		 * 1
		 */
		@ApiField("icon_media_id")
		private String iconMediaId;
		/**
		 * 1
		 */
		@ApiField("is_owner")
		private Boolean isOwner;
		/**
		 * 1
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 1
		 */
		@ApiField("owner")
		private Boolean owner;
		/**
		 * 1
		 */
		@ApiField("show_name")
		private String showName;
		/**
		 * 1
		 */
		@ApiField("staff_id")
		private String staffId;
		/**
		 * 1
		 */
		@ApiField("tag")
		private Long tag;
		/**
		 * 1
		 */
		@ApiField("title")
		private String title;
		/**
		 * 1
		 */
		@ApiField("type")
		private String type;
		/**
		 * 1
		 */
		@ApiField("user_role")
		private String userRole;
	
		public String getAvatarMediaId() {
			return this.avatarMediaId;
		}
		public void setAvatarMediaId(String avatarMediaId) {
			this.avatarMediaId = avatarMediaId;
		}
		public String getIconMediaId() {
			return this.iconMediaId;
		}
		public void setIconMediaId(String iconMediaId) {
			this.iconMediaId = iconMediaId;
		}
		public Boolean getIsOwner() {
			return this.isOwner;
		}
		public void setIsOwner(Boolean isOwner) {
			this.isOwner = isOwner;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public Boolean getOwner() {
			return this.owner;
		}
		public void setOwner(Boolean owner) {
			this.owner = owner;
		}
		public String getShowName() {
			return this.showName;
		}
		public void setShowName(String showName) {
			this.showName = showName;
		}
		public String getStaffId() {
			return this.staffId;
		}
		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}
		public Long getTag() {
			return this.tag;
		}
		public void setTag(Long tag) {
			this.tag = tag;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUserRole() {
			return this.userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Content extends TaobaoObject {
		private static final long serialVersionUID = 6179821545312741833L;
		/**
		 * 1
		 */
		@ApiField("content_type")
		private Long contentType;
		/**
		 * 1
		 */
		@ApiField("geo_content")
		private String geoContent;
		/**
		 * 1
		 */
		@ApiField("text")
		private String text;
	
		public Long getContentType() {
			return this.contentType;
		}
		public void setContentType(Long contentType) {
			this.contentType = contentType;
		}
		public String getGeoContent() {
			return this.geoContent;
		}
		public void setGeoContent(String geoContent) {
			this.geoContent = geoContent;
		}
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Posts extends TaobaoObject {
		private static final long serialVersionUID = 1237783377568917513L;
		/**
		 * 1
		 */
		@ApiField("author")
		private Author author;
		/**
		 * 1
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 1
		 */
		@ApiListField("comments")
		@ApiField("comments")
		private List<Comments> comments;
		/**
		 * 1
		 */
		@ApiField("content")
		private Content content;
		/**
		 * 1
		 */
		@ApiField("create_at")
		private Long createAt;
		/**
		 * 1
		 */
		@ApiField("feed_type")
		private Long feedType;
		/**
		 * 1
		 */
		@ApiField("post_id")
		private Long postId;
		/**
		 * 1
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 1
		 */
		@ApiField("tags")
		private String tags;
	
		public Author getAuthor() {
			return this.author;
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public List<Comments> getComments() {
			return this.comments;
		}
		public void setComments(List<Comments> comments) {
			this.comments = comments;
		}
		public Content getContent() {
			return this.content;
		}
		public void setContent(Content content) {
			this.content = content;
		}
		public Long getCreateAt() {
			return this.createAt;
		}
		public void setCreateAt(Long createAt) {
			this.createAt = createAt;
		}
		public Long getFeedType() {
			return this.feedType;
		}
		public void setFeedType(Long feedType) {
			this.feedType = feedType;
		}
		public Long getPostId() {
			return this.postId;
		}
		public void setPostId(Long postId) {
			this.postId = postId;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getTags() {
			return this.tags;
		}
		public void setTags(String tags) {
			this.tags = tags;
		}
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCircleTopicResponse extends TaobaoObject {
		private static final long serialVersionUID = 1264814646352237814L;
		/**
		 * 1
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 1
		 */
		@ApiListField("posts")
		@ApiField("posts")
		private List<Posts> posts;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<Posts> getPosts() {
			return this.posts;
		}
		public void setPosts(List<Posts> posts) {
			this.posts = posts;
		}
	}
	


}
