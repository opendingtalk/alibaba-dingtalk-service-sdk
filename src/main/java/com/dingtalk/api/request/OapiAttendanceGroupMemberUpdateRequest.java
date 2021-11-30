package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiAttendanceGroupMemberUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.member.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.17
 */
public class OapiAttendanceGroupMemberUpdateRequest extends BaseTaobaoRequest<OapiAttendanceGroupMemberUpdateResponse> {
	
	

	/** 
	* 考勤组id
	 */
	private Long groupId;

	/** 
	* 操作人userId
	 */
	private String opUserId;

	/** 
	* 0表示从今天开始排班，1表示从明天
	 */
	private Long scheduleFlag;

	/** 
	* 更新入参
	 */
	private String updateParam;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setScheduleFlag(Long scheduleFlag) {
		this.scheduleFlag = scheduleFlag;
	}

	public Long getScheduleFlag() {
		return this.scheduleFlag;
	}

	public void setUpdateParam(String updateParam) {
		this.updateParam = updateParam;
	}

	public void setUpdateParam(TopGroupMemberUpdateParam updateParam) {
		this.updateParam = new JSONWriter(false,false,true).write(updateParam);
	}

	public String getUpdateParam() {
		return this.updateParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.member.update";
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
		txtParams.put("group_id", this.groupId);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("schedule_flag", this.scheduleFlag);
		txtParams.put("update_param", this.updateParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupMemberUpdateResponse> getResponseClass() {
		return OapiAttendanceGroupMemberUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupId, "groupId");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(scheduleFlag, "scheduleFlag");
	}
	
	/**
	 * 更新入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopGroupMemberUpdateParam extends TaobaoObject {
		private static final long serialVersionUID = 2332649857815964479L;
		/**
		 * 要添加的考勤部门，没有的话，无需赋值
		 */
		@ApiListField("add_depts")
		@ApiField("string")
		private List<String> addDepts;
		/**
		 * 要添加的无需考勤人员，没有的话，无需赋值
		 */
		@ApiListField("add_extra_users")
		@ApiField("string")
		private List<String> addExtraUsers;
		/**
		 * 要添加的考勤人员，没有的话，无需赋值
		 */
		@ApiListField("add_users")
		@ApiField("string")
		private List<String> addUsers;
		/**
		 * 要删除的考勤部门，没有的话，无需赋值
		 */
		@ApiListField("remove_depts")
		@ApiField("string")
		private List<String> removeDepts;
		/**
		 * 要删除的无需考勤人员，没有的话，无需赋值
		 */
		@ApiListField("remove_extra_users")
		@ApiField("string")
		private List<String> removeExtraUsers;
		/**
		 * 要删除的考勤人员，没有的话，无需赋值
		 */
		@ApiListField("remove_users")
		@ApiField("string")
		private List<String> removeUsers;
	
		public List<String> getAddDepts() {
			return this.addDepts;
		}
		public void setAddDepts(List<String> addDepts) {
			this.addDepts = addDepts;
		}
		public List<String> getAddExtraUsers() {
			return this.addExtraUsers;
		}
		public void setAddExtraUsers(List<String> addExtraUsers) {
			this.addExtraUsers = addExtraUsers;
		}
		public List<String> getAddUsers() {
			return this.addUsers;
		}
		public void setAddUsers(List<String> addUsers) {
			this.addUsers = addUsers;
		}
		public List<String> getRemoveDepts() {
			return this.removeDepts;
		}
		public void setRemoveDepts(List<String> removeDepts) {
			this.removeDepts = removeDepts;
		}
		public List<String> getRemoveExtraUsers() {
			return this.removeExtraUsers;
		}
		public void setRemoveExtraUsers(List<String> removeExtraUsers) {
			this.removeExtraUsers = removeExtraUsers;
		}
		public List<String> getRemoveUsers() {
			return this.removeUsers;
		}
		public void setRemoveUsers(List<String> removeUsers) {
			this.removeUsers = removeUsers;
		}
	}
	

}