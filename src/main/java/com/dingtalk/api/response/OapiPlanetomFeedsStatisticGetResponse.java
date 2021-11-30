package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.planetom.feeds.statistic.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiPlanetomFeedsStatisticGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1324511217349456898L;

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
	 * 返回值model
	 */
	@ApiField("result")
	private OpenFeedInfoModel result;

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

	public void setResult(OpenFeedInfoModel result) {
		this.result = result;
	}
	public OpenFeedInfoModel getResult( ) {
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
	 * 返回值model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFeedInfoModel extends TaobaoObject {
		private static final long serialVersionUID = 8813836763581957297L;
		/**
		 * 主播uid
		 */
		@ApiField("anchor_id")
		private String anchorId;
		/**
		 * 绑定群的cid列表
		 */
		@ApiListField("chat_ids")
		@ApiField("string")
		private List<String> chatIds;
		/**
		 * 封面链接
		 */
		@ApiField("cover_url")
		private String coverUrl;
		/**
		 * 直播时长（毫秒）
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 剪辑过后的视频回放地址(含authkey,若空则代表没有经过剪辑)
		 */
		@ApiField("edit_replay_url")
		private String editReplayUrl;
		/**
		 * 直播结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 课程id
		 */
		@ApiField("feed_id")
		private String feedId;
		/**
		 * 课程类型
		 */
		@ApiField("feed_type")
		private Long feedType;
		/**
		 * 是否有回放保存
		 */
		@ApiField("has_play_back")
		private Boolean hasPlayBack;
		/**
		 * 简介
		 */
		@ApiField("introduction")
		private String introduction;
		/**
		 * 跳转链接
		 */
		@ApiField("jump_url")
		private String jumpUrl;
		/**
		 * 回放拉流地址（含authkey）
		 */
		@ApiField("replay_url")
		private String replayUrl;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
		/**
		 * 课程状态
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 直播状态
		 */
		@ApiField("sub_status")
		private Long subStatus;
		/**
		 * 课程标题
		 */
		@ApiField("title")
		private String title;
	
		public String getAnchorId() {
			return this.anchorId;
		}
		public void setAnchorId(String anchorId) {
			this.anchorId = anchorId;
		}
		public List<String> getChatIds() {
			return this.chatIds;
		}
		public void setChatIds(List<String> chatIds) {
			this.chatIds = chatIds;
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
		public String getEditReplayUrl() {
			return this.editReplayUrl;
		}
		public void setEditReplayUrl(String editReplayUrl) {
			this.editReplayUrl = editReplayUrl;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public String getFeedId() {
			return this.feedId;
		}
		public void setFeedId(String feedId) {
			this.feedId = feedId;
		}
		public Long getFeedType() {
			return this.feedType;
		}
		public void setFeedType(Long feedType) {
			this.feedType = feedType;
		}
		public Boolean getHasPlayBack() {
			return this.hasPlayBack;
		}
		public void setHasPlayBack(Boolean hasPlayBack) {
			this.hasPlayBack = hasPlayBack;
		}
		public String getIntroduction() {
			return this.introduction;
		}
		public void setIntroduction(String introduction) {
			this.introduction = introduction;
		}
		public String getJumpUrl() {
			return this.jumpUrl;
		}
		public void setJumpUrl(String jumpUrl) {
			this.jumpUrl = jumpUrl;
		}
		public String getReplayUrl() {
			return this.replayUrl;
		}
		public void setReplayUrl(String replayUrl) {
			this.replayUrl = replayUrl;
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
		public Long getSubStatus() {
			return this.subStatus;
		}
		public void setSubStatus(Long subStatus) {
			this.subStatus = subStatus;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
