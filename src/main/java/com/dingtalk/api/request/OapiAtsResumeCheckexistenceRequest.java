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
import com.dingtalk.api.response.OapiAtsResumeCheckexistenceResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.resume.checkexistence request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.26
 */
public class OapiAtsResumeCheckexistenceRequest extends BaseTaobaoRequest<OapiAtsResumeCheckexistenceResponse> {
	
	

	/** 
	* 业务唯一标识
	 */
	private String bizCode;

	/** 
	* 结构化简历详情
	 */
	private String resumeDetailInfo;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setResumeDetailInfo(String resumeDetailInfo) {
		this.resumeDetailInfo = resumeDetailInfo;
	}

	public void setResumeDetailInfo(ResumeDetailInfo resumeDetailInfo) {
		this.resumeDetailInfo = new JSONWriter(false,false,true).write(resumeDetailInfo);
	}

	public String getResumeDetailInfo() {
		return this.resumeDetailInfo;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.resume.checkexistence";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("resume_detail_info", this.resumeDetailInfo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsResumeCheckexistenceResponse> getResponseClass() {
		return OapiAtsResumeCheckexistenceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
	}
	
	/**
	 * 项目经历
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProjectInfo extends TaobaoObject {
		private static final long serialVersionUID = 2287242141258939423L;
		/**
		 * 项目所属公司名称
		 */
		@ApiField("company")
		private String company;
		/**
		 * 结束时间
		 */
		@ApiField("end_date")
		private String endDate;
		/**
		 * 项目描述
		 */
		@ApiField("project_description")
		private String projectDescription;
		/**
		 * 项目名称
		 */
		@ApiField("project_name")
		private String projectName;
		/**
		 * 项目职责
		 */
		@ApiField("responsibilities")
		private String responsibilities;
		/**
		 * 开始时间
		 */
		@ApiField("start_date")
		private String startDate;
		/**
		 * 项目职位
		 */
		@ApiField("title")
		private String title;
	
		public String getCompany() {
			return this.company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getEndDate() {
			return this.endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getProjectDescription() {
			return this.projectDescription;
		}
		public void setProjectDescription(String projectDescription) {
			this.projectDescription = projectDescription;
		}
		public String getProjectName() {
			return this.projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getResponsibilities() {
			return this.responsibilities;
		}
		public void setResponsibilities(String responsibilities) {
			this.responsibilities = responsibilities;
		}
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 工作经历
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ExperienceInfo extends TaobaoObject {
		private static final long serialVersionUID = 1142798536481291579L;
		/**
		 * 工作业绩
		 */
		@ApiField("achievement")
		private String achievement;
		/**
		 * 公司名称
		 */
		@ApiField("company")
		private String company;
		/**
		 * 公司描述
		 */
		@ApiField("company_description")
		private String companyDescription;
		/**
		 * 所在部门
		 */
		@ApiField("department")
		private String department;
		/**
		 * 终止时间
		 */
		@ApiField("end_date")
		private String endDate;
		/**
		 * 汇报对象
		 */
		@ApiField("leader")
		private String leader;
		/**
		 * 工作地点
		 */
		@ApiField("location")
		private String location;
		/**
		 * 其它信息
		 */
		@ApiField("others")
		private String others;
		/**
		 * 工作时间段
		 */
		@ApiField("periods_of_time")
		private String periodsOfTime;
		/**
		 * 离职原因
		 */
		@ApiField("reason_of_leaving")
		private String reasonOfLeaving;
		/**
		 * 薪水
		 */
		@ApiField("salary")
		private String salary;
		/**
		 * 公司规模
		 */
		@ApiField("size")
		private String size;
		/**
		 * 开始时间
		 */
		@ApiField("start_date")
		private String startDate;
		/**
		 * 工作描述
		 */
		@ApiField("summary")
		private String summary;
		/**
		 * 职务
		 */
		@ApiField("title")
		private String title;
		/**
		 * 公司性质
		 */
		@ApiField("type")
		private String type;
		/**
		 * 下属人数
		 */
		@ApiField("underling_number")
		private String underlingNumber;
		/**
		 * 所属行业
		 */
		@ApiField("vocation")
		private String vocation;
		/**
		 * 工作类型（实习经历、工作经历）
		 */
		@ApiField("work_type")
		private String workType;
	
		public String getAchievement() {
			return this.achievement;
		}
		public void setAchievement(String achievement) {
			this.achievement = achievement;
		}
		public String getCompany() {
			return this.company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getCompanyDescription() {
			return this.companyDescription;
		}
		public void setCompanyDescription(String companyDescription) {
			this.companyDescription = companyDescription;
		}
		public String getDepartment() {
			return this.department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getEndDate() {
			return this.endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getLeader() {
			return this.leader;
		}
		public void setLeader(String leader) {
			this.leader = leader;
		}
		public String getLocation() {
			return this.location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getOthers() {
			return this.others;
		}
		public void setOthers(String others) {
			this.others = others;
		}
		public String getPeriodsOfTime() {
			return this.periodsOfTime;
		}
		public void setPeriodsOfTime(String periodsOfTime) {
			this.periodsOfTime = periodsOfTime;
		}
		public String getReasonOfLeaving() {
			return this.reasonOfLeaving;
		}
		public void setReasonOfLeaving(String reasonOfLeaving) {
			this.reasonOfLeaving = reasonOfLeaving;
		}
		public String getSalary() {
			return this.salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getSize() {
			return this.size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUnderlingNumber() {
			return this.underlingNumber;
		}
		public void setUnderlingNumber(String underlingNumber) {
			this.underlingNumber = underlingNumber;
		}
		public String getVocation() {
			return this.vocation;
		}
		public void setVocation(String vocation) {
			this.vocation = vocation;
		}
		public String getWorkType() {
			return this.workType;
		}
		public void setWorkType(String workType) {
			this.workType = workType;
		}
	}
	
	/**
	 * 教育经历
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EducationInfo extends TaobaoObject {
		private static final long serialVersionUID = 1783144183351742711L;
		/**
		 * 学位
		 */
		@ApiField("advanced_degree")
		private String advancedDegree;
		/**
		 * 院系
		 */
		@ApiField("department")
		private String department;
		/**
		 * 学历
		 */
		@ApiField("education")
		private String education;
		/**
		 * 终止时间
		 */
		@ApiField("end_date")
		private String endDate;
		/**
		 * 其它内容
		 */
		@ApiField("others")
		private String others;
		/**
		 * 学校名称
		 */
		@ApiField("school")
		private String school;
		/**
		 * 学校特征标签
		 */
		@ApiField("school_label")
		private String schoolLabel;
		/**
		 * 院校类别：取值为 0：普通，1：211 院校，2：985 院校，3：既是 211 又是 985 院校，4：外国 5：台湾大学
		 */
		@ApiField("school_type")
		private String schoolType;
		/**
		 * 专业
		 */
		@ApiField("speciality")
		private String speciality;
		/**
		 * 开始时间
		 */
		@ApiField("start_date")
		private String startDate;
		/**
		 * 统招或自考
		 */
		@ApiField("student_type")
		private String studentType;
		/**
		 * 留学经历
		 */
		@ApiField("study_abroad_experience")
		private String studyAbroadExperience;
		/**
		 * 详细介绍
		 */
		@ApiField("summary")
		private String summary;
	
		public String getAdvancedDegree() {
			return this.advancedDegree;
		}
		public void setAdvancedDegree(String advancedDegree) {
			this.advancedDegree = advancedDegree;
		}
		public String getDepartment() {
			return this.department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getEducation() {
			return this.education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public String getEndDate() {
			return this.endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getOthers() {
			return this.others;
		}
		public void setOthers(String others) {
			this.others = others;
		}
		public String getSchool() {
			return this.school;
		}
		public void setSchool(String school) {
			this.school = school;
		}
		public String getSchoolLabel() {
			return this.schoolLabel;
		}
		public void setSchoolLabel(String schoolLabel) {
			this.schoolLabel = schoolLabel;
		}
		public String getSchoolType() {
			return this.schoolType;
		}
		public void setSchoolType(String schoolType) {
			this.schoolType = schoolType;
		}
		public String getSpeciality() {
			return this.speciality;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getStudentType() {
			return this.studentType;
		}
		public void setStudentType(String studentType) {
			this.studentType = studentType;
		}
		public String getStudyAbroadExperience() {
			return this.studyAbroadExperience;
		}
		public void setStudyAbroadExperience(String studyAbroadExperience) {
			this.studyAbroadExperience = studyAbroadExperience;
		}
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
	}
	
	/**
	 * 结构化简历详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResumeDetailInfo extends TaobaoObject {
		private static final long serialVersionUID = 3728841175112729795L;
		/**
		 * 教育经历
		 */
		@ApiListField("education_info_list")
		@ApiField("education_info")
		private List<EducationInfo> educationInfoList;
		/**
		 * 邮箱
		 */
		@ApiField("email")
		private String email;
		/**
		 * 工作经历
		 */
		@ApiListField("experience_info_list")
		@ApiField("experience_info")
		private List<ExperienceInfo> experienceInfoList;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 手机号
		 */
		@ApiField("phone_num")
		private String phoneNum;
		/**
		 * 项目经历
		 */
		@ApiListField("project_info_list")
		@ApiField("project_info")
		private List<ProjectInfo> projectInfoList;
	
		public List<EducationInfo> getEducationInfoList() {
			return this.educationInfoList;
		}
		public void setEducationInfoList(List<EducationInfo> educationInfoList) {
			this.educationInfoList = educationInfoList;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<ExperienceInfo> getExperienceInfoList() {
			return this.experienceInfoList;
		}
		public void setExperienceInfoList(List<ExperienceInfo> experienceInfoList) {
			this.experienceInfoList = experienceInfoList;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNum() {
			return this.phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		public List<ProjectInfo> getProjectInfoList() {
			return this.projectInfoList;
		}
		public void setProjectInfoList(List<ProjectInfo> projectInfoList) {
			this.projectInfoList = projectInfoList;
		}
	}
	

}