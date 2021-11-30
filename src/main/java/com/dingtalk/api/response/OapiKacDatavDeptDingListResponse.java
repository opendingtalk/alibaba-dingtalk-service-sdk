package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.dept.ding.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavDeptDingListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2529147183316771353L;

	/** 
	 * 错误吗
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * resut
	 */
	@ApiField("result")
	private DingUsageDeptSummaryResponse result;


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

	public void setResult(DingUsageDeptSummaryResponse result) {
		this.result = result;
	}
	public DingUsageDeptSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * data
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingUsageDeptSummaryVo extends TaobaoObject {
		private static final long serialVersionUID = 7467712712624531298L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 最近一天发送应用ding数量
		 */
		@ApiField("ding_app_cnt")
		private Long dingAppCnt;
		/**
		 * 最近一天发送应用ding人数
		 */
		@ApiField("ding_app_user_cnt")
		private Long dingAppUserCnt;
		/**
		 * 最近一天发送电话ding数量
		 */
		@ApiField("ding_call_cnt")
		private Long dingCallCnt;
		/**
		 * 最近一天发送电话ding人数
		 */
		@ApiField("ding_call_user_cnt")
		private Long dingCallUserCnt;
		/**
		 * 最近一天发送ding的数量
		 */
		@ApiField("ding_cnt")
		private Long dingCnt;
		/**
		 * 最近一天发送短信ding数量
		 */
		@ApiField("ding_sms_cnt")
		private Long dingSmsCnt;
		/**
		 * 最近一天发送短信ding人数
		 */
		@ApiField("ding_sms_user_cnt")
		private Long dingSmsUserCnt;
		/**
		 * 最近一天发送ding的人数
		 */
		@ApiField("ding_user_cnt")
		private Long dingUserCnt;
		/**
		 * 最近一天发送语音ding数量
		 */
		@ApiField("ding_voip_cnt")
		private Long dingVoipCnt;
		/**
		 * 最近一天发送语音ding人数
		 */
		@ApiField("ding_voip_user_cnt")
		private Long dingVoipUserCnt;
		/**
		 * 历史累计发钉数
		 */
		@ApiField("send_ding_total_cnt")
		private String sendDingTotalCnt;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public Long getDingAppCnt() {
			return this.dingAppCnt;
		}
		public void setDingAppCnt(Long dingAppCnt) {
			this.dingAppCnt = dingAppCnt;
		}
		public Long getDingAppUserCnt() {
			return this.dingAppUserCnt;
		}
		public void setDingAppUserCnt(Long dingAppUserCnt) {
			this.dingAppUserCnt = dingAppUserCnt;
		}
		public Long getDingCallCnt() {
			return this.dingCallCnt;
		}
		public void setDingCallCnt(Long dingCallCnt) {
			this.dingCallCnt = dingCallCnt;
		}
		public Long getDingCallUserCnt() {
			return this.dingCallUserCnt;
		}
		public void setDingCallUserCnt(Long dingCallUserCnt) {
			this.dingCallUserCnt = dingCallUserCnt;
		}
		public Long getDingCnt() {
			return this.dingCnt;
		}
		public void setDingCnt(Long dingCnt) {
			this.dingCnt = dingCnt;
		}
		public Long getDingSmsCnt() {
			return this.dingSmsCnt;
		}
		public void setDingSmsCnt(Long dingSmsCnt) {
			this.dingSmsCnt = dingSmsCnt;
		}
		public Long getDingSmsUserCnt() {
			return this.dingSmsUserCnt;
		}
		public void setDingSmsUserCnt(Long dingSmsUserCnt) {
			this.dingSmsUserCnt = dingSmsUserCnt;
		}
		public Long getDingUserCnt() {
			return this.dingUserCnt;
		}
		public void setDingUserCnt(Long dingUserCnt) {
			this.dingUserCnt = dingUserCnt;
		}
		public Long getDingVoipCnt() {
			return this.dingVoipCnt;
		}
		public void setDingVoipCnt(Long dingVoipCnt) {
			this.dingVoipCnt = dingVoipCnt;
		}
		public Long getDingVoipUserCnt() {
			return this.dingVoipUserCnt;
		}
		public void setDingVoipUserCnt(Long dingVoipUserCnt) {
			this.dingVoipUserCnt = dingVoipUserCnt;
		}
		public String getSendDingTotalCnt() {
			return this.sendDingTotalCnt;
		}
		public void setSendDingTotalCnt(String sendDingTotalCnt) {
			this.sendDingTotalCnt = sendDingTotalCnt;
		}
	}
	
	/**
	 * resut
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingUsageDeptSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 4123417924451971111L;
		/**
		 * data
		 */
		@ApiListField("data")
		@ApiField("ding_usage_dept_summary_vo")
		private List<DingUsageDeptSummaryVo> data;
		/**
		 * 是否有下一页；true则存在更多分页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次请求的分页游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<DingUsageDeptSummaryVo> getData() {
			return this.data;
		}
		public void setData(List<DingUsageDeptSummaryVo> data) {
			this.data = data;
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
