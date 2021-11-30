package com.qimencloud.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API(QimenCloud): a80z6n2lov. response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class MyXiaoxuanttTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1459747455162696214L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ResultDO result;


	public void setResult(ResultDO result) {
		this.result = result;
	}
	public ResultDO getResult( ) {
		return this.result;
	}
	
	/**
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultDO {

	/**
		 * 数据
		 */
		@ApiField("data")
		private String data;
		/**
		 * 错误码
		 */
		@ApiField("errorCode")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("errorMessage")
		private String errorMessage;
	

	public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMessage() {
			return this.errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

}



}
