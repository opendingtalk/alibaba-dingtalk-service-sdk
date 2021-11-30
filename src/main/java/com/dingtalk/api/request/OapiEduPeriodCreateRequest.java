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
import com.dingtalk.api.response.OapiEduPeriodCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.period.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.31
 */
public class OapiEduPeriodCreateRequest extends BaseTaobaoRequest<OapiEduPeriodCreateResponse> {
	
	

	/** 
	* 学段信息
	 */
	private String openPeriod;

	/** 
	* 钉钉管理员
	 */
	private String operator;

	/** 
	* 校区id
	 */
	private Long superId;

	public void setOpenPeriod(String openPeriod) {
		this.openPeriod = openPeriod;
	}

	public void setOpenPeriod(OpenPeriod openPeriod) {
		this.openPeriod = new JSONWriter(false,false,true).write(openPeriod);
	}

	public String getOpenPeriod() {
		return this.openPeriod;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setSuperId(Long superId) {
		this.superId = superId;
	}

	public Long getSuperId() {
		return this.superId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.period.create";
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
		txtParams.put("open_period", this.openPeriod);
		txtParams.put("operator", this.operator);
		txtParams.put("super_id", this.superId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduPeriodCreateResponse> getResponseClass() {
		return OapiEduPeriodCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(superId, "superId");
	}
	
	/**
	 * 年级
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Grades extends TaobaoObject {
		private static final long serialVersionUID = 7845353555515729655L;
		/**
		 * 创建年级时，需要在此年级下创建多少个班级。允许填0.
		 */
		@ApiField("classes")
		private Long classes;
		/**
		 * 年级level
		 */
		@ApiField("grade")
		private String grade;
		/**
		 * 年级名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 入学年份
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
	 * 学段信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPeriod extends TaobaoObject {
		private static final long serialVersionUID = 6351574739122276667L;
		/**
		 * 年级
		 */
		@ApiListField("grades")
		@ApiField("grades")
		private List<Grades> grades;
		/**
		 * number: 初中按照1,2,3年级命名。默认。  text: 初中按照6,7,8,9年级命名
		 */
		@ApiField("name_mode")
		private String nameMode;
		/**
		 * 幼儿园：kindergarten  小学：primary_school  初中：  middle_school  高中：  high_school
		 */
		@ApiField("period_code")
		private String periodCode;
		/**
		 * 学段名.  其枚举值：  幼儿园小学初中高中
		 */
		@ApiField("step")
		private String step;
	
		public List<Grades> getGrades() {
			return this.grades;
		}
		public void setGrades(List<Grades> grades) {
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
	

}