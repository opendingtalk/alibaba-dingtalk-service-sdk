package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5818985346644147294L;

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
	 * 直播创建响应model
	 */
	@ApiField("result")
	private CreateLiveRespModel result;


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

	public void setResult(CreateLiveRespModel result) {
		this.result = result;
	}
	public CreateLiveRespModel getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 转码直播地址
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LiveUrlExtModel extends TaobaoObject {
		private static final long serialVersionUID = 5352497759316325382L;
		/**
		 * 播放地址flv,超清-720p
		 */
		@ApiField("live_url_high")
		private String liveUrlHigh;
		/**
		 * 播放地址flv,标清-360p
		 */
		@ApiField("live_url_low")
		private String liveUrlLow;
		/**
		 * 播放地址flv,高清-480p
		 */
		@ApiField("live_url_normal")
		private String liveUrlNormal;
		/**
		 * 播放地址flv,极速
		 */
		@ApiField("live_url_ultra_low")
		private String liveUrlUltraLow;
		/**
		 * 播放地址flv,流畅
		 */
		@ApiField("live_url_very_low")
		private String liveUrlVeryLow;
	
		public String getLiveUrlHigh() {
			return this.liveUrlHigh;
		}
		public void setLiveUrlHigh(String liveUrlHigh) {
			this.liveUrlHigh = liveUrlHigh;
		}
		public String getLiveUrlLow() {
			return this.liveUrlLow;
		}
		public void setLiveUrlLow(String liveUrlLow) {
			this.liveUrlLow = liveUrlLow;
		}
		public String getLiveUrlNormal() {
			return this.liveUrlNormal;
		}
		public void setLiveUrlNormal(String liveUrlNormal) {
			this.liveUrlNormal = liveUrlNormal;
		}
		public String getLiveUrlUltraLow() {
			return this.liveUrlUltraLow;
		}
		public void setLiveUrlUltraLow(String liveUrlUltraLow) {
			this.liveUrlUltraLow = liveUrlUltraLow;
		}
		public String getLiveUrlVeryLow() {
			return this.liveUrlVeryLow;
		}
		public void setLiveUrlVeryLow(String liveUrlVeryLow) {
			this.liveUrlVeryLow = liveUrlVeryLow;
		}
	}
	
	/**
	 * 直播创建响应model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateLiveRespModel extends TaobaoObject {
		private static final long serialVersionUID = 8577456968315767647L;
		/**
		 * 预约直播时间
		 */
		@ApiField("appointment_time")
		private Date appointmentTime;
		/**
		 * 推流地址
		 */
		@ApiField("input_stream_url")
		private String inputStreamUrl;
		/**
		 * 原始直播地址
		 */
		@ApiField("live_url")
		private String liveUrl;
		/**
		 * 转码直播地址
		 */
		@ApiField("live_url_ext")
		private LiveUrlExtModel liveUrlExt;
		/**
		 * 原始HLS直播地址
		 */
		@ApiField("live_url_hls")
		private String liveUrlHls;
		/**
		 * 直播回放地址
		 */
		@ApiField("playback_url")
		private String playbackUrl;
		/**
		 * 直播UUID
		 */
		@ApiField("uuid")
		private String uuid;
	
		public Date getAppointmentTime() {
			return this.appointmentTime;
		}
		public void setAppointmentTime(Date appointmentTime) {
			this.appointmentTime = appointmentTime;
		}
		public String getInputStreamUrl() {
			return this.inputStreamUrl;
		}
		public void setInputStreamUrl(String inputStreamUrl) {
			this.inputStreamUrl = inputStreamUrl;
		}
		public String getLiveUrl() {
			return this.liveUrl;
		}
		public void setLiveUrl(String liveUrl) {
			this.liveUrl = liveUrl;
		}
		public LiveUrlExtModel getLiveUrlExt() {
			return this.liveUrlExt;
		}
		public void setLiveUrlExt(LiveUrlExtModel liveUrlExt) {
			this.liveUrlExt = liveUrlExt;
		}
		public String getLiveUrlHls() {
			return this.liveUrlHls;
		}
		public void setLiveUrlHls(String liveUrlHls) {
			this.liveUrlHls = liveUrlHls;
		}
		public String getPlaybackUrl() {
			return this.playbackUrl;
		}
		public void setPlaybackUrl(String playbackUrl) {
			this.playbackUrl = playbackUrl;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	


}
