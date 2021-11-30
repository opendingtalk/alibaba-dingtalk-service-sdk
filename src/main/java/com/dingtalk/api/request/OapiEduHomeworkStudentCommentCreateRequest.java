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

import com.dingtalk.api.response.OapiEduHomeworkStudentCommentCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.student.comment.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.28
 */
public class OapiEduHomeworkStudentCommentCreateRequest extends BaseTaobaoRequest<OapiEduHomeworkStudentCommentCreateResponse> {
	
	

	/** 
	* 属性参数
	 */
	private String attributes;

	/** 
	* 业务编码
	 */
	private String bizCode;

	/** 
	* 班级ID
	 */
	private String classId;

	/** 
	* 评论
	 */
	private String comment;

	/** 
	* 作业ID
	 */
	private Long hwId;

	/** 
	* 老师评论视频
	 */
	private String media;

	/** 
	* 老师评论图片
	 */
	private String photo;

	/** 
	* 学生ID
	 */
	private String studentId;

	/** 
	* 学生姓名
	 */
	private String studentName;

	/** 
	* 老师UserId
	 */
	private String teacherUserid;

	/** 
	* 老师评论语音
	 */
	private String video;

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassId() {
		return this.classId;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return this.comment;
	}

	public void setHwId(Long hwId) {
		this.hwId = hwId;
	}

	public Long getHwId() {
		return this.hwId;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getMedia() {
		return this.media;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhoto() {
		return this.photo;
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

	public void setTeacherUserid(String teacherUserid) {
		this.teacherUserid = teacherUserid;
	}

	public String getTeacherUserid() {
		return this.teacherUserid;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getVideo() {
		return this.video;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.student.comment.create";
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
		txtParams.put("attributes", this.attributes);
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("class_id", this.classId);
		txtParams.put("comment", this.comment);
		txtParams.put("hw_id", this.hwId);
		txtParams.put("media", this.media);
		txtParams.put("photo", this.photo);
		txtParams.put("student_id", this.studentId);
		txtParams.put("student_name", this.studentName);
		txtParams.put("teacher_userid", this.teacherUserid);
		txtParams.put("video", this.video);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkStudentCommentCreateResponse> getResponseClass() {
		return OapiEduHomeworkStudentCommentCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(hwId, "hwId");
		RequestCheckUtils.checkNotEmpty(studentId, "studentId");
		RequestCheckUtils.checkNotEmpty(teacherUserid, "teacherUserid");
	}
	

}