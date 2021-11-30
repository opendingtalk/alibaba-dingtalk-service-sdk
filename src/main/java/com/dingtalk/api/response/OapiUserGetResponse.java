package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3387532165761393481L;

	/** 
	 * active
	 */
	@ApiField("active")
	private Boolean active;

	/** 
	 * associatedUnionId
	 */
	@ApiField("associatedUnionId")
	private String associatedUnionId;

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
	 * inviteMobile
	 */
	@ApiField("inviteMobile")
	private String inviteMobile;

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
	 * isCustomizedPortal
	 */
	@ApiField("isCustomizedPortal")
	private Boolean isCustomizedPortal;

	/** 
	 * isHide
	 */
	@ApiField("isHide")
	private Boolean isHide;

	/** 
	 * isLeaderInDepts
	 */
	@ApiField("isLeaderInDepts")
	private String isLeaderInDepts;

	/** 
	 * isLimited
	 */
	@ApiField("isLimited")
	private Boolean isLimited;

	/** 
	 * isSenior
	 */
	@ApiField("isSenior")
	private Boolean isSenior;

	/** 
	 * jobnumber
	 */
	@ApiField("jobnumber")
	private String jobnumber;

	/** 
	 * mana
	 */
	@ApiField("managerUserId")
	private String managerUserId;

	/** 
	 * memberView
	 */
	@ApiField("memberView")
	private Boolean memberView;

	/** 
	 * mobile
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * mobileHash
	 */
	@ApiField("mobileHash")
	private String mobileHash;

	/** 
	 * name
	 */
	@ApiField("name")
	private String name;

	/** 
	 * nickname
	 */
	@ApiField("nickname")
	private String nickname;

	/** 
	 * openId
	 */
	@ApiField("openId")
	private String openId;

	/** 
	 * orderInDepts
	 */
	@ApiField("orderInDepts")
	private String orderInDepts;

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
	 * realAuthed
	 */
	@ApiField("realAuthed")
	private Boolean realAuthed;

	/** 
	 * remark
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * roles
	 */
	@ApiListField("roles")
	@ApiField("roles")
	private List<Roles> roles;

	/** 
	 * stateCode
	 */
	@ApiField("stateCode")
	private String stateCode;

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


	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getActive( ) {
		return this.active;
	}

	public void setAssociatedUnionId(String associatedUnionId) {
		this.associatedUnionId = associatedUnionId;
	}
	public String getAssociatedUnionId( ) {
		return this.associatedUnionId;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setDepartment(List<Long> department) {
		this.department = department;
	}
	public List<Long> getDepartment( ) {
		return this.department;
	}

	public void setDingId(String dingId) {
		this.dingId = dingId;
	}
	public String getDingId( ) {
		return this.dingId;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

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

	public void setExtattr(String extattr) {
		this.extattr = extattr;
	}
	public String getExtattr( ) {
		return this.extattr;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}
	public Date getHiredDate( ) {
		return this.hiredDate;
	}

	public void setInviteMobile(String inviteMobile) {
		this.inviteMobile = inviteMobile;
	}
	public String getInviteMobile( ) {
		return this.inviteMobile;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public Boolean getIsAdmin( ) {
		return this.isAdmin;
	}

	public void setIsBoss(Boolean isBoss) {
		this.isBoss = isBoss;
	}
	public Boolean getIsBoss( ) {
		return this.isBoss;
	}

	public void setIsCustomizedPortal(Boolean isCustomizedPortal) {
		this.isCustomizedPortal = isCustomizedPortal;
	}
	public Boolean getIsCustomizedPortal( ) {
		return this.isCustomizedPortal;
	}

	public void setIsHide(Boolean isHide) {
		this.isHide = isHide;
	}
	public Boolean getIsHide( ) {
		return this.isHide;
	}

	public void setIsLeaderInDepts(String isLeaderInDepts) {
		this.isLeaderInDepts = isLeaderInDepts;
	}
	public String getIsLeaderInDepts( ) {
		return this.isLeaderInDepts;
	}

	public void setIsLimited(Boolean isLimited) {
		this.isLimited = isLimited;
	}
	public Boolean getIsLimited( ) {
		return this.isLimited;
	}

	public void setIsSenior(Boolean isSenior) {
		this.isSenior = isSenior;
	}
	public Boolean getIsSenior( ) {
		return this.isSenior;
	}

	public void setJobnumber(String jobnumber) {
		this.jobnumber = jobnumber;
	}
	public String getJobnumber( ) {
		return this.jobnumber;
	}

	public void setManagerUserId(String managerUserId) {
		this.managerUserId = managerUserId;
	}
	public String getManagerUserId( ) {
		return this.managerUserId;
	}

	public void setMemberView(Boolean memberView) {
		this.memberView = memberView;
	}
	public Boolean getMemberView( ) {
		return this.memberView;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setMobileHash(String mobileHash) {
		this.mobileHash = mobileHash;
	}
	public String getMobileHash( ) {
		return this.mobileHash;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getNickname( ) {
		return this.nickname;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderInDepts(String orderInDepts) {
		this.orderInDepts = orderInDepts;
	}
	public String getOrderInDepts( ) {
		return this.orderInDepts;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}
	public String getOrgEmail( ) {
		return this.orgEmail;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosition( ) {
		return this.position;
	}

	public void setRealAuthed(Boolean realAuthed) {
		this.realAuthed = realAuthed;
	}
	public Boolean getRealAuthed( ) {
		return this.realAuthed;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	public List<Roles> getRoles( ) {
		return this.roles;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateCode( ) {
		return this.stateCode;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel( ) {
		return this.tel;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getUnionid( ) {
		return this.unionid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public String getWorkPlace( ) {
		return this.workPlace;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * roles
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Roles extends TaobaoObject {
		private static final long serialVersionUID = 1572382722389781166L;
		/**
		 * groupName
		 */
		@ApiField("groupName")
		private String groupName;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * type
		 */
		@ApiField("type")
		private Long type;
	
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
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	


}
