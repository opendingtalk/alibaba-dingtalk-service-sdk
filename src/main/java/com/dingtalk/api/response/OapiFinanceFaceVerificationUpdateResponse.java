package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.finance.faceVerification.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFinanceFaceVerificationUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7151976623125822798L;

	/** 
	 * 业务标识
	 */
	@ApiField("business_id")
	private String businessId;

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
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

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
