package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.bpms.processes.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpBpmsProcessesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2295613596653813119L;

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
	 * 审批流列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessVo extends TaobaoObject {
		private static final long serialVersionUID = 4512687579715155114L;
		/**
		 * 考勤关联类型，NONE表示无关联，LEAVE表示请假，OUT表示出差外出，OVERTIME表示加班，REPAIR_CHECK表示补卡申请
		 */
		@ApiField("attendance_type")
		private String attendanceType;
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
		private static final long serialVersionUID = 8549373446424536135L;
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
		 * 审批流列表
		 */
		@ApiListField("process_list")
		@ApiField("process_vo")
		private List<ProcessVo> processList;
		/**
		 * 是否成功
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
		public List<ProcessVo> getProcessList() {
			return this.processList;
		}
		public void setProcessList(List<ProcessVo> processList) {
			this.processList = processList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
