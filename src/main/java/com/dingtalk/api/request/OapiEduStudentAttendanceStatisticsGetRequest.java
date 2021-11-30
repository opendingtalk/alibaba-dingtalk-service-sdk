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

import com.dingtalk.api.response.OapiEduStudentAttendanceStatisticsGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.student.attendance.statistics.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.24
 */
public class OapiEduStudentAttendanceStatisticsGetRequest extends BaseTaobaoRequest<OapiEduStudentAttendanceStatisticsGetResponse> {
	
	

	/** 
	* 指定获取哪一天的数据，格式为yyyyMMdd
	 */
	private String date;

	/** 
	* 当前操作人的用户ID
	 */
	private String opUserid;

	/** 
	* 指定获取那个学校的数据，学校的CorpId
	 */
	private String schoolCorpid;

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setSchoolCorpid(String schoolCorpid) {
		this.schoolCorpid = schoolCorpid;
	}

	public String getSchoolCorpid() {
		return this.schoolCorpid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.student.attendance.statistics.get";
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
		txtParams.put("date", this.date);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("school_corpid", this.schoolCorpid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduStudentAttendanceStatisticsGetResponse> getResponseClass() {
		return OapiEduStudentAttendanceStatisticsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(date, "date");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(schoolCorpid, "schoolCorpid");
	}
	

}