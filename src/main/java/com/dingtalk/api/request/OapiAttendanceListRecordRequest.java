package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceListRecordResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.listRecord request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.10
 */
public class OapiAttendanceListRecordRequest extends BaseTaobaoRequest<OapiAttendanceListRecordResponse> {
	
	

	/** 
	* 开始时间
	 */
	private String checkDateFrom;

	/** 
	* 结束时间
	 */
	private String checkDateTo;

	/** 
	* 是否为国际化
	 */
	private Boolean isI18n;

	/** 
	* 待查询的用户id列表
	 */
	private List<String> userIds;

	public void setCheckDateFrom(String checkDateFrom) {
		this.checkDateFrom = checkDateFrom;
	}

	public String getCheckDateFrom() {
		return this.checkDateFrom;
	}

	public void setCheckDateTo(String checkDateTo) {
		this.checkDateTo = checkDateTo;
	}

	public String getCheckDateTo() {
		return this.checkDateTo;
	}

	public void setIsI18n(Boolean isI18n) {
		this.isI18n = isI18n;
	}

	public Boolean getIsI18n() {
		return this.isI18n;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.listRecord";
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
		txtParams.put("checkDateFrom", this.checkDateFrom);
		txtParams.put("checkDateTo", this.checkDateTo);
		txtParams.put("isI18n", this.isI18n);
		txtParams.put("userIds", TaobaoUtils.objectToJson(this.userIds));
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceListRecordResponse> getResponseClass() {
		return OapiAttendanceListRecordResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}