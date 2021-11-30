package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.bpms.process.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpBpmsProcessCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4378656912447112833L;

	/** 
	 * 返回结果
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
	 * 审批流
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessVo extends TaobaoObject {
		private static final long serialVersionUID = 3572844851875886737L;
		/**
		 * 考勤关联类型，NONE表示无关联，LEAVE表示请假，OUT表示出差外出，OVERTIME表示加班，REPAIR_CHECK表示补卡申请
		 */
		@ApiField("attendance_type")
		private String attendanceType;
		/**
		 * 业务分类标识
		 */
		@ApiField("biz_category_id")
		private String bizCategoryId;
		/**
		 * 业务组织标识，dingtalk表示钉钉
		 */
		@ApiField("biz_org_id")
		private String bizOrgId;
		/**
		 * 描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 图标链接
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 排序顺序
		 */
		@ApiField("list_order")
		private Long listOrder;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 审批流唯一标识
		 */
		@ApiField("process_code")
		private String processCode;
		/**
		 * 状态，PUBLISHED表示启用，INVALID表示停用，SAVED表示草稿
		 */
		@ApiField("status")
		private String status;
		/**
		 * 类型，INTERNAL表示内部审批单，EXTERNAL表示外部业务单
		 */
		@ApiField("type")
		private String type;
	
		public String getAttendanceType() {
			return this.attendanceType;
		}
		public void setAttendanceType(String attendanceType) {
			this.attendanceType = attendanceType;
		}
		public String getBizCategoryId() {
			return this.bizCategoryId;
		}
		public void setBizCategoryId(String bizCategoryId) {
			this.bizCategoryId = bizCategoryId;
		}
		public String getBizOrgId() {
			return this.bizOrgId;
		}
		public void setBizOrgId(String bizOrgId) {
			this.bizOrgId = bizOrgId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getIconUrl() {
			return this.iconUrl;
		}
		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}
		public Long getListOrder() {
			return this.listOrder;
		}
		public void setListOrder(Long listOrder) {
			this.listOrder = listOrder;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3416885342717324486L;
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
		 * 审批流
		 */
		@ApiField("process")
		private ProcessVo process;
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
		public ProcessVo getProcess() {
			return this.process;
		}
		public void setProcess(ProcessVo process) {
			this.process = process;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
