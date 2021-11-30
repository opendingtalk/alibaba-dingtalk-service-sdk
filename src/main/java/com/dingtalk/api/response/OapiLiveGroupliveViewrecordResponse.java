package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.viewrecord response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiLiveGroupliveViewrecordResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2675695827238822233L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private QueryLiveViewRecordDetail result;


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

	public void setResult(QueryLiveViewRecordDetail result) {
		this.result = result;
	}
	public QueryLiveViewRecordDetail getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 用户观看记录
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserViewRecordDetailModelList extends TaobaoObject {
		private static final long serialVersionUID = 3617838246485348693L;
		/**
		 * 开始观看时间戳
		 */
		@ApiField("live_begin_unix_time")
		private Long liveBeginUnixTime;
		/**
		 * 结束观看时间戳
		 */
		@ApiField("live_end_unix_time")
		private Long liveEndUnixTime;
		/**
		 * 用户id
		 */
		@ApiField("user_id")
		private String userId;
		/**
		 * 用户名
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 0：直播 1：回放
		 */
		@ApiField("view_type")
		private Long viewType;
		/**
		 * 观看时长，单位s
		 */
		@ApiField("watch_time_second")
		private Long watchTimeSecond;
	
		public Long getLiveBeginUnixTime() {
			return this.liveBeginUnixTime;
		}
		public void setLiveBeginUnixTime(Long liveBeginUnixTime) {
			this.liveBeginUnixTime = liveBeginUnixTime;
		}
		public Long getLiveEndUnixTime() {
			return this.liveEndUnixTime;
		}
		public void setLiveEndUnixTime(Long liveEndUnixTime) {
			this.liveEndUnixTime = liveEndUnixTime;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Long getViewType() {
			return this.viewType;
		}
		public void setViewType(Long viewType) {
			this.viewType = viewType;
		}
		public Long getWatchTimeSecond() {
			return this.watchTimeSecond;
		}
		public void setWatchTimeSecond(Long watchTimeSecond) {
			this.watchTimeSecond = watchTimeSecond;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryLiveViewRecordDetail extends TaobaoObject {
		private static final long serialVersionUID = 8725167344349467888L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 群名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 是否分页拉取完成，true：完成
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 直播uuid
		 */
		@ApiField("live_uuid")
		private String liveUuid;
		/**
		 * 用户观看记录
		 */
		@ApiListField("record_list")
		@ApiField("user_view_record_detail_model_list")
		private List<UserViewRecordDetailModelList> recordList;
		/**
		 * 直播标题
		 */
		@ApiField("title")
		private String title;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public String getLiveUuid() {
			return this.liveUuid;
		}
		public void setLiveUuid(String liveUuid) {
			this.liveUuid = liveUuid;
		}
		public List<UserViewRecordDetailModelList> getRecordList() {
			return this.recordList;
		}
		public void setRecordList(List<UserViewRecordDetailModelList> recordList) {
			this.recordList = recordList;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
