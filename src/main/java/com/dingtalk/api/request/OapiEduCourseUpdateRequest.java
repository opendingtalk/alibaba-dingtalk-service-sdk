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

import com.dingtalk.api.response.OapiEduCourseUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.10
 */
public class OapiEduCourseUpdateRequest extends BaseTaobaoRequest<OapiEduCourseUpdateResponse> {
	
	

	/** 
	* 课程唯一编码
	 */
	private String courseCode;

	/** 
	* 课程的结束时间，Unix毫秒时间戳
	 */
	private Long endTime;

	/** 
	* 课程介绍
	 */
	private String introduce;

	/** 
	* 课程名称
	 */
	private String name;

	/** 
	* 当前用户ID
	 */
	private String opUserid;

	/** 
	* 课程的开始时间，Unix毫秒时间戳
	 */
	private Long startTime;

	/** 
	* 老师的组织CorpId
	 */
	private String teacherCorpid;

	/** 
	* 老师的用户ID
	 */
	private String teacherUserid;

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseCode() {
		return this.courseCode;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setTeacherCorpid(String teacherCorpid) {
		this.teacherCorpid = teacherCorpid;
	}

	public String getTeacherCorpid() {
		return this.teacherCorpid;
	}

	public void setTeacherUserid(String teacherUserid) {
		this.teacherUserid = teacherUserid;
	}

	public String getTeacherUserid() {
		return this.teacherUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.update";
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
		txtParams.put("end_time", this.endTime);
		txtParams.put("introduce", this.introduce);
		txtParams.put("name", this.name);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("start_time", this.startTime);
		txtParams.put("teacher_corpid", this.teacherCorpid);
		txtParams.put("teacher_userid", this.teacherUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseUpdateResponse> getResponseClass() {
		return OapiEduCourseUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkMaxLength(introduce, 120, "introduce");
		RequestCheckUtils.checkMaxLength(name, 64, "name");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	

}