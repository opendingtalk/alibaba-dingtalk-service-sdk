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

import com.dingtalk.api.response.OapiAttendanceGroupWifisQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.group.wifis.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiAttendanceGroupWifisQueryRequest extends BaseTaobaoRequest<OapiAttendanceGroupWifisQueryResponse> {
	
	

	/** 
	* 上一批次最后一个id，默认空
	 */
	private String cursor;

	/** 
	* 考勤组id
	 */
	private String groupKey;

	/** 
	* 操作人userId
	 */
	private String opUserid;

	/** 
	* 分页大小
	 */
	private Long size;

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return this.cursor;
	}

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

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.group.wifis.query";
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
		txtParams.put("group_key", this.groupKey);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGroupWifisQueryResponse> getResponseClass() {
		return OapiAttendanceGroupWifisQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupKey, "groupKey");
	}
	

}