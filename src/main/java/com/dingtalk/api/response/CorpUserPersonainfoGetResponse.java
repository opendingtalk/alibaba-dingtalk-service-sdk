package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.user.personainfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpUserPersonainfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1244873186697774825L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPersonaInfo extends TaobaoObject {
		private static final long serialVersionUID = 2648687472967332681L;
		/**
		 * 生日
		 */
		@ApiField("dob")
		private Date dob;
		/**
		 * 性别
		 */
		@ApiField("gender")
		private String gender;
		/**
		 * 行业
		 */
		@ApiField("industry")
		private String industry;
		/**
		 * 头衔
		 */
		@ApiField("title")
		private String title;
		/**
		 * umids
		 */
		@ApiListField("umids")
		@ApiField("string")
		private List<String> umids;
		/**
		 * 工作区域
		 */
		@ApiField("work_station")
		private String workStation;
	
		public Date getDob() {
			return this.dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getGender() {
			return this.gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getIndustry() {
			return this.industry;
		}
		public void setIndustry(String industry) {
			this.industry = industry;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<String> getUmids() {
			return this.umids;
		}
		public void setUmids(List<String> umids) {
			this.umids = umids;
		}
		public String getWorkStation() {
			return this.workStation;
		}
		public void setWorkStation(String workStation) {
			this.workStation = workStation;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7726157135591271964L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 返回结果
		 */
		@ApiField("result")
		private OpenPersonaInfo result;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public OpenPersonaInfo getResult() {
			return this.result;
		}
		public void setResult(OpenPersonaInfo result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
