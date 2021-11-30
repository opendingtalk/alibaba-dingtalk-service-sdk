package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.bill.querytag response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiDingpayBillQuerytagResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8254531354946164189L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误文案
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private BillTagQueryOpenResponse result;


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

	public void setResult(BillTagQueryOpenResponse result) {
		this.result = result;
	}
	public BillTagQueryOpenResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BillTagQueryOpenResponse extends TaobaoObject {
		private static final long serialVersionUID = 6298756945754752421L;
		/**
		 * 标签列表
		 */
		@ApiListField("tags")
		@ApiField("string")
		private List<String> tags;
	
		public List<String> getTags() {
			return this.tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	}
	


}
