package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.user.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiV2UserCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6482715386133689275L;

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
	private UserCreateResponse result;


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

	public void setResult(UserCreateResponse result) {
		this.result = result;
	}
	public UserCreateResponse getResult( ) {
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
	public static class UserCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 8842369756221697324L;
		/**
		 * 员工唯一id
		 */
		@ApiField("unionId")
		private String unionId;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUnionId() {
			return this.unionId;
		}
		public void setUnionId(String unionId) {
			this.unionId = unionId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
