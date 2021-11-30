package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.familydr.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEnterpriseFamilydrListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5546482213621787514L;

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
		private static final long serialVersionUID = 7412626367151418578L;
		/**
		 * 企业ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 二级部门名称
		 */
		@ApiField("dept_name_lv2")
		private String deptNameLv2;
		/**
		 * 三级部门名称
		 */
		@ApiField("dept_name_lv3")
		private String deptNameLv3;
		/**
		 * 最近1天成功发起直播人数
		 */
		@ApiField("live_launch_succ_user_cnt_1d")
		private String liveLaunchSuccUserCnt1d;
		/**
		 * 最近7天成功发起直播人数
		 */
		@ApiField("live_launch_succ_user_cnt_1w")
		private String liveLaunchSuccUserCnt1w;
		/**
		 * 最近1天观看直播人数
		 */
		@ApiField("live_play_user_cnt_1d")
		private String livePlayUserCnt1d;
		/**
		 * 最近7天观看直播人数
		 */
		@ApiField("live_play_user_cnt_1w")
		private String livePlayUserCnt1w;
		/**
		 * 查询时间
		 */
		@ApiField("stat_date")
		private String statDate;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getDeptNameLv2() {
			return this.deptNameLv2;
		}
		public void setDeptNameLv2(String deptNameLv2) {
			this.deptNameLv2 = deptNameLv2;
		}
		public String getDeptNameLv3() {
			return this.deptNameLv3;
		}
		public void setDeptNameLv3(String deptNameLv3) {
			this.deptNameLv3 = deptNameLv3;
		}
		public String getLiveLaunchSuccUserCnt1d() {
			return this.liveLaunchSuccUserCnt1d;
		}
		public void setLiveLaunchSuccUserCnt1d(String liveLaunchSuccUserCnt1d) {
			this.liveLaunchSuccUserCnt1d = liveLaunchSuccUserCnt1d;
		}
		public String getLiveLaunchSuccUserCnt1w() {
			return this.liveLaunchSuccUserCnt1w;
		}
		public void setLiveLaunchSuccUserCnt1w(String liveLaunchSuccUserCnt1w) {
			this.liveLaunchSuccUserCnt1w = liveLaunchSuccUserCnt1w;
		}
		public String getLivePlayUserCnt1d() {
			return this.livePlayUserCnt1d;
		}
		public void setLivePlayUserCnt1d(String livePlayUserCnt1d) {
			this.livePlayUserCnt1d = livePlayUserCnt1d;
		}
		public String getLivePlayUserCnt1w() {
			return this.livePlayUserCnt1w;
		}
		public void setLivePlayUserCnt1w(String livePlayUserCnt1w) {
			this.livePlayUserCnt1w = livePlayUserCnt1w;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
	}
	


}
