package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.invoice.setting.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripInvoiceSettingAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3519794111911929566L;

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
	 * 结果值
	 */
	@ApiField("module")
	private Long module;

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

	public void setModule(Long module) {
		this.module = module;
	}
	public Long getModule( ) {
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
	


}
