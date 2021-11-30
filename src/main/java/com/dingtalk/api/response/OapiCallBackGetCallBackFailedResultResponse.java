package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.call_back.get_call_back_failed_result response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCallBackGetCallBackFailedResultResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5462244148598252394L;

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
	 * 事件列表，一次最多200个
	 */
	@ApiListField("failed_list")
	@ApiField("failed")
	private List<Failed> failedList;

	/** 
	 * has_more
	 */
	@ApiField("has_more")
	private Boolean hasMore;


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

	public void setFailedList(List<Failed> failedList) {
		this.failedList = failedList;
	}
	public List<Failed> getFailedList( ) {
		return this.failedList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 事件列表，一次最多200个
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Failed extends TaobaoObject {
		private static final long serialVersionUID = 7759656958447154835L;
		/**
		 * bpms_instance_change
		 */
		@ApiField("bpms_instance_change")
		private String bpmsInstanceChange;
		/**
		 * bpms_task_change
		 */
		@ApiField("bpms_task_change")
		private String bpmsTaskChange;
		/**
		 * 事件类型，有20种，“user_add_org”, “user_modify_org”, “user_leave_org”,“org_admin_add”, “org_admin_remove”, “org_dept_create”, “org_dept_modify”, “org_dept_remove”, “org_remove”, “chat_add_member”, “chat_remove_member”, “chat_quit”, “chat_update_owner”, “chat_update_title”, “chat_disband”,“chat_disband_microapp”, “check_in”,“bpms_task_change”,“bpms_instance_change”,“label_user_change”, “label_conf_add”, “label_conf_modify”,“label_conf_del”
		 */
		@ApiField("call_back_tag")
		private String callBackTag;
		/**
		 * check_in
		 */
		@ApiField("check_in")
		private String checkIn;
		/**
		 * data
		 */
		@ApiField("data")
		private String data;
		/**
		 * event_time
		 */
		@ApiField("event_time")
		private Long eventTime;
		/**
		 * org_admin_add
		 */
		@ApiField("org_admin_add")
		private String orgAdminAdd;
		/**
		 * org_admin_remove
		 */
		@ApiField("org_admin_remove")
		private String orgAdminRemove;
		/**
		 * org_change
		 */
		@ApiField("org_change")
		private String orgChange;
		/**
		 * org_dept_create
		 */
		@ApiField("org_dept_create")
		private String orgDeptCreate;
		/**
		 * org_dept_modify
		 */
		@ApiField("org_dept_modify")
		private String orgDeptModify;
		/**
		 * org_dept_remove
		 */
		@ApiField("org_dept_remove")
		private String orgDeptRemove;
		/**
		 * user_add_org
		 */
		@ApiField("user_add_org")
		private String userAddOrg;
		/**
		 * user_leave_org
		 */
		@ApiField("user_leave_org")
		private String userLeaveOrg;
		/**
		 * user_modify_org
		 */
		@ApiField("user_modify_org")
		private String userModifyOrg;
	
		public String getBpmsInstanceChange() {
			return this.bpmsInstanceChange;
		}
		public void setBpmsInstanceChange(String bpmsInstanceChange) {
			this.bpmsInstanceChange = bpmsInstanceChange;
		}
		public void setBpmsInstanceChangeString(String bpmsInstanceChange) {
			this.bpmsInstanceChange = bpmsInstanceChange;
		}
		
		public String getBpmsTaskChange() {
			return this.bpmsTaskChange;
		}
		public void setBpmsTaskChange(String bpmsTaskChange) {
			this.bpmsTaskChange = bpmsTaskChange;
		}
		public void setBpmsTaskChangeString(String bpmsTaskChange) {
			this.bpmsTaskChange = bpmsTaskChange;
		}
		
		public String getCallBackTag() {
			return this.callBackTag;
		}
		public void setCallBackTag(String callBackTag) {
			this.callBackTag = callBackTag;
		}
		public String getCheckIn() {
			return this.checkIn;
		}
		public void setCheckIn(String checkIn) {
			this.checkIn = checkIn;
		}
		public void setCheckInString(String checkIn) {
			this.checkIn = checkIn;
		}
		
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
			this.data = data;
		}
		
		public Long getEventTime() {
			return this.eventTime;
		}
		public void setEventTime(Long eventTime) {
			this.eventTime = eventTime;
		}
		public String getOrgAdminAdd() {
			return this.orgAdminAdd;
		}
		public void setOrgAdminAdd(String orgAdminAdd) {
			this.orgAdminAdd = orgAdminAdd;
		}
		public void setOrgAdminAddString(String orgAdminAdd) {
			this.orgAdminAdd = orgAdminAdd;
		}
		
		public String getOrgAdminRemove() {
			return this.orgAdminRemove;
		}
		public void setOrgAdminRemove(String orgAdminRemove) {
			this.orgAdminRemove = orgAdminRemove;
		}
		public void setOrgAdminRemoveString(String orgAdminRemove) {
			this.orgAdminRemove = orgAdminRemove;
		}
		
		public String getOrgChange() {
			return this.orgChange;
		}
		public void setOrgChange(String orgChange) {
			this.orgChange = orgChange;
		}
		public void setOrgChangeString(String orgChange) {
			this.orgChange = orgChange;
		}
		
		public String getOrgDeptCreate() {
			return this.orgDeptCreate;
		}
		public void setOrgDeptCreate(String orgDeptCreate) {
			this.orgDeptCreate = orgDeptCreate;
		}
		public void setOrgDeptCreateString(String orgDeptCreate) {
			this.orgDeptCreate = orgDeptCreate;
		}
		
		public String getOrgDeptModify() {
			return this.orgDeptModify;
		}
		public void setOrgDeptModify(String orgDeptModify) {
			this.orgDeptModify = orgDeptModify;
		}
		public void setOrgDeptModifyString(String orgDeptModify) {
			this.orgDeptModify = orgDeptModify;
		}
		
		public String getOrgDeptRemove() {
			return this.orgDeptRemove;
		}
		public void setOrgDeptRemove(String orgDeptRemove) {
			this.orgDeptRemove = orgDeptRemove;
		}
		public void setOrgDeptRemoveString(String orgDeptRemove) {
			this.orgDeptRemove = orgDeptRemove;
		}
		
		public String getUserAddOrg() {
			return this.userAddOrg;
		}
		public void setUserAddOrg(String userAddOrg) {
			this.userAddOrg = userAddOrg;
		}
		public void setUserAddOrgString(String userAddOrg) {
			this.userAddOrg = userAddOrg;
		}
		
		public String getUserLeaveOrg() {
			return this.userLeaveOrg;
		}
		public void setUserLeaveOrg(String userLeaveOrg) {
			this.userLeaveOrg = userLeaveOrg;
		}
		public void setUserLeaveOrgString(String userLeaveOrg) {
			this.userLeaveOrg = userLeaveOrg;
		}
		
		public String getUserModifyOrg() {
			return this.userModifyOrg;
		}
		public void setUserModifyOrg(String userModifyOrg) {
			this.userModifyOrg = userModifyOrg;
		}
		public void setUserModifyOrgString(String userModifyOrg) {
			this.userModifyOrg = userModifyOrg;
		}
		
	}
	


}
