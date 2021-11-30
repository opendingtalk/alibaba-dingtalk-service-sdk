package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.seller.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRetailSellerQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6758556334918529998L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 卖家列表
	 */
	@ApiListField("result")
	@ApiField("seller_dto")
	private List<SellerDto> result;

	/** 
	 * 调用成功于否
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

	public void setResult(List<SellerDto> result) {
		this.result = result;
	}
	public List<SellerDto> getResult( ) {
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
	 * 卖家列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SellerDto extends TaobaoObject {
		private static final long serialVersionUID = 5255419813436455458L;
		/**
		 * 卖家ID
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 卖家nick
		 */
		@ApiField("seller_nick")
		private String sellerNick;
		/**
		 * 天猫店|淘宝店
		 */
		@ApiField("type")
		private String type;
	
		public Long getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	


}
