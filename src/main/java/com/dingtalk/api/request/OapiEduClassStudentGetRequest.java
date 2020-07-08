package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiEduClassStudentGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.class.student.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.11
 */
public class OapiEduClassStudentGetRequest extends BaseTaobaoRequest<OapiEduClassStudentGetResponse> {
	
	

	/** 
	* 班级ID
	 */
	private Long classId;

	/** 
	* 学生入参
	 */
	private String studentParam;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setStudentParam(String studentParam) {
		this.studentParam = studentParam;
	}

	public void setStudentParam(List<OpenStudentParam> studentParam) {
		this.studentParam = new JSONWriter(false,false,true).write(studentParam);
	}

	public String getStudentParam() {
		return this.studentParam;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.class.student.get";
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
		txtParams.put("class_id", this.classId);
		txtParams.put("student_param", this.studentParam);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduClassStudentGetResponse> getResponseClass() {
		return OapiEduClassStudentGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(studentParam, 100, "studentParam");
	}
	
	/**
	 * 学生入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenStudentParam extends TaobaoObject {
		private static final long serialVersionUID = 7632268715954257252L;
		/**
		 * 班级ID
		 */
		@ApiField("class_id")
		private String classId;
		/**
		 * 学生列表
		 */
		@ApiListField("student_ids")
		@ApiField("string")
		private List<String> studentIds;
	
		public String getClassId() {
			return this.classId;
		}
		public void setClassId(String classId) {
			this.classId = classId;
		}
		public List<String> getStudentIds() {
			return this.studentIds;
		}
		public void setStudentIds(List<String> studentIds) {
			this.studentIds = studentIds;
		}
	}
	

}