package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.push.device.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoPushDeviceSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2874256365827388297L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 响应内容
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 额外信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 调用结果
	 */
	@ApiField("model")
	private SendMsgResponse model;

	/** 
	 * 是否调用成功
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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(SendMsgResponse model) {
		this.model = model;
	}
	public SendMsgResponse getModel( ) {
		return this.model;
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
	 * 调用结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SendMsgResponse extends TaobaoObject {
		private static final long serialVersionUID = 8573979233845421168L;
		/**
		 * 推送消息id
		 */
		@ApiField("bizId_push")
		private String bizIdPush;
	
		public String getBizIdPush() {
			return this.bizIdPush;
		}
		public void setBizIdPush(String bizIdPush) {
			this.bizIdPush = bizIdPush;
		}
	}
	


}
