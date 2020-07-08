package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.userid.getbyunionid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserUseridGetbyunionidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5755529647226319293L;

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
	private UserIdResponse result;


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

	public void setResult(UserIdResponse result) {
		this.result = result;
	}
	public UserIdResponse getResult( ) {
		return this.result;
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
	public static class UserIdResponse extends TaobaoObject {
		private static final long serialVersionUID = 3444254541829526789L;
		/**
		 * 联系类型，0表示企业内部员工，1表示企业外部联系人
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
