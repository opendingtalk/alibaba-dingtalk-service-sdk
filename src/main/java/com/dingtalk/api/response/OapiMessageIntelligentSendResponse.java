package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.intelligent.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMessageIntelligentSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8637525673615391487L;

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
	private SendMsgCardResultVo result;

	/** 
	 * 请求是否成功
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

	public void setResult(SendMsgCardResultVo result) {
		this.result = result;
	}
	public SendMsgCardResultVo getResult( ) {
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
	public static class SendMsgCardResultVo extends TaobaoObject {
		private static final long serialVersionUID = 4381295959378833993L;
		/**
		 * 群内没有小钉
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 发送消息是否成功发送消息失败，看errorMsg信息
		 */
		@ApiField("result")
		private Boolean result;
	
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public Boolean getResult() {
			return this.result;
		}
		public void setResult(Boolean result) {
			this.result = result;
		}
	}
	


}
