package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.auth.group.permission.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmAuthGroupPermissionListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4268247249269153352L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误内容
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private Result result;


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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 操作范围
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperateScope extends TaobaoObject {
		private static final long serialVersionUID = 7281213782293984791L;
		/**
		 * 是否有权限
		 */
		@ApiField("has_auth")
		private Boolean hasAuth;
		/**
		 * 操作名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 操作类型
		 */
		@ApiField("type")
		private String type;
	
		public Boolean getHasAuth() {
			return this.hasAuth;
		}
		public void setHasAuth(Boolean hasAuth) {
			this.hasAuth = hasAuth;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 管理部门信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptInfo extends TaobaoObject {
		private static final long serialVersionUID = 7891353716589529312L;
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
	}
	
	/**
	 * 员工信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class StaffInfo extends TaobaoObject {
		private static final long serialVersionUID = 8476873926889638478L;
		/**
		 * 员工名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 员工id
		 */
		@ApiField("staff_id")
		private String staffId;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStaffId() {
			return this.staffId;
		}
		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}
	}
	
	/**
	 * 扩展内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Ext extends TaobaoObject {
		private static final long serialVersionUID = 4712724358541182712L;
		/**
		 * 管理部门信息
		 */
		@ApiListField("dept_info")
		@ApiField("dept_info")
		private List<DeptInfo> deptInfo;
		/**
		 * 员工信息
		 */
		@ApiListField("staff_info")
		@ApiField("staff_info")
		private List<StaffInfo> staffInfo;
	
		public List<DeptInfo> getDeptInfo() {
			return this.deptInfo;
		}
		public void setDeptInfo(List<DeptInfo> deptInfo) {
			this.deptInfo = deptInfo;
		}
		public List<StaffInfo> getStaffInfo() {
			return this.staffInfo;
		}
		public void setStaffInfo(List<StaffInfo> staffInfo) {
			this.staffInfo = staffInfo;
		}
	}
	
	/**
	 * 管理范围
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ManageScope extends TaobaoObject {
		private static final long serialVersionUID = 4542983772325222764L;
		/**
		 * 扩展内容
		 */
		@ApiField("ext")
		private Ext ext;
		/**
		 * 是否有权限
		 */
		@ApiField("has_auth")
		private Boolean hasAuth;
		/**
		 * 管理范围名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 管理范围类型
		 */
		@ApiField("type")
		private String type;
	
		public Ext getExt() {
			return this.ext;
		}
		public void setExt(Ext ext) {
			this.ext = ext;
		}
		public Boolean getHasAuth() {
			return this.hasAuth;
		}
		public void setHasAuth(Boolean hasAuth) {
			this.hasAuth = hasAuth;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 权限内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AuthObjects extends TaobaoObject {
		private static final long serialVersionUID = 8411858291429219733L;
		/**
		 * 表单名称
		 */
		@ApiField("label")
		private String label;
		/**
		 * 管理范围
		 */
		@ApiListField("manage_scope")
		@ApiField("manage_scope")
		private List<ManageScope> manageScope;
		/**
		 * 权限组名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 操作范围
		 */
		@ApiListField("operate_scope")
		@ApiField("operate_scope")
		private List<OperateScope> operateScope;
	
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public List<ManageScope> getManageScope() {
			return this.manageScope;
		}
		public void setManageScope(List<ManageScope> manageScope) {
			this.manageScope = manageScope;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<OperateScope> getOperateScope() {
			return this.operateScope;
		}
		public void setOperateScope(List<OperateScope> operateScope) {
			this.operateScope = operateScope;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4312641448299737963L;
		/**
		 * 权限内容
		 */
		@ApiListField("auth_objects")
		@ApiField("auth_objects")
		private List<AuthObjects> authObjects;
		/**
		 * 权限组id
		 */
		@ApiField("role_id")
		private Long roleId;
	
		public List<AuthObjects> getAuthObjects() {
			return this.authObjects;
		}
		public void setAuthObjects(List<AuthObjects> authObjects) {
			this.authObjects = authObjects;
		}
		public Long getRoleId() {
			return this.roleId;
		}
		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}
	}
	


}
