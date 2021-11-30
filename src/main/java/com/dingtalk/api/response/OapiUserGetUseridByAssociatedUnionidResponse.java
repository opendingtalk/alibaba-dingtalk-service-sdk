package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getUseridByAssociatedUnionid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetUseridByAssociatedUnionidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2486816481449126121L;

	/** 
	 * 错误码，0为成功
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 用户userid结果
	 */
	@ApiField("result")
	private UseridVo result;


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

	public void setResult(UseridVo result) {
		this.result = result;
	}
	public UseridVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 用户userid结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UseridVo extends TaobaoObject {
		private static final long serialVersionUID = 7275838638225691714L;
		/**
		 * 用户通讯录类型，0为内部，1为外部
		 */
		@ApiField("contactType")
		private Long contactType;
		/**
		 * 用户在企业中userid
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
