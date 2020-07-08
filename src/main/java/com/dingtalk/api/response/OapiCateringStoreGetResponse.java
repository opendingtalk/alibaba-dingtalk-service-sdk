package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.store.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCateringStoreGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2882859942337418482L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误原因
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 查询结果
	 */
	@ApiField("result")
	private PageResult result;

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

	public void setResult(PageResult result) {
		this.result = result;
	}
	public PageResult getResult( ) {
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
	 * 门店店长列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Managerlist extends TaobaoObject {
		private static final long serialVersionUID = 4146617933948225792L;
		/**
		 * 门店店长工号
		 */
		@ApiField("staff_id")
		private String staffId;
	
		public String getStaffId() {
			return this.staffId;
		}
		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}
	}
	
	/**
	 * 当前页数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Data extends TaobaoObject {
		private static final long serialVersionUID = 5498285683877164612L;
		/**
		 * 部门编号
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 门店店长列表
		 */
		@ApiListField("manager_list")
		@ApiField("managerlist")
		private List<Managerlist> managerList;
		/**
		 * 部门类型，门店为store
		 */
		@ApiField("type")
		private String type;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public List<Managerlist> getManagerList() {
			return this.managerList;
		}
		public void setManagerList(List<Managerlist> managerList) {
			this.managerList = managerList;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 5435276553758622939L;
		/**
		 * 当前页码
		 */
		@ApiField("current")
		private Long current;
		/**
		 * 当前页数据
		 */
		@ApiListField("data")
		@ApiField("data")
		private List<Data> data;
		/**
		 * 是否有下一页数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 每页记录数
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 总记录数
		 */
		@ApiField("total")
		private Long total;
		/**
		 * 总页数
		 */
		@ApiField("total_page")
		private Long totalPage;
	
		public Long getCurrent() {
			return this.current;
		}
		public void setCurrent(Long current) {
			this.current = current;
		}
		public List<Data> getData() {
			return this.data;
		}
		public void setData(List<Data> data) {
			this.data = data;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
		public Long getTotalPage() {
			return this.totalPage;
		}
		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}
	}
	


}
