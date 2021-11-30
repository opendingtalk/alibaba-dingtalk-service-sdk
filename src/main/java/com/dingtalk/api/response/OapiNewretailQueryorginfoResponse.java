package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.newretail.queryorginfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiNewretailQueryorginfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8413577714436812561L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private Org result;


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

	public void setResult(Org result) {
		this.result = result;
	}
	public Org getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Org extends TaobaoObject {
		private static final long serialVersionUID = 6152658494498944116L;
		/**
		 * licenseMediaId
		 */
		@ApiField("licensemediaid")
		private String licensemediaid;
		/**
		 * orgName
		 */
		@ApiField("orgname")
		private String orgname;
		/**
		 * registNum
		 */
		@ApiField("registnum")
		private String registnum;
		/**
		 * unifiedSocialCredit
		 */
		@ApiField("unifiedsocialcredit")
		private String unifiedsocialcredit;
		/**
		 * unnameorganizationCoded
		 */
		@ApiField("unnameorganizationcoded")
		private String unnameorganizationcoded;
	
		public String getLicensemediaid() {
			return this.licensemediaid;
		}
		public void setLicensemediaid(String licensemediaid) {
			this.licensemediaid = licensemediaid;
		}
		public String getOrgname() {
			return this.orgname;
		}
		public void setOrgname(String orgname) {
			this.orgname = orgname;
		}
		public String getRegistnum() {
			return this.registnum;
		}
		public void setRegistnum(String registnum) {
			this.registnum = registnum;
		}
		public String getUnifiedsocialcredit() {
			return this.unifiedsocialcredit;
		}
		public void setUnifiedsocialcredit(String unifiedsocialcredit) {
			this.unifiedsocialcredit = unifiedsocialcredit;
		}
		public String getUnnameorganizationcoded() {
			return this.unnameorganizationcoded;
		}
		public void setUnnameorganizationcoded(String unnameorganizationcoded) {
			this.unnameorganizationcoded = unnameorganizationcoded;
		}
	}
	


}
