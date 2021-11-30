package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.contact.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCrmContactCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7662646557493638939L;

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
	 * 联系人信息
	 */
	@ApiField("result")
	private CreateContactResponse result;


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

	public void setResult(CreateContactResponse result) {
		this.result = result;
	}
	public CreateContactResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 联系人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateContactResponse extends TaobaoObject {
		private static final long serialVersionUID = 3381779416921839833L;
		/**
		 * 联系人实例ID
		 */
		@ApiField("contact_instance_id")
		private String contactInstanceId;
		/**
		 * 联系人unionId，自建应用视情况返回
		 */
		@ApiField("contact_unionid")
		private String contactUnionid;
		/**
		 * 联系人在客户通讯录的ID
		 */
		@ApiField("contact_userid")
		private String contactUserid;
	
		public String getContactInstanceId() {
			return this.contactInstanceId;
		}
		public void setContactInstanceId(String contactInstanceId) {
			this.contactInstanceId = contactInstanceId;
		}
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
	}
	


}
