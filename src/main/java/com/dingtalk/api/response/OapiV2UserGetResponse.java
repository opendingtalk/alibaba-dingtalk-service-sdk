package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7543355983658117473L;

	/** 
	 * 错误码。0代表成功。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 业务返回结果
	 */
	@ApiField("result")
	private UserGetResponse result;


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

	public void setResult(UserGetResponse result) {
		this.result = result;
	}
	public UserGetResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 员工在对应的部门中的排序。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptOrder extends TaobaoObject {
		private static final long serialVersionUID = 3863851843972375622L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 员工在部门中的排序。
		 */
		@ApiField("order")
		private Long order;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
		}
	}
	
	/**
	 * 员工在对应的部门中是否领导。
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptLeader extends TaobaoObject {
		private static final long serialVersionUID = 5774413245962862216L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 是否领导
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
	 * 角色列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserRole extends TaobaoObject {
		private static final long serialVersionUID = 4184981891363852626L;
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
	 * 关联映射关系
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UnionEmpMapVo extends TaobaoObject {
		private static final long serialVersionUID = 8651214956284799393L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 关联信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UnionEmpExt extends TaobaoObject {
		private static final long serialVersionUID = 1849175611525359615L;
		/**
		 * 企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 关联映射关系
		 */
		@ApiListField("union_emp_map_list")
		@ApiField("union_emp_map_vo")
		private List<UnionEmpMapVo> unionEmpMapList;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public List<UnionEmpMapVo> getUnionEmpMapList() {
			return this.unionEmpMapList;
		}
		public void setUnionEmpMapList(List<UnionEmpMapVo> unionEmpMapList) {
			this.unionEmpMapList = unionEmpMapList;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 任职信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptPosition extends TaobaoObject {
		private static final long serialVersionUID = 8485554616717989229L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 是否是主任职
		 */
		@ApiField("is_main")
		private Boolean isMain;
		/**
		 * 部门内职位
		 */
		@ApiField("title")
		private String title;
		/**
		 * 部门内工作地
		 */
		@ApiField("work_place")
		private String workPlace;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public Boolean getIsMain() {
			return this.isMain;
		}
		public void setIsMain(Boolean isMain) {
			this.isMain = isMain;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getWorkPlace() {
			return this.workPlace;
		}
		public void setWorkPlace(String workPlace) {
			this.workPlace = workPlace;
		}
	}
	
	/**
	 * 业务返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserGetResponse extends TaobaoObject {
		private static final long serialVersionUID = 8759745685549764454L;
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
		 * 头像
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 是否老板
		 */
		@ApiField("boss")
		private Boolean boss;
		/**
		 * 所属部门id列表
		 */
		@ApiListField("dept_id_list")
		@ApiField("number")
		private List<Long> deptIdList;
		/**
		 * 员工在对应的部门中的排序。
		 */
		@ApiListField("dept_order_list")
		@ApiField("dept_order")
		private List<DeptOrder> deptOrderList;
		/**
		 * 任职信息
		 */
		@ApiListField("dept_position_list")
		@ApiField("dept_position")
		private List<DeptPosition> deptPositionList;
		/**
		 * 员工邮箱
		 */
		@ApiField("email")
		private String email;
		/**
		 * 是否专属帐号
		 */
		@ApiField("exclusive_account")
		private Boolean exclusiveAccount;
		/**
		 * 专属帐号类型：{sso: 企业自定义idp;dingtalk: 钉钉idp}
		 */
		@ApiField("exclusive_account_type")
		private String exclusiveAccountType;
		/**
		 * 扩展属性，长度最大2000个字符。可以设置多种属性（手机上最多显示10个扩展属性，具体显示哪些属性，请到OA管理后台->设置->通讯录信息设置和OA管理后台->设置->手机端显示信息设置）。 该字段的值支持链接类型填写，同时链接支持变量通配符自动替换，目前支持通配符有：userid，corpid。示例： [工位地址](http:www.dingtalk.com?userid=#userid#&corpid=#corpid#)
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 是否号码隐藏。隐藏手机号后，手机号在个人资料页隐藏，但仍可对其发DING、发起钉钉免费商务电话。
		 */
		@ApiField("hide_mobile")
		private Boolean hideMobile;
		/**
		 * 入职时间，Unix时间戳，单位ms。
		 */
		@ApiField("hired_date")
		private Long hiredDate;
		/**
		 * 员工工号
		 */
		@ApiField("job_number")
		private String jobNumber;
		/**
		 * 员工在对应的部门中是否领导。
		 */
		@ApiListField("leader_in_dept")
		@ApiField("dept_leader")
		private List<DeptLeader> leaderInDept;
		/**
		 * 专属帐号登录名
		 */
		@ApiField("login_id")
		private String loginId;
		/**
		 * 主管的ID，仅限企业内部开发调用
		 */
		@ApiField("manager_userid")
		private String managerUserid;
		/**
		 * 手机号码
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 员工名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 员工的企业邮箱
		 */
		@ApiField("org_email")
		private String orgEmail;
		/**
		 * 企业邮箱类型（profession：标准版，base：基础版）
		 */
		@ApiField("org_email_type")
		private String orgEmailType;
		/**
		 * 是否实名认证
		 */
		@ApiField("real_authed")
		private Boolean realAuthed;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 角色列表
		 */
		@ApiListField("role_list")
		@ApiField("user_role")
		private List<UserRole> roleList;
		/**
		 * 是否高管
		 */
		@ApiField("senior")
		private Boolean senior;
		/**
		 * 国际电话区号
		 */
		@ApiField("state_code")
		private String stateCode;
		/**
		 * 分机号
		 */
		@ApiField("telephone")
		private String telephone;
		/**
		 * 职位
		 */
		@ApiField("title")
		private String title;
		/**
		 * 关联信息
		 */
		@ApiField("union_emp_ext")
		private UnionEmpExt unionEmpExt;
		/**
		 * 员工在当前开发者企业账号范围内的唯一标识
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 办公地点
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
		public List<Long> getDeptIdList() {
			return this.deptIdList;
		}
		public void setDeptIdList(List<Long> deptIdList) {
			this.deptIdList = deptIdList;
		}
		public List<DeptOrder> getDeptOrderList() {
			return this.deptOrderList;
		}
		public void setDeptOrderList(List<DeptOrder> deptOrderList) {
			this.deptOrderList = deptOrderList;
		}
		public List<DeptPosition> getDeptPositionList() {
			return this.deptPositionList;
		}
		public void setDeptPositionList(List<DeptPosition> deptPositionList) {
			this.deptPositionList = deptPositionList;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Boolean getExclusiveAccount() {
			return this.exclusiveAccount;
		}
		public void setExclusiveAccount(Boolean exclusiveAccount) {
			this.exclusiveAccount = exclusiveAccount;
		}
		public String getExclusiveAccountType() {
			return this.exclusiveAccountType;
		}
		public void setExclusiveAccountType(String exclusiveAccountType) {
			this.exclusiveAccountType = exclusiveAccountType;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public Boolean getHideMobile() {
			return this.hideMobile;
		}
		public void setHideMobile(Boolean hideMobile) {
			this.hideMobile = hideMobile;
		}
		public Long getHiredDate() {
			return this.hiredDate;
		}
		public void setHiredDate(Long hiredDate) {
			this.hiredDate = hiredDate;
		}
		public String getJobNumber() {
			return this.jobNumber;
		}
		public void setJobNumber(String jobNumber) {
			this.jobNumber = jobNumber;
		}
		public List<DeptLeader> getLeaderInDept() {
			return this.leaderInDept;
		}
		public void setLeaderInDept(List<DeptLeader> leaderInDept) {
			this.leaderInDept = leaderInDept;
		}
		public String getLoginId() {
			return this.loginId;
		}
		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}
		public String getManagerUserid() {
			return this.managerUserid;
		}
		public void setManagerUserid(String managerUserid) {
			this.managerUserid = managerUserid;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOrgEmail() {
			return this.orgEmail;
		}
		public void setOrgEmail(String orgEmail) {
			this.orgEmail = orgEmail;
		}
		public String getOrgEmailType() {
			return this.orgEmailType;
		}
		public void setOrgEmailType(String orgEmailType) {
			this.orgEmailType = orgEmailType;
		}
		public Boolean getRealAuthed() {
			return this.realAuthed;
		}
		public void setRealAuthed(Boolean realAuthed) {
			this.realAuthed = realAuthed;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public List<UserRole> getRoleList() {
			return this.roleList;
		}
		public void setRoleList(List<UserRole> roleList) {
			this.roleList = roleList;
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
		public String getTelephone() {
			return this.telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public UnionEmpExt getUnionEmpExt() {
			return this.unionEmpExt;
		}
		public void setUnionEmpExt(UnionEmpExt unionEmpExt) {
			this.unionEmpExt = unionEmpExt;
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
