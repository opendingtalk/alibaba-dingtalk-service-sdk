package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.schedule.shift.listbydays response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceScheduleShiftListbydaysResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2182122825497232796L;

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
	@ApiListField("result")
	@ApiField("top_day_schedule_shift_vo")
	private List<TopDayScheduleShiftVo> result;

	/** 
	 * 成功标记
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

	public void setResult(List<TopDayScheduleShiftVo> result) {
		this.result = result;
	}
	public List<TopDayScheduleShiftVo> getResult( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopDayScheduleShiftVo extends TaobaoObject {
		private static final long serialVersionUID = 7819122559631727553L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 考勤组id
		 */
		@ApiField("group_id")
		private Long groupId;
		/**
		 * 班次id
		 */
		@ApiListField("shift_ids")
		@ApiField("number")
		private List<Long> shiftIds;
		/**
		 * 班次名称
		 */
		@ApiListField("shift_names")
		@ApiField("string")
		private List<String> shiftNames;
		/**
		 * 班次版本id
		 */
		@ApiListField("shift_versions")
		@ApiField("number")
		private List<Long> shiftVersions;
		/**
		 * 人员userId
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 工作日
		 */
		@ApiField("work_date")
		private Date workDate;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Long getGroupId() {
			return this.groupId;
		}
		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
		public List<Long> getShiftIds() {
			return this.shiftIds;
		}
		public void setShiftIds(List<Long> shiftIds) {
			this.shiftIds = shiftIds;
		}
		public List<String> getShiftNames() {
			return this.shiftNames;
		}
		public void setShiftNames(List<String> shiftNames) {
			this.shiftNames = shiftNames;
		}
		public List<Long> getShiftVersions() {
			return this.shiftVersions;
		}
		public void setShiftVersions(List<Long> shiftVersions) {
			this.shiftVersions = shiftVersions;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public Date getWorkDate() {
			return this.workDate;
		}
		public void setWorkDate(Date workDate) {
			this.workDate = workDate;
		}
	}
	


}
