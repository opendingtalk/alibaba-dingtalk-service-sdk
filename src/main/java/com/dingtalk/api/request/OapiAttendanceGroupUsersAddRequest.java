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

import com.dingtalk.api.response.OapiAttendanceGroupUsersAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.users.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAttendanceGroupUsersAddRequest extends BaseTaobaoRequest<OapiAttendanceGroupUsersAddResponse> {
	
	

	/** 
	* 考勤组id
	 */
	private String groupKey;

	/** 
	* 操作人userId
	 */
	private String opUserid;

	/** 
	* 用户列表
	 */
	private String userIdList;

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getGroupKey() {
		return this.groupKey;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setUserIdList(String userIdList) {
		this.userIdList = userIdList;
	}

	public String getUserIdList() {
		return this.userIdList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.users.add";
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
		txtParams.put("group_key", this.groupKey);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("user_id_list", this.userIdList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupUsersAddResponse> getResponseClass() {
		return OapiAttendanceGroupUsersAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupKey, "groupKey");
		RequestCheckUtils.checkNotEmpty(userIdList, "userIdList");
		RequestCheckUtils.checkMaxListSize(userIdList, 100, "userIdList");
	}
	

}