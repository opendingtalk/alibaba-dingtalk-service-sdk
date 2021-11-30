package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Date;
import java.util.List;

public class SmartworkBpmsProcessinstanceGetResponse
        extends TaobaoResponse
{
    private static final long serialVersionUID = 4823155422214658159L;
    @ApiField("result")
    private DingOpenResult result;

    public void setResult(DingOpenResult result)
    {
        this.result = result;
    }

    public DingOpenResult getResult()
    {
        return this.result;
    }

//    public boolean isSuccess()
//    {
//        return (getErrcode() == null) || (getErrcode().equals(Long.valueOf(0L)));
//    }

    public static class FormComponentValueVo
            extends TaobaoObject
    {
        private static final long serialVersionUID = 6817329622198766917L;
        @ApiField("ext_value")
        private String extValue;
        @ApiField("name")
        private String name;
        @ApiField("value")
        private String value;

        public String getExtValue()
        {
            return this.extValue;
        }

        public void setExtValue(String extValue)
        {
            this.extValue = extValue;
        }

        public String getName()
        {
            return this.name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getValue()
        {
            return this.value;
        }

        public void setValue(String value)
        {
            this.value = value;
        }
    }

    public static class OperationRecordsVo
            extends TaobaoObject
    {
        private static final long serialVersionUID = 3431962198676542189L;
        @ApiField("date")
        private Date date;
        @ApiField("operation_result")
        private String operationResult;
        @ApiField("operation_type")
        private String operationType;
        @ApiField("remark")
        private String remark;
        @ApiField("userid")
        private String userid;

        public Date getDate()
        {
            return this.date;
        }

        public void setDate(Date date)
        {
            this.date = date;
        }

        public String getOperationResult()
        {
            return this.operationResult;
        }

        public void setOperationResult(String operationResult)
        {
            this.operationResult = operationResult;
        }

        public String getOperationType()
        {
            return this.operationType;
        }

        public void setOperationType(String operationType)
        {
            this.operationType = operationType;
        }

        public String getRemark()
        {
            return this.remark;
        }

        public void setRemark(String remark)
        {
            this.remark = remark;
        }

        public String getUserid()
        {
            return this.userid;
        }

        public void setUserid(String userid)
        {
            this.userid = userid;
        }
    }

    public static class TaskTopVo
            extends TaobaoObject
    {
        private static final long serialVersionUID = 5339115239311545679L;
        @ApiField("create_time")
        private Date createTime;
        @ApiField("finish_time")
        private Date finishTime;
        @ApiField("task_result")
        private String taskResult;
        @ApiField("task_status")
        private String taskStatus;
        @ApiField("taskid")
        private String taskid;
        @ApiField("userid")
        private String userid;

        public Date getCreateTime()
        {
            return this.createTime;
        }

        public void setCreateTime(Date createTime)
        {
            this.createTime = createTime;
        }

        public Date getFinishTime()
        {
            return this.finishTime;
        }

        public void setFinishTime(Date finishTime)
        {
            this.finishTime = finishTime;
        }

        public String getTaskResult()
        {
            return this.taskResult;
        }

        public void setTaskResult(String taskResult)
        {
            this.taskResult = taskResult;
        }

        public String getTaskStatus()
        {
            return this.taskStatus;
        }

        public void setTaskStatus(String taskStatus)
        {
            this.taskStatus = taskStatus;
        }

        public String getTaskid()
        {
            return this.taskid;
        }

        public void setTaskid(String taskid)
        {
            this.taskid = taskid;
        }

        public String getUserid()
        {
            return this.userid;
        }

        public void setUserid(String userid)
        {
            this.userid = userid;
        }
    }

    public static class ProcessInstanceTopVo
            extends TaobaoObject
    {
        private static final long serialVersionUID = 3681526255275267251L;
        @ApiListField("approver_userids")
        @ApiField("string")
        private List<String> approverUserids;
        @ApiListField("attached_process_instance_ids")
        @ApiField("string")
        private List<String> attachedProcessInstanceIds;
        @ApiField("biz_action")
        private String bizAction;
        @ApiField("business_id")
        private String businessId;
        @ApiListField("cc_userids")
        @ApiField("string")
        private List<String> ccUserids;
        @ApiField("create_time")
        private Date createTime;
        @ApiField("finish_time")
        private Date finishTime;
        @ApiListField("form_component_values")
        @ApiField("form_component_value_vo")
        private List<SmartworkBpmsProcessinstanceGetResponse.FormComponentValueVo> formComponentValues;
        @ApiListField("operation_records")
        @ApiField("operation_records_vo")
        private List<SmartworkBpmsProcessinstanceGetResponse.OperationRecordsVo> operationRecords;
        @ApiField("originator_dept_id")
        private String originatorDeptId;
        @ApiField("originator_dept_name")
        private String originatorDeptName;
        @ApiField("originator_userid")
        private String originatorUserid;
        @ApiField("result")
        private String result;
        @ApiField("status")
        private String status;
        @ApiListField("tasks")
        @ApiField("task_top_vo")
        private List<SmartworkBpmsProcessinstanceGetResponse.TaskTopVo> tasks;
        @ApiField("title")
        private String title;

        public List<String> getApproverUserids()
        {
            return this.approverUserids;
        }

        public void setApproverUserids(List<String> approverUserids)
        {
            this.approverUserids = approverUserids;
        }

        public List<String> getAttachedProcessInstanceIds()
        {
            return this.attachedProcessInstanceIds;
        }

        public void setAttachedProcessInstanceIds(List<String> attachedProcessInstanceIds)
        {
            this.attachedProcessInstanceIds = attachedProcessInstanceIds;
        }

        public String getBizAction()
        {
            return this.bizAction;
        }

        public void setBizAction(String bizAction)
        {
            this.bizAction = bizAction;
        }

        public String getBusinessId()
        {
            return this.businessId;
        }

        public void setBusinessId(String businessId)
        {
            this.businessId = businessId;
        }

        public List<String> getCcUserids()
        {
            return this.ccUserids;
        }

        public void setCcUserids(List<String> ccUserids)
        {
            this.ccUserids = ccUserids;
        }

        public Date getCreateTime()
        {
            return this.createTime;
        }

        public void setCreateTime(Date createTime)
        {
            this.createTime = createTime;
        }

        public Date getFinishTime()
        {
            return this.finishTime;
        }

        public void setFinishTime(Date finishTime)
        {
            this.finishTime = finishTime;
        }

        public List<SmartworkBpmsProcessinstanceGetResponse.FormComponentValueVo> getFormComponentValues()
        {
            return this.formComponentValues;
        }

        public void setFormComponentValues(List<SmartworkBpmsProcessinstanceGetResponse.FormComponentValueVo> formComponentValues)
        {
            this.formComponentValues = formComponentValues;
        }

        public List<SmartworkBpmsProcessinstanceGetResponse.OperationRecordsVo> getOperationRecords()
        {
            return this.operationRecords;
        }

        public void setOperationRecords(List<SmartworkBpmsProcessinstanceGetResponse.OperationRecordsVo> operationRecords)
        {
            this.operationRecords = operationRecords;
        }

        public String getOriginatorDeptId()
        {
            return this.originatorDeptId;
        }

        public void setOriginatorDeptId(String originatorDeptId)
        {
            this.originatorDeptId = originatorDeptId;
        }

        public String getOriginatorDeptName()
        {
            return this.originatorDeptName;
        }

        public void setOriginatorDeptName(String originatorDeptName)
        {
            this.originatorDeptName = originatorDeptName;
        }

        public String getOriginatorUserid()
        {
            return this.originatorUserid;
        }

        public void setOriginatorUserid(String originatorUserid)
        {
            this.originatorUserid = originatorUserid;
        }

        public String getResult()
        {
            return this.result;
        }

        public void setResult(String result)
        {
            this.result = result;
        }

        public String getStatus()
        {
            return this.status;
        }

        public void setStatus(String status)
        {
            this.status = status;
        }

        public List<SmartworkBpmsProcessinstanceGetResponse.TaskTopVo> getTasks()
        {
            return this.tasks;
        }

        public void setTasks(List<SmartworkBpmsProcessinstanceGetResponse.TaskTopVo> tasks)
        {
            this.tasks = tasks;
        }

        public String getTitle()
        {
            return this.title;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }
    }

    public static class DingOpenResult
            extends TaobaoObject
    {
        private static final long serialVersionUID = 4784823898441678266L;
        @ApiField("ding_open_errcode")
        private Long dingOpenErrcode;
        @ApiField("error_msg")
        private String errorMsg;
        @ApiField("process_instance")
        private SmartworkBpmsProcessinstanceGetResponse.ProcessInstanceTopVo processInstance;
        @ApiField("success")
        private Boolean success;

        public Long getDingOpenErrcode()
        {
            return this.dingOpenErrcode;
        }

        public void setDingOpenErrcode(Long dingOpenErrcode)
        {
            this.dingOpenErrcode = dingOpenErrcode;
        }

        public String getErrorMsg()
        {
            return this.errorMsg;
        }

        public void setErrorMsg(String errorMsg)
        {
            this.errorMsg = errorMsg;
        }

        public SmartworkBpmsProcessinstanceGetResponse.ProcessInstanceTopVo getProcessInstance()
        {
            return this.processInstance;
        }

        public void setProcessInstance(SmartworkBpmsProcessinstanceGetResponse.ProcessInstanceTopVo processInstance)
        {
            this.processInstance = processInstance;
        }

        public Boolean getSuccess()
        {
            return this.success;
        }

        public void setSuccess(Boolean success)
        {
            this.success = success;
        }
    }
}
