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

import com.dingtalk.api.response.OapiAttendanceGroupsKeytoidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.groups.keytoid request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.23
 */
public class OapiAttendanceGroupsKeytoidRequest extends BaseTaobaoRequest<OapiAttendanceGroupsKeytoidResponse> {
	
	

	/** 
	* groupKey
	 */
	private String groupKey;

	/** 
	* 操作人的userId
	 */
	private String opUserId;

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getGroupKey() {
		return this.groupKey;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.groups.keytoid";
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
		txtParams.put("op_user_id", this.opUserId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupsKeytoidResponse> getResponseClass() {
		return OapiAttendanceGroupsKeytoidResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupKey, "groupKey");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	

}