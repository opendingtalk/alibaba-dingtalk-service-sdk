package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_permanent_code response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServiceGetPermanentCodeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8836782688377697435L;

	/** 
	 * 授权方企业信息
	 */
	@ApiField("auth_corp_info")
	private AuthCorpInfo authCorpInfo;

	/** 
	 * 企业服务窗永久授权码，如果该套件下存在服务窗应用，会返回
	 */
	@ApiField("ch_permanent_code")
	private String chPermanentCode;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 永久授权码
	 */
	@ApiField("permanent_code")
	private String permanentCode;


	public void setAuthCorpInfo(AuthCorpInfo authCorpInfo) {
		this.authCorpInfo = authCorpInfo;
	}
	public AuthCorpInfo getAuthCorpInfo( ) {
		return this.authCorpInfo;
	}

	public void setChPermanentCode(String chPermanentCode) {
		this.chPermanentCode = chPermanentCode;
	}
	public String getChPermanentCode( ) {
		return this.chPermanentCode;
	}

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

	public void setPermanentCode(String permanentCode) {
		this.permanentCode = permanentCode;
	}
	public String getPermanentCode( ) {
		return this.permanentCode;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 授权方企业信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AuthCorpInfo extends TaobaoObject {
		private static final long serialVersionUID = 3145132847922425666L;
		/**
		 * corp_name
		 */
		@ApiField("corp_name")
		private String corpName;
		/**
		 * 授权方企业id
		 */
		@ApiField("corpid")
		private String corpid;
	
		public String getCorpName() {
			return this.corpName;
		}
		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
	}
	


}
