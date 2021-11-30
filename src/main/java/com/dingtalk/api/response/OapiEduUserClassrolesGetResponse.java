package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.user.classroles.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduUserClassrolesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4144985736454149555L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 学校的地址信息(如果有)
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenOrgLocation extends TaobaoObject {
		private static final long serialVersionUID = 5636799128978198565L;
		/**
		 * 学校所在市名称(如果有)
		 */
		@ApiField("org_loc_city")
		private String orgLocCity;
		/**
		 * 学校所在省名称(如果有)
		 */
		@ApiField("org_loc_province")
		private String orgLocProvince;
		/**
		 * 学校所在区名称(如果有)
		 */
		@ApiField("org_loc_region")
		private String orgLocRegion;
		/**
		 * 学校所在地区编码(如果有)
		 */
		@ApiField("region_id")
		private String regionId;
	
		public String getOrgLocCity() {
			return this.orgLocCity;
		}
		public void setOrgLocCity(String orgLocCity) {
			this.orgLocCity = orgLocCity;
		}
		public String getOrgLocProvince() {
			return this.orgLocProvince;
		}
		public void setOrgLocProvince(String orgLocProvince) {
			this.orgLocProvince = orgLocProvince;
		}
		public String getOrgLocRegion() {
			return this.orgLocRegion;
		}
		public void setOrgLocRegion(String orgLocRegion) {
			this.orgLocRegion = orgLocRegion;
		}
		public String getRegionId() {
			return this.regionId;
		}
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}
	
	/**
	 * 用户所有班级的角色列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Userclassrolelist extends TaobaoObject {
		private static final long serialVersionUID = 2793811826679177935L;
		/**
		 * 所在班级ID
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班级名称
		 */
		@ApiField("class_name")
		private String className;
		/**
		 * 组织id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 所在班级的姓名( 如果当前用户在班上为老师，则为老师姓名 ;如果当前用户在班上为家长， 则为孩子的学生姓名; 如果当前用户在班上为学生，则为学生姓名 )
		 */
		@ApiField("name")
		private String name;
		/**
		 * 学校的地址信息(如果有)
		 */
		@ApiField("org_location")
		private OpenOrgLocation orgLocation;
		/**
		 * 学校名称(如果有)
		 */
		@ApiField("org_name")
		private String orgName;
		/**
		 * 所在班级的角色(学生:student，老师: teacher)
		 */
		@ApiField("role_name")
		private String roleName;
		/**
		 * 所在班级的员工ID。 如果当前用户在班上为老师， 则为老师的员工ID; 如果当前用户在班上为家长， 则为孩子的学生员工ID; 如果当前用户在班上为学生， 则为学生的员工ID
		 */
		@ApiField("user_id")
		private String userId;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getClassName() {
			return this.className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public OpenOrgLocation getOrgLocation() {
			return this.orgLocation;
		}
		public void setOrgLocation(OpenOrgLocation orgLocation) {
			this.orgLocation = orgLocation;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public String getRoleName() {
			return this.roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenUserClassRoleListResponse extends TaobaoObject {
		private static final long serialVersionUID = 8642794587246574935L;
		/**
		 * 用户所有班级的角色列表
		 */
		@ApiListField("user_class_role_list")
		@ApiField("userclassrolelist")
		private List<Userclassrolelist> userClassRoleList;
	
		public List<Userclassrolelist> getUserClassRoleList() {
			return this.userClassRoleList;
		}
		public void setUserClassRoleList(List<Userclassrolelist> userClassRoleList) {
			this.userClassRoleList = userClassRoleList;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5887925798867831895L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误消息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * result
		 */
		@ApiField("result")
		private OpenUserClassRoleListResponse result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public OpenUserClassRoleListResponse getResult() {
			return this.result;
		}
		public void setResult(OpenUserClassRoleListResponse result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
