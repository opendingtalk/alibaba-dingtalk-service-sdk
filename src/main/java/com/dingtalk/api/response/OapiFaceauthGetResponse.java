package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.faceauth.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFaceauthGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6594241288999329549L;

	/** 
	 * 错误码 0表示验证成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误码描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 实名认证的结果
	 */
	@ApiField("result")
	private Result result;


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

	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 实名认证的结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3135649218469314786L;
		/**
		 * 身份证号码,只有在用户输入的情况下才返回
		 */
		@ApiField("idcard_no")
		private String idcardNo;
		/**
		 * 用户输入的姓名
		 */
		@ApiField("name")
		private String name;
	
		public String getIdcardNo() {
			return this.idcardNo;
		}
		public void setIdcardNo(String idcardNo) {
			this.idcardNo = idcardNo;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	


}
