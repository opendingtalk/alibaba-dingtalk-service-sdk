package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduHomeworkStudentMarkTagResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.student.mark.tag request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.03
 */
public class OapiEduHomeworkStudentMarkTagRequest extends BaseTaobaoRequest<OapiEduHomeworkStudentMarkTagResponse> {
	
	

	/** 
	* 业务编码
	 */
	private String bizCode;

	/** 
	* 班级ID
	 */
	private Long classId;

	/** 
	* 作业ID
	 */
	private Long hwId;

	/** 
	* 学生userid
	 */
	private String studentId;

	/** 
	* 学生姓名
	 */
	private String studentName;

	/** 
	* 作业标记：优秀、良好、差
	 */
	private String tag;

	/** 
	* 老师userid
	 */
	private String teacherId;

	/** 
	* 文本内容
	 */
	private String text;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setHwId(Long hwId) {
		this.hwId = hwId;
	}

	public Long getHwId() {
		return this.hwId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherId() {
		return this.teacherId;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.student.mark.tag";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("class_id", this.classId);
		txtParams.put("hw_id", this.hwId);
		txtParams.put("student_id", this.studentId);
		txtParams.put("student_name", this.studentName);
		txtParams.put("tag", this.tag);
		txtParams.put("teacher_id", this.teacherId);
		txtParams.put("text", this.text);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkStudentMarkTagResponse> getResponseClass() {
		return OapiEduHomeworkStudentMarkTagResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}