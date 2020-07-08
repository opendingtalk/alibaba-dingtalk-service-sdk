package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessinstanceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2824364668289264771L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 实例详情
	 */
	@ApiField("process_instance")
	private ProcessInstanceTopVo processInstance;


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

	public void setProcessInstance(ProcessInstanceTopVo processInstance) {
		this.processInstance = processInstance;
	}
	public ProcessInstanceTopVo getProcessInstance( ) {
		return this.processInstance;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 评论附件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Attachment extends TaobaoObject {
		private static final long serialVersionUID = 5193795748843279171L;
		/**
		 * id
		 */
		@ApiField("file_id")
		private String fileId;
		/**
		 * 附件名称
		 */
		@ApiField("file_name")
		private String fileName;
		/**
		 * 大小
		 */
		@ApiField("file_size")
		private String fileSize;
		/**
		 * 类型
		 */
		@ApiField("file_type")
		private String fileType;
	
		public String getFileId() {
			return this.fileId;
		}
		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
		public String getFileName() {
			return this.fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileSize() {
			return this.fileSize;
		}
		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}
		public String getFileType() {
			return this.fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
	}
	
	/**
	 * 操作记录列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationRecordsVo extends TaobaoObject {
		private static final long serialVersionUID = 5412137312545496341L;
		/**
		 * 评论附件
		 */
		@ApiListField("attachments")
		@ApiField("attachment")
		private List<Attachment> attachments;
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
	
		public List<Attachment> getAttachments() {
			return this.attachments;
		}
		public void setAttachments(List<Attachment> attachments) {
			this.attachments = attachments;
		}
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
	 * 任务列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskTopVo extends TaobaoObject {
		private static final long serialVersionUID = 2574911823879773394L;
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
		 * 任务节点id
		 */
		@ApiField("taskid")
		private String taskid;
		/**
		 * 任务url
		 */
		@ApiField("url")
		private String url;
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
		public String getTaskid() {
			return this.taskid;
		}
		public void setTaskid(String taskid) {
			this.taskid = taskid;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 表单详情列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormComponentValueVo extends TaobaoObject {
		private static final long serialVersionUID = 5656891774582745833L;
		/**
		 * 组件类型
		 */
		@ApiField("component_type")
		private String componentType;
		/**
		 * 标签扩展值
		 */
		@ApiField("ext_value")
		private String extValue;
		/**
		 * 组件id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 标签名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 标签值
		 */
		@ApiField("value")
		private String value;
	
		public String getComponentType() {
			return this.componentType;
		}
		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}
		public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
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
	 * 实例详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessInstanceTopVo extends TaobaoObject {
		private static final long serialVersionUID = 5843758265151611675L;
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
		@ApiListField("cc_userids")
		@ApiField("string")
		private List<String> ccUserids;
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
		 * 表单详情列表
		 */
		@ApiListField("form_component_values")
		@ApiField("form_component_value_vo")
		private List<FormComponentValueVo> formComponentValues;
		/**
		 * 主流程实例标识
		 */
		@ApiField("main_process_instance_id")
		private String mainProcessInstanceId;
		/**
		 * 操作记录列表
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
		 * 任务列表
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
		public List<String> getCcUserids() {
			return this.ccUserids;
		}
		public void setCcUserids(List<String> ccUserids) {
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
		public List<FormComponentValueVo> getFormComponentValues() {
			return this.formComponentValues;
		}
		public void setFormComponentValues(List<FormComponentValueVo> formComponentValues) {
			this.formComponentValues = formComponentValues;
		}
		public String getMainProcessInstanceId() {
			return this.mainProcessInstanceId;
		}
		public void setMainProcessInstanceId(String mainProcessInstanceId) {
			this.mainProcessInstanceId = mainProcessInstanceId;
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
	


}
