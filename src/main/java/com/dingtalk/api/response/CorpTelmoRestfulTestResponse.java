package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.telmo.restful.test response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpTelmoRestfulTestResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8427558356771982513L;

	/** 
	 * result
	 */
	@ApiField("result")
	private IsvOrderCreateResult result;


	public void setResult(IsvOrderCreateResult result) {
		this.result = result;
	}
	public IsvOrderCreateResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IsvOrderCreateResult extends TaobaoObject {
		private static final long serialVersionUID = 4236323915961832961L;
		/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * gmtCreate
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * gmtModified
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * mainOrderId
		 */
		@ApiField("main_order_id")
		private String mainOrderId;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * totalAmount
		 */
		@ApiField("total_amount")
		private Long totalAmount;
	
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getMainOrderId() {
			return this.mainOrderId;
		}
		public void setMainOrderId(String mainOrderId) {
			this.mainOrderId = mainOrderId;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public Long getTotalAmount() {
			return this.totalAmount;
		}
		public void setTotalAmount(Long totalAmount) {
			this.totalAmount = totalAmount;
		}
	}
	


}
