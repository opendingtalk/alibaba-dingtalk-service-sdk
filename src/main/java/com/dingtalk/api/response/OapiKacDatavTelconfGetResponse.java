package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.telconf.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavTelconfGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1732827517157259856L;

	/** 
	 * 结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 提示信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private TelConferenceSummaryResponse result;


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

	public void setResult(TelConferenceSummaryResponse result) {
		this.result = result;
	}
	public TelConferenceSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TelConferenceSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 4676938949231693627L;
		/**
		 * 呼叫成功次数
		 */
		@ApiField("call_count")
		private Long callCount;
		/**
		 * 呼叫成功时长(秒)
		 */
		@ApiField("call_duration")
		private String callDuration;
		/**
		 * 呼叫参与人次
		 */
		@ApiField("call_join_pv")
		private Long callJoinPv;
	
		public Long getCallCount() {
			return this.callCount;
		}
		public void setCallCount(Long callCount) {
			this.callCount = callCount;
		}
		public String getCallDuration() {
			return this.callDuration;
		}
		public void setCallDuration(String callDuration) {
			this.callDuration = callDuration;
		}
		public Long getCallJoinPv() {
			return this.callJoinPv;
		}
		public void setCallJoinPv(Long callJoinPv) {
			this.callJoinPv = callJoinPv;
		}
	}
	


}
