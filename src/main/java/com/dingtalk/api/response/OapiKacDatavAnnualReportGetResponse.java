package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.annual_report.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavAnnualReportGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2878856438344865137L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果对象
	 */
	@ApiField("result")
	private AnnualReportResponse result;


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

	public void setResult(AnnualReportResponse result) {
		this.result = result;
	}
	public AnnualReportResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AnnualReportResponse extends TaobaoObject {
		private static final long serialVersionUID = 4185924896169328331L;
		/**
		 * 年累计打卡天数
		 */
		@ApiField("at_check_days_1y")
		private Long atCheckDays1y;
		/**
		 * 年累计智能填表的人次，仅当type=1时有效
		 */
		@ApiField("general_form_user_cnt_1y")
		private Long generalFormUserCnt1y;
		/**
		 * 年累计新增内部群聊数量，仅当type=3时有效
		 */
		@ApiField("inner_group_cnt_1y")
		private Long innerGroupCnt1y;
		/**
		 * 年累计发起视频会议时长（分钟）
		 */
		@ApiField("join_succ_video_conf_len_1y")
		private String joinSuccVideoConfLen1y;
		/**
		 * 年累计参与（含发起）视频会议次数
		 */
		@ApiField("join_succ_video_conf_num_1y")
		private Long joinSuccVideoConfNum1y;
		/**
		 * 年累计参与（含发起）视频会议人次，仅当type=1时有效
		 */
		@ApiField("join_succ_video_conf_user_cnt_1y")
		private Long joinSuccVideoConfUserCnt1y;
		/**
		 * 年累计参与（含发起）语音会议时长（分钟）
		 */
		@ApiField("join_succ_voip_conf_len_1y")
		private String joinSuccVoipConfLen1y;
		/**
		 * 年累计参与（含发起）语音会议次数
		 */
		@ApiField("join_succ_voip_conf_num_1y")
		private Long joinSuccVoipConfNum1y;
		/**
		 * 年累计参与（含发起）语音会议人次，仅当type=1时有效
		 */
		@ApiField("join_succ_voip_conf_user_cnt_1y")
		private Long joinSuccVoipConfUserCnt1y;
		/**
		 * 年累计参与直播次数
		 */
		@ApiField("live_join_succ_cnt_1y")
		private Long liveJoinSuccCnt1y;
		/**
		 * 年累计参与直播时长（分钟）
		 */
		@ApiField("live_join_succ_time_len_1y")
		private String liveJoinSuccTimeLen1y;
		/**
		 * 年累计外勤天数
		 */
		@ApiField("outside_days_1y")
		private Long outsideDays1y;
		/**
		 * 处理审批数
		 */
		@ApiField("process_inst_operate_cnt_1y")
		private Long processInstOperateCnt1y;
		/**
		 * 发起审批数
		 */
		@ApiField("process_inst_submit_cnt_1y")
		private Long processInstSubmitCnt1y;
		/**
		 * 年累计使用的应用数量
		 */
		@ApiField("use_micro_app_cnt_1y")
		private Long useMicroAppCnt1y;
		/**
		 * 年累计使用的应用人数，仅当type=1,2时有效
		 */
		@ApiField("use_micro_user_cnt_1y")
		private Long useMicroUserCnt1y;
	
		public Long getAtCheckDays1y() {
			return this.atCheckDays1y;
		}
		public void setAtCheckDays1y(Long atCheckDays1y) {
			this.atCheckDays1y = atCheckDays1y;
		}
		public Long getGeneralFormUserCnt1y() {
			return this.generalFormUserCnt1y;
		}
		public void setGeneralFormUserCnt1y(Long generalFormUserCnt1y) {
			this.generalFormUserCnt1y = generalFormUserCnt1y;
		}
		public Long getInnerGroupCnt1y() {
			return this.innerGroupCnt1y;
		}
		public void setInnerGroupCnt1y(Long innerGroupCnt1y) {
			this.innerGroupCnt1y = innerGroupCnt1y;
		}
		public String getJoinSuccVideoConfLen1y() {
			return this.joinSuccVideoConfLen1y;
		}
		public void setJoinSuccVideoConfLen1y(String joinSuccVideoConfLen1y) {
			this.joinSuccVideoConfLen1y = joinSuccVideoConfLen1y;
		}
		public Long getJoinSuccVideoConfNum1y() {
			return this.joinSuccVideoConfNum1y;
		}
		public void setJoinSuccVideoConfNum1y(Long joinSuccVideoConfNum1y) {
			this.joinSuccVideoConfNum1y = joinSuccVideoConfNum1y;
		}
		public Long getJoinSuccVideoConfUserCnt1y() {
			return this.joinSuccVideoConfUserCnt1y;
		}
		public void setJoinSuccVideoConfUserCnt1y(Long joinSuccVideoConfUserCnt1y) {
			this.joinSuccVideoConfUserCnt1y = joinSuccVideoConfUserCnt1y;
		}
		public String getJoinSuccVoipConfLen1y() {
			return this.joinSuccVoipConfLen1y;
		}
		public void setJoinSuccVoipConfLen1y(String joinSuccVoipConfLen1y) {
			this.joinSuccVoipConfLen1y = joinSuccVoipConfLen1y;
		}
		public Long getJoinSuccVoipConfNum1y() {
			return this.joinSuccVoipConfNum1y;
		}
		public void setJoinSuccVoipConfNum1y(Long joinSuccVoipConfNum1y) {
			this.joinSuccVoipConfNum1y = joinSuccVoipConfNum1y;
		}
		public Long getJoinSuccVoipConfUserCnt1y() {
			return this.joinSuccVoipConfUserCnt1y;
		}
		public void setJoinSuccVoipConfUserCnt1y(Long joinSuccVoipConfUserCnt1y) {
			this.joinSuccVoipConfUserCnt1y = joinSuccVoipConfUserCnt1y;
		}
		public Long getLiveJoinSuccCnt1y() {
			return this.liveJoinSuccCnt1y;
		}
		public void setLiveJoinSuccCnt1y(Long liveJoinSuccCnt1y) {
			this.liveJoinSuccCnt1y = liveJoinSuccCnt1y;
		}
		public String getLiveJoinSuccTimeLen1y() {
			return this.liveJoinSuccTimeLen1y;
		}
		public void setLiveJoinSuccTimeLen1y(String liveJoinSuccTimeLen1y) {
			this.liveJoinSuccTimeLen1y = liveJoinSuccTimeLen1y;
		}
		public Long getOutsideDays1y() {
			return this.outsideDays1y;
		}
		public void setOutsideDays1y(Long outsideDays1y) {
			this.outsideDays1y = outsideDays1y;
		}
		public Long getProcessInstOperateCnt1y() {
			return this.processInstOperateCnt1y;
		}
		public void setProcessInstOperateCnt1y(Long processInstOperateCnt1y) {
			this.processInstOperateCnt1y = processInstOperateCnt1y;
		}
		public Long getProcessInstSubmitCnt1y() {
			return this.processInstSubmitCnt1y;
		}
		public void setProcessInstSubmitCnt1y(Long processInstSubmitCnt1y) {
			this.processInstSubmitCnt1y = processInstSubmitCnt1y;
		}
		public Long getUseMicroAppCnt1y() {
			return this.useMicroAppCnt1y;
		}
		public void setUseMicroAppCnt1y(Long useMicroAppCnt1y) {
			this.useMicroAppCnt1y = useMicroAppCnt1y;
		}
		public Long getUseMicroUserCnt1y() {
			return this.useMicroUserCnt1y;
		}
		public void setUseMicroUserCnt1y(Long useMicroUserCnt1y) {
			this.useMicroUserCnt1y = useMicroUserCnt1y;
		}
	}
	


}
