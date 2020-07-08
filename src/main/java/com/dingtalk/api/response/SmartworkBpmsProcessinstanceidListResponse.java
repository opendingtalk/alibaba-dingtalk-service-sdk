package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.processinstanceid.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkBpmsProcessinstanceidListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8484387125329216586L;

	/** 
	 * DingOpenResult
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
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessInstanceTopVo extends TaobaoObject {
		private static final long serialVersionUID = 2177284912778464721L;
		/**
		 * 审批实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
	
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 6531238239364973118L;
		/**
		 * list
		 */
		@ApiListField("list")
		@ApiField("process_instance_top_vo")
		private List<ProcessInstanceTopVo> list;
		/**
		 * 表示下次查询的游标，当返回结果没有该字段时表示没有更多数据了
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
	
		public List<ProcessInstanceTopVo> getList() {
			return this.list;
		}
		public void setList(List<ProcessInstanceTopVo> list) {
			this.list = list;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
	}
	
	/**
	 * DingOpenResult
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7459454461133483585L;
		/**
		 * 错误码
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("result")
		private PageResult result;
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
		public PageResult getResult() {
			return this.result;
		}
		public void setResult(PageResult result) {
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
