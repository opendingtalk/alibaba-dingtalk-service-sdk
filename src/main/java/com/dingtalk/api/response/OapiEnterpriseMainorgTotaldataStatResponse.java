package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.mainorg.totaldata.stat response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEnterpriseMainorgTotaldataStatResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6667958324354617625L;

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
	 * 系统自动生成
	 */
	@ApiListField("result")
	@ApiField("main_stat_data_vo")
	private List<MainStatDataVo> result;

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

	public void setResult(List<MainStatDataVo> result) {
		this.result = result;
	}
	public List<MainStatDataVo> getResult( ) {
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
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MainStatDataVo extends TaobaoObject {
		private static final long serialVersionUID = 1793277941792796588L;
		/**
		 * 在线组织激活用户数
		 */
		@ApiField("active_mbr_cnt_std")
		private String activeMbrCntStd;
		/**
		 * 全员群数量
		 */
		@ApiField("all_group_cnt")
		private String allGroupCnt;
		/**
		 * 最近1天降低碳排量G
		 */
		@ApiField("carbon_amount_1d")
		private String carbonAmount1d;
		/**
		 * 最近7天降低碳排量G
		 */
		@ApiField("carbon_amount_1w")
		private String carbonAmount1w;
		/**
		 * 企业ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 部门群数量
		 */
		@ApiField("dept_group_cnt")
		private String deptGroupCnt;
		/**
		 * 最近1天钉办节约小时
		 */
		@ApiField("ding_save_hour_1d")
		private String dingSaveHour1d;
		/**
		 * 最近7天钉办节约小时
		 */
		@ApiField("ding_save_hour_1w")
		private String dingSaveHour1w;
		/**
		 * 最近7天发送消息人数
		 */
		@ApiField("end_message_user_cnt_1w")
		private String endMessageUserCnt1w;
		/**
		 * 内部群数量
		 */
		@ApiField("innerGroupCnt")
		private String innerGroupCnt;
		/**
		 * 最近1天成功发起直播次数
		 */
		@ApiField("liveLaunchSuccCnt1d")
		private String liveLaunchSuccCnt1d;
		/**
		 * 最近7天成功发起直播次数
		 */
		@ApiField("liveLaunchSuccCnt1w")
		private String liveLaunchSuccCnt1w;
		/**
		 * 在线组织通讯录人数
		 */
		@ApiField("mbr_cnt_std")
		private String mbrCntStd;
		/**
		 * 最近1天在线会议次数
		 */
		@ApiField("online_conference_cnt_1d")
		private String onlineConferenceCnt1d;
		/**
		 * 最近7天在线会议次数
		 */
		@ApiField("online_conference_cnt_7d")
		private String onlineConferenceCnt7d;
		/**
		 * 在线组织数
		 */
		@ApiField("online_org_nt")
		private String onlineOrgNt;
		/**
		 * 组织覆盖率
		 */
		@ApiField("org_online_ratio")
		private String orgOnlineRatio;
		/**
		 * 实际组织数
		 */
		@ApiField("real_org_cnt")
		private String realOrgCnt;
		/**
		 * 最近1天接收DING的用户数
		 */
		@ApiField("receive_ding_user_cnt_1d")
		private String receiveDingUserCnt1d;
		/**
		 * 最近7天接收DING的用户数
		 */
		@ApiField("receive_ding_user_cnt_1w")
		private String receiveDingUserCnt1w;
		/**
		 * 关联组织数
		 */
		@ApiField("rel_org_nt")
		private String relOrgNt;
		/**
		 * 最近1天发送消息人数
		 */
		@ApiField("send_message_user_cnt_1d")
		private String sendMessageUserCnt1d;
		/**
		 * 统计日期
		 */
		@ApiField("stat_date")
		private String statDate;
	
		public String getActiveMbrCntStd() {
			return this.activeMbrCntStd;
		}
		public void setActiveMbrCntStd(String activeMbrCntStd) {
			this.activeMbrCntStd = activeMbrCntStd;
		}
		public String getAllGroupCnt() {
			return this.allGroupCnt;
		}
		public void setAllGroupCnt(String allGroupCnt) {
			this.allGroupCnt = allGroupCnt;
		}
		public String getCarbonAmount1d() {
			return this.carbonAmount1d;
		}
		public void setCarbonAmount1d(String carbonAmount1d) {
			this.carbonAmount1d = carbonAmount1d;
		}
		public String getCarbonAmount1w() {
			return this.carbonAmount1w;
		}
		public void setCarbonAmount1w(String carbonAmount1w) {
			this.carbonAmount1w = carbonAmount1w;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getDeptGroupCnt() {
			return this.deptGroupCnt;
		}
		public void setDeptGroupCnt(String deptGroupCnt) {
			this.deptGroupCnt = deptGroupCnt;
		}
		public String getDingSaveHour1d() {
			return this.dingSaveHour1d;
		}
		public void setDingSaveHour1d(String dingSaveHour1d) {
			this.dingSaveHour1d = dingSaveHour1d;
		}
		public String getDingSaveHour1w() {
			return this.dingSaveHour1w;
		}
		public void setDingSaveHour1w(String dingSaveHour1w) {
			this.dingSaveHour1w = dingSaveHour1w;
		}
		public String getEndMessageUserCnt1w() {
			return this.endMessageUserCnt1w;
		}
		public void setEndMessageUserCnt1w(String endMessageUserCnt1w) {
			this.endMessageUserCnt1w = endMessageUserCnt1w;
		}
		public String getInnerGroupCnt() {
			return this.innerGroupCnt;
		}
		public void setInnerGroupCnt(String innerGroupCnt) {
			this.innerGroupCnt = innerGroupCnt;
		}
		public String getLiveLaunchSuccCnt1d() {
			return this.liveLaunchSuccCnt1d;
		}
		public void setLiveLaunchSuccCnt1d(String liveLaunchSuccCnt1d) {
			this.liveLaunchSuccCnt1d = liveLaunchSuccCnt1d;
		}
		public String getLiveLaunchSuccCnt1w() {
			return this.liveLaunchSuccCnt1w;
		}
		public void setLiveLaunchSuccCnt1w(String liveLaunchSuccCnt1w) {
			this.liveLaunchSuccCnt1w = liveLaunchSuccCnt1w;
		}
		public String getMbrCntStd() {
			return this.mbrCntStd;
		}
		public void setMbrCntStd(String mbrCntStd) {
			this.mbrCntStd = mbrCntStd;
		}
		public String getOnlineConferenceCnt1d() {
			return this.onlineConferenceCnt1d;
		}
		public void setOnlineConferenceCnt1d(String onlineConferenceCnt1d) {
			this.onlineConferenceCnt1d = onlineConferenceCnt1d;
		}
		public String getOnlineConferenceCnt7d() {
			return this.onlineConferenceCnt7d;
		}
		public void setOnlineConferenceCnt7d(String onlineConferenceCnt7d) {
			this.onlineConferenceCnt7d = onlineConferenceCnt7d;
		}
		public String getOnlineOrgNt() {
			return this.onlineOrgNt;
		}
		public void setOnlineOrgNt(String onlineOrgNt) {
			this.onlineOrgNt = onlineOrgNt;
		}
		public String getOrgOnlineRatio() {
			return this.orgOnlineRatio;
		}
		public void setOrgOnlineRatio(String orgOnlineRatio) {
			this.orgOnlineRatio = orgOnlineRatio;
		}
		public String getRealOrgCnt() {
			return this.realOrgCnt;
		}
		public void setRealOrgCnt(String realOrgCnt) {
			this.realOrgCnt = realOrgCnt;
		}
		public String getReceiveDingUserCnt1d() {
			return this.receiveDingUserCnt1d;
		}
		public void setReceiveDingUserCnt1d(String receiveDingUserCnt1d) {
			this.receiveDingUserCnt1d = receiveDingUserCnt1d;
		}
		public String getReceiveDingUserCnt1w() {
			return this.receiveDingUserCnt1w;
		}
		public void setReceiveDingUserCnt1w(String receiveDingUserCnt1w) {
			this.receiveDingUserCnt1w = receiveDingUserCnt1w;
		}
		public String getRelOrgNt() {
			return this.relOrgNt;
		}
		public void setRelOrgNt(String relOrgNt) {
			this.relOrgNt = relOrgNt;
		}
		public String getSendMessageUserCnt1d() {
			return this.sendMessageUserCnt1d;
		}
		public void setSendMessageUserCnt1d(String sendMessageUserCnt1d) {
			this.sendMessageUserCnt1d = sendMessageUserCnt1d;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
	}
	


}
