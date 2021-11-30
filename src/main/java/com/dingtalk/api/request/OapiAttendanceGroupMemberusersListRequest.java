package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceGroupMemberusersListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.memberusers.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.31
 */
public class OapiAttendanceGroupMemberusersListRequest extends BaseTaobaoRequest<OapiAttendanceGroupMemberusersListResponse> {
	
	

	/** 
	* 游标
	 */
	private Long cursor;

	/** 
	* 考勤组id
	 */
	private Long groupId;

	/** 
	* 操作人userId
	 */
	private String opUserId;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

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

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.memberusers.list";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("group_id", this.groupId);
		txtParams.put("op_user_id", this.opUserId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupMemberusersListResponse> getResponseClass() {
		return OapiAttendanceGroupMemberusersListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}