package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.dept.telconf.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavDeptTelconfListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4894893965121812181L;

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
	 * resut
	 */
	@ApiField("result")
	private TelConferenceDeptSummaryResponse result;


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

	public void setResult(TelConferenceDeptSummaryResponse result) {
		this.result = result;
	}
	public TelConferenceDeptSummaryResponse getResult( ) {
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
	public static class TelConferenceDeptSummaryVo extends TaobaoObject {
		private static final long serialVersionUID = 3756484213627872499L;
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
		 * 参与人次
		 */
		@ApiField("join_count")
		private Long joinCount;
		/**
		 * 平均时长（分钟）
		 */
		@ApiField("start_avg_len_min")
		private String startAvgLenMin;
		/**
		 * 发起次数
		 */
		@ApiField("start_count")
		private Long startCount;
		/**
		 * 发起总时长（分钟）
		 */
		@ApiField("start_len_min")
		private String startLenMin;
	
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
		public Long getJoinCount() {
			return this.joinCount;
		}
		public void setJoinCount(Long joinCount) {
			this.joinCount = joinCount;
		}
		public String getStartAvgLenMin() {
			return this.startAvgLenMin;
		}
		public void setStartAvgLenMin(String startAvgLenMin) {
			this.startAvgLenMin = startAvgLenMin;
		}
		public Long getStartCount() {
			return this.startCount;
		}
		public void setStartCount(Long startCount) {
			this.startCount = startCount;
		}
		public String getStartLenMin() {
			return this.startLenMin;
		}
		public void setStartLenMin(String startLenMin) {
			this.startLenMin = startLenMin;
		}
	}
	
	/**
	 * resut
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TelConferenceDeptSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 6668685166337979422L;
		/**
		 * data
		 */
		@ApiListField("data")
		@ApiField("tel_conference_dept_summary_vo")
		private List<TelConferenceDeptSummaryVo> data;
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
	
		public List<TelConferenceDeptSummaryVo> getData() {
			return this.data;
		}
		public void setData(List<TelConferenceDeptSummaryVo> data) {
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
