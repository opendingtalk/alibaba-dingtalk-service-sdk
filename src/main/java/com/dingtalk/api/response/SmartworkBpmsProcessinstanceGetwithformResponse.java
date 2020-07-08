package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.processinstance.getwithform response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkBpmsProcessinstanceGetwithformResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8149193557937711653L;

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
	 * operationRecords
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationRecordsVo extends TaobaoObject {
		private static final long serialVersionUID = 1251935945227613836L;
		/**
		 * 时间
		 */
		@ApiField("date")
		private Date date;
		/**
		 * 操作结果，分为AGREE（同意），REFUSE（拒绝）
		 */
		@ApiField("operation_result")
		private String operationResult;
		/**
		 * 操作类型，分为EXECUTE_TASK_NORMAL（正常执行任务），EXECUTE_TASK_AGENT（代理人执行任务），APPEND_TASK_BEFORE（前加签任务），APPEND_TASK_AFTER（后加签任务），REDIRECT_TASK（转交任务），START_PROCESS_INSTANCE（发起流程实例），TERMINATE_PROCESS_INSTANCE（终止(撤销)流程实例），FINISH_PROCESS_INSTANCE（结束流程实例），ADD_REMARK（添加评论）
		 */
		@ApiField("operation_type")
		private String operationType;
		/**
		 * 评论
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 操作人
		 */
		@ApiField("userid")
		private String userid;
	
		public Date getDate() {
			return this.date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getOperationResult() {
			return this.operationResult;
		}
		public void setOperationResult(String operationResult) {
			this.operationResult = operationResult;
		}
		public String getOperationType() {
			return this.operationType;
		}
		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * tasks
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskTopVo extends TaobaoObject {
		private static final long serialVersionUID = 3896992362498132232L;
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
		 * 任务节点id
		 */
		@ApiField("task_id")
		private String taskId;
		/**
		 * 结果，分为AGREE（同意），REFUSE（拒绝），REDIRECTED（转交）
		 */
		@ApiField("task_result")
		private String taskResult;
		/**
		 * 任务状态，分为NEW（未启动），RUNNING（处理中），PAUSED（暂停），CANCELED（取消），COMPLETED（完成），TERMINATED（终止）
		 */
		@ApiField("task_status")
		private String taskStatus;
		/**
		 * 任务处理人
		 */
		@ApiField("userid")
		private String userid;
	
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
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
		public String getTaskResult() {
			return this.taskResult;
		}
		public void setTaskResult(String taskResult) {
			this.taskResult = taskResult;
		}
		public String getTaskStatus() {
			return this.taskStatus;
		}
		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * details
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubFormValueVo extends TaobaoObject {
		private static final long serialVersionUID = 6396277436555481677L;
		/**
		 * 组件类型
		 */
		@ApiField("detail_component_type")
		private String detailComponentType;
		/**
		 * 明细表单别名
		 */
		@ApiField("detail_form_biz_alias")
		private String detailFormBizAlias;
		/**
		 * 明细扩展值
		 */
		@ApiField("detail_form_ext_value")
		private String detailFormExtValue;
		/**
		 * 明细表单控件id
		 */
		@ApiField("detail_form_id")
		private String detailFormId;
		/**
		 * 明细表单名称
		 */
		@ApiField("detail_form_name")
		private String detailFormName;
		/**
		 * 明细表单值
		 */
		@ApiField("detail_form_value")
		private String detailFormValue;
	
		public String getDetailComponentType() {
			return this.detailComponentType;
		}
		public void setDetailComponentType(String detailComponentType) {
			this.detailComponentType = detailComponentType;
		}
		public String getDetailFormBizAlias() {
			return this.detailFormBizAlias;
		}
		public void setDetailFormBizAlias(String detailFormBizAlias) {
			this.detailFormBizAlias = detailFormBizAlias;
		}
		public String getDetailFormExtValue() {
			return this.detailFormExtValue;
		}
		public void setDetailFormExtValue(String detailFormExtValue) {
			this.detailFormExtValue = detailFormExtValue;
		}
		public String getDetailFormId() {
			return this.detailFormId;
		}
		public void setDetailFormId(String detailFormId) {
			this.detailFormId = detailFormId;
		}
		public String getDetailFormName() {
			return this.detailFormName;
		}
		public void setDetailFormName(String detailFormName) {
			this.detailFormName = detailFormName;
		}
		public String getDetailFormValue() {
			return this.detailFormValue;
		}
		public void setDetailFormValue(String detailFormValue) {
			this.detailFormValue = detailFormValue;
		}
	}
	
	/**
	 * 明细列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormDetailVo extends TaobaoObject {
		private static final long serialVersionUID = 2782284951293233525L;
		/**
		 * details
		 */
		@ApiListField("detail_form_values")
		@ApiField("sub_form_value_vo")
		private List<SubFormValueVo> detailFormValues;
	
		public List<SubFormValueVo> getDetailFormValues() {
			return this.detailFormValues;
		}
		public void setDetailFormValues(List<SubFormValueVo> detailFormValues) {
			this.detailFormValues = detailFormValues;
		}
	}
	
	/**
	 * formValueVOS
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormValueVo extends TaobaoObject {
		private static final long serialVersionUID = 3369476934455946813L;
		/**
		 * 表单别名
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 组件类型
		 */
		@ApiField("component_type")
		private String componentType;
		/**
		 * 明细列表
		 */
		@ApiListField("details")
		@ApiField("form_detail_vo")
		private List<FormDetailVo> details;
		/**
		 * 扩展值
		 */
		@ApiField("ext_value")
		private String extValue;
		/**
		 * 表单控件id
		 */
		@ApiField("form_id")
		private String formId;
		/**
		 * 表单名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public String getComponentType() {
			return this.componentType;
		}
		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}
		public List<FormDetailVo> getDetails() {
			return this.details;
		}
		public void setDetails(List<FormDetailVo> details) {
			this.details = details;
		}
		public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
		public String getFormId() {
			return this.formId;
		}
		public void setFormId(String formId) {
			this.formId = formId;
		}
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class NewProcessInstanceTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5375739271536737916L;
		/**
		 * 审批人
		 */
		@ApiListField("approver_userids")
		@ApiField("string")
		private List<String> approverUserids;
		/**
		 * 审批附属实例列表，当已经通过的审批实例被修改或撤销，会生成一个新的实例，作为原有审批实例的附属。如果想知道当前已经通过的审批实例的状态，可以依次遍历它的附属列表，查询里面每个实例的biz_action
		 */
		@ApiListField("attached_process_instance_ids")
		@ApiField("string")
		private List<String> attachedProcessInstanceIds;
		/**
		 * 审批实例业务动作,MODIFY表示该审批实例是基于原来的实例修改而来，REVOKE表示该审批实例是由原来的实例撤销后重新发起的,NONE表示正常发起
		 */
		@ApiField("biz_action")
		private String bizAction;
		/**
		 * 审批实例业务编号
		 */
		@ApiField("business_id")
		private String businessId;
		/**
		 * 抄送人
		 */
		@ApiField("cc_userids")
		private String ccUserids;
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
		 * formValueVOS
		 */
		@ApiListField("form_values")
		@ApiField("form_value_vo")
		private List<FormValueVo> formValues;
		/**
		 * operationRecords
		 */
		@ApiListField("operation_records")
		@ApiField("operation_records_vo")
		private List<OperationRecordsVo> operationRecords;
		/**
		 * 发起部门
		 */
		@ApiField("originator_dept_id")
		private String originatorDeptId;
		/**
		 * 发起部门
		 */
		@ApiField("originator_dept_name")
		private String originatorDeptName;
		/**
		 * 发起人
		 */
		@ApiField("originator_userid")
		private String originatorUserid;
		/**
		 * 审批表单唯一标示
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 审批结果，分为agree和refuse
		 */
		@ApiField("result")
		private String result;
		/**
		 * 审批状态，分为NEW（刚创建）|RUNNING（运行中）|TERMINATED（被终止）|COMPLETED（完成）|CANCELED（取消）
		 */
		@ApiField("status")
		private String status;
		/**
		 * tasks
		 */
		@ApiListField("tasks")
		@ApiField("task_top_vo")
		private List<TaskTopVo> tasks;
		/**
		 * 审批实例标题
		 */
		@ApiField("title")
		private String title;
	
		public List<String> getApproverUserids() {
			return this.approverUserids;
		}
		public void setApproverUserids(List<String> approverUserids) {
			this.approverUserids = approverUserids;
		}
		public List<String> getAttachedProcessInstanceIds() {
			return this.attachedProcessInstanceIds;
		}
		public void setAttachedProcessInstanceIds(List<String> attachedProcessInstanceIds) {
			this.attachedProcessInstanceIds = attachedProcessInstanceIds;
		}
		public String getBizAction() {
			return this.bizAction;
		}
		public void setBizAction(String bizAction) {
			this.bizAction = bizAction;
		}
		public String getBusinessId() {
			return this.businessId;
		}
		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}
		public String getCcUserids() {
			return this.ccUserids;
		}
		public void setCcUserids(String ccUserids) {
			this.ccUserids = ccUserids;
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
		public List<FormValueVo> getFormValues() {
			return this.formValues;
		}
		public void setFormValues(List<FormValueVo> formValues) {
			this.formValues = formValues;
		}
		public List<OperationRecordsVo> getOperationRecords() {
			return this.operationRecords;
		}
		public void setOperationRecords(List<OperationRecordsVo> operationRecords) {
			this.operationRecords = operationRecords;
		}
		public String getOriginatorDeptId() {
			return this.originatorDeptId;
		}
		public void setOriginatorDeptId(String originatorDeptId) {
			this.originatorDeptId = originatorDeptId;
		}
		public String getOriginatorDeptName() {
			return this.originatorDeptName;
		}
		public void setOriginatorDeptName(String originatorDeptName) {
			this.originatorDeptName = originatorDeptName;
		}
		public String getOriginatorUserid() {
			return this.originatorUserid;
		}
		public void setOriginatorUserid(String originatorUserid) {
			this.originatorUserid = originatorUserid;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public List<TaskTopVo> getTasks() {
			return this.tasks;
		}
		public void setTasks(List<TaskTopVo> tasks) {
			this.tasks = tasks;
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
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5823997459677382487L;
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
		private NewProcessInstanceTopVo result;
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
		public NewProcessInstanceTopVo getResult() {
			return this.result;
		}
		public void setResult(NewProcessInstanceTopVo result) {
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
