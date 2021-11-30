package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.ticket.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCustomerserviceTicketCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5487926393967931758L;

	/** 
	 * 异常码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 异常消息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private TicketCreateResultDto result;

	/** 
	 * 是否成功
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

	public void setResult(TicketCreateResultDto result) {
		this.result = result;
	}
	public TicketCreateResultDto getResult( ) {
		return this.result;
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
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketCreateResultDto extends TaobaoObject {
		private static final long serialVersionUID = 2621713311337721764L;
		/**
		 * 工单id
		 */
		@ApiField("ticket_id")
		private String ticketId;
	
		public String getTicketId() {
			return this.ticketId;
		}
		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}
	}
	


}
