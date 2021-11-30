package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.tinyapp.query.bill.download.url response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TinyappQueryBillDownloadUrlResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5251985577853238924L;

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
		private static final long serialVersionUID = 2162941239191215111L;
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
		 * 对账文件下载地址(有效期30s)
		 */
		@ApiField("download_url")
		private String downloadUrl;
		/**
		 * 业务操作是否成功
		 */
		@ApiField("success")
		private String success;
	
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
		public String getSuccess() {
			return this.success;
		}
		public void setSuccess(String success) {
			this.success = success;
		}
	}
	


}
