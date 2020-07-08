package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.file.upload.transaction response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFileUploadTransactionResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3631394454789922882L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 文件存储id
	 */
	@ApiField("media_id")
	private String mediaId;

	/** 
	 * upload_id
	 */
	@ApiField("upload_id")
	private String uploadId;


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

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getMediaId( ) {
		return this.mediaId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}
	public String getUploadId( ) {
		return this.uploadId;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
