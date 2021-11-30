package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.user.task.submit response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCardUserTaskSubmitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2689416456488126879L;

	/** 
	 * errorcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errormsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 成功时 返回
	 */
	@ApiField("result")
	private CardTaskSubmitResponse result;

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

	public void setResult(CardTaskSubmitResponse result) {
		this.result = result;
	}
	public CardTaskSubmitResponse getResult( ) {
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
	 * 成功时 返回
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CardTaskSubmitResponse extends TaobaoObject {
		private static final long serialVersionUID = 8582351992497751234L;
		/**
		 * 记录ID
		 */
		@ApiField("id")
		private Long id;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	


}
