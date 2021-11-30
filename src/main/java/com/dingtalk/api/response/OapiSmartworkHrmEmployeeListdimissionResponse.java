package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.listdimission response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeListdimissionResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5193144378621445587L;

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
	 * 数据结果
	 */
	@ApiListField("result")
	@ApiField("emp_dimission_info_vo")
	private List<EmpDimissionInfoVo> result;

	/** 
	 * success
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

	public void setResult(List<EmpDimissionInfoVo> result) {
		this.result = result;
	}
	public List<EmpDimissionInfoVo> getResult( ) {
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
	 * 离职部门列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpDeptVO extends TaobaoObject {
		private static final long serialVersionUID = 5729711351555829797L;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
		/**
		 * 部门路径
		 */
		@ApiField("dept_path")
		private String deptPath;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
		public String getDeptPath() {
			return this.deptPath;
		}
		public void setDeptPath(String deptPath) {
			this.deptPath = deptPath;
		}
	}
	
	/**
	 * 数据结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EmpDimissionInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 5614364761419448366L;
		/**
		 * 离职部门列表
		 */
		@ApiListField("dept_list")
		@ApiField("emp_dept_v_o")
		private List<EmpDeptVO> deptList;
		/**
		 * 离职交接人
		 */
		@ApiField("handover_userid")
		private String handoverUserid;
		/**
		 * 最后工作日
		 */
		@ApiField("last_work_day")
		private Long lastWorkDay;
		/**
		 * 离职前主部门id
		 */
		@ApiField("main_dept_id")
		private Long mainDeptId;
		/**
		 * 离职前主部门名称
		 */
		@ApiField("main_dept_name")
		private String mainDeptName;
		/**
		 * 离职前工作状态：1，待入职；2，试用期；3，正式
		 */
		@ApiField("pre_status")
		private Long preStatus;
		/**
		 * 离职原因备注
		 */
		@ApiField("reason_memo")
		private String reasonMemo;
		/**
		 * 离职原因类型：1，家庭原因；2，个人原因；3，发展原因；4，合同到期不续签；5，协议解除；6，无法胜任工作；7，经济性裁员；8，严重违法违纪；9，其他
		 */
		@ApiField("reason_type")
		private Long reasonType;
		/**
		 * 离职状态：1，待离职；2，已离职
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<EmpDeptVO> getDeptList() {
			return this.deptList;
		}
		public void setDeptList(List<EmpDeptVO> deptList) {
			this.deptList = deptList;
		}
		public String getHandoverUserid() {
			return this.handoverUserid;
		}
		public void setHandoverUserid(String handoverUserid) {
			this.handoverUserid = handoverUserid;
		}
		public Long getLastWorkDay() {
			return this.lastWorkDay;
		}
		public void setLastWorkDay(Long lastWorkDay) {
			this.lastWorkDay = lastWorkDay;
		}
		public Long getMainDeptId() {
			return this.mainDeptId;
		}
		public void setMainDeptId(Long mainDeptId) {
			this.mainDeptId = mainDeptId;
		}
		public String getMainDeptName() {
			return this.mainDeptName;
		}
		public void setMainDeptName(String mainDeptName) {
			this.mainDeptName = mainDeptName;
		}
		public Long getPreStatus() {
			return this.preStatus;
		}
		public void setPreStatus(Long preStatus) {
			this.preStatus = preStatus;
		}
		public String getReasonMemo() {
			return this.reasonMemo;
		}
		public void setReasonMemo(String reasonMemo) {
			this.reasonMemo = reasonMemo;
		}
		public Long getReasonType() {
			return this.reasonType;
		}
		public void setReasonType(Long reasonType) {
			this.reasonType = reasonType;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
