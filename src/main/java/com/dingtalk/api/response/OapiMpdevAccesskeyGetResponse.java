package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mpdev.accesskey.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMpdevAccesskeyGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1124172254186863273L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回内容
	 */
	@ApiField("result")
	private OssTokenVo result;

	/** 
	 * 成功标记
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

	public void setResult(OssTokenVo result) {
		this.result = result;
	}
	public OssTokenVo getResult( ) {
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
	 * 返回内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OssTokenVo extends TaobaoObject {
		private static final long serialVersionUID = 5316177232876532976L;
		/**
		 * accessKeySecret
		 */
		@ApiField("access_key_secret")
		private String accessKeySecret;
		/**
		 * accessid
		 */
		@ApiField("accessid")
		private String accessid;
		/**
		 * 失效时间
		 */
		@ApiField("expiration")
		private String expiration;
		/**
		 * 上传文件名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * securityToken
		 */
		@ApiField("security_token")
		private String securityToken;
	
		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}
		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}
		public String getAccessid() {
			return this.accessid;
		}
		public void setAccessid(String accessid) {
			this.accessid = accessid;
		}
		public String getExpiration() {
			return this.expiration;
		}
		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSecurityToken() {
			return this.securityToken;
		}
		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}
	}
	


}
