package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.idcard.identify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpIdcardIdentifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2262378555246145714L;

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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IdCardResultVo extends TaobaoObject {
		private static final long serialVersionUID = 6658727746575559322L;
		/**
		 * 身份证有效期开始日期，格式 YYYYMMDD，如19870825
		 */
		@ApiField("begin_date")
		private String beginDate;
		/**
		 * 出生日期
		 */
		@ApiField("birth_date")
		private String birthDate;
		/**
		 * 身份证有效期截止日期
		 */
		@ApiField("expiry")
		private String expiry;
		/**
		 * 性别
		 */
		@ApiField("gender")
		private String gender;
		/**
		 * 身份证号
		 */
		@ApiField("id")
		private String id;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 住址
		 */
		@ApiField("original_address")
		private String originalAddress;
	
		public String getBeginDate() {
			return this.beginDate;
		}
		public void setBeginDate(String beginDate) {
			this.beginDate = beginDate;
		}
		public String getBirthDate() {
			return this.birthDate;
		}
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		public String getExpiry() {
			return this.expiry;
		}
		public void setExpiry(String expiry) {
			this.expiry = expiry;
		}
		public String getGender() {
			return this.gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOriginalAddress() {
			return this.originalAddress;
		}
		public void setOriginalAddress(String originalAddress) {
			this.originalAddress = originalAddress;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 2386512963648683238L;
		/**
		 * 错误码
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * 错误描述
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("result")
		private IdCardResultVo result;
		/**
		 * 是否成功
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
		public IdCardResultVo getResult() {
			return this.result;
		}
		public void setResult(IdCardResultVo result) {
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
