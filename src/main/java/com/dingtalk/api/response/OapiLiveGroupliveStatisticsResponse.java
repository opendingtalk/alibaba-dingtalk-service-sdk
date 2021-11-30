package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.statistics response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveGroupliveStatisticsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2695842575873397628L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private GroupLiveStatistics result;


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

	public void setResult(GroupLiveStatistics result) {
		this.result = result;
	}
	public GroupLiveStatistics getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 观看列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Groupliveviewers extends TaobaoObject {
		private static final long serialVersionUID = 2235261799526944131L;
		/**
		 * openid
		 */
		@ApiField("open_id")
		private Long openId;
		/**
		 * 直播时长
		 */
		@ApiField("play_duration")
		private Long playDuration;
		/**
		 * 回放时长
		 */
		@ApiField("play_record_duration")
		private Long playRecordDuration;
	
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
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveStatistics extends TaobaoObject {
		private static final long serialVersionUID = 3132611562644849499L;
		/**
		 * 观看列表
		 */
		@ApiListField("group_live_viewers")
		@ApiField("groupliveviewers")
		private List<Groupliveviewers> groupLiveViewers;
		/**
		 * 直播总时长
		 */
		@ApiField("live_duration")
		private Long liveDuration;
		/**
		 * 消息
		 */
		@ApiField("message_count")
		private Long messageCount;
		/**
		 * 点赞
		 */
		@ApiField("praise_count")
		private Long praiseCount;
		/**
		 * pv
		 */
		@ApiField("pv")
		private Long pv;
		/**
		 * 开始时间
		 */
		@ApiField("start_sime")
		private Long startSime;
		/**
		 * 直播标题
		 */
		@ApiField("title")
		private String title;
		/**
		 * 未看数
		 */
		@ApiField("unviewed_count")
		private Long unviewedCount;
		/**
		 * 已看
		 */
		@ApiField("viewer_count")
		private Long viewerCount;
	
		public List<Groupliveviewers> getGroupLiveViewers() {
			return this.groupLiveViewers;
		}
		public void setGroupLiveViewers(List<Groupliveviewers> groupLiveViewers) {
			this.groupLiveViewers = groupLiveViewers;
		}
		public Long getLiveDuration() {
			return this.liveDuration;
		}
		public void setLiveDuration(Long liveDuration) {
			this.liveDuration = liveDuration;
		}
		public Long getMessageCount() {
			return this.messageCount;
		}
		public void setMessageCount(Long messageCount) {
			this.messageCount = messageCount;
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
		public Long getStartSime() {
			return this.startSime;
		}
		public void setStartSime(Long startSime) {
			this.startSime = startSime;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getUnviewedCount() {
			return this.unviewedCount;
		}
		public void setUnviewedCount(Long unviewedCount) {
			this.unviewedCount = unviewedCount;
		}
		public Long getViewerCount() {
			return this.viewerCount;
		}
		public void setViewerCount(Long viewerCount) {
			this.viewerCount = viewerCount;
		}
	}
	


}
