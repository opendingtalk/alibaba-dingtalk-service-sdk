package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.ototask.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRobotMessageOtotaskQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7236518224475911557L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private OtoMessageSendTopResponse result;

	/** 
	 * 是否受理成功
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

	public void setResult(OtoMessageSendTopResponse result) {
		this.result = result;
	}
	public OtoMessageSendTopResponse getResult( ) {
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
	public static class OtoMessageSendTopResponse extends TaobaoObject {
		private static final long serialVersionUID = 1257392313728913464L;
		/**
		 * READ 已读，UNREAD 未读
		 */
		@ApiField("read_status")
		private String readStatus;
		/**
		 * 消息已读时间戳，单位：秒
		 */
		@ApiField("read_timestamp")
		private Long readTimestamp;
		/**
		 * 发送结果码，只有SUCCESS为成功
		 */
		@ApiField("send_status")
		private String sendStatus;
	
		public String getReadStatus() {
			return this.readStatus;
		}
		public void setReadStatus(String readStatus) {
			this.readStatus = readStatus;
		}
		public Long getReadTimestamp() {
			return this.readTimestamp;
		}
		public void setReadTimestamp(Long readTimestamp) {
			this.readTimestamp = readTimestamp;
		}
		public String getSendStatus() {
			return this.sendStatus;
		}
		public void setSendStatus(String sendStatus) {
			this.sendStatus = sendStatus;
		}
	}
	


}
