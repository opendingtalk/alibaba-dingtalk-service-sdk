package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.call.record.queryauth response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpCallRecordQueryauthResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8573442498646592384L;

	/** 
	 * 授权json表示
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 授权json表示
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 1219381948885187122L;
		/**
		 * false 表示没有授权 true表示已授权
		 */
		@ApiField("is_auth")
		private Boolean isAuth;
	
		public Boolean getIsAuth() {
			return this.isAuth;
		}
		public void setIsAuth(Boolean isAuth) {
			this.isAuth = isAuth;
		}
	}
	


}
