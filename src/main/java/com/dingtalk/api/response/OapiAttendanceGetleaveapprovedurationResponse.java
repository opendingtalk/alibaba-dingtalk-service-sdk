package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getleaveapproveduration response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGetleaveapprovedurationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8678641889187324827L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private ApproveDurationForTopVo result;


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

	public void setResult(ApproveDurationForTopVo result) {
		this.result = result;
	}
	public ApproveDurationForTopVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ApproveDurationForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 8862324217122451491L;
		/**
		 * 请假时长（单位分钟）
		 */
		@ApiField("duration_in_minutes")
		private Long durationInMinutes;
	
		public Long getDurationInMinutes() {
			return this.durationInMinutes;
		}
		public void setDurationInMinutes(Long durationInMinutes) {
			this.durationInMinutes = durationInMinutes;
		}
	}
	


}
