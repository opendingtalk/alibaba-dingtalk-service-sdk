package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.invite.data.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProjectInviteDataQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1863733354675343516L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 失败原因
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 响应结果
	 */
	@ApiField("result")
	private Result result;

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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
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
	 * 结果集数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InviteDataModel extends TaobaoObject {
		private static final long serialVersionUID = 1879398544112121569L;
		/**
		 * 渠道，"MARKET"表示通过营销的数据，其他是通过系统的方式进入
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 组织机构id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 结果数据，场景ID，sence_id会放在这个地方
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 修改时间，亦用于游标查询
		 */
		@ApiField("gmt_modified")
		private Long gmtModified;
		/**
		 * 邀请人用户id
		 */
		@ApiField("invite_userid")
		private String inviteUserid;
		/**
		 * 加入日期，格式：yyyyMMdd
		 */
		@ApiField("join_at")
		private Long joinAt;
		/**
		 * 状态.0表示无效（包括过程数据），1:表示有效
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 被邀请人用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public Long getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getInviteUserid() {
			return this.inviteUserid;
		}
		public void setInviteUserid(String inviteUserid) {
			this.inviteUserid = inviteUserid;
		}
		public Long getJoinAt() {
			return this.joinAt;
		}
		public void setJoinAt(Long joinAt) {
			this.joinAt = joinAt;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 响应结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 2469344168784895939L;
		/**
		 * 结果集数据
		 */
		@ApiListField("data")
		@ApiField("invite_data_model")
		private List<InviteDataModel> data;
		/**
		 * 是否有更多数据
		 */
		@ApiField("has_more")
		private String hasMore;
		/**
		 * 下次游标开始
		 */
		@ApiField("next_cursor")
		private String nextCursor;
	
		public List<InviteDataModel> getData() {
			return this.data;
		}
		public void setData(List<InviteDataModel> data) {
			this.data = data;
		}
		public String getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(String hasMore) {
			this.hasMore = hasMore;
		}
		public String getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(String nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
