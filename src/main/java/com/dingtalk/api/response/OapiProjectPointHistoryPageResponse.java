package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.point.history.page response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProjectPointHistoryPageResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7528775525451391399L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private PageResult result;

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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
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
	public static class PointHistoryDTO extends TaobaoObject {
		private static final long serialVersionUID = 6444961178447796558L;
		/**
		 * 组织ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 创建时间（精确到毫秒数）
		 */
		@ApiField("create_at")
		private Long createAt;
		/**
		 * 对应的行为代码（可空）
		 */
		@ApiField("rule_code")
		private String ruleCode;
		/**
		 * 对应的行为描述
		 */
		@ApiField("rule_name")
		private String ruleName;
		/**
		 * 增加或减少的分数（增加为正数，减少为负数）
		 */
		@ApiField("score")
		private Long score;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 幂等键
		 */
		@ApiField("uuid")
		private String uuid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getCreateAt() {
			return this.createAt;
		}
		public void setCreateAt(Long createAt) {
			this.createAt = createAt;
		}
		public String getRuleCode() {
			return this.ruleCode;
		}
		public void setRuleCode(String ruleCode) {
			this.ruleCode = ruleCode;
		}
		public String getRuleName() {
			return this.ruleName;
		}
		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}
		public Long getScore() {
			return this.score;
		}
		public void setScore(Long score) {
			this.score = score;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 3179872947868841311L;
		/**
		 * 是否有更多数据，如果为false，这表示本次查询没有更多的数据了。
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 结果集数据
		 */
		@ApiListField("list")
		@ApiField("point_history_d_t_o")
		private List<PointHistoryDTO> list;
		/**
		 * 下次游标开始
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<PointHistoryDTO> getList() {
			return this.list;
		}
		public void setList(List<PointHistoryDTO> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
