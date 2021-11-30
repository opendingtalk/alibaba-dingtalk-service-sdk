package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.subaccount.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasUserSubaccountAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6827498524848478651L;

	/** 
	 * 错误码  -1 系统异常 40035 参数错误
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 添加账号出参
	 */
	@ApiField("result")
	private AddSubAccountResp result;

	/** 
	 * 接口是否调用成功
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

	public void setResult(AddSubAccountResp result) {
		this.result = result;
	}
	public AddSubAccountResp getResult( ) {
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
	 * 添加账号出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddSubAccountResp extends TaobaoObject {
		private static final long serialVersionUID = 1518319137529436711L;
		/**
		 * im的唯一id
		 */
		@ApiField("im_openid")
		private String imOpenid;
	
		public String getImOpenid() {
			return this.imOpenid;
		}
		public void setImOpenid(String imOpenid) {
			this.imOpenid = imOpenid;
		}
	}
	


}
