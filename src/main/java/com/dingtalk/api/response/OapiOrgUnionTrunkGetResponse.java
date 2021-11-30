package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.union.trunk.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiOrgUnionTrunkGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7536838245136826389L;

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
		private static final long serialVersionUID = 6498624334968738198L;
		/**
		 * 主干组织的corpid
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 主干组织的名称
		 */
		@ApiField("org_name")
		private String orgName;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
	}
	


}
