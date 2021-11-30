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
import com.dingtalk.api.response.OapiEduCourseListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.06.10
 */
public class OapiEduCourseListRequest extends BaseTaobaoRequest<OapiEduCourseListResponse> {
	
	

	/** 
	* 按课程编码列表查询
	 */
	private String courseCodes;

	/** 
	* 表示分页游标，从0开始
	 */
	private Long cursor;

	/** 
	* 时间查询结束区间
	 */
	private Long endTime;

	/** 
	* 按课程名称查询
	 */
	private String name;

	/** 
	* 当前操作人的用户ID
	 */
	private String opUserid;

	/** 
	* 查询选项
	 */
	private String option;

	/** 
	* 参与方查询条件
	 */
	private String participantCondition;

	/** 
	* 查询的场景：当前有：manage(管理视角)，lecture(授课视角)
	 */
	private String scene;

	/** 
	* 表示分页大小
	 */
	private Long size;

	/** 
	* 时间查询开始区间
	 */
	private Long startTime;

	/** 
	* 课程状态值
	 */
	private String statuses;

	/** 
	* 按应用唯一标识列表查询
	 */
	private String suiteKeys;

	/** 
	* 授课老师查询条件
	 */
	private String teacherConditions;

	public void setCourseCodes(String courseCodes) {
		this.courseCodes = courseCodes;
	}

	public String getCourseCodes() {
		return this.courseCodes;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
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

	public void setOption(QueryCourseOption option) {
		this.option = new JSONWriter(false,false,true).write(option);
	}

	public String getOption() {
		return this.option;
	}

	public void setParticipantCondition(String participantCondition) {
		this.participantCondition = participantCondition;
	}

	public void setParticipantCondition(QueryCourseParticipantCondition participantCondition) {
		this.participantCondition = new JSONWriter(false,false,true).write(participantCondition);
	}

	public String getParticipantCondition() {
		return this.participantCondition;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getScene() {
		return this.scene;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStatuses(String statuses) {
		this.statuses = statuses;
	}

	public String getStatuses() {
		return this.statuses;
	}

	public void setSuiteKeys(String suiteKeys) {
		this.suiteKeys = suiteKeys;
	}

	public String getSuiteKeys() {
		return this.suiteKeys;
	}

	public void setTeacherConditions(String teacherConditions) {
		this.teacherConditions = teacherConditions;
	}

	public void setTeacherConditions(List<QueryTeacherCondition> teacherConditions) {
		this.teacherConditions = new JSONWriter(false,false,true).write(teacherConditions);
	}

	public String getTeacherConditions() {
		return this.teacherConditions;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.list";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("end_time", this.endTime);
		txtParams.put("name", this.name);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("option", this.option);
		txtParams.put("participant_condition", this.participantCondition);
		txtParams.put("scene", this.scene);
		txtParams.put("size", this.size);
		txtParams.put("start_time", this.startTime);
		txtParams.put("statuses", this.statuses);
		txtParams.put("suite_keys", this.suiteKeys);
		txtParams.put("teacher_conditions", this.teacherConditions);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseListResponse> getResponseClass() {
		return OapiEduCourseListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(courseCodes, 100, "courseCodes");
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkMinValue(cursor, 0L, "cursor");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 100L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
		RequestCheckUtils.checkMaxListSize(statuses, 5, "statuses");
		RequestCheckUtils.checkMaxListSize(suiteKeys, 5, "suiteKeys");
		RequestCheckUtils.checkObjectMaxListSize(teacherConditions, 30, "teacherConditions");
	}
	
	/**
	 * 查询选项
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryCourseOption extends TaobaoObject {
		private static final long serialVersionUID = 6611125517365333286L;
		/**
		 * 是否连带查询课堂信息
		 */
		@ApiField("b_fetch_classrooms")
		private Boolean bFetchClassrooms;
	
		public Boolean getbFetchClassrooms() {
			return this.bFetchClassrooms;
		}
		public void setbFetchClassrooms(Boolean bFetchClassrooms) {
			this.bFetchClassrooms = bFetchClassrooms;
		}
	}
	
	/**
	 * 参与方查询条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryCourseParticipantCondition extends TaobaoObject {
		private static final long serialVersionUID = 1546337846662962333L;
		/**
		 * 参与方角色选项
		 */
		@ApiField("role")
		private String role;
	
		public String getRole() {
			return this.role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	}
	
	/**
	 * 授课老师查询条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryTeacherCondition extends TaobaoObject {
		private static final long serialVersionUID = 7653194248856816226L;
		/**
		 * 授课老师组织CorpId
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 老师用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}