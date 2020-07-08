package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.suborg.totaldata.stat response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEnterpriseSuborgTotaldataStatResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7339182756366687322L;

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
	@ApiField("family_doctor_data_vo")
	private List<FamilyDoctorDataVo> result;

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

	public void setResult(List<FamilyDoctorDataVo> result) {
		this.result = result;
	}
	public List<FamilyDoctorDataVo> getResult( ) {
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
	public static class FamilyDoctorDataVo extends TaobaoObject {
		private static final long serialVersionUID = 6213435259156656896L;
		/**
		 * 最近1天活跃率
		 */
		@ApiField("act_ratio_1d")
		private String actRatio1d;
		/**
		 * 最近7天活跃率
		 */
		@ApiField("act_ratio_1w")
		private String actRatio1w;
		/**
		 * 活跃用户数最近1天
		 */
		@ApiField("act_usr_cnt_1d")
		private String actUsrCnt1d;
		/**
		 * 最近7天活跃用户数
		 */
		@ApiField("act_usr_cnt_1w")
		private String actUsrCnt1w;
		/**
		 * 历史截至当日激活会员数
		 */
		@ApiField("active_mbr_cnt_std")
		private String activeMbrCntStd;
		/**
		 * 激活率
		 */
		@ApiField("active_ratio")
		private String activeRatio;
		/**
		 * 企业ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 最近1天钉钉指数
		 */
		@ApiField("ding_index_1d")
		private String dingIndex1d;
		/**
		 * 最近7天钉钉指数
		 */
		@ApiField("ding_index_1w")
		private String dingIndex1w;
		/**
		 * 历史截至当日企业会员数
		 */
		@ApiField("mbr_cnt_std")
		private String mbrCntStd;
		/**
		 * 最近1天使用钉钉微应用用户比率
		 */
		@ApiField("micro_app_use_ratio_1d")
		private String microAppUseRatio1d;
		/**
		 * 最近7天使用钉钉微应用用户比率
		 */
		@ApiField("micro_app_use_ratio_1w")
		private String microAppUseRatio1w;
		/**
		 * 最近1天使用钉钉微应用用户数
		 */
		@ApiField("micro_app_user_cnt_1d")
		private String microAppUserCnt1d;
		/**
		 * 最近7天使用钉钉微应用用户数
		 */
		@ApiField("micro_app_user_cnt_1w")
		private String microAppUserCnt1w;
		/**
		 * 审批模板数
		 */
		@ApiField("pm_form_cnt_001")
		private String pmFormCnt001;
		/**
		 * 自定义模板数
		 */
		@ApiField("pm_form_cnt_002")
		private String pmFormCnt002;
		/**
		 * 自定义模板比率
		 */
		@ApiField("pm_form_self_def_ratio")
		private String pmFormSelfDefRatio;
		/**
		 * 最近1天使用审批用户数
		 */
		@ApiField("process_user_cnt_1d")
		private String processUserCnt1d;
		/**
		 * 最近7天使用审批用户数
		 */
		@ApiField("process_user_cnt_1w")
		private String processUserCnt1w;
		/**
		 * 最近1天使用审批的用户比率
		 */
		@ApiField("process_user_ratio_1d")
		private String processUserRatio1d;
		/**
		 * 最近7天使用审批的用户比率
		 */
		@ApiField("process_user_ratio_1w")
		private String processUserRatio1w;
		/**
		 * 最近1天沟通用户数
		 */
		@ApiField("send_message_user_cnt_1d")
		private String sendMessageUserCnt1d;
		/**
		 * 最近7天沟通用户数
		 */
		@ApiField("send_message_user_cnt_1w")
		private String sendMessageUserCnt1w;
		/**
		 * 最近1天沟通率
		 */
		@ApiField("send_message_user_ratio_1d")
		private String sendMessageUserRatio1d;
		/**
		 * 最近7天沟通率
		 */
		@ApiField("send_message_user_ratio_1w")
		private String sendMessageUserRatio1w;
		/**
		 * 查询时间
		 */
		@ApiField("stat_date")
		private String statDate;
		/**
		 * 所辖组织的地理纬度
		 */
		@ApiField("sub_org_area_lat")
		private String subOrgAreaLat;
		/**
		 * 所辖组织的地理经度
		 */
		@ApiField("sub_org_area_lng")
		private String subOrgAreaLng;
		/**
		 * 所辖组织名称
		 */
		@ApiField("sub_org_name")
		private String subOrgName;
	
		public String getActRatio1d() {
			return this.actRatio1d;
		}
		public void setActRatio1d(String actRatio1d) {
			this.actRatio1d = actRatio1d;
		}
		public String getActRatio1w() {
			return this.actRatio1w;
		}
		public void setActRatio1w(String actRatio1w) {
			this.actRatio1w = actRatio1w;
		}
		public String getActUsrCnt1d() {
			return this.actUsrCnt1d;
		}
		public void setActUsrCnt1d(String actUsrCnt1d) {
			this.actUsrCnt1d = actUsrCnt1d;
		}
		public String getActUsrCnt1w() {
			return this.actUsrCnt1w;
		}
		public void setActUsrCnt1w(String actUsrCnt1w) {
			this.actUsrCnt1w = actUsrCnt1w;
		}
		public String getActiveMbrCntStd() {
			return this.activeMbrCntStd;
		}
		public void setActiveMbrCntStd(String activeMbrCntStd) {
			this.activeMbrCntStd = activeMbrCntStd;
		}
		public String getActiveRatio() {
			return this.activeRatio;
		}
		public void setActiveRatio(String activeRatio) {
			this.activeRatio = activeRatio;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getDingIndex1d() {
			return this.dingIndex1d;
		}
		public void setDingIndex1d(String dingIndex1d) {
			this.dingIndex1d = dingIndex1d;
		}
		public String getDingIndex1w() {
			return this.dingIndex1w;
		}
		public void setDingIndex1w(String dingIndex1w) {
			this.dingIndex1w = dingIndex1w;
		}
		public String getMbrCntStd() {
			return this.mbrCntStd;
		}
		public void setMbrCntStd(String mbrCntStd) {
			this.mbrCntStd = mbrCntStd;
		}
		public String getMicroAppUseRatio1d() {
			return this.microAppUseRatio1d;
		}
		public void setMicroAppUseRatio1d(String microAppUseRatio1d) {
			this.microAppUseRatio1d = microAppUseRatio1d;
		}
		public String getMicroAppUseRatio1w() {
			return this.microAppUseRatio1w;
		}
		public void setMicroAppUseRatio1w(String microAppUseRatio1w) {
			this.microAppUseRatio1w = microAppUseRatio1w;
		}
		public String getMicroAppUserCnt1d() {
			return this.microAppUserCnt1d;
		}
		public void setMicroAppUserCnt1d(String microAppUserCnt1d) {
			this.microAppUserCnt1d = microAppUserCnt1d;
		}
		public String getMicroAppUserCnt1w() {
			return this.microAppUserCnt1w;
		}
		public void setMicroAppUserCnt1w(String microAppUserCnt1w) {
			this.microAppUserCnt1w = microAppUserCnt1w;
		}
		public String getPmFormCnt001() {
			return this.pmFormCnt001;
		}
		public void setPmFormCnt001(String pmFormCnt001) {
			this.pmFormCnt001 = pmFormCnt001;
		}
		public String getPmFormCnt002() {
			return this.pmFormCnt002;
		}
		public void setPmFormCnt002(String pmFormCnt002) {
			this.pmFormCnt002 = pmFormCnt002;
		}
		public String getPmFormSelfDefRatio() {
			return this.pmFormSelfDefRatio;
		}
		public void setPmFormSelfDefRatio(String pmFormSelfDefRatio) {
			this.pmFormSelfDefRatio = pmFormSelfDefRatio;
		}
		public String getProcessUserCnt1d() {
			return this.processUserCnt1d;
		}
		public void setProcessUserCnt1d(String processUserCnt1d) {
			this.processUserCnt1d = processUserCnt1d;
		}
		public String getProcessUserCnt1w() {
			return this.processUserCnt1w;
		}
		public void setProcessUserCnt1w(String processUserCnt1w) {
			this.processUserCnt1w = processUserCnt1w;
		}
		public String getProcessUserRatio1d() {
			return this.processUserRatio1d;
		}
		public void setProcessUserRatio1d(String processUserRatio1d) {
			this.processUserRatio1d = processUserRatio1d;
		}
		public String getProcessUserRatio1w() {
			return this.processUserRatio1w;
		}
		public void setProcessUserRatio1w(String processUserRatio1w) {
			this.processUserRatio1w = processUserRatio1w;
		}
		public String getSendMessageUserCnt1d() {
			return this.sendMessageUserCnt1d;
		}
		public void setSendMessageUserCnt1d(String sendMessageUserCnt1d) {
			this.sendMessageUserCnt1d = sendMessageUserCnt1d;
		}
		public String getSendMessageUserCnt1w() {
			return this.sendMessageUserCnt1w;
		}
		public void setSendMessageUserCnt1w(String sendMessageUserCnt1w) {
			this.sendMessageUserCnt1w = sendMessageUserCnt1w;
		}
		public String getSendMessageUserRatio1d() {
			return this.sendMessageUserRatio1d;
		}
		public void setSendMessageUserRatio1d(String sendMessageUserRatio1d) {
			this.sendMessageUserRatio1d = sendMessageUserRatio1d;
		}
		public String getSendMessageUserRatio1w() {
			return this.sendMessageUserRatio1w;
		}
		public void setSendMessageUserRatio1w(String sendMessageUserRatio1w) {
			this.sendMessageUserRatio1w = sendMessageUserRatio1w;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
		public String getSubOrgAreaLat() {
			return this.subOrgAreaLat;
		}
		public void setSubOrgAreaLat(String subOrgAreaLat) {
			this.subOrgAreaLat = subOrgAreaLat;
		}
		public String getSubOrgAreaLng() {
			return this.subOrgAreaLng;
		}
		public void setSubOrgAreaLng(String subOrgAreaLng) {
			this.subOrgAreaLng = subOrgAreaLng;
		}
		public String getSubOrgName() {
			return this.subOrgName;
		}
		public void setSubOrgName(String subOrgName) {
			this.subOrgName = subOrgName;
		}
	}
	


}
