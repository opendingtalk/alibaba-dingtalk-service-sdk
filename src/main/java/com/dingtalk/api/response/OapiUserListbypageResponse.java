package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.listbypage response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserListbypageResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8768669753216479721L;

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
	 * hasMore
	 */
	@ApiField("hasMore")
	private Boolean hasMore;

	/** 
	 * userlist
	 */
	@ApiListField("userlist")
	@ApiField("userlist")
	private List<Userlist> userlist;


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

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setUserlist(List<Userlist> userlist) {
		this.userlist = userlist;
	}
	public List<Userlist> getUserlist( ) {
		return this.userlist;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * userlist
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Userlist extends TaobaoObject {
		private static final long serialVersionUID = 7398259236243146454L;
		/**
		 * active
		 */
		@ApiField("active")
		private Boolean active;
		/**
		 * avatar
		 */
		@ApiField("avatar")
		private String avatar;
		/**
		 * department
		 */
		@ApiListField("department")
		@ApiField("number")
		private List<Long> department;
		/**
		 * dingId
		 */
		@ApiField("dingId")
		private String dingId;
		/**
		 * email
		 */
		@ApiField("email")
		private String email;
		/**
		 * extattr
		 */
		@ApiField("extattr")
		private String extattr;
		/**
		 * hiredDate
		 */
		@ApiField("hiredDate")
		private Date hiredDate;
		/**
		 * isAdmin
		 */
		@ApiField("isAdmin")
		private Boolean isAdmin;
		/**
		 * isBoss
		 */
		@ApiField("isBoss")
		private Boolean isBoss;
		/**
		 * isHide
		 */
		@ApiField("isHide")
		private Boolean isHide;
		/**
		 * isLeader
		 */
		@ApiField("isLeader")
		private Boolean isLeader;
		/**
		 * jobnumber
		 */
		@ApiField("jobnumber")
		private String jobnumber;
		/**
		 * mobile
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * order
		 */
		@ApiField("order")
		private Long order;
		/**
		 * orgEmail
		 */
		@ApiField("orgEmail")
		private String orgEmail;
		/**
		 * position
		 */
		@ApiField("position")
		private String position;
		/**
		 * remark
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * tel
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * unionid
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * workPlace
		 */
		@ApiField("workPlace")
		private String workPlace;
	
		public Boolean getActive() {
			return this.active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public String getAvatar() {
			return this.avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public List<Long> getDepartment() {
			return this.department;
		}
		public void setDepartment(List<Long> department) {
			this.department = department;
		}
		public String getDingId() {
			return this.dingId;
		}
		public void setDingId(String dingId) {
			this.dingId = dingId;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getExtattr() {
			return this.extattr;
		}
		public void setExtattr(String extattr) {
			this.extattr = extattr;
		}
		public Date getHiredDate() {
			return this.hiredDate;
		}
		public void setHiredDate(Date hiredDate) {
			this.hiredDate = hiredDate;
		}
		public Boolean getIsAdmin() {
			return this.isAdmin;
		}
		public void setIsAdmin(Boolean isAdmin) {
			this.isAdmin = isAdmin;
		}
		public Boolean getIsBoss() {
			return this.isBoss;
		}
		public void setIsBoss(Boolean isBoss) {
			this.isBoss = isBoss;
		}
		public Boolean getIsHide() {
			return this.isHide;
		}
		public void setIsHide(Boolean isHide) {
			this.isHide = isHide;
		}
		public Boolean getIsLeader() {
			return this.isLeader;
		}
		public void setIsLeader(Boolean isLeader) {
			this.isLeader = isLeader;
		}
		public String getJobnumber() {
			return this.jobnumber;
		}
		public void setJobnumber(String jobnumber) {
			this.jobnumber = jobnumber;
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
