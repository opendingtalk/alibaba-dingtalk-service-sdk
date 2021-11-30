package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.IdCard.ocr response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceIdCardOcrResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2595245756251385876L;

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
	 * 身份证信息
	 */
	@ApiField("result")
	private OpenIdCardInfo result;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(OpenIdCardInfo result) {
		this.result = result;
	}
	public OpenIdCardInfo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 身份证信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenIdCardInfo extends TaobaoObject {
		private static final long serialVersionUID = 8484867585643522852L;
		/**
		 * 地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 签发机构名称
		 */
		@ApiField("auth_inst_name")
		private String authInstName;
		/**
		 * 生日
		 */
		@ApiField("birthday")
		private String birthday;
		/**
		 * 有效期间
		 */
		@ApiField("effect_period")
		private String effectPeriod;
		/**
		 * 性别
		 */
		@ApiField("gender")
		private String gender;
		/**
		 * 身份证号
		 */
		@ApiField("id_card_no")
		private String idCardNo;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 国家
		 */
		@ApiField("nation")
		private String nation;
		/**
		 * 是否有效
		 */
		@ApiField("valid")
		private Boolean valid;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAuthInstName() {
			return this.authInstName;
		}
		public void setAuthInstName(String authInstName) {
			this.authInstName = authInstName;
		}
		public String getBirthday() {
			return this.birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getEffectPeriod() {
			return this.effectPeriod;
		}
		public void setEffectPeriod(String effectPeriod) {
			this.effectPeriod = effectPeriod;
		}
		public String getGender() {
			return this.gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getIdCardNo() {
			return this.idCardNo;
		}
		public void setIdCardNo(String idCardNo) {
			this.idCardNo = idCardNo;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNation() {
			return this.nation;
		}
		public void setNation(String nation) {
			this.nation = nation;
		}
		public Boolean getValid() {
			return this.valid;
		}
		public void setValid(Boolean valid) {
			this.valid = valid;
		}
	}
	


}
