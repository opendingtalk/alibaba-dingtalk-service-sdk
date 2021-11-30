package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.dept.dau.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavDeptDauListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8148217855434825875L;

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
	 * 结果对象
	 */
	@ApiField("result")
	private DeptDauSummaryResponse result;


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

	public void setResult(DeptDauSummaryResponse result) {
		this.result = result;
	}
	public DeptDauSummaryResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 数据列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptDauSummaryVo extends TaobaoObject {
		private static final long serialVersionUID = 1647367427667426278L;
		/**
		 * 钉钉app端登录人数
		 */
		@ApiField("app_active_users")
		private Long appActiveUsers;
		/**
		 * 通讯录人数
		 */
		@ApiField("contacts_number")
		private Long contactsNumber;
		/**
		 * 日活跃人数
		 */
		@ApiField("daily_active_users")
		private Long dailyActiveUsers;
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
		 * 钉钉pc端登录人数
		 */
		@ApiField("pc_active_users")
		private Long pcActiveUsers;
	
		public Long getAppActiveUsers() {
			return this.appActiveUsers;
		}
		public void setAppActiveUsers(Long appActiveUsers) {
			this.appActiveUsers = appActiveUsers;
		}
		public Long getContactsNumber() {
			return this.contactsNumber;
		}
		public void setContactsNumber(Long contactsNumber) {
			this.contactsNumber = contactsNumber;
		}
		public Long getDailyActiveUsers() {
			return this.dailyActiveUsers;
		}
		public void setDailyActiveUsers(Long dailyActiveUsers) {
			this.dailyActiveUsers = dailyActiveUsers;
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
		public Long getPcActiveUsers() {
			return this.pcActiveUsers;
		}
		public void setPcActiveUsers(Long pcActiveUsers) {
			this.pcActiveUsers = pcActiveUsers;
		}
	}
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptDauSummaryResponse extends TaobaoObject {
		private static final long serialVersionUID = 5547431687484185512L;
		/**
		 * 数据列表
		 */
		@ApiListField("data")
		@ApiField("dept_dau_summary_vo")
		private List<DeptDauSummaryVo> data;
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
	
		public List<DeptDauSummaryVo> getData() {
			return this.data;
		}
		public void setData(List<DeptDauSummaryVo> data) {
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
