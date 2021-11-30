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

import com.dingtalk.api.response.OapiEduCourseReplayResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.replay request
 * 
 * @author top auto create
 * @since 1.0, 2021.07.03
 */
public class OapiEduCourseReplayRequest extends BaseTaobaoRequest<OapiEduCourseReplayResponse> {
	
	

	/** 
	* 需要回放的课程编码
	 */
	private String courseCode;

	/** 
	* 操作用户id
	 */
	private String opUserId;

	/** 
	* 指定一段的历史回放编码
	 */
	private String targetId;

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseCode() {
		return this.courseCode;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetId() {
		return this.targetId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.replay";
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
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("target_id", this.targetId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseReplayResponse> getResponseClass() {
		return OapiEduCourseReplayResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	

}