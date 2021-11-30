package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceGroupMemberListbyidsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.member.listbyids request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.16
 */
public class OapiAttendanceGroupMemberListbyidsRequest extends BaseTaobaoRequest<OapiAttendanceGroupMemberListbyidsResponse> {
	
	

	/** 
	* 考勤组id
	 */
	private Long groupId;

	/** 
	* 成员id，可以是userId或者deptId
	 */
	private String memberIds;

	/** 
	* 0 表示员工，1表示部门
	 */
	private Long memberType;

	/** 
	* 操作人userId
	 */
	private String opUserId;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setMemberIds(String memberIds) {
		this.memberIds = memberIds;
	}

	public String getMemberIds() {
		return this.memberIds;
	}

	public void setMemberType(Long memberType) {
		this.memberType = memberType;
	}

	public Long getMemberType() {
		return this.memberType;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.member.listbyids";
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
		txtParams.put("member_ids", this.memberIds);
		txtParams.put("member_type", this.memberType);
		txtParams.put("op_user_id", this.opUserId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupMemberListbyidsResponse> getResponseClass() {
		return OapiAttendanceGroupMemberListbyidsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupId, "groupId");
		RequestCheckUtils.checkNotEmpty(memberIds, "memberIds");
		RequestCheckUtils.checkMaxListSize(memberIds, 20, "memberIds");
		RequestCheckUtils.checkNotEmpty(memberType, "memberType");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	

}