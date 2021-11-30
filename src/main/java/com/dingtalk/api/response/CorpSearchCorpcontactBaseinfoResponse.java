package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.search.corpcontact.baseinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpSearchCorpcontactBaseinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3528498892817337615L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * value
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupContactResult extends TaobaoObject {
		private static final long serialVersionUID = 7852727669752367369L;
		/**
		 * aliTmpDept
		 */
		@ApiField("ali_tmp_dept")
		private String aliTmpDept;
		/**
		 * flowerName
		 */
		@ApiField("flower_name")
		private String flowerName;
		/**
		 * jobNumber
		 */
		@ApiField("job_number")
		private String jobNumber;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 职位
		 */
		@ApiField("title")
		private String title;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * workStation
		 */
		@ApiField("work_station")
		private String workStation;
	
		public String getAliTmpDept() {
			return this.aliTmpDept;
		}
		public void setAliTmpDept(String aliTmpDept) {
			this.aliTmpDept = aliTmpDept;
		}
		public String getFlowerName() {
			return this.flowerName;
		}
		public void setFlowerName(String flowerName) {
			this.flowerName = flowerName;
		}
		public String getJobNumber() {
			return this.jobNumber;
		}
		public void setJobNumber(String jobNumber) {
			this.jobNumber = jobNumber;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getWorkStation() {
			return this.workStation;
		}
		public void setWorkStation(String workStation) {
			this.workStation = workStation;
		}
	}
	
	/**
	 * pageResult
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 8317584489275979515L;
		/**
		 * 是否还有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下次翻页的入参
		 */
		@ApiField("offset")
		private Long offset;
		/**
		 * 能获取的总条数(offset+size不能超过这个值)
		 */
		@ApiField("total")
		private Long total;
		/**
		 * value
		 */
		@ApiListField("value_list")
		@ApiField("group_contact_result")
		private List<GroupContactResult> valueList;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getOffset() {
			return this.offset;
		}
		public void setOffset(Long offset) {
			this.offset = offset;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
		public List<GroupContactResult> getValueList() {
			return this.valueList;
		}
		public void setValueList(List<GroupContactResult> valueList) {
			this.valueList = valueList;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4143367438285322383L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * pageResult
		 */
		@ApiField("page_result")
		private PageResult pageResult;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public PageResult getPageResult() {
			return this.pageResult;
		}
		public void setPageResult(PageResult pageResult) {
			this.pageResult = pageResult;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
