package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.user.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIndustryUserListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3731264977651637179L;

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
	@ApiField("result")
	private ResultWrapper result;

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

	public void setResult(ResultWrapper result) {
		this.result = result;
	}
	public ResultWrapper getResult( ) {
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
	 * 标签列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenRole extends TaobaoObject {
		private static final long serialVersionUID = 6792259663172278628L;
		/**
		 * 标签id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 标签名
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
	 * 员工列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenIndustryEmp extends TaobaoObject {
		private static final long serialVersionUID = 6189885796543626469L;
		/**
		 * 员工特征
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 员工名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 标签列表
		 */
		@ApiListField("roles")
		@ApiField("open_role")
		private List<OpenRole> roles;
		/**
		 * 钉钉唯一标示
		 */
		@ApiField("unionid")
		private String unionid;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
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
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResultWrapper extends TaobaoObject {
		private static final long serialVersionUID = 2858166536422382832L;
		/**
		 * 员工列表
		 */
		@ApiListField("details")
		@ApiField("open_industry_emp")
		private List<OpenIndustryEmp> details;
		/**
		 * 是否有更多
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 游标位置
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<OpenIndustryEmp> getDetails() {
			return this.details;
		}
		public void setDetails(List<OpenIndustryEmp> details) {
			this.details = details;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	


}
