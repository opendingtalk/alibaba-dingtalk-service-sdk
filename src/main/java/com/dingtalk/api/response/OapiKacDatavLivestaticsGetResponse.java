package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.livestatics.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavLivestaticsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8287329997325772512L;

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
	 * 统计结果对象
	 */
	@ApiField("result")
	private LiveStatisticsResponse result;

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

	public void setResult(LiveStatisticsResponse result) {
		this.result = result;
	}
	public LiveStatisticsResponse getResult( ) {
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
	 * 返回观看人的UID列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LiveViewerRspModel extends TaobaoObject {
		private static final long serialVersionUID = 2534163311571879995L;
		/**
		 * 观看人的ID
		 */
		@ApiField("open_id")
		private Long openId;
		/**
		 * 观看时长
		 */
		@ApiField("play_duration")
		private Long playDuration;
		/**
		 * 观看回放时长
		 */
		@ApiField("play_record_duration")
		private Long playRecordDuration;
		/**
		 * 观看状态：1：看过 2：没有看过
		 */
		@ApiField("status")
		private Long status;
	
		public Long getOpenId() {
			return this.openId;
		}
		public void setOpenId(Long openId) {
			this.openId = openId;
		}
		public Long getPlayDuration() {
			return this.playDuration;
		}
		public void setPlayDuration(Long playDuration) {
			this.playDuration = playDuration;
		}
		public Long getPlayRecordDuration() {
			return this.playRecordDuration;
		}
		public void setPlayRecordDuration(Long playRecordDuration) {
			this.playRecordDuration = playRecordDuration;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	
	/**
	 * 统计结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LiveStatisticsResponse extends TaobaoObject {
		private static final long serialVersionUID = 4773242727178595711L;
		/**
		 * 所有观看的人员，包括直播和录播
		 */
		@ApiField("all_view_count")
		private Long allViewCount;
		/**
		 * 直播封面
		 */
		@ApiField("cover_url")
		private String coverUrl;
		/**
		 * 直播时长
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 直播开始时间戳，单位ms
		 */
		@ApiField("live_start_time")
		private Long liveStartTime;
		/**
		 * 直播类型；0:普通群直播 1:联播
		 */
		@ApiField("live_type")
		private Long liveType;
		/**
		 * 返回观看人的UID列表
		 */
		@ApiListField("live_viewers")
		@ApiField("live_viewer_rsp_model")
		private List<LiveViewerRspModel> liveViewers;
		/**
		 * 群成员总数
		 */
		@ApiField("member_count")
		private Long memberCount;
		/**
		 * 聊天消息数量
		 */
		@ApiField("message_count")
		private Long messageCount;
		/**
		 * 在线人数
		 */
		@ApiField("online_count")
		private Long onlineCount;
		/**
		 * 点赞数量
		 */
		@ApiField("praise_count")
		private Long praiseCount;
		/**
		 * 观看次数
		 */
		@ApiField("pv")
		private Long pv;
		/**
		 * 录播可见级别 0：全员可见 1：全员不可见
		 */
		@ApiField("record_seen_level")
		private Long recordSeenLevel;
		/**
		 * 录播可见级别原因 1：主播选择全员不可见 2：回放时长不足1分钟
		 */
		@ApiField("record_seen_level_reason")
		private Long recordSeenLevelReason;
		/**
		 * 直播主题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 未看过直播和录播的人员数
		 */
		@ApiField("un_view_all_count")
		private Long unViewAllCount;
		/**
		 * 未观看人数
		 */
		@ApiField("un_viewed_count")
		private Long unViewedCount;
		/**
		 * 观看人数
		 */
		@ApiField("uv")
		private Long uv;
		/**
		 * 观看人数对应到具体人
		 */
		@ApiField("viewer_count")
		private Long viewerCount;
	
		public Long getAllViewCount() {
			return this.allViewCount;
		}
		public void setAllViewCount(Long allViewCount) {
			this.allViewCount = allViewCount;
		}
		public String getCoverUrl() {
			return this.coverUrl;
		}
		public void setCoverUrl(String coverUrl) {
			this.coverUrl = coverUrl;
		}
		public Long getDuration() {
			return this.duration;
		}
		public void setDuration(Long duration) {
			this.duration = duration;
		}
		public Long getLiveStartTime() {
			return this.liveStartTime;
		}
		public void setLiveStartTime(Long liveStartTime) {
			this.liveStartTime = liveStartTime;
		}
		public Long getLiveType() {
			return this.liveType;
		}
		public void setLiveType(Long liveType) {
			this.liveType = liveType;
		}
		public List<LiveViewerRspModel> getLiveViewers() {
			return this.liveViewers;
		}
		public void setLiveViewers(List<LiveViewerRspModel> liveViewers) {
			this.liveViewers = liveViewers;
		}
		public Long getMemberCount() {
			return this.memberCount;
		}
		public void setMemberCount(Long memberCount) {
			this.memberCount = memberCount;
		}
		public Long getMessageCount() {
			return this.messageCount;
		}
		public void setMessageCount(Long messageCount) {
			this.messageCount = messageCount;
		}
		public Long getOnlineCount() {
			return this.onlineCount;
		}
		public void setOnlineCount(Long onlineCount) {
			this.onlineCount = onlineCount;
		}
		public Long getPraiseCount() {
			return this.praiseCount;
		}
		public void setPraiseCount(Long praiseCount) {
			this.praiseCount = praiseCount;
		}
		public Long getPv() {
			return this.pv;
		}
		public void setPv(Long pv) {
			this.pv = pv;
		}
		public Long getRecordSeenLevel() {
			return this.recordSeenLevel;
		}
		public void setRecordSeenLevel(Long recordSeenLevel) {
			this.recordSeenLevel = recordSeenLevel;
		}
		public Long getRecordSeenLevelReason() {
			return this.recordSeenLevelReason;
		}
		public void setRecordSeenLevelReason(Long recordSeenLevelReason) {
			this.recordSeenLevelReason = recordSeenLevelReason;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getUnViewAllCount() {
			return this.unViewAllCount;
		}
		public void setUnViewAllCount(Long unViewAllCount) {
			this.unViewAllCount = unViewAllCount;
		}
		public Long getUnViewedCount() {
			return this.unViewedCount;
		}
		public void setUnViewedCount(Long unViewedCount) {
			this.unViewedCount = unViewedCount;
		}
		public Long getUv() {
			return this.uv;
		}
		public void setUv(Long uv) {
			this.uv = uv;
		}
		public Long getViewerCount() {
			return this.viewerCount;
		}
		public void setViewerCount(Long viewerCount) {
			this.viewerCount = viewerCount;
		}
	}
	


}
