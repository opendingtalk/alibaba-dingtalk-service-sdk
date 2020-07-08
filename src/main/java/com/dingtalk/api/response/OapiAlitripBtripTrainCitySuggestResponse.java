package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.train.city.suggest response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripTrainCitySuggestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4889143589494738525L;

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
		private static final long serialVersionUID = 5234669167142123932L;
		/**
		 * 城市码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 城市名称
		 */
		@ApiField("name")
		private String name;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SuggestRs extends TaobaoObject {
		private static final long serialVersionUID = 4495252657754669638L;
		/**
		 * 城市列表
		 */
		@ApiListField("cities")
		@ApiField("city_vo")
		private List<CityVo> cities;
	
		public List<CityVo> getCities() {
			return this.cities;
		}
		public void setCities(List<CityVo> cities) {
			this.cities = cities;
		}
	}
	


}
