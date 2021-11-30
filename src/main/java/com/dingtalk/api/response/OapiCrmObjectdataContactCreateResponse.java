package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectdata.contact.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmObjectdataContactCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8517195156483738953L;

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
		private static final long serialVersionUID = 5875827842423918996L;
		/**
		 * 联系人用户ID
		 */
		@ApiField("contact_unionid")
		private String contactUnionid;
		/**
		 * 联系人通讯录员工ID
		 */
		@ApiField("contact_userid")
		private String contactUserid;
		/**
		 * 联系人数据id
		 */
		@ApiField("instance_id")
		private String instanceId;
	
		public String getContactUnionid() {
			return this.contactUnionid;
		}
		public void setContactUnionid(String contactUnionid) {
			this.contactUnionid = contactUnionid;
		}
		public String getContactUserid() {
			return this.contactUserid;
		}
		public void setContactUserid(String contactUserid) {
			this.contactUserid = contactUserid;
		}
		public String getInstanceId() {
			return this.instanceId;
		}
		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}
	


}
