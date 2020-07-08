package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.authinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiOrgAuthinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6761621817634359143L;

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
	 * 结果封装
	 */
	@ApiField("result")
	private AntOrgAuthInfoVo result;

	/** 
	 * true表示查询成功，false表示失败
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

	public void setResult(AntOrgAuthInfoVo result) {
		this.result = result;
	}
	public AntOrgAuthInfoVo getResult( ) {
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
	 * 结果封装
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AntOrgAuthInfoVo extends TaobaoObject {
		private static final long serialVersionUID = 3251979824233832211L;
		/**
		 * 企业注册地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 认证等级：0=未认证  1=高级认证 2=中级认证 3=初级认证
		 */
		@ApiField("auth_level")
		private Long authLevel;
		/**
		 * 营业执照有时效的url
		 */
		@ApiField("cert_pic_url")
		private String certPicUrl;
		/**
		 * 企业corpId
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 企业名称
		 */
		@ApiField("corp_name")
		private String corpName;
		/**
		 * 企业类型：企业、政府事业单位、其他组织、个体工商户
		 */
		@ApiField("corp_type")
		private String corpType;
		/**
		 * 组织机构码
		 */
		@ApiField("org_code")
		private String orgCode;
		/**
		 * 注册地所在市
		 */
		@ApiField("reg_city")
		private String regCity;
		/**
		 * 注册地所在省
		 */
		@ApiField("reg_province")
		private String regProvince;
		/**
		 * 企业注册号
		 */
		@ApiField("regist_no")
		private String registNo;
		/**
		 * 统一信用代码
		 */
		@ApiField("uniform_social_credit_code")
		private String uniformSocialCreditCode;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Long getAuthLevel() {
			return this.authLevel;
		}
		public void setAuthLevel(Long authLevel) {
			this.authLevel = authLevel;
		}
		public String getCertPicUrl() {
			return this.certPicUrl;
		}
		public void setCertPicUrl(String certPicUrl) {
			this.certPicUrl = certPicUrl;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getCorpName() {
			return this.corpName;
		}
		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}
		public String getCorpType() {
			return this.corpType;
		}
		public void setCorpType(String corpType) {
			this.corpType = corpType;
		}
		public String getOrgCode() {
			return this.orgCode;
		}
		public void setOrgCode(String orgCode) {
			this.orgCode = orgCode;
		}
		public String getRegCity() {
			return this.regCity;
		}
		public void setRegCity(String regCity) {
			this.regCity = regCity;
		}
		public String getRegProvince() {
			return this.regProvince;
		}
		public void setRegProvince(String regProvince) {
			this.regProvince = regProvince;
		}
		public String getRegistNo() {
			return this.registNo;
		}
		public void setRegistNo(String registNo) {
			this.registNo = registNo;
		}
		public String getUniformSocialCreditCode() {
			return this.uniformSocialCreditCode;
		}
		public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
			this.uniformSocialCreditCode = uniformSocialCreditCode;
		}
	}
	


}
