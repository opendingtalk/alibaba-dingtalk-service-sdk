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
import com.dingtalk.api.response.OapiEduGradeCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.grade.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.31
 */
public class OapiEduGradeCreateRequest extends BaseTaobaoRequest<OapiEduGradeCreateResponse> {
	
	

	/** 
	* 待写入的年级
	 */
	private String openGrade;

	/** 
	* 钉钉企业管理员
	 */
	private String operator;

	/** 
	* 学段id
	 */
	private Long superId;

	public void setOpenGrade(String openGrade) {
		this.openGrade = openGrade;
	}

	public void setOpenGrade(OpenGrade openGrade) {
		this.openGrade = new JSONWriter(false,false,true).write(openGrade);
	}

	public String getOpenGrade() {
		return this.openGrade;
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
		return "dingtalk.oapi.edu.grade.create";
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
		txtParams.put("open_grade", this.openGrade);
		txtParams.put("operator", this.operator);
		txtParams.put("super_id", this.superId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduGradeCreateResponse> getResponseClass() {
		return OapiEduGradeCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(operator, "operator");
		RequestCheckUtils.checkNotEmpty(superId, "superId");
	}
	
	/**
	 * 待写入的年级
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGrade extends TaobaoObject {
		private static final long serialVersionUID = 7894922353181452972L;
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
	

}