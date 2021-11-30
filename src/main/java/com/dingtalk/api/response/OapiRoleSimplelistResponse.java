package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.simplelist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRoleSimplelistResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3675351438562417312L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private PageVo result;


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

	public void setResult(PageVo result) {
		this.result = result;
	}
	public PageVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 管理范围
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgDeptVo extends TaobaoObject {
		private static final long serialVersionUID = 8521134254157321382L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门名称
		 */
		@ApiField("name")
		private String name;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenEmpSimple extends TaobaoObject {
		private static final long serialVersionUID = 3836223481818184775L;
		/**
		 * 管理范围
		 */
		@ApiListField("manageScopes")
		@ApiField("org_dept_vo")
		private List<OrgDeptVo> manageScopes;
		/**
		 * 员工姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<OrgDeptVo> getManageScopes() {
			return this.manageScopes;
		}
		public void setManageScopes(List<OrgDeptVo> manageScopes) {
			this.manageScopes = manageScopes;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
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
	public static class PageVo extends TaobaoObject {
		private static final long serialVersionUID = 7137889313738644749L;
		/**
		 * 后面是否还有数据
		 */
		@ApiField("hasMore")
		private Boolean hasMore;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("open_emp_simple")
		private List<OpenEmpSimple> list;
		/**
		 * 下次拉取数据的游标
		 */
		@ApiField("nextCursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<OpenEmpSimple> getList() {
			return this.list;
		}
		public void setList(List<OpenEmpSimple> list) {
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
