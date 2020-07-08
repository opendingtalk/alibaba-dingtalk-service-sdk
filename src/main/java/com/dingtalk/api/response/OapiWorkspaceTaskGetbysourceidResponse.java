package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.task.getbysourceid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceTaskGetbysourceidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1662691599221229839L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 响应结果
	 */
	@ApiField("result")
	private Task result;


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

	public void setResult(Task result) {
		this.result = result;
	}
	public Task getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 任务的扩展字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TaskExtension extends TaobaoObject {
		private static final long serialVersionUID = 3476426945257393271L;
		/**
		 * 评论数
		 */
		@ApiField("comment_count")
		private String commentCount;
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
	
		public String getCommentCount() {
			return this.commentCount;
		}
		public void setCommentCount(String commentCount) {
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
	}
	
	/**
	 * 响应结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Task extends TaobaoObject {
		private static final long serialVersionUID = 4366889279656899433L;
		/**
		 * 归属企业id
		 */
		@ApiField("belong_corp_id")
		private String belongCorpId;
		/**
		 * 业务标识
		 */
		@ApiField("biz_tag")
		private String bizTag;
		/**
		 * 任务所属项目(虚拟企业），基于项目空间的项目
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 创建者id
		 */
		@ApiField("creator_userid")
		private String creatorUserid;
		/**
		 * 任务描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 执行者id
		 */
		@ApiField("executor_userid")
		private String executorUserid;
		/**
		 * 任务的扩展字段
		 */
		@ApiField("extension")
		private TaskExtension extension;
		/**
		 * 完成时间
		 */
		@ApiField("finish_date")
		private Date finishDate;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
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
		 * 计划完成时间
		 */
		@ApiField("plan_finish_date")
		private Date planFinishDate;
		/**
		 * 计划开始时间
		 */
		@ApiField("plan_start_date")
		private Date planStartDate;
		/**
		 * 优先级
		 */
		@ApiField("priority")
		private Long priority;
		/**
		 * 任务source来源
		 */
		@ApiField("source")
		private String source;
		/**
		 * 来源id
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 开始时间
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
		 * 任务id
		 */
		@ApiField("task_id")
		private String taskId;
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
	
		public String getBelongCorpId() {
			return this.belongCorpId;
		}
		public void setBelongCorpId(String belongCorpId) {
			this.belongCorpId = belongCorpId;
		}
		public String getBizTag() {
			return this.bizTag;
		}
		public void setBizTag(String bizTag) {
			this.bizTag = bizTag;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getCreatorUserid() {
			return this.creatorUserid;
		}
		public void setCreatorUserid(String creatorUserid) {
			this.creatorUserid = creatorUserid;
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
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
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
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
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
