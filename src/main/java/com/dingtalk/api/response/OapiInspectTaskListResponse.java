package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.inspect.task.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiInspectTaskListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7782268163754775653L;

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
	 * 分页结果
	 */
	@ApiField("result")
	private PageResult result;


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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 巡店任务列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopInspectTaskVo extends TaobaoObject {
		private static final long serialVersionUID = 4476684945427481998L;
		/**
		 * 签到时间戳，单位毫秒
		 */
		@ApiField("check_in_time")
		private Long checkInTime;
		/**
		 * 签退时间戳，单位毫秒
		 */
		@ApiField("check_out_time")
		private Long checkOutTime;
		/**
		 * 巡店时间，单位秒
		 */
		@ApiField("duration")
		private String duration;
		/**
		 * 位置唯一标识，如果是B1等硬件设备则为设备唯一标识
		 */
		@ApiField("position_id")
		private String positionId;
		/**
		 * 位置名称
		 */
		@ApiField("position_name")
		private String positionName;
		/**
		 * 任务状态，1已签到，2已正常签退，3已异常签退
		 */
		@ApiField("status")
		private String status;
		/**
		 * 任务id 唯一标识一个任务
		 */
		@ApiField("task_id")
		private String taskId;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 工作日期时间戳，单位毫秒
		 */
		@ApiField("work_date")
		private Long workDate;
	
		public Long getCheckInTime() {
			return this.checkInTime;
		}
		public void setCheckInTime(Long checkInTime) {
			this.checkInTime = checkInTime;
		}
		public Long getCheckOutTime() {
			return this.checkOutTime;
		}
		public void setCheckOutTime(Long checkOutTime) {
			this.checkOutTime = checkOutTime;
		}
		public String getDuration() {
			return this.duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getPositionId() {
			return this.positionId;
		}
		public void setPositionId(String positionId) {
			this.positionId = positionId;
		}
		public String getPositionName() {
			return this.positionName;
		}
		public void setPositionName(String positionName) {
			this.positionName = positionName;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public Long getWorkDate() {
			return this.workDate;
		}
		public void setWorkDate(Long workDate) {
			this.workDate = workDate;
		}
	}
	
	/**
	 * 分页结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 8537265329147825739L;
		/**
		 * 是否还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 巡店任务列表
		 */
		@ApiListField("list")
		@ApiField("top_inspect_task_vo")
		private List<TopInspectTaskVo> list;
		/**
		 * 游标，下次分页请求使用
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<TopInspectTaskVo> getList() {
			return this.list;
		}
		public void setList(List<TopInspectTaskVo> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
