package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.blackboard.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiBlackboardGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5278736914443157962L;

	/** 
	 * 请求失败返回错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 请求失败返回错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 出参
	 */
	@ApiField("result")
	private OapiBlackboardVo result;

	/** 
	 * 请求成功
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

	public void setResult(OapiBlackboardVo result) {
		this.result = result;
	}
	public OapiBlackboardVo getResult( ) {
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
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OapiBlackboardVo extends TaobaoObject {
		private static final long serialVersionUID = 5719278259466554642L;
		/**
		 * 公告作者
		 */
		@ApiField("author")
		private String author;
		/**
		 * 公告分类
		 */
		@ApiField("category_id")
		private String categoryId;
		/**
		 * 公告内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 封面图的url链接
		 */
		@ApiField("coverpic_url")
		private String coverpicUrl;
		/**
		 * 接收部门列表
		 */
		@ApiListField("depname_list")
		@ApiField("string")
		private List<String> depnameList;
		/**
		 * 公告创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 公告最后修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 公告id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 保密等级(0：普通公告，20：保密公告)
		 */
		@ApiField("private_level")
		private Long privateLevel;
		/**
		 * 已读人数
		 */
		@ApiField("read_count")
		private Long readCount;
		/**
		 * 公告标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 未读人数
		 */
		@ApiField("unread_count")
		private Long unreadCount;
		/**
		 * 接收人列表
		 */
		@ApiListField("username_list")
		@ApiField("string")
		private List<String> usernameList;
	
		public String getAuthor() {
			return this.author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getCategoryId() {
			return this.categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getCoverpicUrl() {
			return this.coverpicUrl;
		}
		public void setCoverpicUrl(String coverpicUrl) {
			this.coverpicUrl = coverpicUrl;
		}
		public List<String> getDepnameList() {
			return this.depnameList;
		}
		public void setDepnameList(List<String> depnameList) {
			this.depnameList = depnameList;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Long getPrivateLevel() {
			return this.privateLevel;
		}
		public void setPrivateLevel(Long privateLevel) {
			this.privateLevel = privateLevel;
		}
		public Long getReadCount() {
			return this.readCount;
		}
		public void setReadCount(Long readCount) {
			this.readCount = readCount;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getUnreadCount() {
			return this.unreadCount;
		}
		public void setUnreadCount(Long unreadCount) {
			this.unreadCount = unreadCount;
		}
		public List<String> getUsernameList() {
			return this.usernameList;
		}
		public void setUsernameList(List<String> usernameList) {
			this.usernameList = usernameList;
		}
	}
	


}
