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

import com.dingtalk.api.response.OapiEduHomeworkStudentSubmitResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.student.submit request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.28
 */
public class OapiEduHomeworkStudentSubmitRequest extends BaseTaobaoRequest<OapiEduHomeworkStudentSubmitResponse> {
	
	

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
	private Long classId;

	/** 
	* 内容
	 */
	private String content;

	/** 
	* 作业ID
	 */
	private Long hwId;

	/** 
	* 视频地址
	 */
	private String media;

	/** 
	* 图片地址
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
	* 提交人ID
	 */
	private String submitorId;

	/** 
	* 标题
	 */
	private String title;

	/** 
	* 音频地址
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

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
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

	public void setSubmitorId(String submitorId) {
		this.submitorId = submitorId;
	}

	public String getSubmitorId() {
		return this.submitorId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getVideo() {
		return this.video;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.student.submit";
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
		txtParams.put("content", this.content);
		txtParams.put("hw_id", this.hwId);
		txtParams.put("media", this.media);
		txtParams.put("photo", this.photo);
		txtParams.put("student_id", this.studentId);
		txtParams.put("student_name", this.studentName);
		txtParams.put("submitor_id", this.submitorId);
		txtParams.put("title", this.title);
		txtParams.put("video", this.video);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkStudentSubmitResponse> getResponseClass() {
		return OapiEduHomeworkStudentSubmitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(hwId, "hwId");
		RequestCheckUtils.checkNotEmpty(studentId, "studentId");
		RequestCheckUtils.checkNotEmpty(studentName, "studentName");
		RequestCheckUtils.checkNotEmpty(submitorId, "submitorId");
	}
	

}