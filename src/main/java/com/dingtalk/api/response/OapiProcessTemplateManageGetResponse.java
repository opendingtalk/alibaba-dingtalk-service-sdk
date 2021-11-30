package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.template.manage.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessTemplateManageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6396965542213718935L;

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
	 * 模版对象
	 */
	@ApiListField("result")
	@ApiField("process_simple_v_o")
	private List<ProcessSimpleVO> result;

	/** 
	 * 成功
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(List<ProcessSimpleVO> result) {
		this.result = result;
	}
	public List<ProcessSimpleVO> getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 模版对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProcessSimpleVO extends TaobaoObject {
		private static final long serialVersionUID = 3585779773592969424L;
		/**
		 * 关联考勤类型 ，0: 无 ；1：补卡申请 ；2：请假。。。
		 */
		@ApiField("attendance_type")
		private Long attendanceType;
		/**
		 * 模版名
		 */
		@ApiField("flow_title")
		private String flowTitle;
		/**
		 * 修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 图标名
		 */
		@ApiField("icon_name")
		private String iconName;
		/**
		 * 图标地址
		 */
		@ApiField("icon_url")
		private String iconUrl;
		/**
		 * 是否新模版
		 */
		@ApiField("is_new_process")
		private Boolean isNewProcess;
		/**
		 * 模版code
		 */
		@ApiField("process_code")
		private String processCode;
	
		public Long getAttendanceType() {
			return this.attendanceType;
		}
		public void setAttendanceType(Long attendanceType) {
			this.attendanceType = attendanceType;
		}
		public String getFlowTitle() {
			return this.flowTitle;
		}
		public void setFlowTitle(String flowTitle) {
			this.flowTitle = flowTitle;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getIconName() {
			return this.iconName;
		}
		public void setIconName(String iconName) {
			this.iconName = iconName;
		}
		public String getIconUrl() {
			return this.iconUrl;
		}
		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}
		public Boolean getIsNewProcess() {
			return this.isNewProcess;
		}
		public void setIsNewProcess(Boolean isNewProcess) {
			this.isNewProcess = isNewProcess;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	


}
