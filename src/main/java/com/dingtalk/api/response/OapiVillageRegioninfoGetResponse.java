package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.village.regioninfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiVillageRegioninfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8589132438291784397L;

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
	 * 行政区域返回值
	 */
	@ApiField("result")
	private OrgRegionResponseVo result;

	/** 
	 * 访问是否成功
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

	public void setResult(OrgRegionResponseVo result) {
		this.result = result;
	}
	public OrgRegionResponseVo getResult( ) {
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
	 * 行政区域返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgRegionResponseVo extends TaobaoObject {
		private static final long serialVersionUID = 3527868283735836634L;
		/**
		 * 市行政区域码
		 */
		@ApiField("city_id")
		private String cityId;
		/**
		 * 城市名
		 */
		@ApiField("city_name")
		private String cityName;
		/**
		 * 县区行政区域码
		 */
		@ApiField("county_id")
		private String countyId;
		/**
		 * 县区名称
		 */
		@ApiField("county_name")
		private String countyName;
		/**
		 * 省的行政区域码
		 */
		@ApiField("province_id")
		private String provinceId;
		/**
		 * 省份名称
		 */
		@ApiField("province_name")
		private String provinceName;
		/**
		 * 行政区域级别
		 */
		@ApiField("region_level")
		private String regionLevel;
		/**
		 * 镇的行政区域码
		 */
		@ApiField("town_id")
		private String townId;
		/**
		 * 镇名
		 */
		@ApiField("town_name")
		private String townName;
		/**
		 * 村的行政区域码
		 */
		@ApiField("village_id")
		private String villageId;
		/**
		 * 村名
		 */
		@ApiField("village_name")
		private String villageName;
	
		public String getCityId() {
			return this.cityId;
		}
		public void setCityId(String cityId) {
			this.cityId = cityId;
		}
		public String getCityName() {
			return this.cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getCountyId() {
			return this.countyId;
		}
		public void setCountyId(String countyId) {
			this.countyId = countyId;
		}
		public String getCountyName() {
			return this.countyName;
		}
		public void setCountyName(String countyName) {
			this.countyName = countyName;
		}
		public String getProvinceId() {
			return this.provinceId;
		}
		public void setProvinceId(String provinceId) {
			this.provinceId = provinceId;
		}
		public String getProvinceName() {
			return this.provinceName;
		}
		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}
		public String getRegionLevel() {
			return this.regionLevel;
		}
		public void setRegionLevel(String regionLevel) {
			this.regionLevel = regionLevel;
		}
		public String getTownId() {
			return this.townId;
		}
		public void setTownId(String townId) {
			this.townId = townId;
		}
		public String getTownName() {
			return this.townName;
		}
		public void setTownName(String townName) {
			this.townName = townName;
		}
		public String getVillageId() {
			return this.villageId;
		}
		public void setVillageId(String villageId) {
			this.villageId = villageId;
		}
		public String getVillageName() {
			return this.villageName;
		}
		public void setVillageName(String villageName) {
			this.villageName = villageName;
		}
	}
	


}
