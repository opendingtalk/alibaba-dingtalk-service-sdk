package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIndustryUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2472371218899554218L;

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
	 * 员工信息
	 */
	@ApiField("result")
	private OpenIndustryEmp result;

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

	public void setResult(OpenIndustryEmp result) {
		this.result = result;
	}
	public OpenIndustryEmp getResult( ) {
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
	 * 员工角色列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRole extends TaobaoObject {
		private static final long serialVersionUID = 8228358179964181968L;
		/**
		 * 标签ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 标签名称
		 */
		@ApiField("name")
		private String name;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 员工信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenIndustryEmp extends TaobaoObject {
		private static final long serialVersionUID = 8188812888811297213L;
		/**
		 * 员工特征
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 员工名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 员工角色列表
		 */
		@ApiListField("roles")
		@ApiField("open_role")
		private List<OpenRole> roles;
		/**
		 * unionId
		 */
		@ApiField("unionid")
		private String unionid;
	
		public String getFeature() {
			return this.feature;
		}
		public void setFeature(String feature) {
			this.feature = feature;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<OpenRole> getRoles() {
			return this.roles;
		}
		public void setRoles(List<OpenRole> roles) {
			this.roles = roles;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
	}
	


}
