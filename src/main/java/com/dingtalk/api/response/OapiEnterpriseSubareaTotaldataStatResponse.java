package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.enterprise.subarea.totaldata.stat response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEnterpriseSubareaTotaldataStatResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2232788791819528682L;

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
	@ApiField("area_stat_data_v_o")
	private List<AreaStatDataVO> result;

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

	public void setResult(List<AreaStatDataVO> result) {
		this.result = result;
	}
	public List<AreaStatDataVO> getResult( ) {
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
	public static class AreaStatDataVO extends TaobaoObject {
		private static final long serialVersionUID = 3462184372687882843L;
		/**
		 * 所辖区域活跃率
		 */
		@ApiField("act_ratio_1d")
		private String actRatio1d;
		/**
		 * 活跃用户数最近1天
		 */
		@ApiField("act_usr_cn_1d")
		private String actUsrCn1d;
		/**
		 * 历史截至当日激活会员数
		 */
		@ApiField("active_mbr_cnt_std")
		private String activeMbrCntStd;
		/**
		 * 所辖区域用户的激活率
		 */
		@ApiField("active_mbr_ratio")
		private String activeMbrRatio;
		/**
		 * 所属城市维度
		 */
		@ApiField("city_lat")
		private String cityLat;
		/**
		 * 所属城市经度
		 */
		@ApiField("city_lng")
		private String cityLng;
		/**
		 * 城市名称
		 */
		@ApiField("city_name")
		private String cityName;
		/**
		 * 企业ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 区县纬度
		 */
		@ApiField("county_lat")
		private String countyLat;
		/**
		 * 区县经度
		 */
		@ApiField("county_lng")
		private String countyLng;
		/**
		 * 城市所在区域
		 */
		@ApiField("county_name")
		private String countyName;
		/**
		 * 历史截至当日企业会员数
		 */
		@ApiField("mbr_cnt_std")
		private String mbrCntStd;
		/**
		 * 所辖区域在线组织数
		 */
		@ApiField("online_org_cnt")
		private String onlineOrgCnt;
		/**
		 * 所辖区域组织覆盖率
		 */
		@ApiField("org_online_ratio")
		private String orgOnlineRatio;
		/**
		 * 所辖区域实际组织数
		 */
		@ApiField("real_org_cnt")
		private String realOrgCnt;
		/**
		 * 发送消息数量
		 */
		@ApiField("send_message_cnt_1d")
		private String sendMessageCnt1d;
		/**
		 * 发送消息人数
		 */
		@ApiField("send_message_user_cnt_1d")
		private String sendMessageUserCnt1d;
		/**
		 * 查询时间
		 */
		@ApiField("stat_date")
		private String statDate;
	
		public String getActRatio1d() {
			return this.actRatio1d;
		}
		public void setActRatio1d(String actRatio1d) {
			this.actRatio1d = actRatio1d;
		}
		public String getActUsrCn1d() {
			return this.actUsrCn1d;
		}
		public void setActUsrCn1d(String actUsrCn1d) {
			this.actUsrCn1d = actUsrCn1d;
		}
		public String getActiveMbrCntStd() {
			return this.activeMbrCntStd;
		}
		public void setActiveMbrCntStd(String activeMbrCntStd) {
			this.activeMbrCntStd = activeMbrCntStd;
		}
		public String getActiveMbrRatio() {
			return this.activeMbrRatio;
		}
		public void setActiveMbrRatio(String activeMbrRatio) {
			this.activeMbrRatio = activeMbrRatio;
		}
		public String getCityLat() {
			return this.cityLat;
		}
		public void setCityLat(String cityLat) {
			this.cityLat = cityLat;
		}
		public String getCityLng() {
			return this.cityLng;
		}
		public void setCityLng(String cityLng) {
			this.cityLng = cityLng;
		}
		public String getCityName() {
			return this.cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getCountyLat() {
			return this.countyLat;
		}
		public void setCountyLat(String countyLat) {
			this.countyLat = countyLat;
		}
		public String getCountyLng() {
			return this.countyLng;
		}
		public void setCountyLng(String countyLng) {
			this.countyLng = countyLng;
		}
		public String getCountyName() {
			return this.countyName;
		}
		public void setCountyName(String countyName) {
			this.countyName = countyName;
		}
		public String getMbrCntStd() {
			return this.mbrCntStd;
		}
		public void setMbrCntStd(String mbrCntStd) {
			this.mbrCntStd = mbrCntStd;
		}
		public String getOnlineOrgCnt() {
			return this.onlineOrgCnt;
		}
		public void setOnlineOrgCnt(String onlineOrgCnt) {
			this.onlineOrgCnt = onlineOrgCnt;
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
		public String getSendMessageCnt1d() {
			return this.sendMessageCnt1d;
		}
		public void setSendMessageCnt1d(String sendMessageCnt1d) {
			this.sendMessageCnt1d = sendMessageCnt1d;
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
