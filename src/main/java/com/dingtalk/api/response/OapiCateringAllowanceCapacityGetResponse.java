package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.allowance.capacity.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCateringAllowanceCapacityGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1192691411748331172L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 餐补结果
	 */
	@ApiField("result")
	private CateringOpenGetDeductCapacityResponse result;


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

	public void setResult(CateringOpenGetDeductCapacityResponse result) {
		this.result = result;
	}
	public CateringOpenGetDeductCapacityResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 餐补结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CateringOpenGetDeductCapacityResponse extends TaobaoObject {
		private static final long serialVersionUID = 1624276395917583714L;
		/**
		 * 可抵扣金额，单位为分
		 */
		@ApiField("deduct_capacity")
		private Long deductCapacity;
	
		public Long getDeductCapacity() {
			return this.deductCapacity;
		}
		public void setDeductCapacity(Long deductCapacity) {
			this.deductCapacity = deductCapacity;
		}
	}
	


}
