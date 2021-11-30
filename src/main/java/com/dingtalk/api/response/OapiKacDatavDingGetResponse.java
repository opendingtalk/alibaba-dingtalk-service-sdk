package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.ding.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavDingGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4589714838216287899L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果对象
	 */
	@ApiField("result")
	private DingUsageSummaryResponse result;


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

	public void setResult(DingUsageSummaryResponse result) {
		this.result = result;
	}
	public DingUsageSummaryResponse getResult( ) {
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
	public static class DingUsageSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 7489128465669428997L;
		/**
		 * 最近一天发送应用DING数
		 */
		@ApiField("ding_app_cnt")
		private Long dingAppCnt;
		/**
		 * 最近一天发送应用DING人数
		 */
		@ApiField("ding_app_user_cnt")
		private Long dingAppUserCnt;
		/**
		 * 最近一天发送电话DING数
		 */
		@ApiField("ding_call_cnt")
		private Long dingCallCnt;
		/**
		 * 最近一天发送电话DING人数
		 */
		@ApiField("ding_call_user_cnt")
		private Long dingCallUserCnt;
		/**
		 * 最近1天发送DING数
		 */
		@ApiField("ding_cnt")
		private Long dingCnt;
		/**
		 * 最近一天发送短信DING数
		 */
		@ApiField("ding_sms_cnt")
		private Long dingSmsCnt;
		/**
		 * 最近一天发送短信DING人数
		 */
		@ApiField("ding_sms_user_cnt")
		private Long dingSmsUserCnt;
		/**
		 * 最近1天发送DING人数
		 */
		@ApiField("ding_user_cnt")
		private Long dingUserCnt;
		/**
		 * 最近一天发送语音DING数
		 */
		@ApiField("ding_voip_cnt")
		private Long dingVoipCnt;
		/**
		 * 最近一天发送语音DING人数
		 */
		@ApiField("ding_voip_user_cnt")
		private Long dingVoipUserCnt;
	
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
	}
	


}
