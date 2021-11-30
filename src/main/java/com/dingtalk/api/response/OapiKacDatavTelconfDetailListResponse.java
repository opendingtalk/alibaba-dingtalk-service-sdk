package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.telconf.detail.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavTelconfDetailListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7578428549866718988L;

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
	private TelConferenceDetailResponse result;


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

	public void setResult(TelConferenceDetailResponse result) {
		this.result = result;
	}
	public TelConferenceDetailResponse getResult( ) {
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
	public static class TelConferenceDetailVo extends TaobaoObject {
		private static final long serialVersionUID = 6444435862814385347L;
		/**
		 * 会议id
		 */
		@ApiField("conf_id")
		private String confId;
		/**
		 * 会议时长（分钟）
		 */
		@ApiField("conf_len_min")
		private String confLenMin;
		/**
		 * 发起人部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 发起人部门
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 会议结束时间
		 */
		@ApiField("end_time")
		private String endTime;
		/**
		 * 参与人数
		 */
		@ApiField("join_user_count")
		private Long joinUserCount;
		/**
		 * 发起人工号
		 */
		@ApiField("staff_job_num")
		private String staffJobNum;
		/**
		 * 发起人姓名
		 */
		@ApiField("staff_name")
		private String staffName;
		/**
		 * 会议开始时间
		 */
		@ApiField("start_time")
		private String startTime;
		/**
		 * 员工在当前企业内的唯一标识，也称staffId。可由企业在创建时指定，并代表一定含义比如工号，创建后不可修改
		 */
		@ApiField("userid")
		private String userid;
	
		public String getConfId() {
			return this.confId;
		}
		public void setConfId(String confId) {
			this.confId = confId;
		}
		public String getConfLenMin() {
			return this.confLenMin;
		}
		public void setConfLenMin(String confLenMin) {
			this.confLenMin = confLenMin;
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
		public String getEndTime() {
			return this.endTime;
		}
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
		public Long getJoinUserCount() {
			return this.joinUserCount;
		}
		public void setJoinUserCount(Long joinUserCount) {
			this.joinUserCount = joinUserCount;
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
		public String getStartTime() {
			return this.startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TelConferenceDetailResponse extends TaobaoObject {
		private static final long serialVersionUID = 6231621172413489313L;
		/**
		 * data
		 */
		@ApiListField("data")
		@ApiField("tel_conference_detail_vo")
		private List<TelConferenceDetailVo> data;
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
	
		public List<TelConferenceDetailVo> getData() {
			return this.data;
		}
		public void setData(List<TelConferenceDetailVo> data) {
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
