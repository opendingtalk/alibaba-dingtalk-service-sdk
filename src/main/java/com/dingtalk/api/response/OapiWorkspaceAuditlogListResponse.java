package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workspace.auditlog.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiWorkspaceAuditlogListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7894767834617962427L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private OpenAuditLogDto result;


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

	public void setResult(OpenAuditLogDto result) {
		this.result = result;
	}
	public OpenAuditLogDto getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 记录列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EventAuditLogDto extends TaobaoObject {
		private static final long serialVersionUID = 2214388171484185283L;
		/**
		 * 操作类型
		 */
		@ApiField("action")
		private String action;
		/**
		 * 文件id
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 操作机器浏览器
		 */
		@ApiField("browser")
		private String browser;
		/**
		 * 用户的钉钉id
		 */
		@ApiField("ding_talk_id")
		private String dingTalkId;
		/**
		 * 用户所在企业中的员工id
		 */
		@ApiField("emp_id")
		private String empId;
		/**
		 * 记录修改时间，unix时间戳，单位ms
		 */
		@ApiField("gmt_create")
		private String gmtCreate;
		/**
		 * 操作机器ip
		 */
		@ApiField("ip_address")
		private String ipAddress;
		/**
		 * 操作者名字
		 */
		@ApiField("operator_name")
		private String operatorName;
		/**
		 * 企业名称
		 */
		@ApiField("org_name")
		private String orgName;
		/**
		 * 操作端
		 */
		@ApiField("platform")
		private String platform;
		/**
		 * 项目名称
		 */
		@ApiField("project_name")
		private String projectName;
		/**
		 * 文件接收方名称
		 */
		@ApiField("receiver_name")
		private String receiverName;
		/**
		 * 文件名
		 */
		@ApiField("resource")
		private String resource;
		/**
		 * 文件类型
		 */
		@ApiField("resource_extension")
		private String resourceExtension;
		/**
		 * 文件大小
		 */
		@ApiField("resource_size")
		private String resourceSize;
		/**
		 * 任务名称
		 */
		@ApiField("task_name")
		private String taskName;
	
		public String getAction() {
			return this.action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getBrowser() {
			return this.browser;
		}
		public void setBrowser(String browser) {
			this.browser = browser;
		}
		public String getDingTalkId() {
			return this.dingTalkId;
		}
		public void setDingTalkId(String dingTalkId) {
			this.dingTalkId = dingTalkId;
		}
		public String getEmpId() {
			return this.empId;
		}
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		public String getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getIpAddress() {
			return this.ipAddress;
		}
		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}
		public String getOperatorName() {
			return this.operatorName;
		}
		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public String getPlatform() {
			return this.platform;
		}
		public void setPlatform(String platform) {
			this.platform = platform;
		}
		public String getProjectName() {
			return this.projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getReceiverName() {
			return this.receiverName;
		}
		public void setReceiverName(String receiverName) {
			this.receiverName = receiverName;
		}
		public String getResource() {
			return this.resource;
		}
		public void setResource(String resource) {
			this.resource = resource;
		}
		public String getResourceExtension() {
			return this.resourceExtension;
		}
		public void setResourceExtension(String resourceExtension) {
			this.resourceExtension = resourceExtension;
		}
		public String getResourceSize() {
			return this.resourceSize;
		}
		public void setResourceSize(String resourceSize) {
			this.resourceSize = resourceSize;
		}
		public String getTaskName() {
			return this.taskName;
		}
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
	}
	
	/**
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenAuditLogDto extends TaobaoObject {
		private static final long serialVersionUID = 4765634817143697513L;
		/**
		 * 记录列表
		 */
		@ApiListField("log_list")
		@ApiField("event_audit_log_dto")
		private List<EventAuditLogDto> logList;
	
		public List<EventAuditLogDto> getLogList() {
			return this.logList;
		}
		public void setLogList(List<EventAuditLogDto> logList) {
			this.logList = logList;
		}
	}
	


}
