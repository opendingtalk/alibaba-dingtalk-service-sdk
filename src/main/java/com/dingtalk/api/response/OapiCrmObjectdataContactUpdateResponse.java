package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.contact.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmObjectdataContactUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7425466949199289287L;

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
	 * 结果
	 */
	@ApiField("result")
	private ObjectDataCreateDto result;

	/** 
	 * 执行结果
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

	public void setResult(ObjectDataCreateDto result) {
		this.result = result;
	}
	public ObjectDataCreateDto getResult( ) {
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
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ObjectDataCreateDto extends TaobaoObject {
		private static final long serialVersionUID = 8324755257548379365L;
		/**
		 * 联系人数据id
		 */
		@ApiField("instance_id")
		private String instanceId;
	
		public String getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}
	


}
