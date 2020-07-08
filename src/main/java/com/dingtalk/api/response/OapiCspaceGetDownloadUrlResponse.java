package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.get_download_url response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCspaceGetDownloadUrlResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5834418842224167463L;

	/** 
	 * 0
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * success
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private CreateApprovalShareResult result;


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

	public void setResult(CreateApprovalShareResult result) {
		this.result = result;
	}
	public CreateApprovalShareResult getResult( ) {
		return this.result;
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
	public static class CreateApprovalShareResult extends TaobaoObject {
		private static final long serialVersionUID = 4231296118366996659L;
		/**
		 * 过期时间
		 */
		@ApiField("expire")
		private Date expire;
		/**
		 * 下载链接
		 */
		@ApiField("url")
		private String url;
	
		public Date getExpire() {
			return this.expire;
		}
		public void setExpire(Date expire) {
			this.expire = expire;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	


}
