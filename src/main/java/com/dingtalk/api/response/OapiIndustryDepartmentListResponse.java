package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.department.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIndustryDepartmentListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7447483744644159423L;

	/** 
	 * 成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private ResultWrapper result;

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
	 * details
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenIndustryDeptInfo extends TaobaoObject {
		private static final long serialVersionUID = 4747814626349474674L;
		/**
		 * 传统农村类型
		 */
		@ApiField("contact_type")
		private String contactType;
		/**
		 * 部门ID
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 户
		 */
		@ApiField("dept_type")
		private String deptType;
		/**
		 * 部门属性信息
		 */
		@ApiField("feature")
		private String feature;
		/**
		 * 部门名称
		 */
		@ApiField("name")
		private String name;
	
		public String getContactType() {
			return this.contactType;
		}
		public void setContactType(String contactType) {
			this.contactType = contactType;
		}
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getDeptType() {
			return this.deptType;
		}
		public void setDeptType(String deptType) {
			this.deptType = deptType;
		}
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
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResultWrapper extends TaobaoObject {
		private static final long serialVersionUID = 5254273331732466988L;
		/**
		 * details
		 */
		@ApiListField("details")
		@ApiField("open_industry_dept_info")
		private List<OpenIndustryDeptInfo> details;
		/**
		 * 是否还有更多
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一个游标开始位置
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<OpenIndustryDeptInfo> getDetails() {
			return this.details;
		}
		public void setDetails(List<OpenIndustryDeptInfo> details) {
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
