package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8578136496648472979L;

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
	 * 返回结果
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
	 * 用户信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ListUserResponse extends TaobaoObject {
		private static final long serialVersionUID = 2335291824619474844L;
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
		 * 员工在部门中的排序。
		 */
		@ApiField("dept_order")
		private Long deptOrder;
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
		 * 专属帐号类型
		 */
		@ApiField("exclusive_account_type")
		private String exclusiveAccountType;
		/**
		 * 扩展属性
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
		 * 是否领导
		 */
		@ApiField("leader")
		private Boolean leader;
		/**
		 * 专属帐号登录名
		 */
		@ApiField("login_id")
		private String loginId;
		/**
		 * 手机号码
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 用户姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 员工的企业邮箱
		 */
		@ApiField("org_email")
		private String orgEmail;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
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
		public Long getDeptOrder() {
			return this.deptOrder;
		}
		public void setDeptOrder(Long deptOrder) {
			this.deptOrder = deptOrder;
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
		public Boolean getLeader() {
			return this.leader;
		}
		public void setLeader(Boolean leader) {
			this.leader = leader;
		}
		public String getLoginId() {
			return this.loginId;
		}
		public void setLoginId(String loginId) {
			this.loginId = loginId;
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
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
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
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 5441448555729655152L;
		/**
		 * 是否还有更多的数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 用户信息列表
		 */
		@ApiListField("list")
		@ApiField("list_user_response")
		private List<ListUserResponse> list;
		/**
		 * 下一次分页的游标，如果has_more为false，表示没有更多的分页数据
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<ListUserResponse> getList() {
			return this.list;
		}
		public void setList(List<ListUserResponse> list) {
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
