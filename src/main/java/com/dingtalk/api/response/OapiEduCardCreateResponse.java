package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCardCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6151657355423231679L;

	/** 
	 * errorcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errormessage
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private CreateCardResponse result;

	/** 
	 * 是否成功
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

	public void setResult(CreateCardResponse result) {
		this.result = result;
	}
	public CreateCardResponse getResult( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateCardResponse extends TaobaoObject {
		private static final long serialVersionUID = 3667193524926718855L;
		/**
		 * 卡片ID
		 */
		@ApiField("cardid")
		private Long cardid;
	
		public Long getCardid() {
			return this.cardid;
		}
		public void setCardid(Long cardid) {
			this.cardid = cardid;
		}
	}
	


}
