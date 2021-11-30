package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.industry.organization.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIndustryOrganizationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3738984459156988438L;

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
	private OpenIndustryOrgInfo result;

	/** 
	 * 成功
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

	public void setResult(OpenIndustryOrgInfo result) {
		this.result = result;
	}
	public OpenIndustryOrgInfo getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenIndustryOrgInfo extends TaobaoObject {
		private static final long serialVersionUID = 1215819747385331472L;
		/**
		 * 区域id信息
		 */
		@ApiField("region_id")
		private String regionId;
		/**
		 * 区域信息
		 */
		@ApiField("region_location")
		private String regionLocation;
		/**
		 * 区域类型，区镇村
		 */
		@ApiField("region_type")
		private String regionType;
	
		public String getRegionId() {
			return this.regionId;
		}
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
		public String getRegionLocation() {
			return this.regionLocation;
		}
		public void setRegionLocation(String regionLocation) {
			this.regionLocation = regionLocation;
		}
		public String getRegionType() {
			return this.regionType;
		}
		public void setRegionType(String regionType) {
			this.regionType = regionType;
		}
	}
	


}
