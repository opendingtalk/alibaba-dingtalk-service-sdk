package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.auth.group.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmAuthGroupListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4291774446291332316L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiListField("result")
	@ApiField("role_group_vo")
	private List<RoleGroupVo> result;


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

	public void setResult(List<RoleGroupVo> result) {
		this.result = result;
	}
	public List<RoleGroupVo> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RoleGroupVo extends TaobaoObject {
		private static final long serialVersionUID = 5318843537166113396L;
		/**
		 * 角色组名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 角色组id
		 */
		@ApiField("role_id")
		private Long roleId;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getRoleId() {
			return this.roleId;
		}
		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}
	}
	


}
