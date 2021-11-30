package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.flight.city.suggest response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripFlightCitySuggestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8365682981892382677L;

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
	 * 结果对象
	 */
	@ApiField("result")
	private SuggestRs result;

	/** 
	 * 成功标识
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

	public void setResult(SuggestRs result) {
		this.result = result;
	}
	public SuggestRs getResult( ) {
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
	 * 城市列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CityVo extends TaobaoObject {
		private static final long serialVersionUID = 7537939583665336459L;
		/**
		 * 三字码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 与搜索城市距离，单位千米，只在邻近机场推荐有值
		 */
		@ApiField("distance")
		private Long distance;
		/**
		 * 城市名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 邻近机场城市，只在邻近机场推荐有值
		 */
		@ApiField("travel_name")
		private String travelName;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public Long getDistance() {
			return this.distance;
		}
		public void setDistance(Long distance) {
			this.distance = distance;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTravelName() {
			return this.travelName;
		}
		public void setTravelName(String travelName) {
			this.travelName = travelName;
		}
	}
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SuggestRs extends TaobaoObject {
		private static final long serialVersionUID = 5298228827321874715L;
		/**
		 * 城市列表
		 */
		@ApiListField("cities")
		@ApiField("city_vo")
		private List<CityVo> cities;
		/**
		 * 是否为邻近城市
		 */
		@ApiField("nearby")
		private Boolean nearby;
	
		public List<CityVo> getCities() {
			return this.cities;
		}
		public void setCities(List<CityVo> cities) {
			this.cities = cities;
		}
		public Boolean getNearby() {
			return this.nearby;
		}
		public void setNearby(Boolean nearby) {
			this.nearby = nearby;
		}
	}
	


}
