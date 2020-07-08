package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.intelligent.interactiveCard.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiIntelligentInteractiveCardSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3475188233237821841L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private SendInteractiveCardResultVo result;

	/** 
	 * 调用结果
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

	public void setResult(SendInteractiveCardResultVo result) {
		this.result = result;
	}
	public SendInteractiveCardResultVo getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SendInteractiveCardResultVo extends TaobaoObject {
		private static final long serialVersionUID = 7398649547456252426L;
		/**
		 * 卡片发送结果
		 */
		@ApiField("result")
		private Boolean result;
	
		public Boolean getResult() {
			return this.result;
		}
		public void setResult(Boolean result) {
			this.result = result;
		}
	}
	


}
