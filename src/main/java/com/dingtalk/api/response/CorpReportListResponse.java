package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.report.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpReportListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6423674359278384586L;

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
	 * 日志内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JsonObject extends TaobaoObject {
		private static final long serialVersionUID = 6688624414832248655L;
		/**
		 * 模板内容
		 */
		@ApiField("key")
		private String key;
		/**
		 * 排序
		 */
		@ApiField("sort")
		private String sort;
		/**
		 * 类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 用户填写的内容
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getSort() {
			return this.sort;
		}
		public void setSort(String sort) {
			this.sort = sort;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 日志列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReportOapiVo extends TaobaoObject {
		private static final long serialVersionUID = 5211945495641126597L;
		/**
		 * 日志内容
		 */
		@ApiListField("contents")
		@ApiField("json_object")
		private List<JsonObject> contents;
		/**
		 * 日志创建时间
		 */
		@ApiField("create_time")
		private Long createTime;
		/**
		 * 日志创建人userid
		 */
		@ApiField("creator_id")
		private String creatorId;
		/**
		 * 日志创建人
		 */
		@ApiField("creator_name")
		private String creatorName;
		/**
		 * 部门
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 日志唯一id
		 */
		@ApiField("report_id")
		private String reportId;
		/**
		 * 日志模板名
		 */
		@ApiField("template_name")
		private String templateName;
	
		public List<JsonObject> getContents() {
			return this.contents;
		}
		public void setContents(List<JsonObject> contents) {
			this.contents = contents;
		}
		public Long getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
		public String getCreatorId() {
			return this.creatorId;
		}
		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}
		public String getCreatorName() {
			return this.creatorName;
		}
		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getReportId() {
			return this.reportId;
		}
		public void setReportId(String reportId) {
			this.reportId = reportId;
		}
		public String getTemplateName() {
			return this.templateName;
		}
		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageVo extends TaobaoObject {
		private static final long serialVersionUID = 6566446692128454151L;
		/**
		 * 日志列表
		 */
		@ApiListField("data_list")
		@ApiField("report_oapi_vo")
		private List<ReportOapiVo> dataList;
		/**
		 * 是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * nextCursor
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 分页大小
		 */
		@ApiField("size")
		private Long size;
	
		public List<ReportOapiVo> getDataList() {
			return this.dataList;
		}
		public void setDataList(List<ReportOapiVo> dataList) {
			this.dataList = dataList;
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
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3347731656512588571L;
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
		 * result
		 */
		@ApiField("result")
		private PageVo result;
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
		public PageVo getResult() {
			return this.result;
		}
		public void setResult(PageVo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
