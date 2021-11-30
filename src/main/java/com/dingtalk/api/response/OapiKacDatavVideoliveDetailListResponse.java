package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.videolive.detail.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavVideoliveDetailListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8148552647897673894L;

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
	 * 结果对象
	 */
	@ApiField("result")
	private VideoLiveDetailResponse result;


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

	public void setResult(VideoLiveDetailResponse result) {
		this.result = result;
	}
	public VideoLiveDetailResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 数据明细列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VideoLiveDetailVo extends TaobaoObject {
		private static final long serialVersionUID = 5477699484383586632L;
		/**
		 * 直播群cid
		 */
		@ApiField("cid")
		private String cid;
		/**
		 * 部门ID
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 直播群名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 群人数
		 */
		@ApiField("group_user_count")
		private Long groupUserCount;
		/**
		 * 观看直播次数
		 */
		@ApiField("live_watch_count")
		private Long liveWatchCount;
		/**
		 * 直播时长（秒）
		 */
		@ApiField("live_watch_duration")
		private String liveWatchDuration;
		/**
		 * 直播结束时间
		 */
		@ApiField("live_watch_end_time")
		private String liveWatchEndTime;
		/**
		 * 直播开始时间
		 */
		@ApiField("live_watch_start_time")
		private String liveWatchStartTime;
		/**
		 * 直播标题
		 */
		@ApiField("live_watch_title")
		private String liveWatchTitle;
		/**
		 * 观看直播人数
		 */
		@ApiField("live_watch_user_count")
		private Long liveWatchUserCount;
		/**
		 * 直播发起人员工工号
		 */
		@ApiField("staff_job_num")
		private String staffJobNum;
		/**
		 * 直播发起人用户名称
		 */
		@ApiField("staff_name")
		private String staffName;
		/**
		 * 员工在当前企业内的唯一标识，也称staffId。可由企业在创建时指定，并代表一定含义比如工号，创建后不可修改
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 直播uuid
		 */
		@ApiField("uuid")
		private String uuid;
	
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Long getGroupUserCount() {
			return this.groupUserCount;
		}
		public void setGroupUserCount(Long groupUserCount) {
			this.groupUserCount = groupUserCount;
		}
		public Long getLiveWatchCount() {
			return this.liveWatchCount;
		}
		public void setLiveWatchCount(Long liveWatchCount) {
			this.liveWatchCount = liveWatchCount;
		}
		public String getLiveWatchDuration() {
			return this.liveWatchDuration;
		}
		public void setLiveWatchDuration(String liveWatchDuration) {
			this.liveWatchDuration = liveWatchDuration;
		}
		public String getLiveWatchEndTime() {
			return this.liveWatchEndTime;
		}
		public void setLiveWatchEndTime(String liveWatchEndTime) {
			this.liveWatchEndTime = liveWatchEndTime;
		}
		public String getLiveWatchStartTime() {
			return this.liveWatchStartTime;
		}
		public void setLiveWatchStartTime(String liveWatchStartTime) {
			this.liveWatchStartTime = liveWatchStartTime;
		}
		public String getLiveWatchTitle() {
			return this.liveWatchTitle;
		}
		public void setLiveWatchTitle(String liveWatchTitle) {
			this.liveWatchTitle = liveWatchTitle;
		}
		public Long getLiveWatchUserCount() {
			return this.liveWatchUserCount;
		}
		public void setLiveWatchUserCount(Long liveWatchUserCount) {
			this.liveWatchUserCount = liveWatchUserCount;
		}
		public String getStaffJobNum() {
			return this.staffJobNum;
		}
		public void setStaffJobNum(String staffJobNum) {
			this.staffJobNum = staffJobNum;
		}
		public String getStaffName() {
			return this.staffName;
		}
		public void setStaffName(String staffName) {
			this.staffName = staffName;
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
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VideoLiveDetailResponse extends TaobaoObject {
		private static final long serialVersionUID = 7119864892845514983L;
		/**
		 * 数据明细列表
		 */
		@ApiListField("data")
		@ApiField("video_live_detail_vo")
		private List<VideoLiveDetailVo> data;
		/**
		 * 是否有下一页；true则存在更多分页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次请求的分页游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<VideoLiveDetailVo> getData() {
			return this.data;
		}
		public void setData(List<VideoLiveDetailVo> data) {
			this.data = data;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
