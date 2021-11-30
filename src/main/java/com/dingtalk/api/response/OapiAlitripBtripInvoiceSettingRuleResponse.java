package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.invoice.setting.rule response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripInvoiceSettingRuleResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8528361963911945727L;

	/** 
	 * 状态码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 结果信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 返回值
	 */
	@ApiField("module")
	private OpenInvoiceRuleRS module;

	/** 
	 * 操作是否成功
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

	public void setModule(OpenInvoiceRuleRS module) {
		this.module = module;
	}
	public OpenInvoiceRuleRS getModule( ) {
		return this.module;
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
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenInvoiceRuleRS extends TaobaoObject {
		private static final long serialVersionUID = 5365814175828887649L;
		/**
		 * 新增数
		 */
		@ApiField("add_num")
		private Long addNum;
		/**
		 * 删除数
		 */
		@ApiField("remove_num")
		private Long removeNum;
	
		public Long getAddNum() {
			return this.addNum;
		}
		public void setAddNum(Long addNum) {
			this.addNum = addNum;
		}
		public Long getRemoveNum() {
			return this.removeNum;
		}
		public void setRemoveNum(Long removeNum) {
			this.removeNum = removeNum;
		}
	}
	


}
