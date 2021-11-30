package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.file.presignedurl.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCspaceFilePresignedurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7153186779649353641L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("presigned_url_result")
	private GenerateUrlResult presignedUrlResult;

	/** 
	 * 请求是否成功
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

	public void setPresignedUrlResult(GenerateUrlResult presignedUrlResult) {
		this.presignedUrlResult = presignedUrlResult;
	}
	public GenerateUrlResult getPresignedUrlResult( ) {
		return this.presignedUrlResult;
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GenerateUrlResult extends TaobaoObject {
		private static final long serialVersionUID = 1276911398123632324L;
		/**
		 * 验证码，此属性无需关注
		 */
		@ApiField("code")
		private String code;
		/**
		 * 文件唯一标识，此属性无需关注
		 */
		@ApiField("mediaid")
		private String mediaid;
		/**
		 * 文件下载Url
		 */
		@ApiField("url")
		private String url;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMediaid() {
			return this.mediaid;
		}
		public void setMediaid(String mediaid) {
			this.mediaid = mediaid;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
