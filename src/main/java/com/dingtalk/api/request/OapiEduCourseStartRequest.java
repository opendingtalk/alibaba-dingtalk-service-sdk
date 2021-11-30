package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiEduCourseStartResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.start request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.20
 */
public class OapiEduCourseStartRequest extends BaseTaobaoRequest<OapiEduCourseStartResponse> {
	
	

	/** 
	* 需要开始的课程编码
	 */
	private String courseCode;

	/** 
	* 操作用户id
	 */
	private String opUserId;

	/** 
	* 开始课程的可选属性设定
	 */
	private String startOption;

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

	public void setStartOption(String startOption) {
		this.startOption = startOption;
	}

	public void setStartOption(StartOption startOption) {
		this.startOption = new JSONWriter(false,false,true).write(startOption);
	}

	public String getStartOption() {
		return this.startOption;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.start";
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
		txtParams.put("start_option", this.startOption);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseStartResponse> getResponseClass() {
		return OapiEduCourseStartResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	
	/**
	 * 开始课程的可选属性设定
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class StartOption extends TaobaoObject {
		private static final long serialVersionUID = 1355929462151385474L;
		/**
		 * 该课堂是否允许提前进入，时效最早为提前30分钟
		 */
		@ApiField("b_allow_join_in_advance")
		private Boolean bAllowJoinInAdvance;
	
		public Boolean getbAllowJoinInAdvance() {
			return this.bAllowJoinInAdvance;
		}
		public void setbAllowJoinInAdvance(Boolean bAllowJoinInAdvance) {
			this.bAllowJoinInAdvance = bAllowJoinInAdvance;
		}
	}
	

}