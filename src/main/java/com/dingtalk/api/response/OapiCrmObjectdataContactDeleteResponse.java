package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.contact.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmObjectdataContactDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4162236895167392872L;

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
	 * 删除结果
	 */
	@ApiField("result")
	private ObjectDataDeleteDto result;


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

	public void setResult(ObjectDataDeleteDto result) {
		this.result = result;
	}
	public ObjectDataDeleteDto getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 删除结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ObjectDataDeleteDto extends TaobaoObject {
		private static final long serialVersionUID = 8717916948165134183L;
		/**
		 * 删除的联系人实例ID
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
