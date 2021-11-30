package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.invoice.gettitle response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpInvoiceGettitleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7239263866221637268L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InvoiceVo extends TaobaoObject {
		private static final long serialVersionUID = 1441198723435961682L;
		/**
		 * 银行账户
		 */
		@ApiField("account")
		private String account;
		/**
		 * 企业注册地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 开户行
		 */
		@ApiField("bank_name")
		private String bankName;
		/**
		 * 联系方式
		 */
		@ApiField("contact")
		private String contact;
		/**
		 * 税号
		 */
		@ApiField("duty_para")
		private String dutyPara;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 发票抬头
		 */
		@ApiField("title")
		private String title;
	
		public String getAccount() {
			return this.account;
		}
		public void setAccount(String account) {
			this.account = account;
		}
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBankName() {
			return this.bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getContact() {
			return this.contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getDutyPara() {
			return this.dutyPara;
		}
		public void setDutyPara(String dutyPara) {
			this.dutyPara = dutyPara;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4456228238529753356L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("invoice")
		private InvoiceVo invoice;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public InvoiceVo getInvoice() {
			return this.invoice;
		}
		public void setInvoice(InvoiceVo invoice) {
			this.invoice = invoice;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
