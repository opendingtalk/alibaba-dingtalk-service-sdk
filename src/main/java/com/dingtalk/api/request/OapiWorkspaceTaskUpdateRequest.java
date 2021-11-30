package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiWorkspaceTaskUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.task.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.20
 */
public class OapiWorkspaceTaskUpdateRequest extends BaseTaobaoRequest<OapiWorkspaceTaskUpdateResponse> {
	
	

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 操作者id
	 */
	private String operatorUserid;

	/** 
	* 请求入参
	 */
	private String task;

	/** 
	* 任务ID
	 */
	private String taskId;

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setOperatorUserid(String operatorUserid) {
		this.operatorUserid = operatorUserid;
	}

	public String getOperatorUserid() {
		return this.operatorUserid;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public void setTask(TaskUpdate task) {
		this.task = new JSONWriter(false,false,true).write(task);
	}

	public String getTask() {
		return this.task;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workspace.task.update";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("operator_userid", this.operatorUserid);
		txtParams.put("task", this.task);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkspaceTaskUpdateResponse> getResponseClass() {
		return OapiWorkspaceTaskUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	
	/**
	 * 待办系统属性，主要包含接入方的详情页跳转链接
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskSystemProperty extends TaobaoObject {
		private static final long serialVersionUID = 5746844488512524733L;
		/**
		 * APP 跳转连接
		 */
		@ApiField("appUrl")
		private String appUrl;
		/**
		 * web 跳转连接
		 */
		@ApiField("webUrl")
		private String webUrl;
	
		public String getAppUrl() {
			return this.appUrl;
		}
		public void setAppUrl(String appUrl) {
			this.appUrl = appUrl;
		}
		public String getWebUrl() {
			return this.webUrl;
		}
		public void setWebUrl(String webUrl) {
			this.webUrl = webUrl;
		}
	}
	
	/**
	 * 任务的扩展字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskExtension extends TaobaoObject {
		private static final long serialVersionUID = 5819764186986468976L;
		/**
		 * 评论数
		 */
		@ApiField("comment_count")
		private Long commentCount;
		/**
		 * 附件地址
		 */
		@ApiField("file_path")
		private String filePath;
		/**
		 * 用户可扩展的字段
		 */
		@ApiField("other")
		private String other;
		/**
		 * 待办系统属性，主要包含接入方的详情页跳转链接
		 */
		@ApiField("systemProperty")
		private TaskSystemProperty systemProperty;
	
		public Long getCommentCount() {
			return this.commentCount;
		}
		public void setCommentCount(Long commentCount) {
			this.commentCount = commentCount;
		}
		public String getFilePath() {
			return this.filePath;
		}
		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}
		public String getOther() {
			return this.other;
		}
		public void setOther(String other) {
			this.other = other;
		}
		public TaskSystemProperty getSystemProperty() {
			return this.systemProperty;
		}
		public void setSystemProperty(TaskSystemProperty systemProperty) {
			this.systemProperty = systemProperty;
		}
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskUpdate extends TaobaoObject {
		private static final long serialVersionUID = 1266366923151283938L;
		/**
		 * 任务所属项目(虚拟企业），基于项目空间的项目
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 描述（传null不更新，传空串则清空原值）
		 */
		@ApiField("description")
		private String description;
		/**
		 * 执行者id（传null不更新，传空串则清空原值）
		 */
		@ApiField("executor_userid")
		private String executorUserid;
		/**
		 * 任务的扩展字段
		 */
		@ApiField("extension")
		private TaskExtension extension;
		/**
		 * 完成时间（传null不更新，传Date(0)，即1970-01-01T08:00:00.000+08:00则清空原值）
		 */
		@ApiField("finish_date")
		private Date finishDate;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 是否归档
		 */
		@ApiField("is_archived")
		private Boolean isArchived;
		/**
		 * 是否放入回收站
		 */
		@ApiField("is_recycled")
		private Boolean isRecycled;
		/**
		 * 更新者id
		 */
		@ApiField("modifier_userid")
		private String modifierUserid;
		/**
		 * 父任务id
		 */
		@ApiField("parent_id")
		private String parentId;
		/**
		 * 计划结束时间（传null不更新，传Date(0)，即1970-01-01T08:00:00.000+08:00则清空原值）
		 */
		@ApiField("plan_finish_date")
		private Date planFinishDate;
		/**
		 * 计划开始时间（传null不更新，传Date(0)，即1970-01-01T08:00:00.000+08:00则清空原值）
		 */
		@ApiField("plan_start_date")
		private Date planStartDate;
		/**
		 * 优先级
		 */
		@ApiField("priority")
		private Long priority;
		/**
		 * 任务来源source
		 */
		@ApiField("source")
		private String source;
		/**
		 * 来源id
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 开始日期（传null不更新，传Date(0)，即1970-01-01T08:00:00.000+08:00则清空原值）
		 */
		@ApiField("start_date")
		private Date startDate;
		/**
		 * 工作流状态id
		 */
		@ApiField("status_id")
		private Long statusId;
		/**
		 * 状态阶段: 开始阶段(0)，进行阶段(1)，完成阶段(2)
		 */
		@ApiField("status_stage")
		private Long statusStage;
		/**
		 * 标题
		 */
		@ApiField("subject")
		private String subject;
		/**
		 * 任务类型分类: 任务 TASK("task"),      需求     REQ("req"),      缺陷     BUG("bug"),      风险     RISK("risk"),      工作项     WORKITEM("workitem")
		 */
		@ApiField("task_type_category")
		private String taskTypeCategory;
		/**
		 * 任务类型id
		 */
		@ApiField("task_type_id")
		private Long taskTypeId;
		/**
		 * 任务参与者列表
		 */
		@ApiListField("tracker_userids")
		@ApiField("string")
		private List<String> trackerUserids;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getExecutorUserid() {
			return this.executorUserid;
		}
		public void setExecutorUserid(String executorUserid) {
			this.executorUserid = executorUserid;
		}
		public TaskExtension getExtension() {
			return this.extension;
		}
		public void setExtension(TaskExtension extension) {
			this.extension = extension;
		}
		public Date getFinishDate() {
			return this.finishDate;
		}
		public void setFinishDate(Date finishDate) {
			this.finishDate = finishDate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Boolean getIsArchived() {
			return this.isArchived;
		}
		public void setIsArchived(Boolean isArchived) {
			this.isArchived = isArchived;
		}
		public Boolean getIsRecycled() {
			return this.isRecycled;
		}
		public void setIsRecycled(Boolean isRecycled) {
			this.isRecycled = isRecycled;
		}
		public String getModifierUserid() {
			return this.modifierUserid;
		}
		public void setModifierUserid(String modifierUserid) {
			this.modifierUserid = modifierUserid;
		}
		public String getParentId() {
			return this.parentId;
		}
		public void setParentId(String parentId) {
			this.parentId = parentId;
		}
		public Date getPlanFinishDate() {
			return this.planFinishDate;
		}
		public void setPlanFinishDate(Date planFinishDate) {
			this.planFinishDate = planFinishDate;
		}
		public Date getPlanStartDate() {
			return this.planStartDate;
		}
		public void setPlanStartDate(Date planStartDate) {
			this.planStartDate = planStartDate;
		}
		public Long getPriority() {
			return this.priority;
		}
		public void setPriority(Long priority) {
			this.priority = priority;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public Date getStartDate() {
			return this.startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Long getStatusId() {
			return this.statusId;
		}
		public void setStatusId(Long statusId) {
			this.statusId = statusId;
		}
		public Long getStatusStage() {
			return this.statusStage;
		}
		public void setStatusStage(Long statusStage) {
			this.statusStage = statusStage;
		}
		public String getSubject() {
			return this.subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getTaskTypeCategory() {
			return this.taskTypeCategory;
		}
		public void setTaskTypeCategory(String taskTypeCategory) {
			this.taskTypeCategory = taskTypeCategory;
		}
		public Long getTaskTypeId() {
			return this.taskTypeId;
		}
		public void setTaskTypeId(Long taskTypeId) {
			this.taskTypeId = taskTypeId;
		}
		public List<String> getTrackerUserids() {
			return this.trackerUserids;
		}
		public void setTrackerUserids(List<String> trackerUserids) {
			this.trackerUserids = trackerUserids;
		}
	}
	

}