package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.group.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCustomerserviceGroupCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4625696417361693922L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 创建群结果
	 */
	@ApiField("result")
	private ServiceGroupCreateResponse result;

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

	public void setResult(ServiceGroupCreateResponse result) {
		this.result = result;
	}
	public ServiceGroupCreateResponse getResult( ) {
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
	 * 创建群结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceGroupCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 5853715669799577912L;
		/**
		 * 群ID
		 */
		@ApiField("group_id")
		private String groupId;
	
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
	}
	


}
