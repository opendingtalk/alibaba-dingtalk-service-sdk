package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.category.address.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripCategoryAddressGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6736536721279649274L;

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
	 * module
	 */
	@ApiField("result")
	private OpenJumpInfoRs result;

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

	public void setResult(OpenJumpInfoRs result) {
		this.result = result;
	}
	public OpenJumpInfoRs getResult( ) {
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
	 * module
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenJumpInfoRs extends TaobaoObject {
		private static final long serialVersionUID = 1832675268957383766L;
		/**
		 * 跳转url
		 */
		@ApiField("url")
		private String url;
	
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
