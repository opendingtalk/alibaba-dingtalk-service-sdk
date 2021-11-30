package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.auth.group.member.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmAuthGroupMemberListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3317248432547235442L;

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
	 * 员工信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Staff extends TaobaoObject {
		private static final long serialVersionUID = 5594582524358518137L;
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
	 * 部门信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Dept extends TaobaoObject {
		private static final long serialVersionUID = 7126173921984471759L;
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
	 * 角色
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Tag extends TaobaoObject {
		private static final long serialVersionUID = 3526122813585943737L;
		/**
		 * 角色名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 角色id
		 */
		@ApiField("tag_id")
		private Long tagId;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getTagId() {
			return this.tagId;
		}
		public void setTagId(Long tagId) {
			this.tagId = tagId;
		}
	}
	
	/**
	 * 成员信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 5857236184929547547L;
		/**
		 * 是否是全员分组
		 */
		@ApiField("all_member")
		private Boolean allMember;
		/**
		 * 部门信息
		 */
		@ApiListField("dept")
		@ApiField("dept")
		private List<Dept> dept;
		/**
		 * 员工信息
		 */
		@ApiListField("staff")
		@ApiField("staff")
		private List<Staff> staff;
		/**
		 * 角色
		 */
		@ApiListField("tag")
		@ApiField("tag")
		private List<Tag> tag;
	
		public Boolean getAllMember() {
			return this.allMember;
		}
		public void setAllMember(Boolean allMember) {
			this.allMember = allMember;
		}
		public List<Dept> getDept() {
			return this.dept;
		}
		public void setDept(List<Dept> dept) {
			this.dept = dept;
		}
		public List<Staff> getStaff() {
			return this.staff;
		}
		public void setStaff(List<Staff> staff) {
			this.staff = staff;
		}
		public List<Tag> getTag() {
			return this.tag;
		}
		public void setTag(List<Tag> tag) {
			this.tag = tag;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 7352957841621173535L;
		/**
		 * 成员信息
		 */
		@ApiField("member_info")
		private MemberInfo memberInfo;
		/**
		 * 权限组名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 权限组id
		 */
		@ApiField("role_id")
		private Long roleId;
	
		public MemberInfo getMemberInfo() {
			return this.memberInfo;
		}
		public void setMemberInfo(MemberInfo memberInfo) {
			this.memberInfo = memberInfo;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getRoleId() {
			return this.roleId;
		}
		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}
	}
	


}
