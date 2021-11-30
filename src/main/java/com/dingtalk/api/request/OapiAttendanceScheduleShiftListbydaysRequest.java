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

import com.dingtalk.api.response.OapiAttendanceScheduleShiftListbydaysResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.schedule.shift.listbydays request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.06
 */
public class OapiAttendanceScheduleShiftListbydaysRequest extends BaseTaobaoRequest<OapiAttendanceScheduleShiftListbydaysResponse> {
	
	

	/** 
	* 开始日期
	 */
	private Long fromDateTime;

	/** 
	* 操作者userId
	 */
	private String opUserId;

	/** 
	* 结束日期
	 */
	private Long toDateTime;

	/** 
	* 人员userIds
	 */
	private String userids;

	public void setFromDateTime(Long fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public Long getFromDateTime() {
		return this.fromDateTime;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setToDateTime(Long toDateTime) {
		this.toDateTime = toDateTime;
	}

	public Long getToDateTime() {
		return this.toDateTime;
	}

	public void setUserids(String userids) {
		this.userids = userids;
	}

	public String getUserids() {
		return this.userids;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.schedule.shift.listbydays";
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
		txtParams.put("from_date_time", this.fromDateTime);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("to_date_time", this.toDateTime);
		txtParams.put("userids", this.userids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceScheduleShiftListbydaysResponse> getResponseClass() {
		return OapiAttendanceScheduleShiftListbydaysResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fromDateTime, "fromDateTime");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(toDateTime, "toDateTime");
		RequestCheckUtils.checkNotEmpty(userids, "userids");
		RequestCheckUtils.checkMaxListSize(userids, 20, "userids");
	}
	

}