package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduHomeworkStudentCommentDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.student.comment.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.29
 */
public class OapiEduHomeworkStudentCommentDeleteRequest extends BaseTaobaoRequest<OapiEduHomeworkStudentCommentDeleteResponse> {
	
	

	/** 
	* 业务编码
	 */
	private String bizCode;

	/** 
	* 班级ID
	 */
	private Long classId;

	/** 
	* 评论ID
	 */
	private Long commentId;

	/** 
	* 作业ID
	 */
	private Long hwId;

	/** 
	* 学生ID
	 */
	private String studentId;

	/** 
	* 老师UserID
	 */
	private String teacherUserid;

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

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getCommentId() {
		return this.commentId;
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

	public void setTeacherUserid(String teacherUserid) {
		this.teacherUserid = teacherUserid;
	}

	public String getTeacherUserid() {
		return this.teacherUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.student.comment.delete";
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
		txtParams.put("comment_id", this.commentId);
		txtParams.put("hw_id", this.hwId);
		txtParams.put("student_id", this.studentId);
		txtParams.put("teacher_userid", this.teacherUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkStudentCommentDeleteResponse> getResponseClass() {
		return OapiEduHomeworkStudentCommentDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}