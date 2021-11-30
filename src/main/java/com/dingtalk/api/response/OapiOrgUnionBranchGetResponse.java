package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.union.branch.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiOrgUnionBranchGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7822836677496635721L;

	/** 
	 * 错误code
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误msg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * OpenOrgUnion
	 */
	@ApiListField("result")
	@ApiField("open_org_union")
	private List<OpenOrgUnion> result;

	/** 
	 * 是否成功
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

	public void setResult(List<OpenOrgUnion> result) {
		this.result = result;
	}
	public List<OpenOrgUnion> getResult( ) {
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
	 * OpenOrgUnion
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenOrgUnion extends TaobaoObject {
		private static final long serialVersionUID = 3777161459913637565L;
		/**
		 * 分支组织corpid
		 */
		@ApiField("union_corpid")
		private String unionCorpid;
		/**
		 * 分支组织名称
		 */
		@ApiField("union_org_name")
		private String unionOrgName;
	
		public String getUnionCorpid() {
			return this.unionCorpid;
		}
		public void setUnionCorpid(String unionCorpid) {
			this.unionCorpid = unionCorpid;
		}
		public String getUnionOrgName() {
			return this.unionOrgName;
		}
		public void setUnionOrgName(String unionOrgName) {
			this.unionOrgName = unionOrgName;
		}
	}
	


}
