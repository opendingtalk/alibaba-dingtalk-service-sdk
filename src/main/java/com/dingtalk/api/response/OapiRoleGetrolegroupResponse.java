package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.getrolegroup response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRoleGetrolegroupResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7279213817752686651L;

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
	 * 角色组信息
	 */
	@ApiField("role_group")
	private OpenRoleGroup roleGroup;


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

	public void setRoleGroup(OpenRoleGroup roleGroup) {
		this.roleGroup = roleGroup;
	}
	public OpenRoleGroup getRoleGroup( ) {
		return this.roleGroup;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 角色列表信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRole extends TaobaoObject {
		private static final long serialVersionUID = 3121771343974319915L;
		/**
		 * 角色id
		 */
		@ApiField("role_id")
		private Long roleId;
		/**
		 * 角色名
		 */
		@ApiField("role_name")
		private String roleName;
	
		public Long getRoleId() {
			return this.roleId;
		}
		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return this.roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
	}
	
	/**
	 * 角色组信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRoleGroup extends TaobaoObject {
		private static final long serialVersionUID = 8474165123329873311L;
		/**
		 * 角色组名
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 角色列表信息
		 */
		@ApiListField("roles")
		@ApiField("open_role")
		private List<OpenRole> roles;
	
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public List<OpenRole> getRoles() {
			return this.roles;
		}
		public void setRoles(List<OpenRole> roles) {
			this.roles = roles;
		}
	}
	


}
