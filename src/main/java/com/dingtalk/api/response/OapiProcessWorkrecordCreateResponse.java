package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.workrecord.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessWorkrecordCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4233822174721242327L;

	/** 
	 * 0
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 成功
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 实例信息
	 */
	@ApiField("result")
	private SaveFaceProcessInstanceResponse result;

	/** 
	 * true
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

	public void setResult(SaveFaceProcessInstanceResponse result) {
		this.result = result;
	}
	public SaveFaceProcessInstanceResponse getResult( ) {
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
	 * 实例信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SaveFaceProcessInstanceResponse extends TaobaoObject {
		private static final long serialVersionUID = 8115843316316278893L;
		/**
		 * 审批实例id
		 */
		@ApiField("process_instance_id")
		private String processInstanceId;
	
		public String getProcessInstanceId() {
			return this.processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
	}
	


}
