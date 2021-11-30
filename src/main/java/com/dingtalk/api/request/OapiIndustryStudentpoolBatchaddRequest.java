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
import com.dingtalk.api.response.OapiIndustryStudentpoolBatchaddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.studentpool.batchadd request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.14
 */
public class OapiIndustryStudentpoolBatchaddRequest extends BaseTaobaoRequest<OapiIndustryStudentpoolBatchaddResponse> {
	
	

	/** 
	* 业务code
	 */
	private String bizCode;

	/** 
	* 学员列表
	 */
	private String studentList;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setStudentList(String studentList) {
		this.studentList = studentList;
	}

	public void setStudentList(List<TrainingStudentDto> studentList) {
		this.studentList = new JSONWriter(false,false,true).write(studentList);
	}

	public String getStudentList() {
		return this.studentList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.industry.studentpool.batchadd";
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
		txtParams.put("student_list", this.studentList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiIndustryStudentpoolBatchaddResponse> getResponseClass() {
		return OapiIndustryStudentpoolBatchaddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkObjectMaxListSize(studentList, 20, "studentList");
	}
	
	/**
	 * 学员联系人列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PatriarchDto extends TaobaoObject {
		private static final long serialVersionUID = 7718642916769559576L;
		/**
		 * 联系人手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 联系人名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 联系人与学员的关系
		 */
		@ApiField("relation")
		private String relation;
	
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRelation() {
			return this.relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
	}
	
	/**
	 * 学员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TrainingStudentDto extends TaobaoObject {
		private static final long serialVersionUID = 8635789186438179172L;
		/**
		 * 学员手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 学员名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 学员编号
		 */
		@ApiField("number")
		private String number;
		/**
		 * 课包ID列表
		 */
		@ApiListField("package_ids")
		@ApiField("number")
		private List<Long> packageIds;
		/**
		 * 学员联系人列表
		 */
		@ApiListField("patriarchs")
		@ApiField("patriarch_dto")
		private List<PatriarchDto> patriarchs;
	
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public List<Long> getPackageIds() {
			return this.packageIds;
		}
		public void setPackageIds(List<Long> packageIds) {
			this.packageIds = packageIds;
		}
		public List<PatriarchDto> getPatriarchs() {
			return this.patriarchs;
		}
		public void setPatriarchs(List<PatriarchDto> patriarchs) {
			this.patriarchs = patriarchs;
		}
	}
	

}