package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceGetcolumnvalResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getcolumnval request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.13
 */
public class OapiAttendanceGetcolumnvalRequest extends BaseTaobaoRequest<OapiAttendanceGetcolumnvalResponse> {
	
	

	/** 
	* 列id，多值用英文逗号分隔
	 */
	private String columnIdList;

	/** 
	* 开始时间
	 */
	private Date fromDate;

	/** 
	* 结束时间
	 */
	private Date toDate;

	/** 
	* 用户的userId
	 */
	private String userid;

	public void setColumnIdList(String columnIdList) {
		this.columnIdList = columnIdList;
	}

	public String getColumnIdList() {
		return this.columnIdList;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.getcolumnval";
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
		txtParams.put("column_id_list", this.columnIdList);
		txtParams.put("from_date", this.fromDate);
		txtParams.put("to_date", this.toDate);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGetcolumnvalResponse> getResponseClass() {
		return OapiAttendanceGetcolumnvalResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(columnIdList, 20, "columnIdList");
	}
	

}