package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.invoice.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripInvoiceSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7126722559157794561L;

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
	 * 发票列表
	 */
	@ApiListField("invoice")
	@ApiField("open_invoice_do")
	private List<OpenInvoiceDo> invoice;

	/** 
	 * 成功标识
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

	public void setInvoice(List<OpenInvoiceDo> invoice) {
		this.invoice = invoice;
	}
	public List<OpenInvoiceDo> getInvoice( ) {
		return this.invoice;
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
	 * 发票列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenInvoiceDo extends TaobaoObject {
		private static final long serialVersionUID = 1784793672475831553L;
		/**
		 * 商旅发票id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 第三方发票id
		 */
		@ApiField("third_part_invoice_id")
		private String thirdPartInvoiceId;
		/**
		 * 发票抬头
		 */
		@ApiField("title")
		private String title;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getThirdPartInvoiceId() {
			return this.thirdPartInvoiceId;
		}
		public void setThirdPartInvoiceId(String thirdPartInvoiceId) {
			this.thirdPartInvoiceId = thirdPartInvoiceId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
