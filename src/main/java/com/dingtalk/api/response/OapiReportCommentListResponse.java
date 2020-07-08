package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.comment.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiReportCommentListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3895539522191253279L;

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
	 * 统计结果
	 */
	@ApiField("result")
	private ReportPageVo result;

	/** 
	 * 成功
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

	public void setResult(ReportPageVo result) {
		this.result = result;
	}
	public ReportPageVo getResult( ) {
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
	 * 日志评论详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReportCommentVo extends TaobaoObject {
		private static final long serialVersionUID = 4262353323871281713L;
		/**
		 * 评论内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 评论时间
		 */
		@ApiField("create_time")
		private Date createTime;
		/**
		 * 评论人id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Date getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 统计结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReportPageVo extends TaobaoObject {
		private static final long serialVersionUID = 8234922569454677953L;
		/**
		 * 日志评论详情
		 */
		@ApiListField("comments")
		@ApiField("report_comment_vo")
		private List<ReportCommentVo> comments;
		/**
		 * 是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次分页调用的offset值，当返回结果里没有next_cursor时，表示分页结束
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<ReportCommentVo> getComments() {
			return this.comments;
		}
		public void setComments(List<ReportCommentVo> comments) {
			this.comments = comments;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
