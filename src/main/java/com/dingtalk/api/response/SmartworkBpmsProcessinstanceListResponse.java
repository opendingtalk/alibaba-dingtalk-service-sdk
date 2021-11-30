package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.processinstance.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkBpmsProcessinstanceListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6499674734882154278L;

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
	 * 审批表单变量组
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentValueVo extends TaobaoObject {
		private static final long serialVersionUID = 7197919626149267716L;
		/**
		 * 表单标签名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 表单标签值
		 */
		@ApiField("value")
		private String value;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessInstanceTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5277386623849533687L;
		/**
		 * 审批人列表
		 */
		@ApiListField("approver_userid_list")
		@ApiField("string")
		private List<String> approverUseridList;
		/**
		 * 流程实例业务编号
		 */
		@ApiField("business_id")
		private String businessId;
		/**
		 * 抄送人列表
		 */
		@ApiListField("cc_userid_list")
		@ApiField("string")
		private List<String> ccUseridList;
		/**
		 * 开始时间
		 */
		@ApiField("create_time")
		private Date createTime;
		/**
		 * 结束时间
		 */
		@ApiField("finish_time")
		private Date finishTime;
		/**
		 * 审批表单变量组
		 */
		@ApiListField("form_component_values")
		@ApiField("form_component_value_vo")
		private List<FormComponentValueVo> formComponentValues;
		/**
		 * 发起人部门id
		 */
		@ApiField("originator_dept_id")
		private String originatorDeptId;
		/**
		 * 发起人userid
		 */
		@ApiField("originator_userid")
		private String originatorUserid;
		/**
		 * 审批实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
		/**
		 * 审批结果，分为agree和refuse
		 */
		@ApiField("process_instance_result")
		private String processInstanceResult;
		/**
		 * 审批状态，分为NEW（刚创建）|RUNNING（运行中）|TERMINATED（被终止）|COMPLETED（完成）|CANCELED（取消）
		 */
		@ApiField("status")
		private String status;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	
		public List<String> getApproverUseridList() {
			return this.approverUseridList;
		}
		public void setApproverUseridList(List<String> approverUseridList) {
			this.approverUseridList = approverUseridList;
		}
		public String getBusinessId() {
			return this.businessId;
		}
		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}
		public List<String> getCcUseridList() {
			return this.ccUseridList;
		}
		public void setCcUseridList(List<String> ccUseridList) {
			this.ccUseridList = ccUseridList;
		}
		public Date getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public Date getFinishTime() {
			return this.finishTime;
		}
		public void setFinishTime(Date finishTime) {
			this.finishTime = finishTime;
		}
		public List<FormComponentValueVo> getFormComponentValues() {
			return this.formComponentValues;
		}
		public void setFormComponentValues(List<FormComponentValueVo> formComponentValues) {
			this.formComponentValues = formComponentValues;
		}
		public String getOriginatorDeptId() {
			return this.originatorDeptId;
		}
		public void setOriginatorDeptId(String originatorDeptId) {
			this.originatorDeptId = originatorDeptId;
		}
		public String getOriginatorUserid() {
			return this.originatorUserid;
		}
		public void setOriginatorUserid(String originatorUserid) {
			this.originatorUserid = originatorUserid;
		}
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getProcessInstanceResult() {
			return this.processInstanceResult;
		}
		public void setProcessInstanceResult(String processInstanceResult) {
			this.processInstanceResult = processInstanceResult;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageResult extends TaobaoObject {
		private static final long serialVersionUID = 6491713636166474689L;
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3666222426336157857L;
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
