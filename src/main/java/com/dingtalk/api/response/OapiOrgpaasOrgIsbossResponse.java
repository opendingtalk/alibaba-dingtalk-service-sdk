package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.orgpaas.org.isboss response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiOrgpaasOrgIsbossResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4566282262832191248L;

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
	 * 结果
	 */
	@ApiField("result")
	private IsOrgBossResp result;

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

	public void setResult(IsOrgBossResp result) {
		this.result = result;
	}
	public IsOrgBossResp getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsOrgBossResp extends TaobaoObject {
		private static final long serialVersionUID = 5547965757216289247L;
		/**
		 * 是否boss
		 */
		@ApiField("is_boss")
		private Boolean isBoss;
	
		public Boolean getIsBoss() {
			return this.isBoss;
		}
		public void setIsBoss(Boolean isBoss) {
			this.isBoss = isBoss;
		}
	}
	


}
