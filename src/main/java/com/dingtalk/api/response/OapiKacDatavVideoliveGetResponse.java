package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.videolive.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavVideoliveGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5396374729741216962L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 统计数据对象
	 */
	@ApiField("result")
	private VideoLiveSummaryResponse result;


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

	public void setResult(VideoLiveSummaryResponse result) {
		this.result = result;
	}
	public VideoLiveSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 统计数据对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VideoLiveSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 7851739513378336653L;
		/**
		 * 成功发起5分钟直播次数
		 */
		@ApiField("live_launch_succ5min_cnt")
		private Long liveLaunchSucc5minCnt;
		/**
		 * 成功发起直播次数
		 */
		@ApiField("live_launch_succ_cnt")
		private Long liveLaunchSuccCnt;
		/**
		 * 观看直播次数
		 */
		@ApiField("live_play_cnt")
		private Long livePlayCnt;
		/**
		 * 观看直播人数
		 */
		@ApiField("live_play_user_cnt")
		private Long livePlayUserCnt;
		/**
		 * 成功发起直播时长
		 */
		@ApiField("live_succ_time_len")
		private String liveSuccTimeLen;
		/**
		 * 观看人数最多直播的观看人数
		 */
		@ApiField("max_user_cnt")
		private Long maxUserCnt;
		/**
		 * 最近一天看直播的人数（包含观看和回放
		 */
		@ApiField("watch_group_live_user_cnt")
		private Long watchGroupLiveUserCnt;
	
		public Long getLiveLaunchSucc5minCnt() {
			return this.liveLaunchSucc5minCnt;
		}
		public void setLiveLaunchSucc5minCnt(Long liveLaunchSucc5minCnt) {
			this.liveLaunchSucc5minCnt = liveLaunchSucc5minCnt;
		}
		public Long getLiveLaunchSuccCnt() {
			return this.liveLaunchSuccCnt;
		}
		public void setLiveLaunchSuccCnt(Long liveLaunchSuccCnt) {
			this.liveLaunchSuccCnt = liveLaunchSuccCnt;
		}
		public Long getLivePlayCnt() {
			return this.livePlayCnt;
		}
		public void setLivePlayCnt(Long livePlayCnt) {
			this.livePlayCnt = livePlayCnt;
		}
		public Long getLivePlayUserCnt() {
			return this.livePlayUserCnt;
		}
		public void setLivePlayUserCnt(Long livePlayUserCnt) {
			this.livePlayUserCnt = livePlayUserCnt;
		}
		public String getLiveSuccTimeLen() {
			return this.liveSuccTimeLen;
		}
		public void setLiveSuccTimeLen(String liveSuccTimeLen) {
			this.liveSuccTimeLen = liveSuccTimeLen;
		}
		public Long getMaxUserCnt() {
			return this.maxUserCnt;
		}
		public void setMaxUserCnt(Long maxUserCnt) {
			this.maxUserCnt = maxUserCnt;
		}
		public Long getWatchGroupLiveUserCnt() {
			return this.watchGroupLiveUserCnt;
		}
		public void setWatchGroupLiveUserCnt(Long watchGroupLiveUserCnt) {
			this.watchGroupLiveUserCnt = watchGroupLiveUserCnt;
		}
	}
	


}
