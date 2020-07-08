package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.push.send.uid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoPushSendUidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7861918376921181888L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 返回信息
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
	 * 是否成功
	 */
	@ApiField("success")
	private String success;


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

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
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
		private static final long serialVersionUID = 6362623745478734147L;
		/**
		 * 消息的id
		 */
		@ApiField("biz_id_push")
		private String bizIdPush;
	
		public String getBizIdPush() {
			return this.bizIdPush;
		}
		public void setBizIdPush(String bizIdPush) {
			this.bizIdPush = bizIdPush;
		}
	}
	


}
