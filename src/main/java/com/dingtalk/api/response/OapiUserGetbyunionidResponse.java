package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getbyunionid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetbyunionidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3765787953179199144L;

	/** 
	 * 错误码。0代表成功。
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息。
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private UserGetByUnionIdResponse result;


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

	public void setResult(UserGetByUnionIdResponse result) {
		this.result = result;
	}
	public UserGetByUnionIdResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserGetByUnionIdResponse extends TaobaoObject {
		private static final long serialVersionUID = 4359736436926748784L;
		/**
		 * 联系类型，0 企业内部员工 1 企业外部联系人
		 */
		@ApiField("contact_type")
		private Long contactType;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getContactType() {
			return this.contactType;
		}
		public void setContactType(Long contactType) {
			this.contactType = contactType;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
