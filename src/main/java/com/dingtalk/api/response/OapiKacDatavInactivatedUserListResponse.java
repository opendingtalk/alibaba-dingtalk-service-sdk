package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.inactivated.user.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiKacDatavInactivatedUserListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8364267962537494286L;

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
	private UnactivatedUserResponse result;


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

	public void setResult(UnactivatedUserResponse result) {
		this.result = result;
	}
	public UnactivatedUserResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 人员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UnactivatedUserVo extends TaobaoObject {
		private static final long serialVersionUID = 8168978945929965846L;
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
		 * 员工工号
		 */
		@ApiField("staff_job_num")
		private String staffJobNum;
		/**
		 * 员工姓名
		 */
		@ApiField("staff_name")
		private String staffName;
		/**
		 * 员工在当前企业内的唯一标识，也称staffId。可由企业在创建时指定，并代表一定含义比如工号，创建后不可修改
		 */
		@ApiField("userid")
		private String userid;
	
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
	}
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UnactivatedUserResponse extends TaobaoObject {
		private static final long serialVersionUID = 5327692295181122462L;
		/**
		 * 人员列表
		 */
		@ApiListField("data")
		@ApiField("unactivated_user_vo")
		private List<UnactivatedUserVo> data;
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
	
		public List<UnactivatedUserVo> getData() {
			return this.data;
		}
		public void setData(List<UnactivatedUserVo> data) {
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
