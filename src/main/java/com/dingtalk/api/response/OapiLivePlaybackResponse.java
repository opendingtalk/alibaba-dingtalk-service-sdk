package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.playback response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLivePlaybackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8159141829477661532L;

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
	 * 回放查询响应model
	 */
	@ApiField("result")
	private PlayBackRespModel result;


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

	public void setResult(PlayBackRespModel result) {
		this.result = result;
	}
	public PlayBackRespModel getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 分页查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PlayBackModel extends TaobaoObject {
		private static final long serialVersionUID = 5878419656623662166L;
		/**
		 * 封面图
		 */
		@ApiField("cover_url")
		private String coverUrl;
		/**
		 * 直播结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 简介
		 */
		@ApiField("intro")
		private String intro;
		/**
		 * 横竖屏: false 竖屏, true 横屏(默认)
		 */
		@ApiField("land_scape")
		private Boolean landScape;
		/**
		 * 回放地址
		 */
		@ApiField("playback_url")
		private String playbackUrl;
		/**
		 * 直播可观看类型: false 受限制的直播, true 公开的直播(默认)
		 */
		@ApiField("shared")
		private Boolean shared;
		/**
		 * 直播开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
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
		public String getPlaybackUrl() {
			return this.playbackUrl;
		}
		public void setPlaybackUrl(String playbackUrl) {
			this.playbackUrl = playbackUrl;
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
	
	/**
	 * 回放查询响应model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PlayBackRespModel extends TaobaoObject {
		private static final long serialVersionUID = 7496894679694517671L;
		/**
		 * 结果总数
		 */
		@ApiField("all_count")
		private Long allCount;
		/**
		 * 是否还有
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 偏移量
		 */
		@ApiField("offset")
		private Long offset;
		/**
		 * 页面大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 分页查询结果
		 */
		@ApiListField("play_back_list")
		@ApiField("play_back_model")
		private List<PlayBackModel> playBackList;
	
		public Long getAllCount() {
			return this.allCount;
		}
		public void setAllCount(Long allCount) {
			this.allCount = allCount;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getOffset() {
			return this.offset;
		}
		public void setOffset(Long offset) {
			this.offset = offset;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public List<PlayBackModel> getPlayBackList() {
			return this.playBackList;
		}
		public void setPlayBackList(List<PlayBackModel> playBackList) {
			this.playBackList = playBackList;
		}
	}
	


}
