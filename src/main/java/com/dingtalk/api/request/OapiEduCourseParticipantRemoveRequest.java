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

import com.dingtalk.api.response.OapiEduCourseParticipantRemoveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.participant.remove request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.24
 */
public class OapiEduCourseParticipantRemoveRequest extends BaseTaobaoRequest<OapiEduCourseParticipantRemoveResponse> {
	
	

	/** 
	* 课程编码
	 */
	private String courseCode;

	/** 
	* 当前用户ID
	 */
	private String opUserid;

	/** 
	* 参与方的组织CropId
	 */
	private String participantCorpid;

	/** 
	* 参与方ID。participant_type=1时，participant_id表示用户ID；participant_type=2时，participant_id表示部门ID；participant_type=3时，participant_id表示组织ID；
	 */
	private String participantId;

	/** 
	* 1：用户、2：部门（对应家校通讯录中的班级、年级。详情请参考https:ding-doc.dingtalk.comdoc#serverapi3gga05az3y0h）、3：组织
	 */
	private Long participantType;

	/** 
	* student：学生、guardian: 监护人、teacher：老师（注意：授课老师不支持移除）
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
		return "dingtalk.oapi.edu.course.participant.remove";
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
		txtParams.put("participant_corpid", this.participantCorpid);
		txtParams.put("participant_id", this.participantId);
		txtParams.put("participant_type", this.participantType);
		txtParams.put("role", this.role);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseParticipantRemoveResponse> getResponseClass() {
		return OapiEduCourseParticipantRemoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(participantCorpid, "participantCorpid");
		RequestCheckUtils.checkNotEmpty(participantId, "participantId");
		RequestCheckUtils.checkNotEmpty(participantType, "participantType");
		RequestCheckUtils.checkNotEmpty(role, "role");
	}
	

}