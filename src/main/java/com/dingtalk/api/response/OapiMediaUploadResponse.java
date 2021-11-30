package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.media.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMediaUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4357566323888495563L;

	/** 
	 * 媒体文件上传时间戳
	 */
	@ApiField("created_at")
	private Long createdAt;

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
	 * 媒体文件上传后获取的唯一标识
	 */
	@ApiField("media_id")
	private String mediaId;

	/** 
	 * 媒体文件类型，分别有图片（image）、语音（voice）、普通文件(file)
	 */
	@ApiField("type")
	private String type;


	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	public Long getCreatedAt( ) {
		return this.createdAt;
	}

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

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
