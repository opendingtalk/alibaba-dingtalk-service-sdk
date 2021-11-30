package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.file.url.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessinstanceFileUrlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1229234771322787367L;

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
	 * 返回结果
	 */
	@ApiField("result")
	private AppSpaceResponse result;

	/** 
	 * 成功失败
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

	public void setResult(AppSpaceResponse result) {
		this.result = result;
	}
	public AppSpaceResponse getResult( ) {
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
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AppSpaceResponse extends TaobaoObject {
		private static final long serialVersionUID = 8725248775575728777L;
		/**
		 * 文件下载地址
		 */
		@ApiField("download_uri")
		private String downloadUri;
		/**
		 * 文件id
		 */
		@ApiField("file_id")
		private String fileId;
		/**
		 * 文件spaceId
		 */
		@ApiField("space_id")
		private Long spaceId;
	
		public String getDownloadUri() {
			return this.downloadUri;
		}
		public void setDownloadUri(String downloadUri) {
			this.downloadUri = downloadUri;
		}
		public String getFileId() {
			return this.fileId;
		}
		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
		public Long getSpaceId() {
			return this.spaceId;
		}
		public void setSpaceId(Long spaceId) {
			this.spaceId = spaceId;
		}
	}
	


}
