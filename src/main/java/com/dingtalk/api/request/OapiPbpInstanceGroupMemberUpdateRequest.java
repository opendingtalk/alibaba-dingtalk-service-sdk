package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiPbpInstanceGroupMemberUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.group.member.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.25
 */
public class OapiPbpInstanceGroupMemberUpdateRequest extends BaseTaobaoRequest<OapiPbpInstanceGroupMemberUpdateResponse> {
	
	

	/** 
	* 同步参数
	 */
	private String syncParam;

	public void setSyncParam(String syncParam) {
		this.syncParam = syncParam;
	}

	public void setSyncParam(PunchGroupSyncMemberParam syncParam) {
		this.syncParam = new JSONWriter(false,false,true).write(syncParam);
	}

	public String getSyncParam() {
		return this.syncParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.instance.group.member.update";
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
		txtParams.put("sync_param", this.syncParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpInstanceGroupMemberUpdateResponse> getResponseClass() {
		return OapiPbpInstanceGroupMemberUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 删除成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PunchGroupMemberParam extends TaobaoObject {
		private static final long serialVersionUID = 2598956858233817576L;
		/**
		 * 员工userId
		 */
		@ApiField("member_id")
		private String memberId;
		/**
		 * 成员类型，0表示员工
		 */
		@ApiField("type")
		private Long type;
	
		public String getMemberId() {
			return this.memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 同步参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PunchGroupSyncMemberParam extends TaobaoObject {
		private static final long serialVersionUID = 3237178711721998118L;
		/**
		 * 新增成员列表
		 */
		@ApiListField("add_member_list")
		@ApiField("punch_group_member_param")
		private List<PunchGroupMemberParam> addMemberList;
		/**
		 * 业务唯一标识
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 业务实例唯一标识
		 */
		@ApiField("biz_inst_id")
		private String bizInstId;
		/**
		 * 删除成员列表
		 */
		@ApiListField("delete_member_list")
		@ApiField("punch_group_member_param")
		private List<PunchGroupMemberParam> deleteMemberList;
		/**
		 * 打卡组唯一标识
		 */
		@ApiField("punch_group_id")
		private String punchGroupId;
	
		public List<PunchGroupMemberParam> getAddMemberList() {
			return this.addMemberList;
		}
		public void setAddMemberList(List<PunchGroupMemberParam> addMemberList) {
			this.addMemberList = addMemberList;
		}
		public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getBizInstId() {
			return this.bizInstId;
		}
		public void setBizInstId(String bizInstId) {
			this.bizInstId = bizInstId;
		}
		public List<PunchGroupMemberParam> getDeleteMemberList() {
			return this.deleteMemberList;
		}
		public void setDeleteMemberList(List<PunchGroupMemberParam> deleteMemberList) {
			this.deleteMemberList = deleteMemberList;
		}
		public String getPunchGroupId() {
			return this.punchGroupId;
		}
		public void setPunchGroupId(String punchGroupId) {
			this.punchGroupId = punchGroupId;
		}
	}
	

}