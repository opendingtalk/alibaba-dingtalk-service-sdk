package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.material.news.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMaterialNewsAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3762181864567254993L;

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
	 * 消息卡片id
	 */
	@ApiField("media_id")
	private String mediaId;


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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
