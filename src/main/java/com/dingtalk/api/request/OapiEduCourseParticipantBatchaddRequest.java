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
import com.dingtalk.api.response.OapiEduCourseParticipantBatchaddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.participant.batchadd request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.28
 */
public class OapiEduCourseParticipantBatchaddRequest extends BaseTaobaoRequest<OapiEduCourseParticipantBatchaddResponse> {
	
	

	/** 
	* 课程编码集合
	 */
	private String courseCodes;

	/** 
	* 参与方列表
	 */
	private String courseParticipants;

	/** 
	* 当前用户ID
	 */
	private String opUserid;

	/** 
	* 参与方的组织CropId
	 */
	private String participantCorpid;

	public void setCourseCodes(String courseCodes) {
		this.courseCodes = courseCodes;
	}

	public String getCourseCodes() {
		return this.courseCodes;
	}

	public void setCourseParticipants(String courseParticipants) {
		this.courseParticipants = courseParticipants;
	}

	public void setCourseParticipants(List<CourseParticipantBaseDTO> courseParticipants) {
		this.courseParticipants = new JSONWriter(false,false,true).write(courseParticipants);
	}

	public String getCourseParticipants() {
		return this.courseParticipants;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setParticipantCorpid(String participantCorpid) {
		this.participantCorpid = participantCorpid;
	}

	public String getParticipantCorpid() {
		return this.participantCorpid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.participant.batchadd";
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
		txtParams.put("course_codes", this.courseCodes);
		txtParams.put("course_participants", this.courseParticipants);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("participant_corpid", this.participantCorpid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseParticipantBatchaddResponse> getResponseClass() {
		return OapiEduCourseParticipantBatchaddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(courseCodes, "courseCodes");
		RequestCheckUtils.checkMaxListSize(courseCodes, 10, "courseCodes");
		RequestCheckUtils.checkObjectMaxListSize(courseParticipants, 100, "courseParticipants");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(participantCorpid, "participantCorpid");
	}
	
	/**
	 * 参与方选项信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CourseParticipantOption extends TaobaoObject {
		private static final long serialVersionUID = 6437357828587163274L;
		/**
		 * 群类型：teacherStudentGroup（师生群）、officialClassGroup（家校群）
		 */
		@ApiField("groupType")
		private String groupType;
	
		public String getGroupType() {
			return this.groupType;
		}
		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}
	}
	
	/**
	 * 参与方列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CourseParticipantBaseDTO extends TaobaoObject {
		private static final long serialVersionUID = 6289672468382511583L;
		/**
		 * 参与方选项信息
		 */
		@ApiField("option")
		private CourseParticipantOption option;
		/**
		 * 参与方ID。participant_type=1时，participant_id表示用户ID；participant_type=2时，participant_id表示部门ID；participant_type=3时，participant_id表示组织ID；
		 */
		@ApiField("participant_id")
		private String participantId;
		/**
		 * 参与方类型。1：用户、2：部门（对应家校通讯录中的班级、年级。详情请参考https:ding-doc.dingtalk.comdoc#serverapi3gga05az3y0h）、3：组织
		 */
		@ApiField("participant_type")
		private Long participantType;
		/**
		 * 参与方角色。student：学生、guardian: 监护人、teacher：老师（注意：授课老师只支持通过课程创建和修改接口，进行添加和修改）
		 */
		@ApiField("role")
		private String role;
	
		public CourseParticipantOption getOption() {
			return this.option;
		}
		public void setOption(CourseParticipantOption option) {
			this.option = option;
		}
		public String getParticipantId() {
			return this.participantId;
		}
		public void setParticipantId(String participantId) {
			this.participantId = participantId;
		}
		public Long getParticipantType() {
			return this.participantType;
		}
		public void setParticipantType(Long participantType) {
			this.participantType = participantType;
		}
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	}
	

}