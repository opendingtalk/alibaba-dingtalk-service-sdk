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
import com.dingtalk.api.response.OapiEduSchoolInitResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.school.init request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.31
 */
public class OapiEduSchoolInitRequest extends BaseTaobaoRequest<OapiEduSchoolInitResponse> {
	
	

	/** 
	* 校区
	 */
	private String campus;

	/** 
	* 钉钉企业通讯录管理员
	 */
	private String operator;

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public void setCampus(OpenCampus campus) {
		this.campus = new JSONWriter(false,false,true).write(campus);
	}

	public String getCampus() {
		return this.campus;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.school.init";
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
		txtParams.put("campus", this.campus);
		txtParams.put("operator", this.operator);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduSchoolInitResponse> getResponseClass() {
		return OapiEduSchoolInitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operator, "operator");
	}
	
	/**
	 * 年级列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGrade extends TaobaoObject {
		private static final long serialVersionUID = 6355652592512367311L;
		/**
		 * [0,无限)其下的班级数。尽量不要超过100个，否则页面性能有问题
		 */
		@ApiField("classes")
		private Long classes;
		/**
		 * 年级level
		 */
		@ApiField("grade")
		private String grade;
		/**
		 * 年级名，与grade start_year需要对应
		 */
		@ApiField("name")
		private String name;
		/**
		 * 入学年份。请注意startyear name grade三者之间的关联关系
		 */
		@ApiField("start_year")
		private String startYear;
	
		public Long getClasses() {
			return this.classes;
		}
		public void setClasses(Long classes) {
			this.classes = classes;
		}
		public String getGrade() {
			return this.grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStartYear() {
			return this.startYear;
		}
		public void setStartYear(String startYear) {
			this.startYear = startYear;
		}
	}
	
	/**
	 * 学段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPeriod extends TaobaoObject {
		private static final long serialVersionUID = 1479713496674824424L;
		/**
		 * 年级列表
		 */
		@ApiListField("grades")
		@ApiField("open_grade")
		private List<OpenGrade> grades;
		/**
		 * number: 初中按照1,2,3年级命名。默认。  text: 初中按照6,7,8,9年级命名
		 */
		@ApiField("name_mode")
		private String nameMode;
		/**
		 * 学段code。幼儿园：kindergarten  小学：primary_school  初中：  middle_school  高中：  high_school
		 */
		@ApiField("period_code")
		private String periodCode;
		/**
		 * 学段名；幼儿园：kindergarten  小学：primary_school  初中：  middle_school  高中：  high_school
		 */
		@ApiField("step")
		private String step;
	
		public List<OpenGrade> getGrades() {
			return this.grades;
		}
		public void setGrades(List<OpenGrade> grades) {
			this.grades = grades;
		}
		public String getNameMode() {
			return this.nameMode;
		}
		public void setNameMode(String nameMode) {
			this.nameMode = nameMode;
		}
		public String getPeriodCode() {
			return this.periodCode;
		}
		public void setPeriodCode(String periodCode) {
			this.periodCode = periodCode;
		}
		public String getStep() {
			return this.step;
		}
		public void setStep(String step) {
			this.step = step;
		}
	}
	
	/**
	 * 校区
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCampus extends TaobaoObject {
		private static final long serialVersionUID = 1893317388774379717L;
		/**
		 * 校区名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 学段列表
		 */
		@ApiListField("periods")
		@ApiField("open_period")
		private List<OpenPeriod> periods;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<OpenPeriod> getPeriods() {
			return this.periods;
		}
		public void setPeriods(List<OpenPeriod> periods) {
			this.periods = periods;
		}
	}
	

}