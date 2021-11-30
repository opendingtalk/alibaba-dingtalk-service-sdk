package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.union.cooperate.info.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUnionCooperateInfoListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7585623417945828547L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 加入申请加入空间信息
	 */
	@ApiListField("result")
	@ApiField("open_cooperate_union_vo")
	private List<OpenCooperateUnionVo> result;

	/** 
	 * 成功
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(List<OpenCooperateUnionVo> result) {
		this.result = result;
	}
	public List<OpenCooperateUnionVo> getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 加入/申请加入空间信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCooperateUnionVo extends TaobaoObject {
		private static final long serialVersionUID = 2343468183154722326L;
		/**
		 * 加入企业认证等级0 未认证 1高级认证 2中级认证 3初级认证
		 */
		@ApiField("auth_level")
		private Long authLevel;
		/**
		 * 挂载部门ID(在合作空间中的架构属性)
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 加入的部门列表(部门下的员工会全部加入)
		 */
		@ApiListField("dept_ids")
		@ApiField("number")
		private List<Long> deptIds;
		/**
		 * 挂载部门名称(在合作空间中的架构属性)，不设置默认是加入企业的名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 加入企业的企业corpId
		 */
		@ApiField("union_corp_id")
		private String unionCorpId;
		/**
		 * 加入企业的企业名称
		 */
		@ApiField("union_org_name")
		private String unionOrgName;
		/**
		 * 加入的方式：1全部加入(不需要选择部门和员工) 2部分加入
		 */
		@ApiField("union_type")
		private Long unionType;
		/**
		 * 单独加入的员工(所在部门不需要加入的情况，直接选择的几个员工)
		 */
		@ApiListField("userids")
		@ApiField("string")
		private List<String> userids;
	
		public Long getAuthLevel() {
			return this.authLevel;
		}
		public void setAuthLevel(Long authLevel) {
			this.authLevel = authLevel;
		}
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public List<Long> getDeptIds() {
			return this.deptIds;
		}
		public void setDeptIds(List<Long> deptIds) {
			this.deptIds = deptIds;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getUnionCorpId() {
			return this.unionCorpId;
		}
		public void setUnionCorpId(String unionCorpId) {
			this.unionCorpId = unionCorpId;
		}
		public String getUnionOrgName() {
			return this.unionOrgName;
		}
		public void setUnionOrgName(String unionOrgName) {
			this.unionOrgName = unionOrgName;
		}
		public Long getUnionType() {
			return this.unionType;
		}
		public void setUnionType(Long unionType) {
			this.unionType = unionType;
		}
		public List<String> getUserids() {
			return this.userids;
		}
		public void setUserids(List<String> userids) {
			this.userids = userids;
		}
	}
	


}
