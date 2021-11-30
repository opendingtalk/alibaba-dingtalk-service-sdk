package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpRoleListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2549459125161659797L;

	/** 
	 * result
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 角色列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Roles extends TaobaoObject {
		private static final long serialVersionUID = 5757617327414925165L;
		/**
		 * 角色ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 角色名称
		 */
		@ApiField("role_name")
		private String roleName;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getRoleName() {
			return this.roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
	}
	
	/**
	 * 角色分组列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RoleGroups extends TaobaoObject {
		private static final long serialVersionUID = 8136995996637595316L;
		/**
		 * 角色分组名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 角色列表
		 */
		@ApiListField("roles")
		@ApiField("roles")
		private List<Roles> roles;
	
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public List<Roles> getRoles() {
			return this.roles;
		}
		public void setRoles(List<Roles> roles) {
			this.roles = roles;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 4697815192527553496L;
		/**
		 * 分页是否还有数据
		 */
		@ApiField("has_more")
		private String hasMore;
		/**
		 * 角色分组列表
		 */
		@ApiListField("list")
		@ApiField("role_groups")
		private List<RoleGroups> list;
	
		public String getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(String hasMore) {
			this.hasMore = hasMore;
		}
		public List<RoleGroups> getList() {
			return this.list;
		}
		public void setList(List<RoleGroups> list) {
			this.list = list;
		}
	}
	


}
