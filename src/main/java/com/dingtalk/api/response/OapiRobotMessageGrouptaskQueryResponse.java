package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.grouptask.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRobotMessageGrouptaskQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6668917323165232274L;

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
	private GroupMessageSendTopResponse result;

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

	public void setResult(GroupMessageSendTopResponse result) {
		this.result = result;
	}
	public GroupMessageSendTopResponse getResult( ) {
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
	public static class GroupMessageSendTopResponse extends TaobaoObject {
		private static final long serialVersionUID = 6187513997988183115L;
		/**
		 * 发送结果码，只有SUCCESS为成功
		 */
		@ApiField("send_status")
		private String sendStatus;
	
		public String getSendStatus() {
			return this.sendStatus;
		}
		public void setSendStatus(String sendStatus) {
			this.sendStatus = sendStatus;
		}
	}
	


}
