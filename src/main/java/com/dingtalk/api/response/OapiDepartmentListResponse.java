package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDepartmentListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8821445665261454365L;

	/** 
	 * department
	 */
	@ApiListField("department")
	@ApiField("department")
	private List<Department> department;

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


	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	public List<Department> getDepartment( ) {
		return this.department;
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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * department
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Department extends TaobaoObject {
		private static final long serialVersionUID = 4535525151899872626L;
		/**
		 * autoAddUser
		 */
		@ApiField("autoAddUser")
		private Boolean autoAddUser;
		/**
		 * createDeptGroup
		 */
		@ApiField("createDeptGroup")
		private Boolean createDeptGroup;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * isFromUnionOrg
		 */
		@ApiField("isFromUnionOrg")
		private Boolean isFromUnionOrg;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * parentid
		 */
		@ApiField("parentid")
		private Long parentid;
		/**
		 * sourceIdentifier
		 */
		@ApiField("sourceIdentifier")
		private String sourceIdentifier;
	
		public Boolean getAutoAddUser() {
			return this.autoAddUser;
		}
		public void setAutoAddUser(Boolean autoAddUser) {
			this.autoAddUser = autoAddUser;
		}
		public Boolean getCreateDeptGroup() {
			return this.createDeptGroup;
		}
		public void setCreateDeptGroup(Boolean createDeptGroup) {
			this.createDeptGroup = createDeptGroup;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Boolean getIsFromUnionOrg() {
			return this.isFromUnionOrg;
		}
		public void setIsFromUnionOrg(Boolean isFromUnionOrg) {
			this.isFromUnionOrg = isFromUnionOrg;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getParentid() {
			return this.parentid;
		}
		public void setParentid(Long parentid) {
			this.parentid = parentid;
		}
		public String getSourceIdentifier() {
			return this.sourceIdentifier;
		}
		public void setSourceIdentifier(String sourceIdentifier) {
			this.sourceIdentifier = sourceIdentifier;
		}
	}
	


}
