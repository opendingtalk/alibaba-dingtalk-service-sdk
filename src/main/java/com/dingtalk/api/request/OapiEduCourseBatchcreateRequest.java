package com.dingtalk.api.request;

import java.util.List;
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
import com.dingtalk.api.response.OapiEduCourseBatchcreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.batchcreate request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.27
 */
public class OapiEduCourseBatchcreateRequest extends BaseTaobaoRequest<OapiEduCourseBatchcreateResponse> {
	
	

	/** 
	* course_infos
	 */
	private String courseInfos;

	/** 
	* 当前用户ID
	 */
	private String opUserid;

	public void setCourseInfos(String courseInfos) {
		this.courseInfos = courseInfos;
	}

	public void setCourseInfos(List<CourseInfo> courseInfos) {
		this.courseInfos = new JSONWriter(false,false,true).write(courseInfos);
	}

	public String getCourseInfos() {
		return this.courseInfos;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.batchcreate";
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
		txtParams.put("course_infos", this.courseInfos);
		txtParams.put("op_userid", this.opUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseBatchcreateResponse> getResponseClass() {
		return OapiEduCourseBatchcreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(courseInfos, 999, "courseInfos");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	
	/**
	 * 课程选项信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CourseOption extends TaobaoObject {
		private static final long serialVersionUID = 7549484943439632214L;
		/**
		 * 课堂模式：1612（支持多少人上台）
		 */
		@ApiField("online_mode")
		private String onlineMode;
		/**
		 * 使用的平台：1（在线课堂）、2（在线课堂Pro）
		 */
		@ApiField("platform")
		private String platform;
		/**
		 * 是否录制老师头像
		 */
		@ApiField("record_avatar")
		private String recordAvatar;
	
		public String getOnlineMode() {
			return this.onlineMode;
		}
		public void setOnlineMode(String onlineMode) {
			this.onlineMode = onlineMode;
		}
		public String getPlatform() {
			return this.platform;
		}
		public void setPlatform(String platform) {
			this.platform = platform;
		}
		public String getRecordAvatar() {
			return this.recordAvatar;
		}
		public void setRecordAvatar(String recordAvatar) {
			this.recordAvatar = recordAvatar;
		}
	}
	
	/**
	 * course_infos
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CourseInfo extends TaobaoObject {
		private static final long serialVersionUID = 5783469889816165863L;
		/**
		 * 业务唯一键，用于保证课程的唯一性，防止重复创建
		 */
		@ApiField("biz_key")
		private String bizKey;
		/**
		 * 课程的结束时间，Unix毫秒时间戳
		 */
		@ApiField("end_time")
		private String endTime;
		/**
		 * 课程介绍
		 */
		@ApiField("introduce")
		private String introduce;
		/**
		 * 课程名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 课程选项信息
		 */
		@ApiField("option")
		private CourseOption option;
		/**
		 * 课程的开始时间，Unix毫秒时间戳
		 */
		@ApiField("start_time")
		private String startTime;
		/**
		 * 老师的组织CorpId
		 */
		@ApiField("teacher_corpid")
		private String teacherCorpid;
		/**
		 * 老师的用户ID
		 */
		@ApiField("teacher_userid")
		private String teacherUserid;
	
		public String getBizKey() {
			return this.bizKey;
		}
		public void setBizKey(String bizKey) {
			this.bizKey = bizKey;
		}
		public String getEndTime() {
			return this.endTime;
		}
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
		public String getIntroduce() {
			return this.introduce;
		}
		public void setIntroduce(String introduce) {
			this.introduce = introduce;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public CourseOption getOption() {
			return this.option;
		}
		public void setOption(CourseOption option) {
			this.option = option;
		}
		public String getStartTime() {
			return this.startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public String getTeacherCorpid() {
			return this.teacherCorpid;
		}
		public void setTeacherCorpid(String teacherCorpid) {
			this.teacherCorpid = teacherCorpid;
		}
		public String getTeacherUserid() {
			return this.teacherUserid;
		}
		public void setTeacherUserid(String teacherUserid) {
			this.teacherUserid = teacherUserid;
		}
	}
	

}