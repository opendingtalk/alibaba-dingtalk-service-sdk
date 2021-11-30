package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.microapp.query.bill.download.url response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class MicroappQueryBillDownloadUrlResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1115271933837118886L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private QueryBillDownloadUrlOpenResponse result;


	public void setResult(QueryBillDownloadUrlOpenResponse result) {
		this.result = result;
	}
	public QueryBillDownloadUrlOpenResponse getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryBillDownloadUrlOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 8735174681211466796L;
		/**
		 * 业务错误码
		 */
		@ApiField("biz_error_code")
		private String bizErrorCode;
		/**
		 * 业务错误码描述
		 */
		@ApiField("biz_error_msg")
		private String bizErrorMsg;
		/**
		 * 对党文件下载地址(有效期30s)
		 */
		@ApiField("download_url")
		private String downloadUrl;
		/**
		 * 业务操作是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public String getBizErrorCode() {
			return this.bizErrorCode;
		}
		public void setBizErrorCode(String bizErrorCode) {
			this.bizErrorCode = bizErrorCode;
		}
		public String getBizErrorMsg() {
			return this.bizErrorMsg;
		}
		public void setBizErrorMsg(String bizErrorMsg) {
			this.bizErrorMsg = bizErrorMsg;
		}
		public String getDownloadUrl() {
			return this.downloadUrl;
		}
		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
