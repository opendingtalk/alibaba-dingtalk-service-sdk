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
import com.dingtalk.api.response.OapiEduCourseParticipantAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.participant.add request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.20
 */
public class OapiEduCourseParticipantAddRequest extends BaseTaobaoRequest<OapiEduCourseParticipantAddResponse> {
	
	

	/** 
	* 课程编码
	 */
	private String courseCode;

	/** 
	* 当前用户ID
	 */
	private String opUserid;

	/** 
	* 参与方选项信息
	 */
	private String option;

	/** 
	* 参与方的组织CropId
	 */
	private String participantCorpid;

	/** 
	* 参与方ID。participant_type=1时，participant_id表示用户ID；participant_type=2时，participant_id表示部门ID；participant_type=3时，participant_id表示组织ID；
	 */
	private String participantId;

	/** 
	* 参与方类型。1：用户、2：部门（对应家校通讯录中的班级、年级。详情请参考https:ding-doc.dingtalk.comdoc#serverapi3gga05az3y0h）、3：组织
	 */
	private Long participantType;

	/** 
	* 参与方角色。student：学生、guardian: 监护人、teacher：老师（注意：授课老师只支持通过课程创建和修改接口，进行添加和修改）
	 */
	private String role;

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseCode() {
		return this.courseCode;
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

	public void setOption(CourseParticipantOption option) {
		this.option = new JSONWriter(false,false,true).write(option);
	}

	public String getOption() {
		return this.option;
	}

	public void setParticipantCorpid(String participantCorpid) {
		this.participantCorpid = participantCorpid;
	}

	public String getParticipantCorpid() {
		return this.participantCorpid;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantId() {
		return this.participantId;
	}

	public void setParticipantType(Long participantType) {
		this.participantType = participantType;
	}

	public Long getParticipantType() {
		return this.participantType;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.participant.add";
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
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("option", this.option);
		txtParams.put("participant_corpid", this.participantCorpid);
		txtParams.put("participant_id", this.participantId);
		txtParams.put("participant_type", this.participantType);
		txtParams.put("role", this.role);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseParticipantAddResponse> getResponseClass() {
		return OapiEduCourseParticipantAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(participantCorpid, "participantCorpid");
		RequestCheckUtils.checkNotEmpty(participantId, "participantId");
		RequestCheckUtils.checkNotEmpty(participantType, "participantType");
		RequestCheckUtils.checkNotEmpty(role, "role");
	}
	
	/**
	 * 参与方选项信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CourseParticipantOption extends TaobaoObject {
		private static final long serialVersionUID = 3678462648657812193L;
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
	

}