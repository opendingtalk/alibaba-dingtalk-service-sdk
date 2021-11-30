package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5521787129356521946L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private CountUserResponse result;


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

	public void setResult(CountUserResponse result) {
		this.result = result;
	}
	public CountUserResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CountUserResponse extends TaobaoObject {
		private static final long serialVersionUID = 7751323522924212243L;
		/**
		 * 员工数量
		 */
		@ApiField("count")
		private Long count;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
	}
	


}
