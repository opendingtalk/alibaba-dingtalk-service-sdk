package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.sendorggroup response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRobotMessageSendorggroupResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1139481423494941552L;

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
		private static final long serialVersionUID = 2311877215777561748L;
		/**
		 * 用于查询发送进度的唯一标识
		 */
		@ApiField("process_query_key")
		private String processQueryKey;
	
		public String getProcessQueryKey() {
			return this.processQueryKey;
		}
		public void setProcessQueryKey(String processQueryKey) {
			this.processQueryKey = processQueryKey;
		}
	}
	


}
