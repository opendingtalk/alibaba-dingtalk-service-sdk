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

import com.dingtalk.api.response.OapiEduCourseDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.10
 */
public class OapiEduCourseDeleteRequest extends BaseTaobaoRequest<OapiEduCourseDeleteResponse> {
	
	

	/** 
	* 课程编码
	 */
	private String courseCode;

	/** 
	* 当前操作人的用户ID
	 */
	private String opUserid;

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseCode() {
		return this.courseCode;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.delete";
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
		txtParams.put("course_code", this.courseCode);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseDeleteResponse> getResponseClass() {
		return OapiEduCourseDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	

}