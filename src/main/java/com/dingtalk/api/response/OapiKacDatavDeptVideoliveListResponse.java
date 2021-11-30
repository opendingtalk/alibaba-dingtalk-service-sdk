package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.dept.videolive.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavDeptVideoliveListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6393894343322756195L;

	/** 
	 * 结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 提示信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private VideoLiveDeptSummaryResponse result;


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

	public void setResult(VideoLiveDeptSummaryResponse result) {
		this.result = result;
	}
	public VideoLiveDeptSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * data
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VideoLiveDeptSummaryVo extends TaobaoObject {
		private static final long serialVersionUID = 1296484947477759969L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 直播发起次数（成功）
		 */
		@ApiField("live_launch_count")
		private Long liveLaunchCount;
		/**
		 * 观看直播人数
		 */
		@ApiField("live_play_user_count")
		private Long livePlayUserCount;
		/**
		 * 直播时长（分钟）
		 */
		@ApiField("live_time_length")
		private String liveTimeLength;
	
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
		public Long getLiveLaunchCount() {
			return this.liveLaunchCount;
		}
		public void setLiveLaunchCount(Long liveLaunchCount) {
			this.liveLaunchCount = liveLaunchCount;
		}
		public Long getLivePlayUserCount() {
			return this.livePlayUserCount;
		}
		public void setLivePlayUserCount(Long livePlayUserCount) {
			this.livePlayUserCount = livePlayUserCount;
		}
		public String getLiveTimeLength() {
			return this.liveTimeLength;
		}
		public void setLiveTimeLength(String liveTimeLength) {
			this.liveTimeLength = liveTimeLength;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VideoLiveDeptSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 8385749688823677765L;
		/**
		 * data
		 */
		@ApiListField("data")
		@ApiField("video_live_dept_summary_vo")
		private List<VideoLiveDeptSummaryVo> data;
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
	
		public List<VideoLiveDeptSummaryVo> getData() {
			return this.data;
		}
		public void setData(List<VideoLiveDeptSummaryVo> data) {
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
