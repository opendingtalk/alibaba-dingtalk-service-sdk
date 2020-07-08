package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.detail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveGroupliveDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4625365168248934865L;

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
	 * 直播详情
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
	 * 查看人员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Groupliveviewers extends TaobaoObject {
		private static final long serialVersionUID = 5142952676939263289L;
		/**
		 * 直播观看时长
		 */
		@ApiField("play_duration")
		private Long playDuration;
		/**
		 * 回放观看时长
		 */
		@ApiField("play_record_duration")
		private Long playRecordDuration;
		/**
		 * 观看用户userid
		 */
		@ApiField("userid")
		private String userid;
	
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
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 直播详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupLiveStatistics extends TaobaoObject {
		private static final long serialVersionUID = 2468683511717726556L;
		/**
		 * 查看人员列表
		 */
		@ApiListField("group_live_viewers")
		@ApiField("groupliveviewers")
		private List<Groupliveviewers> groupLiveViewers;
		/**
		 * 群直播分享url
		 */
		@ApiField("live_share_url")
		private String liveShareUrl;
		/**
		 * 消息数
		 */
		@ApiField("message_count")
		private Long messageCount;
		/**
		 * 点赞数
		 */
		@ApiField("praise_count")
		private Long praiseCount;
		/**
		 * 直播观看人次
		 */
		@ApiField("pv")
		private Long pv;
		/**
		 * 未看人数
		 */
		@ApiField("unviewed_count")
		private Long unviewedCount;
		/**
		 * 已看人数
		 */
		@ApiField("viewer_count")
		private Long viewerCount;
	
		public List<Groupliveviewers> getGroupLiveViewers() {
			return this.groupLiveViewers;
		}
		public void setGroupLiveViewers(List<Groupliveviewers> groupLiveViewers) {
			this.groupLiveViewers = groupLiveViewers;
		}
		public String getLiveShareUrl() {
			return this.liveShareUrl;
		}
		public void setLiveShareUrl(String liveShareUrl) {
			this.liveShareUrl = liveShareUrl;
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
