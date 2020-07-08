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
import com.dingtalk.api.response.OapiEduHomeworkStudentTopicRecordResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.student.topic.record request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.29
 */
public class OapiEduHomeworkStudentTopicRecordRequest extends BaseTaobaoRequest<OapiEduHomeworkStudentTopicRecordResponse> {
	
	

	/** 
	* 答题记录详情
	 */
	private String studentAnswerDetails;

	public void setStudentAnswerDetails(String studentAnswerDetails) {
		this.studentAnswerDetails = studentAnswerDetails;
	}

	public void setStudentAnswerDetails(List<StudentAnswerDetail> studentAnswerDetails) {
		this.studentAnswerDetails = new JSONWriter(false,false,true).write(studentAnswerDetails);
	}

	public String getStudentAnswerDetails() {
		return this.studentAnswerDetails;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.student.topic.record";
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
		txtParams.put("student_answer_details", this.studentAnswerDetails);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkStudentTopicRecordResponse> getResponseClass() {
		return OapiEduHomeworkStudentTopicRecordResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(studentAnswerDetails, 20, "studentAnswerDetails");
	}
	
	/**
	 * 答题记录详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class StudentAnswerDetail extends TaobaoObject {
		private static final long serialVersionUID = 5737435744635894294L;
		/**
		 * 扩展属性
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 业务编码
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 班级ID
		 */
		@ApiField("class_id")
		private String classId;
		/**
		 * 作业ID
		 */
		@ApiField("hw_id")
		private Long hwId;
		/**
		 * 是否答对
		 */
		@ApiField("is_right")
		private String isRight;
		/**
		 * 题目ID
		 */
		@ApiField("question_id")
		private String questionId;
		/**
		 * 做了多少次
		 */
		@ApiField("redo_times")
		private Long redoTimes;
		/**
		 * 做题时间
		 */
		@ApiField("spend_time")
		private Long spendTime;
		/**
		 * 学生ID
		 */
		@ApiField("student_id")
		private String studentId;
		/**
		 * 学生姓名
		 */
		@ApiField("student_name")
		private String studentName;
	
		public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getClassId() {
			return this.classId;
		}
		public void setClassId(String classId) {
			this.classId = classId;
		}
		public Long getHwId() {
			return this.hwId;
		}
		public void setHwId(Long hwId) {
			this.hwId = hwId;
		}
		public String getIsRight() {
			return this.isRight;
		}
		public void setIsRight(String isRight) {
			this.isRight = isRight;
		}
		public String getQuestionId() {
			return this.questionId;
		}
		public void setQuestionId(String questionId) {
			this.questionId = questionId;
		}
		public Long getRedoTimes() {
			return this.redoTimes;
		}
		public void setRedoTimes(Long redoTimes) {
			this.redoTimes = redoTimes;
		}
		public Long getSpendTime() {
			return this.spendTime;
		}
		public void setSpendTime(Long spendTime) {
			this.spendTime = spendTime;
		}
		public String getStudentId() {
			return this.studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return this.studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
	}
	

}