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
import com.dingtalk.api.response.OapiAtsResumeAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.resume.add request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.26
 */
public class OapiAtsResumeAddRequest extends BaseTaobaoRequest<OapiAtsResumeAddResponse> {
	
	

	/** 
	* 业务唯一标识，接入前请提前沟通
	 */
	private String bizCode;

	/** 
	* 简历文件参数
	 */
	private String param;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(CollResumeMailParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.resume.add";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsResumeAddResponse> getResponseClass() {
		return OapiAtsResumeAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
	}
	
	/**
	 * 教育经历
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EducationInfo extends TaobaoObject {
		private static final long serialVersionUID = 4825317631218767552L;
		/**
		 * 学历
		 */
		@ApiField("education")
		private String education;
		/**
		 * 结束时间
		 */
		@ApiField("end_date")
		private String endDate;
		/**
		 * 学校名称
		 */
		@ApiField("school")
		private String school;
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
		 * 详细介绍
		 */
		@ApiField("summary")
		private String summary;
	
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
		public String getSchool() {
			return this.school;
		}
		public void setSchool(String school) {
			this.school = school;
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
		public String getSummary() {
			return this.summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
	}
	
	/**
	 * 工作经历
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ExperienceInfo extends TaobaoObject {
		private static final long serialVersionUID = 4633972162647767181L;
		/**
		 * 公司名称
		 */
		@ApiField("company")
		private String company;
		/**
		 * 结束时间
		 */
		@ApiField("end_date")
		private String endDate;
		/**
		 * 开始时间
		 */
		@ApiField("start_date")
		private String startDate;
		/**
		 * 工作内容
		 */
		@ApiField("summary")
		private String summary;
		/**
		 * 职位名称
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
	}
	
	/**
	 * 培训经历
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TrainingInfo extends TaobaoObject {
		private static final long serialVersionUID = 3311654422934751339L;
		/**
		 * 所获证书
		 */
		@ApiField("certificate")
		private String certificate;
		/**
		 * 培训详情
		 */
		@ApiField("description_in_details")
		private String descriptionInDetails;
		/**
		 * 结束时间
		 */
		@ApiField("end_date")
		private String endDate;
		/**
		 * 开始时间
		 */
		@ApiField("start_date")
		private String startDate;
		/**
		 * 培训机构名称
		 */
		@ApiField("training_institution")
		private String trainingInstitution;
	
		public String getCertificate() {
			return this.certificate;
		}
		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}
		public String getDescriptionInDetails() {
			return this.descriptionInDetails;
		}
		public void setDescriptionInDetails(String descriptionInDetails) {
			this.descriptionInDetails = descriptionInDetails;
		}
		public String getEndDate() {
			return this.endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getTrainingInstitution() {
			return this.trainingInstitution;
		}
		public void setTrainingInstitution(String trainingInstitution) {
			this.trainingInstitution = trainingInstitution;
		}
	}
	
	/**
	 * 项目经历
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProjectInfo extends TaobaoObject {
		private static final long serialVersionUID = 6436448968627448988L;
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
		 * 开始时间
		 */
		@ApiField("start_date")
		private String startDate;
	
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
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
	}
	
	/**
	 * 结构化的简历详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResumeDetailInfo extends TaobaoObject {
		private static final long serialVersionUID = 5142311489793475979L;
		/**
		 * 学位
		 */
		@ApiField("advanced_degree")
		private String advancedDegree;
		/**
		 * 期望薪资
		 */
		@ApiField("aim_salary")
		private String aimSalary;
		/**
		 * 开始工作时间
		 */
		@ApiField("begin_work_time")
		private String beginWorkTime;
		/**
		 * 出生日期
		 */
		@ApiField("birth")
		private String birth;
		/**
		 * 小学，初中，高中，中专，大专，本科，硕士，博士，其他
		 */
		@ApiField("education")
		private String education;
		/**
		 * 教育经历
		 */
		@ApiListField("education_info_list")
		@ApiField("education_info")
		private List<EducationInfo> educationInfoList;
		/**
		 * 邮箱地址
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
		 * 期望工作地
		 */
		@ApiField("forward_location")
		private String forwardLocation;
		/**
		 * 英语等级
		 */
		@ApiField("grade_of_english")
		private String gradeOfEnglish;
		/**
		 * 毕业时间
		 */
		@ApiField("graduate_time")
		private String graduateTime;
		/**
		 * 求职状态
		 */
		@ApiField("job_status")
		private String jobStatus;
		/**
		 * 已婚，未婚，离婚
		 */
		@ApiField("married")
		private String married;
		/**
		 * 姓名，必传
		 */
		@ApiField("name")
		private String name;
		/**
		 * 国籍
		 */
		@ApiField("nationality")
		private String nationality;
		/**
		 * 籍贯
		 */
		@ApiField("native_place")
		private String nativePlace;
		/**
		 * 先居住地
		 */
		@ApiField("now_location")
		private String nowLocation;
		/**
		 * 电话，必传
		 */
		@ApiField("phone_num")
		private String phoneNum;
		/**
		 * 政治面貌
		 */
		@ApiField("political")
		private String political;
		/**
		 * 项目经历
		 */
		@ApiListField("project_info_list")
		@ApiField("project_info")
		private List<ProjectInfo> projectInfoList;
		/**
		 * 当前薪资
		 */
		@ApiField("salary")
		private String salary;
		/**
		 * 毕业院校
		 */
		@ApiField("school")
		private String school;
		/**
		 * 学校类别
		 */
		@ApiField("school_type")
		private String schoolType;
		/**
		 * 男性，女性
		 */
		@ApiField("sex")
		private String sex;
		/**
		 * 专业
		 */
		@ApiField("speciality")
		private String speciality;
		/**
		 * 学历情况
		 */
		@ApiField("student_type")
		private String studentType;
		/**
		 * 职位名称
		 */
		@ApiField("title_standard")
		private String titleStandard;
		/**
		 * 培训经历
		 */
		@ApiListField("training_info_list")
		@ApiField("training_info")
		private List<TrainingInfo> trainingInfoList;
		/**
		 * 行业名称
		 */
		@ApiField("vocation_standard")
		private String vocationStandard;
	
		public String getAdvancedDegree() {
			return this.advancedDegree;
		}
		public void setAdvancedDegree(String advancedDegree) {
			this.advancedDegree = advancedDegree;
		}
		public String getAimSalary() {
			return this.aimSalary;
		}
		public void setAimSalary(String aimSalary) {
			this.aimSalary = aimSalary;
		}
		public String getBeginWorkTime() {
			return this.beginWorkTime;
		}
		public void setBeginWorkTime(String beginWorkTime) {
			this.beginWorkTime = beginWorkTime;
		}
		public String getBirth() {
			return this.birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public String getEducation() {
			return this.education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
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
		public String getForwardLocation() {
			return this.forwardLocation;
		}
		public void setForwardLocation(String forwardLocation) {
			this.forwardLocation = forwardLocation;
		}
		public String getGradeOfEnglish() {
			return this.gradeOfEnglish;
		}
		public void setGradeOfEnglish(String gradeOfEnglish) {
			this.gradeOfEnglish = gradeOfEnglish;
		}
		public String getGraduateTime() {
			return this.graduateTime;
		}
		public void setGraduateTime(String graduateTime) {
			this.graduateTime = graduateTime;
		}
		public String getJobStatus() {
			return this.jobStatus;
		}
		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}
		public String getMarried() {
			return this.married;
		}
		public void setMarried(String married) {
			this.married = married;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNationality() {
			return this.nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getNativePlace() {
			return this.nativePlace;
		}
		public void setNativePlace(String nativePlace) {
			this.nativePlace = nativePlace;
		}
		public String getNowLocation() {
			return this.nowLocation;
		}
		public void setNowLocation(String nowLocation) {
			this.nowLocation = nowLocation;
		}
		public String getPhoneNum() {
			return this.phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		public String getPolitical() {
			return this.political;
		}
		public void setPolitical(String political) {
			this.political = political;
		}
		public List<ProjectInfo> getProjectInfoList() {
			return this.projectInfoList;
		}
		public void setProjectInfoList(List<ProjectInfo> projectInfoList) {
			this.projectInfoList = projectInfoList;
		}
		public String getSalary() {
			return this.salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getSchool() {
			return this.school;
		}
		public void setSchool(String school) {
			this.school = school;
		}
		public String getSchoolType() {
			return this.schoolType;
		}
		public void setSchoolType(String schoolType) {
			this.schoolType = schoolType;
		}
		public String getSex() {
			return this.sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getSpeciality() {
			return this.speciality;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public String getStudentType() {
			return this.studentType;
		}
		public void setStudentType(String studentType) {
			this.studentType = studentType;
		}
		public String getTitleStandard() {
			return this.titleStandard;
		}
		public void setTitleStandard(String titleStandard) {
			this.titleStandard = titleStandard;
		}
		public List<TrainingInfo> getTrainingInfoList() {
			return this.trainingInfoList;
		}
		public void setTrainingInfoList(List<TrainingInfo> trainingInfoList) {
			this.trainingInfoList = trainingInfoList;
		}
		public String getVocationStandard() {
			return this.vocationStandard;
		}
		public void setVocationStandard(String vocationStandard) {
			this.vocationStandard = vocationStandard;
		}
	}
	
	/**
	 * 简历文件信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ResumeFileStoreVo extends TaobaoObject {
		private static final long serialVersionUID = 8779687516974558977L;
		/**
		 * 下载地址
		 */
		@ApiField("download_url")
		private String downloadUrl;
		/**
		 * 文件名，需要带后缀
		 */
		@ApiField("file_name")
		private String fileName;
		/**
		 * 文件类型
		 */
		@ApiField("file_type")
		private String fileType;
	
		public String getDownloadUrl() {
			return this.downloadUrl;
		}
		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}
		public String getFileName() {
			return this.fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getFileType() {
			return this.fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
	}
	
	/**
	 * 原始邮件信息，可选
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MailContent extends TaobaoObject {
		private static final long serialVersionUID = 1775427859335549488L;
		/**
		 * 邮件正文，可选
		 */
		@ApiField("body_html")
		private String bodyHtml;
		/**
		 * 发件人邮件地址，可选
		 */
		@ApiField("from_mail_address")
		private String fromMailAddress;
		/**
		 * 发件人姓名
		 */
		@ApiField("from_mail_alias")
		private String fromMailAlias;
		/**
		 * 邮件地址，可选
		 */
		@ApiField("mail_address")
		private String mailAddress;
		/**
		 * 邮件id
		 */
		@ApiField("mail_id")
		private String mailId;
		/**
		 * 收件时间，时间戳毫秒
		 */
		@ApiField("received_time")
		private String receivedTime;
		/**
		 * 邮件标题，可选
		 */
		@ApiField("title")
		private String title;
	
		public String getBodyHtml() {
			return this.bodyHtml;
		}
		public void setBodyHtml(String bodyHtml) {
			this.bodyHtml = bodyHtml;
		}
		public String getFromMailAddress() {
			return this.fromMailAddress;
		}
		public void setFromMailAddress(String fromMailAddress) {
			this.fromMailAddress = fromMailAddress;
		}
		public String getFromMailAlias() {
			return this.fromMailAlias;
		}
		public void setFromMailAlias(String fromMailAlias) {
			this.fromMailAlias = fromMailAlias;
		}
		public String getMailAddress() {
			return this.mailAddress;
		}
		public void setMailAddress(String mailAddress) {
			this.mailAddress = mailAddress;
		}
		public String getMailId() {
			return this.mailId;
		}
		public void setMailId(String mailId) {
			this.mailId = mailId;
		}
		public String getReceivedTime() {
			return this.receivedTime;
		}
		public void setReceivedTime(String receivedTime) {
			this.receivedTime = receivedTime;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 简历文件参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CollResumeMailParam extends TaobaoObject {
		private static final long serialVersionUID = 7317986183459972948L;
		/**
		 * 渠道来源，接入前请提前沟通
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 匹配到的职位列表
		 */
		@ApiListField("matched_jobs")
		@ApiField("string")
		private List<String> matchedJobs;
		/**
		 * 用户userId
		 */
		@ApiField("opt_user_id")
		private String optUserId;
		/**
		 * 原始邮件信息，可选
		 */
		@ApiField("origin_mail")
		private MailContent originMail;
		/**
		 * 虚拟手机号简历跳转到渠道链接
		 */
		@ApiField("resume_channel_url")
		private String resumeChannelUrl;
		/**
		 * 结构化的简历详情
		 */
		@ApiField("resume_detail_info")
		private ResumeDetailInfo resumeDetailInfo;
		/**
		 * 简历文件信息
		 */
		@ApiField("resume_file")
		private ResumeFileStoreVo resumeFile;
		/**
		 * 是否是虚拟手机号
		 */
		@ApiField("virtual_phone_number_flag")
		private Boolean virtualPhoneNumberFlag;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public List<String> getMatchedJobs() {
			return this.matchedJobs;
		}
		public void setMatchedJobs(List<String> matchedJobs) {
			this.matchedJobs = matchedJobs;
		}
		public String getOptUserId() {
			return this.optUserId;
		}
		public void setOptUserId(String optUserId) {
			this.optUserId = optUserId;
		}
		public MailContent getOriginMail() {
			return this.originMail;
		}
		public void setOriginMail(MailContent originMail) {
			this.originMail = originMail;
		}
		public String getResumeChannelUrl() {
			return this.resumeChannelUrl;
		}
		public void setResumeChannelUrl(String resumeChannelUrl) {
			this.resumeChannelUrl = resumeChannelUrl;
		}
		public ResumeDetailInfo getResumeDetailInfo() {
			return this.resumeDetailInfo;
		}
		public void setResumeDetailInfo(ResumeDetailInfo resumeDetailInfo) {
			this.resumeDetailInfo = resumeDetailInfo;
		}
		public ResumeFileStoreVo getResumeFile() {
			return this.resumeFile;
		}
		public void setResumeFile(ResumeFileStoreVo resumeFile) {
			this.resumeFile = resumeFile;
		}
		public Boolean getVirtualPhoneNumberFlag() {
			return this.virtualPhoneNumberFlag;
		}
		public void setVirtualPhoneNumberFlag(Boolean virtualPhoneNumberFlag) {
			this.virtualPhoneNumberFlag = virtualPhoneNumberFlag;
		}
	}
	

}