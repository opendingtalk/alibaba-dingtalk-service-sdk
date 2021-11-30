package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.member.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceGroupMemberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1281868516986666428L;

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
	 * 人员列表
	 */
	@ApiField("result")
	private PageResult result;

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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
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
	 * 人员userId列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopGroupMemberVo extends TaobaoObject {
		private static final long serialVersionUID = 2381265517713115711L;
		/**
		 * 0表示需要考勤，1表示无需考勤人员
		 */
		@ApiField("atc_flag")
		private String atcFlag;
		/**
		 * 成员id，可以是userId或deptId
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * 0表示员工，1表示部门
		 */
		@ApiField("type")
		private String type;
	
		public String getAtcFlag() {
			return this.atcFlag;
		}
		public void setAtcFlag(String atcFlag) {
			this.atcFlag = atcFlag;
		}
		public String getMemberId() {
			return this.memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 人员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 8279119874149264424L;
		/**
		 * 游标
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 是否还有
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 人员userId列表
		 */
		@ApiListField("result")
		@ApiField("top_group_member_vo")
		private List<TopGroupMemberVo> result;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<TopGroupMemberVo> getResult() {
			return this.result;
		}
		public void setResult(List<TopGroupMemberVo> result) {
			this.result = result;
		}
	}
	


}
