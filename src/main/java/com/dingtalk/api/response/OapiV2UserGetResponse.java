package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5325825823699939766L;

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
	 * 用户id
	 */
	@ApiField("result")
	private PageResult result;


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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 每个部门的顺序
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrderInDept extends TaobaoObject {
		private static final long serialVersionUID = 8585513798985981124L;
		/**
		 * 部门id
		 */
		@ApiField("detp_id")
		private Long detpId;
		/**
		 * 顺序
		 */
		@ApiField("order")
		private Long order;
	
		public Long getDetpId() {
			return this.detpId;
		}
		public void setDetpId(Long detpId) {
			this.detpId = detpId;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
		}
	}
	
	/**
	 * 每个部门的主管情况
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LeaderInDept extends TaobaoObject {
		private static final long serialVersionUID = 4566285134472789999L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 是否为主管
		 */
		@ApiField("leader")
		private Boolean leader;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Boolean getLeader() {
			return this.leader;
		}
		public void setLeader(Boolean leader) {
			this.leader = leader;
		}
	}
	
	/**
	 * 扩展字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ExtAttr extends TaobaoObject {
		private static final long serialVersionUID = 2648344531823825645L;
		/**
		 * 扩展字段的key
		 */
		@ApiField("key")
		private String key;
		/**
		 * 扩展字段的值
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 角色列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RoleBaseResponse extends TaobaoObject {
		private static final long serialVersionUID = 7235741996216231242L;
		/**
		 * 角色组名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 角色id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 角色名称
		 */
		@ApiField("name")
		private String name;
	
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 用户id
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 3595282587538936116L;
		/**
		 * 是否激活
		 */
		@ApiField("active")
		private Boolean active;
		/**
		 * 是否管理员
		 */
		@ApiField("admin")
		private Boolean admin;
		/**
		 * 联合的unionid
		 */
		@ApiField("associated_union_id")
		private String associatedUnionId;
		/**
		 * 个人头像
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 是否为老板
		 */
		@ApiField("boss")
		private Boolean boss;
		/**
		 * 所属部门列表
		 */
		@ApiListField("department")
		@ApiField("number")
		private List<Long> department;
		/**
		 * 邮箱
		 */
		@ApiField("email")
		private String email;
		/**
		 * 扩展字段
		 */
		@ApiListField("ext_attr_list")
		@ApiField("ext_attr")
		private List<ExtAttr> extAttrList;
		/**
		 * 是否隐藏
		 */
		@ApiField("hide")
		private Boolean hide;
		/**
		 * 入职时间
		 */
		@ApiField("hired_date")
		private Date hiredDate;
		/**
		 * 外部工号
		 */
		@ApiField("job_number")
		private String jobNumber;
		/**
		 * 每个部门的主管情况
		 */
		@ApiListField("leader_in_depts")
		@ApiField("leader_in_dept")
		private List<LeaderInDept> leaderInDepts;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 手机号的hash
		 */
		@ApiField("mobile_hash")
		private String mobileHash;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 个人昵称
		 */
		@ApiField("nickname")
		private String nickname;
		/**
		 * 每个部门的顺序
		 */
		@ApiListField("order_in_depts")
		@ApiField("order_in_dept")
		private List<OrderInDept> orderInDepts;
		/**
		 * 企业邮箱
		 */
		@ApiField("org_email")
		private String orgEmail;
		/**
		 * 职级
		 */
		@ApiField("position")
		private String position;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 角色列表
		 */
		@ApiListField("roles")
		@ApiField("role_base_response")
		private List<RoleBaseResponse> roles;
		/**
		 * 是否为高管
		 */
		@ApiField("senior")
		private Boolean senior;
		/**
		 * 国家码
		 */
		@ApiField("state_code")
		private String stateCode;
		/**
		 * 分机号
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * unionid
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 工作地点
		 */
		@ApiField("work_place")
		private String workPlace;
	
		public Boolean getActive() {
			return this.active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public Boolean getAdmin() {
			return this.admin;
		}
		public void setAdmin(Boolean admin) {
			this.admin = admin;
		}
		public String getAssociatedUnionId() {
			return this.associatedUnionId;
		}
		public void setAssociatedUnionId(String associatedUnionId) {
			this.associatedUnionId = associatedUnionId;
		}
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public Boolean getBoss() {
			return this.boss;
		}
		public void setBoss(Boolean boss) {
			this.boss = boss;
		}
		public List<Long> getDepartment() {
			return this.department;
		}
		public void setDepartment(List<Long> department) {
			this.department = department;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<ExtAttr> getExtAttrList() {
			return this.extAttrList;
		}
		public void setExtAttrList(List<ExtAttr> extAttrList) {
			this.extAttrList = extAttrList;
		}
		public Boolean getHide() {
			return this.hide;
		}
		public void setHide(Boolean hide) {
			this.hide = hide;
		}
		public Date getHiredDate() {
			return this.hiredDate;
		}
		public void setHiredDate(Date hiredDate) {
			this.hiredDate = hiredDate;
		}
		public String getJobNumber() {
			return this.jobNumber;
		}
		public void setJobNumber(String jobNumber) {
			this.jobNumber = jobNumber;
		}
		public List<LeaderInDept> getLeaderInDepts() {
			return this.leaderInDepts;
		}
		public void setLeaderInDepts(List<LeaderInDept> leaderInDepts) {
			this.leaderInDepts = leaderInDepts;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getMobileHash() {
			return this.mobileHash;
		}
		public void setMobileHash(String mobileHash) {
			this.mobileHash = mobileHash;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNickname() {
			return this.nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public List<OrderInDept> getOrderInDepts() {
			return this.orderInDepts;
		}
		public void setOrderInDepts(List<OrderInDept> orderInDepts) {
			this.orderInDepts = orderInDepts;
		}
		public String getOrgEmail() {
			return this.orgEmail;
		}
		public void setOrgEmail(String orgEmail) {
			this.orgEmail = orgEmail;
		}
		public String getPosition() {
			return this.position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public List<RoleBaseResponse> getRoles() {
			return this.roles;
		}
		public void setRoles(List<RoleBaseResponse> roles) {
			this.roles = roles;
		}
		public Boolean getSenior() {
			return this.senior;
		}
		public void setSenior(Boolean senior) {
			this.senior = senior;
		}
		public String getStateCode() {
			return this.stateCode;
		}
		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}
		public String getTel() {
			return this.tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getWorkPlace() {
			return this.workPlace;
		}
		public void setWorkPlace(String workPlace) {
			this.workPlace = workPlace;
		}
	}
	


}
