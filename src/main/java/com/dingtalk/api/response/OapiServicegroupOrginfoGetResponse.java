package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.servicegroup.orginfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiServicegroupOrginfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5857387562728573427L;

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
	 * result 数据
	 */
	@ApiField("result")
	private CustomerOrgVO result;


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

	public void setResult(CustomerOrgVO result) {
		this.result = result;
	}
	public CustomerOrgVO getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result 数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CustomerOrgVO extends TaobaoObject {
		private static final long serialVersionUID = 5227923411413499242L;
		/**
		 * 对外的企业ID
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 组织简介，可能为空
		 */
		@ApiField("org_brief")
		private String orgBrief;
		/**
		 * 组织行业
		 */
		@ApiField("org_industry")
		private String orgIndustry;
		/**
		 * 组织 logo 图，可能为空
		 */
		@ApiField("org_logo")
		private String orgLogo;
		/**
		 * 组织名称
		 */
		@ApiField("org_name")
		private String orgName;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getOrgBrief() {
			return this.orgBrief;
		}
		public void setOrgBrief(String orgBrief) {
			this.orgBrief = orgBrief;
		}
		public String getOrgIndustry() {
			return this.orgIndustry;
		}
		public void setOrgIndustry(String orgIndustry) {
			this.orgIndustry = orgIndustry;
		}
		public String getOrgLogo() {
			return this.orgLogo;
		}
		public void setOrgLogo(String orgLogo) {
			this.orgLogo = orgLogo;
		}
		public String getOrgName() {
			return this.orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
	}
	


}
