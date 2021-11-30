package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.auth.scopes response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAuthScopesResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2289125964957899791L;

	/** 
	 * auth_org_scopes
	 */
	@ApiField("auth_org_scopes")
	private AuthOrgScopes authOrgScopes;

	/** 
	 * 可以得到的企业用户字段
	 */
	@ApiListField("auth_user_field")
	@ApiField("string")
	private List<String> authUserField;

	/** 
	 * ISV可以直接使用企业的功能字段
	 */
	@ApiListField("condition_field")
	@ApiField("string")
	private List<String> conditionField;

	/** 
	 * 返回码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 对返回码的文本描述内容
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setAuthOrgScopes(AuthOrgScopes authOrgScopes) {
		this.authOrgScopes = authOrgScopes;
	}
	public AuthOrgScopes getAuthOrgScopes( ) {
		return this.authOrgScopes;
	}

	public void setAuthUserField(List<String> authUserField) {
		this.authUserField = authUserField;
	}
	public List<String> getAuthUserField( ) {
		return this.authUserField;
	}

	public void setConditionField(List<String> conditionField) {
		this.conditionField = conditionField;
	}
	public List<String> getConditionField( ) {
		return this.conditionField;
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
	 * auth_org_scopes
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AuthOrgScopes extends TaobaoObject {
		private static final long serialVersionUID = 4762755988936415176L;
		/**
		 * 企业授权的部门id列表
		 */
		@ApiListField("authed_dept")
		@ApiField("number")
		private List<Long> authedDept;
		/**
		 * 企业授权的员工userid列表
		 */
		@ApiListField("authed_user")
		@ApiField("string")
		private List<String> authedUser;
	
		public List<Long> getAuthedDept() {
			return this.authedDept;
		}
		public void setAuthedDept(List<Long> authedDept) {
			this.authedDept = authedDept;
		}
		public List<String> getAuthedUser() {
			return this.authedUser;
		}
		public void setAuthedUser(List<String> authedUser) {
			this.authedUser = authedUser;
		}
	}
	


}
