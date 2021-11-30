package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5258172978157353513L;

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
	 * 直播查询响应model
	 */
	@ApiField("result")
	private GetDetailRespModel result;


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

	public void setResult(GetDetailRespModel result) {
		this.result = result;
	}
	public GetDetailRespModel getResult( ) {
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
		private static final long serialVersionUID = 7862153365144772587L;
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
	 * 直播查询响应model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetDetailRespModel extends TaobaoObject {
		private static final long serialVersionUID = 4495314717495218765L;
		/**
		 * 预约直播时间
		 */
		@ApiField("appointment_time")
		private Date appointmentTime;
		/**
		 * 直播计划开始时间
		 */
		@ApiField("appt_begin_time")
		private Date apptBeginTime;
		/**
		 * 直播计划结束时间
		 */
		@ApiField("appt_end_time")
		private Date apptEndTime;
		/**
		 * 封面图,16:9长宽比
		 */
		@ApiField("cover_url")
		private String coverUrl;
		/**
		 * 直播结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 推流地址
		 */
		@ApiField("input_stream_url")
		private String inputStreamUrl;
		/**
		 * 简介
		 */
		@ApiField("intro")
		private String intro;
		/**
		 * 横竖屏:false 竖屏, true 横屏(默认)
		 */
		@ApiField("land_scape")
		private Boolean landScape;
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
		 * 预告视频Url
		 */
		@ApiField("pre_video_play_url")
		private String preVideoPlayUrl;
		/**
		 * 直播可观看类型类型:false 受限制的直播, true 公开的直播(默认)
		 */
		@ApiField("shared")
		private Boolean shared;
		/**
		 * 直播开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
		/**
		 * 直播间状态:0 预告, 1 直播中, 2 直播结束
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 直播时长
		 */
		@ApiField("time_length")
		private Long timeLength;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 总共参加人数,UV
		 */
		@ApiField("total_join_count")
		private Long totalJoinCount;
		/**
		 * 总共访问次数,PV
		 */
		@ApiField("total_view_count")
		private Long totalViewCount;
		/**
		 * 别名
		 */
		@ApiField("user_nick")
		private String userNick;
		/**
		 * 主播ID
		 */
		@ApiField("userid")
		private String userid;
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
		public Date getApptBeginTime() {
			return this.apptBeginTime;
		}
		public void setApptBeginTime(Date apptBeginTime) {
			this.apptBeginTime = apptBeginTime;
		}
		public Date getApptEndTime() {
			return this.apptEndTime;
		}
		public void setApptEndTime(Date apptEndTime) {
			this.apptEndTime = apptEndTime;
		}
		public String getCoverUrl() {
			return this.coverUrl;
		}
		public void setCoverUrl(String coverUrl) {
			this.coverUrl = coverUrl;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getInputStreamUrl() {
			return this.inputStreamUrl;
		}
		public void setInputStreamUrl(String inputStreamUrl) {
			this.inputStreamUrl = inputStreamUrl;
		}
		public String getIntro() {
			return this.intro;
		}
		public void setIntro(String intro) {
			this.intro = intro;
		}
		public Boolean getLandScape() {
			return this.landScape;
		}
		public void setLandScape(Boolean landScape) {
			this.landScape = landScape;
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
		public String getPreVideoPlayUrl() {
			return this.preVideoPlayUrl;
		}
		public void setPreVideoPlayUrl(String preVideoPlayUrl) {
			this.preVideoPlayUrl = preVideoPlayUrl;
		}
		public Boolean getShared() {
			return this.shared;
		}
		public void setShared(Boolean shared) {
			this.shared = shared;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getTimeLength() {
			return this.timeLength;
		}
		public void setTimeLength(Long timeLength) {
			this.timeLength = timeLength;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getTotalJoinCount() {
			return this.totalJoinCount;
		}
		public void setTotalJoinCount(Long totalJoinCount) {
			this.totalJoinCount = totalJoinCount;
		}
		public Long getTotalViewCount() {
			return this.totalViewCount;
		}
		public void setTotalViewCount(Long totalViewCount) {
			this.totalViewCount = totalViewCount;
		}
		public String getUserNick() {
			return this.userNick;
		}
		public void setUserNick(String userNick) {
			this.userNick = userNick;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}
	}
	


}
