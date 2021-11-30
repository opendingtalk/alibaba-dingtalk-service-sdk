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
import com.dingtalk.api.response.OapiEduHomeworkCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.04
 */
public class OapiEduHomeworkCreateRequest extends BaseTaobaoRequest<OapiEduHomeworkCreateResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private String attributes;

	/** 
	* 业务编码
	 */
	private String bizCode;

	/** 
	* 作业课程名称
	 */
	private String courseName;

	/** 
	* 作业内容
	 */
	private String hwContent;

	/** 
	* 截止时间
	 */
	private Long hwDeadline;

	/** 
	* 是否开启截止时间
	 */
	private String hwDeadlineOpen;

	/** 
	* 作业视频
	 */
	private String hwMedia;

	/** 
	* 作业图片
	 */
	private String hwPhoto;

	/** 
	* 作业标题
	 */
	private String hwTitle;

	/** 
	* 作业类型
	 */
	private String hwType;

	/** 
	* 作业录音
	 */
	private String hwVideo;

	/** 
	* 幂等ID字段
	 */
	private String identifier;

	/** 
	* 是否开始定时调度
	 */
	private String scheduledRelease;

	/** 
	* 定时调度时间
	 */
	private String scheduledTime;

	/** 
	* 选择的布置班级
	 */
	private String selectClass;

	/** 
	* 选择班级对应学生
	 */
	private String selectStu;

	/** 
	* 状态
	 */
	private String status;

	/** 
	* 发送对象
	 */
	private String targetRole;

	/** 
	* 老师名称
	 */
	private String teacherName;

	/** 
	* 老师userid
	 */
	private String teacherUserid;

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

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setHwContent(String hwContent) {
		this.hwContent = hwContent;
	}

	public String getHwContent() {
		return this.hwContent;
	}

	public void setHwDeadline(Long hwDeadline) {
		this.hwDeadline = hwDeadline;
	}

	public Long getHwDeadline() {
		return this.hwDeadline;
	}

	public void setHwDeadlineOpen(String hwDeadlineOpen) {
		this.hwDeadlineOpen = hwDeadlineOpen;
	}

	public String getHwDeadlineOpen() {
		return this.hwDeadlineOpen;
	}

	public void setHwMedia(String hwMedia) {
		this.hwMedia = hwMedia;
	}

	public String getHwMedia() {
		return this.hwMedia;
	}

	public void setHwPhoto(String hwPhoto) {
		this.hwPhoto = hwPhoto;
	}

	public String getHwPhoto() {
		return this.hwPhoto;
	}

	public void setHwTitle(String hwTitle) {
		this.hwTitle = hwTitle;
	}

	public String getHwTitle() {
		return this.hwTitle;
	}

	public void setHwType(String hwType) {
		this.hwType = hwType;
	}

	public String getHwType() {
		return this.hwType;
	}

	public void setHwVideo(String hwVideo) {
		this.hwVideo = hwVideo;
	}

	public String getHwVideo() {
		return this.hwVideo;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setScheduledRelease(String scheduledRelease) {
		this.scheduledRelease = scheduledRelease;
	}

	public String getScheduledRelease() {
		return this.scheduledRelease;
	}

	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getScheduledTime() {
		return this.scheduledTime;
	}

	public void setSelectClass(String selectClass) {
		this.selectClass = selectClass;
	}

	public void setSelectClass(List<ClassInfoItem> selectClass) {
		this.selectClass = new JSONWriter(false,false,true).write(selectClass);
	}

	public String getSelectClass() {
		return this.selectClass;
	}

	public void setSelectStu(String selectStu) {
		this.selectStu = selectStu;
	}

	public void setSelectStu(List<SelectStuItem> selectStu) {
		this.selectStu = new JSONWriter(false,false,true).write(selectStu);
	}

	public String getSelectStu() {
		return this.selectStu;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTargetRole(String targetRole) {
		this.targetRole = targetRole;
	}

	public String getTargetRole() {
		return this.targetRole;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherUserid(String teacherUserid) {
		this.teacherUserid = teacherUserid;
	}

	public String getTeacherUserid() {
		return this.teacherUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.create";
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
		txtParams.put("course_name", this.courseName);
		txtParams.put("hw_content", this.hwContent);
		txtParams.put("hw_deadline", this.hwDeadline);
		txtParams.put("hw_deadline_open", this.hwDeadlineOpen);
		txtParams.put("hw_media", this.hwMedia);
		txtParams.put("hw_photo", this.hwPhoto);
		txtParams.put("hw_title", this.hwTitle);
		txtParams.put("hw_type", this.hwType);
		txtParams.put("hw_video", this.hwVideo);
		txtParams.put("identifier", this.identifier);
		txtParams.put("scheduled_release", this.scheduledRelease);
		txtParams.put("scheduled_time", this.scheduledTime);
		txtParams.put("select_class", this.selectClass);
		txtParams.put("select_stu", this.selectStu);
		txtParams.put("status", this.status);
		txtParams.put("target_role", this.targetRole);
		txtParams.put("teacher_name", this.teacherName);
		txtParams.put("teacher_userid", this.teacherUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkCreateResponse> getResponseClass() {
		return OapiEduHomeworkCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(courseName, "courseName");
		RequestCheckUtils.checkNotEmpty(hwContent, "hwContent");
		RequestCheckUtils.checkNotEmpty(hwTitle, "hwTitle");
		RequestCheckUtils.checkNotEmpty(identifier, "identifier");
		RequestCheckUtils.checkObjectMaxListSize(selectClass, 50, "selectClass");
		RequestCheckUtils.checkObjectMaxListSize(selectStu, 50, "selectStu");
		RequestCheckUtils.checkNotEmpty(status, "status");
		RequestCheckUtils.checkNotEmpty(teacherName, "teacherName");
		RequestCheckUtils.checkNotEmpty(teacherUserid, "teacherUserid");
	}
	
	/**
	 * 选择的布置班级
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClassInfoItem extends TaobaoObject {
		private static final long serialVersionUID = 8548144881694176574L;
		/**
		 * 班级ID
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班级名称
		 */
		@ApiField("class_name")
		private String className;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getClassName() {
			return this.className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
	}
	
	/**
	 * 选择学生列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class StuInfoItem extends TaobaoObject {
		private static final long serialVersionUID = 6583319526781313473L;
		/**
		 * 学生userid
		 */
		@ApiField("stu_id")
		private String stuId;
		/**
		 * 学生姓名
		 */
		@ApiField("stu_name")
		private String stuName;
	
		public String getStuId() {
			return this.stuId;
		}
		public void setStuId(String stuId) {
			this.stuId = stuId;
		}
		public String getStuName() {
			return this.stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
	}
	
	/**
	 * 选择班级对应学生
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SelectStuItem extends TaobaoObject {
		private static final long serialVersionUID = 6794652765249197884L;
		/**
		 * 班级ID
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 班级名称
		 */
		@ApiField("class_name")
		private String className;
		/**
		 * 选择学生列表
		 */
		@ApiListField("class_stu")
		@ApiField("stu_info_item")
		private List<StuInfoItem> classStu;
	
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getClassName() {
			return this.className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public List<StuInfoItem> getClassStu() {
			return this.classStu;
		}
		public void setClassStu(List<StuInfoItem> classStu) {
			this.classStu = classStu;
		}
	}
	

}