package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.newmanufacturer.order.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiNewmanufacturerOrderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5349494992774859146L;

	/** 
	 * 错误编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 订单信息
	 */
	@ApiField("model")
	private ProductOrderDto model;

	/** 
	 * 成功标记
	 */
	@ApiField("success")
	private String success;


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

	public void setModel(ProductOrderDto model) {
		this.model = model;
	}
	public ProductOrderDto getModel( ) {
		return this.model;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 订单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProductOrderDto extends TaobaoObject {
		private static final long serialVersionUID = 6394226896839385538L;
		/**
		 * 订单编码
		 */
		@ApiField("number")
		private String number;
		/**
		 * 订单状态
		 */
		@ApiField("status")
		private String status;
	
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	}
	


}
