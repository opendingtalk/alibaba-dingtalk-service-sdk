package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.shenghai.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessShenghaiTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3339512534538693653L;

	/** 
	 * App用户基本信息
	 */
	@ApiField("result")
	private UserDo result;


	public void setResult(UserDo result) {
		this.result = result;
	}
	public UserDo getResult( ) {
		return this.result;
	}

	
	
	/**
	 * wef
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Firstreadintromap extends TaobaoObject {
		private static final long serialVersionUID = 3792326382566373864L;
		/**
		 * ss
		 */
		@ApiField("empty")
		private Boolean empty;
	
		public Boolean getEmpty() {
			return this.empty;
		}
		public void setEmpty(Boolean empty) {
			this.empty = empty;
		}
	}
	
	/**
	 * App用户基本信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserDo extends TaobaoObject {
		private static final long serialVersionUID = 5726213543475986264L;
		/**
		 * wef
		 */
		@ApiField("cn_name")
		private String cnName;
		/**
		 * wef
		 */
		@ApiField("email")
		private String email;
		/**
		 * wfe
		 */
		@ApiField("first_read_intro")
		private String firstReadIntro;
		/**
		 * wef
		 */
		@ApiField("first_read_intro_map")
		private Firstreadintromap firstReadIntroMap;
		/**
		 * ff
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * ffe
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * rr
		 */
		@ApiField("id")
		private Long id;
		/**
		 * rr
		 */
		@ApiField("intro_read")
		private Long introRead;
		/**
		 * uu
		 */
		@ApiField("is_admin")
		private Long isAdmin;
		/**
		 * ii
		 */
		@ApiField("is_domain")
		private Long isDomain;
		/**
		 * 77
		 */
		@ApiField("name")
		private String name;
		/**
		 * 88
		 */
		@ApiField("password")
		private String password;
		/**
		 * ww
		 */
		@ApiField("status")
		private Long status;
		/**
		 * ee
		 */
		@ApiField("user_type")
		private Long userType;
		/**
		 * yy
		 */
		@ApiField("work_id")
		private String workId;
	
		public String getCnName() {
			return this.cnName;
		}
		public void setCnName(String cnName) {
			this.cnName = cnName;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFirstReadIntro() {
			return this.firstReadIntro;
		}
		public void setFirstReadIntro(String firstReadIntro) {
			this.firstReadIntro = firstReadIntro;
		}
		public Firstreadintromap getFirstReadIntroMap() {
			return this.firstReadIntroMap;
		}
		public void setFirstReadIntroMap(Firstreadintromap firstReadIntroMap) {
			this.firstReadIntroMap = firstReadIntroMap;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getIntroRead() {
			return this.introRead;
		}
		public void setIntroRead(Long introRead) {
			this.introRead = introRead;
		}
		public Long getIsAdmin() {
			return this.isAdmin;
		}
		public void setIsAdmin(Long isAdmin) {
			this.isAdmin = isAdmin;
		}
		public Long getIsDomain() {
			return this.isDomain;
		}
		public void setIsDomain(Long isDomain) {
			this.isDomain = isDomain;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return this.password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getUserType() {
			return this.userType;
		}
		public void setUserType(Long userType) {
			this.userType = userType;
		}
		public String getWorkId() {
			return this.workId;
		}
		public void setWorkId(String workId) {
			this.workId = workId;
		}
	}
	


}
