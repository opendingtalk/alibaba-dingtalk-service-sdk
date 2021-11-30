package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.safe.querystatus response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2SafeQuerystatusResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4272169333329466853L;

	/** 
	 * 错误码。0代表成功。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * -
	 */
	@ApiField("result")
	private SafeQueryStatusResponse result;


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

	public void setResult(SafeQueryStatusResponse result) {
		this.result = result;
	}
	public SafeQueryStatusResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * -
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SafeQueryStatusResponse extends TaobaoObject {
		private static final long serialVersionUID = 4645429173451515328L;
		/**
		 * 是否已冻结
		 */
		@ApiField("disable")
		private Boolean disable;
	
		public Boolean getDisable() {
			return this.disable;
		}
		public void setDisable(Boolean disable) {
			this.disable = disable;
		}
	}
	


}
