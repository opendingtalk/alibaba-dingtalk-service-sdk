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
import com.dingtalk.api.response.OapiEduCourseCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.14
 */
public class OapiEduCourseCreateRequest extends BaseTaobaoRequest<OapiEduCourseCreateResponse> {
	
	

	/** 
	* 业务唯一键，用于保证课程的唯一性，防止重复创建
	 */
	private String bizKey;

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
	* 课程选项信息
	 */
	private String option;

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

	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}

	public String getBizKey() {
		return this.bizKey;
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

	public void setOption(String option) {
		this.option = option;
	}

	public void setOption(CreateCourseOption option) {
		this.option = new JSONWriter(false,false,true).write(option);
	}

	public String getOption() {
		return this.option;
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
		return "dingtalk.oapi.edu.course.create";
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
		txtParams.put("biz_key", this.bizKey);
		txtParams.put("end_time", this.endTime);
		txtParams.put("introduce", this.introduce);
		txtParams.put("name", this.name);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("option", this.option);
		txtParams.put("start_time", this.startTime);
		txtParams.put("teacher_corpid", this.teacherCorpid);
		txtParams.put("teacher_userid", this.teacherUserid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseCreateResponse> getResponseClass() {
		return OapiEduCourseCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizKey, "bizKey");
		RequestCheckUtils.checkMaxLength(bizKey, 64, "bizKey");
		RequestCheckUtils.checkNotEmpty(introduce, "introduce");
		RequestCheckUtils.checkMaxLength(introduce, 120, "introduce");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 64, "name");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(teacherCorpid, "teacherCorpid");
		RequestCheckUtils.checkNotEmpty(teacherUserid, "teacherUserid");
	}
	
	/**
	 * 课程选项信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateCourseOption extends TaobaoObject {
		private static final long serialVersionUID = 3595736735469612535L;
		/**
		 * 课堂模式：1612（支持多少人上台）
		 */
		@ApiField("onlineMode")
		private String onlineMode;
		/**
		 * 使用的平台：1（在线课堂）、2（在线课堂Pro）
		 */
		@ApiField("platform")
		private String platform;
		/**
		 * 是否录制老师头像
		 */
		@ApiField("recordAvatar")
		private Boolean recordAvatar;
	
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
		public Boolean getRecordAvatar() {
			return this.recordAvatar;
		}
		public void setRecordAvatar(Boolean recordAvatar) {
			this.recordAvatar = recordAvatar;
		}
	}
	

}