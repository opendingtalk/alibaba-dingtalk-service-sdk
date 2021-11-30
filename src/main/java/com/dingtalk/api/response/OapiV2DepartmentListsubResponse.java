package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.listsub response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2DepartmentListsubResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1631396264913277985L;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 部门列表
	 */
	@ApiListField("result")
	@ApiField("dept_base_response")
	private List<DeptBaseResponse> result;


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

	public void setResult(List<DeptBaseResponse> result) {
		this.result = result;
	}
	public List<DeptBaseResponse> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 部门列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DeptBaseResponse extends TaobaoObject {
		private static final long serialVersionUID = 8783322546451939676L;
		/**
		 * 当群已经创建后，是否有新人加入部门会自动加入该群
		 */
		@ApiField("auto_add_user")
		private Boolean autoAddUser;
		/**
		 * 是否同步创建一个关联此部门的企业群
		 */
		@ApiField("create_dept_group")
		private Boolean createDeptGroup;
		/**
		 * 部门ID
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 扩展字段
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 部门是否来自关联组织
		 */
		@ApiField("from_union_org")
		private Boolean fromUnionOrg;
		/**
		 * 部门名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 父部门ID
		 */
		@ApiField("parent_id")
		private Long parentId;
		/**
		 * 部门标识字段
		 */
		@ApiField("source_identifier")
		private String sourceIdentifier;
		/**
		 * 教育行业部门类型
		 */
		@ApiField("tags")
		private String tags;
	
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
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public Boolean getFromUnionOrg() {
			return this.fromUnionOrg;
		}
		public void setFromUnionOrg(Boolean fromUnionOrg) {
			this.fromUnionOrg = fromUnionOrg;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getParentId() {
			return this.parentId;
		}
		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}
		public String getSourceIdentifier() {
			return this.sourceIdentifier;
		}
		public void setSourceIdentifier(String sourceIdentifier) {
			this.sourceIdentifier = sourceIdentifier;
		}
		public String getTags() {
			return this.tags;
		}
		public void setTags(String tags) {
			this.tags = tags;
		}
	}
	


}
