package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.hire.auth.role.getbyuser response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiHireAuthRoleGetbyuserResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8513784134687713395L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 角色列表
	 */
	@ApiListField("result")
	@ApiField("hire_role_simple_vo")
	private List<HireRoleSimpleVo> result;

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

	public void setResult(List<HireRoleSimpleVo> result) {
		this.result = result;
	}
	public List<HireRoleSimpleVo> getResult( ) {
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
	 * 角色列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class HireRoleSimpleVo extends TaobaoObject {
		private static final long serialVersionUID = 6687663888261868258L;
		/**
		 * 角色名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 角色类型：1表示管理员，2表示HR，3表示面试官，4表示用人经理
		 */
		@ApiField("type")
		private Long type;
	
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
