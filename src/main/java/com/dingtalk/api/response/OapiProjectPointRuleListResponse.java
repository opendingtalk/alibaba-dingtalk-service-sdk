package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.project.point.rule.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProjectPointRuleListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2312845486995263679L;

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
	 * 积分（获取增加）规则
	 */
	@ApiListField("result")
	@ApiField("result")
	private List<Result> result;

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

	public void setResult(List<Result> result) {
		this.result = result;
	}
	public List<Result> getResult( ) {
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
	 * 积分（获取/增加）规则
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3814733428216492995L;
		/**
		 * 组织ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 单日计次上限，0表示无上限
		 */
		@ApiField("day_limit_times")
		private Long dayLimitTimes;
		/**
		 * 扩展字段,JSONMap格式
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 分组ID, 默认写入为0
		 */
		@ApiField("group_id")
		private Long groupId;
		/**
		 * 排序ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 规则代码（有唯一约束）
		 */
		@ApiField("rule_code")
		private String ruleCode;
		/**
		 * 规则名称
		 */
		@ApiField("rule_name")
		private String ruleName;
		/**
		 * 分数:正数表示增加负数表示扣减
		 */
		@ApiField("score")
		private Long score;
		/**
		 * 生效状态 0：不生效，1：生效
		 */
		@ApiField("status")
		private Long status;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getDayLimitTimes() {
			return this.dayLimitTimes;
		}
		public void setDayLimitTimes(Long dayLimitTimes) {
			this.dayLimitTimes = dayLimitTimes;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
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
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	


}
