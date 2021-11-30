package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.job.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAtsJobGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7155863843168827215L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 职位结果
	 */
	@ApiField("result")
	private JobSimpleVO result;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(JobSimpleVO result) {
		this.result = result;
	}
	public JobSimpleVO getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 职位地址详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JobAddressVO extends TaobaoObject {
		private static final long serialVersionUID = 8363631825645374535L;
		/**
		 * 地点详情
		 */
		@ApiField("detail")
		private String detail;
		/**
		 * 经度
		 */
		@ApiField("latitude")
		private String latitude;
		/**
		 * 纬度
		 */
		@ApiField("longitude")
		private String longitude;
		/**
		 * 地点名
		 */
		@ApiField("name")
		private String name;
	
		public String getDetail() {
			return this.detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getLatitude() {
			return this.latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return this.longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 职位结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JobSimpleVO extends TaobaoObject {
		private static final long serialVersionUID = 2561292896338381465L;
		/**
		 * 职位地址详情
		 */
		@ApiField("address")
		private JobAddressVO address;
		/**
		 * 职位地址 市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 职位描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 职位地址 区县
		 */
		@ApiField("district")
		private String district;
		/**
		 * 招募人数
		 */
		@ApiField("head_count")
		private Long headCount;
		/**
		 * 职位编码
		 */
		@ApiField("job_code")
		private String jobCode;
		/**
		 * 职位唯一标识
		 */
		@ApiField("job_id")
		private String jobId;
		/**
		 * 最高薪水，单位分
		 */
		@ApiField("max_salary")
		private Long maxSalary;
		/**
		 * 最低薪水，单位分
		 */
		@ApiField("min_salary")
		private Long minSalary;
		/**
		 * 职位名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 职位地址 升
		 */
		@ApiField("province")
		private String province;
		/**
		 * 1小学 2初中 3高中 4中专 5大专 6本科 7硕士 8 博士 9其他
		 */
		@ApiField("required_edu")
		private Long requiredEdu;
		/**
		 * 是否薪资面议
		 */
		@ApiField("salary_negotiable")
		private Boolean salaryNegotiable;
	
		public JobAddressVO getAddress() {
			return this.address;
		}
		public void setAddress(JobAddressVO address) {
			this.address = address;
		}
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
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
		public Long getHeadCount() {
			return this.headCount;
		}
		public void setHeadCount(Long headCount) {
			this.headCount = headCount;
		}
		public String getJobCode() {
			return this.jobCode;
		}
		public void setJobCode(String jobCode) {
			this.jobCode = jobCode;
		}
		public String getJobId() {
			return this.jobId;
		}
		public void setJobId(String jobId) {
			this.jobId = jobId;
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
		public Boolean getSalaryNegotiable() {
			return this.salaryNegotiable;
		}
		public void setSalaryNegotiable(Boolean salaryNegotiable) {
			this.salaryNegotiable = salaryNegotiable;
		}
	}
	


}
