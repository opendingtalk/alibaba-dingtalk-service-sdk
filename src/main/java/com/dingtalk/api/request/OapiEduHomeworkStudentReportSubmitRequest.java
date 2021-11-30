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

import com.dingtalk.api.response.OapiEduHomeworkStudentReportSubmitResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.homework.student.report.submit request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.28
 */
public class OapiEduHomeworkStudentReportSubmitRequest extends BaseTaobaoRequest<OapiEduHomeworkStudentReportSubmitResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private String attributes;

	/** 
	* 业务编码
	 */
	private String bizCode;

	/** 
	* 部门ID
	 */
	private Long classId;

	/** 
	* 作业ID
	 */
	private Long hwId;

	/** 
	* 作业报告
	 */
	private String hwReport;

	/** 
	* 作业结果
	 */
	private String hwResult;

	/** 
	* 学生ID
	 */
	private String studentId;

	/** 
	* 学生姓名
	 */
	private String studentName;

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

	public void setHwId(Long hwId) {
		this.hwId = hwId;
	}

	public Long getHwId() {
		return this.hwId;
	}

	public void setHwReport(String hwReport) {
		this.hwReport = hwReport;
	}

	public String getHwReport() {
		return this.hwReport;
	}

	public void setHwResult(String hwResult) {
		this.hwResult = hwResult;
	}

	public String getHwResult() {
		return this.hwResult;
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

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.homework.student.report.submit";
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
		txtParams.put("hw_id", this.hwId);
		txtParams.put("hw_report", this.hwReport);
		txtParams.put("hw_result", this.hwResult);
		txtParams.put("student_id", this.studentId);
		txtParams.put("student_name", this.studentName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduHomeworkStudentReportSubmitResponse> getResponseClass() {
		return OapiEduHomeworkStudentReportSubmitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkNotEmpty(hwId, "hwId");
		RequestCheckUtils.checkNotEmpty(studentId, "studentId");
		RequestCheckUtils.checkNotEmpty(studentName, "studentName");
	}
	

}