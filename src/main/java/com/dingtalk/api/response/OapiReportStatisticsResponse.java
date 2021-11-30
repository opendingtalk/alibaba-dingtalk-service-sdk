package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.statistics response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiReportStatisticsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6455888349899683755L;

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
	private ReportStatisticsVo result;

	/** 
	 * 是否成功
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

	public void setResult(ReportStatisticsVo result) {
		this.result = result;
	}
	public ReportStatisticsVo getResult( ) {
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
	 * 统计结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReportStatisticsVo extends TaobaoObject {
		private static final long serialVersionUID = 1757258752254232939L;
		/**
		 * 评论个数
		 */
		@ApiField("comment_num")
		private Long commentNum;
		/**
		 * 评论人数，去重
		 */
		@ApiField("comment_user_num")
		private Long commentUserNum;
		/**
		 * 点赞人数
		 */
		@ApiField("like_num")
		private Long likeNum;
		/**
		 * 已读人数
		 */
		@ApiField("read_num")
		private Long readNum;
	
		public Long getCommentNum() {
			return this.commentNum;
		}
		public void setCommentNum(Long commentNum) {
			this.commentNum = commentNum;
		}
		public Long getCommentUserNum() {
			return this.commentUserNum;
		}
		public void setCommentUserNum(Long commentUserNum) {
			this.commentUserNum = commentUserNum;
		}
		public Long getLikeNum() {
			return this.likeNum;
		}
		public void setLikeNum(Long likeNum) {
			this.likeNum = likeNum;
		}
		public Long getReadNum() {
			return this.readNum;
		}
		public void setReadNum(Long readNum) {
			this.readNum = readNum;
		}
	}
	


}
