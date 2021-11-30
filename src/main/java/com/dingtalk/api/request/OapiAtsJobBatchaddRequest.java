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
import com.dingtalk.api.response.OapiAtsJobBatchaddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.job.batchadd request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.08
 */
public class OapiAtsJobBatchaddRequest extends BaseTaobaoRequest<OapiAtsJobBatchaddResponse> {
	
	

	/** 
	* 招聘业务标识
	 */
	private String bizCode;

	/** 
	* 职位列表，单次最多20个
	 */
	private String jobs;

	/** 
	* 操作人员工标识
	 */
	private String opUserId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public void setJobs(List<AtsAddJobParam> jobs) {
		this.jobs = new JSONWriter(false,false,true).write(jobs);
	}

	public String getJobs() {
		return this.jobs;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.job.batchadd";
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
		txtParams.put("jobs", this.jobs);
		txtParams.put("op_user_id", this.opUserId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsJobBatchaddResponse> getResponseClass() {
		return OapiAtsJobBatchaddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkObjectMaxListSize(jobs, 999, "jobs");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
	}
	
	/**
	 * 全职扩展数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JobFullTimeExtDataVo extends TaobaoObject {
		private static final long serialVersionUID = 7624579512211616879L;
		/**
		 * 薪资发放月数
		 */
		@ApiField("salary_month")
		private Long salaryMonth;
	
		public Long getSalaryMonth() {
			return this.salaryMonth;
		}
		public void setSalaryMonth(Long salaryMonth) {
			this.salaryMonth = salaryMonth;
		}
	}
	
	/**
	 * 扩展数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JobExtDataVo extends TaobaoObject {
		private static final long serialVersionUID = 3233534616452553847L;
		/**
		 * 全职扩展数据
		 */
		@ApiField("full_time_ext_data")
		private JobFullTimeExtDataVo fullTimeExtData;
		/**
		 * 招募人数
		 */
		@ApiField("head_count")
		private Long headCount;
	
		public JobFullTimeExtDataVo getFullTimeExtData() {
			return this.fullTimeExtData;
		}
		public void setFullTimeExtData(JobFullTimeExtDataVo fullTimeExtData) {
			this.fullTimeExtData = fullTimeExtData;
		}
		public Long getHeadCount() {
			return this.headCount;
		}
		public void setHeadCount(Long headCount) {
			this.headCount = headCount;
		}
	}
	
	/**
	 * 工作地点
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JobAddressVo extends TaobaoObject {
		private static final long serialVersionUID = 4778283196573545218L;
		/**
		 * 位置详情
		 */
		@ApiField("detail")
		private String detail;
		/**
		 * 位置名称
		 */
		@ApiField("name")
		private String name;
	
		public String getDetail() {
			return this.detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 职位列表，单次最多20个
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AtsAddJobParam extends TaobaoObject {
		private static final long serialVersionUID = 7365458763813874298L;
		/**
		 * 工作地点
		 */
		@ApiField("address")
		private JobAddressVo address;
		/**
		 * 是否校招
		 */
		@ApiField("campus")
		private Boolean campus;
		/**
		 * 城市编码
		 */
		@ApiField("city")
		private String city;
		/**
		 * 操作人员工标识
		 */
		@ApiField("creator_user_id")
		private String creatorUserId;
		/**
		 * 职位描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 区县编码
		 */
		@ApiField("district")
		private String district;
		/**
		 * 扩展数据
		 */
		@ApiField("ext_data")
		private JobExtDataVo extData;
		/**
		 * 职位性质，FULL-TIME：全职，PART-TIME：兼职，INTERNSHIP：实习，OTHER：其他
		 */
		@ApiField("job_nature")
		private String jobNature;
		/**
		 * 最低月薪，单位：元
		 */
		@ApiField("max_salary")
		private Long maxSalary;
		/**
		 * 最高月薪，单位：元
		 */
		@ApiField("min_salary")
		private Long minSalary;
		/**
		 * 职位名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 职位负责人的员工标识列表
		 */
		@ApiListField("owner_user_ids")
		@ApiField("string")
		private List<String> ownerUserIds;
		/**
		 * 省域编码
		 */
		@ApiField("province")
		private String province;
		/**
		 * 学历要求，1小学 2初中 3高中  4中专 5大专 6本科  7硕士 8 博士 9其他
		 */
		@ApiField("required_edu")
		private Long requiredEdu;
	
		public JobAddressVo getAddress() {
			return this.address;
		}
		public void setAddress(JobAddressVo address) {
			this.address = address;
		}
		public Boolean getCampus() {
			return this.campus;
		}
		public void setCampus(Boolean campus) {
			this.campus = campus;
		}
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCreatorUserId() {
			return this.creatorUserId;
		}
		public void setCreatorUserId(String creatorUserId) {
			this.creatorUserId = creatorUserId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getDistrict() {
			return this.district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public JobExtDataVo getExtData() {
			return this.extData;
		}
		public void setExtData(JobExtDataVo extData) {
			this.extData = extData;
		}
		public String getJobNature() {
			return this.jobNature;
		}
		public void setJobNature(String jobNature) {
			this.jobNature = jobNature;
		}
		public Long getMaxSalary() {
			return this.maxSalary;
		}
		public void setMaxSalary(Long maxSalary) {
			this.maxSalary = maxSalary;
		}
		public Long getMinSalary() {
			return this.minSalary;
		}
		public void setMinSalary(Long minSalary) {
			this.minSalary = minSalary;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getOwnerUserIds() {
			return this.ownerUserIds;
		}
		public void setOwnerUserIds(List<String> ownerUserIds) {
			this.ownerUserIds = ownerUserIds;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public Long getRequiredEdu() {
			return this.requiredEdu;
		}
		public void setRequiredEdu(Long requiredEdu) {
			this.requiredEdu = requiredEdu;
		}
	}
	

}