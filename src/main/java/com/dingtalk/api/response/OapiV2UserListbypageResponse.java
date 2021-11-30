package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.listbypage response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserListbypageResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6524888666935159521L;

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
	 * 扩展属性
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ExtAttr extends TaobaoObject {
		private static final long serialVersionUID = 6398614922845277635L;
		/**
		 * key
		 */
		@ApiField("key")
		private String key;
		/**
		 * 值
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
	 * 列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserSimpleListResponse extends TaobaoObject {
		private static final long serialVersionUID = 8897631213886212539L;
		/**
		 * 表示该用户是否激活了钉钉
		 */
		@ApiField("active")
		private Boolean active;
		/**
		 * 是否是企业的管理员，true表示是，false表示不是
		 */
		@ApiField("admin")
		private Boolean admin;
		/**
		 * 关联的id
		 */
		@ApiField("associated_union_id")
		private String associatedUnionId;
		/**
		 * 个人头像url
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * 是否为企业的老板，true表示是，false表示不是
		 */
		@ApiField("boss")
		private Boolean boss;
		/**
		 * 部门列表
		 */
		@ApiListField("department")
		@ApiField("number")
		private List<Long> department;
		/**
		 * 员工的邮箱
		 */
		@ApiField("email")
		private String email;
		/**
		 * 扩展属性
		 */
		@ApiListField("ext_attr_list")
		@ApiField("ext_attr")
		private List<ExtAttr> extAttrList;
		/**
		 * 是否隐藏号码，true表示是，false表示不是
		 */
		@ApiField("hide")
		private Boolean hide;
		/**
		 * 入职时间
		 */
		@ApiField("hired_date")
		private Date hiredDate;
		/**
		 * 员工工号
		 */
		@ApiField("job_number")
		private String jobNumber;
		/**
		 * 是否是部门的主管，true表示是，false表示不是
		 */
		@ApiField("leader")
		private Boolean leader;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 用户姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 个人昵称
		 */
		@ApiField("nickname")
		private String nickname;
		/**
		 * 表示人员在此部门中的排序，列表是按order的倒序排列输出的，即从大到小排列输出的
		 */
		@ApiField("order")
		private Long order;
		/**
		 * 员工的企业邮箱，如果员工的企业邮箱没有开通，返回信息中不包含
		 */
		@ApiField("org_email")
		private String orgEmail;
		/**
		 * 职位信息
		 */
		@ApiField("position")
		private String position;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 是否高管
		 */
		@ApiField("senior")
		private Boolean senior;
		/**
		 * 国家地区码
		 */
		@ApiField("state_code")
		private String stateCode;
		/**
		 * 分机号
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * 员工在当前开发者企业账号范围内的唯一标识，系统生成，固定值，不会改变
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
		public Boolean getLeader() {
			return this.leader;
		}
		public void setLeader(Boolean leader) {
			this.leader = leader;
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
		public String getNickname() {
			return this.nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public Long getOrder() {
			return this.order;
		}
		public void setOrder(Long order) {
			this.order = order;
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
	
	/**
	 * 用户id
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 8768566581547569453L;
		/**
		 * 是否有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 列表
		 */
		@ApiListField("list")
		@ApiField("user_simple_list_response")
		private List<UserSimpleListResponse> list;
		/**
		 * 下一页开始的偏移量
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public List<UserSimpleListResponse> getList() {
			return this.list;
		}
		public void setList(List<UserSimpleListResponse> list) {
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
