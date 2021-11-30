package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.dismission.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmEmployeeDismissionUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3512518241525852372L;

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
	 * 业务是否成功
	 */
	@ApiField("result")
	private Boolean result;

	/** 
	 * 接口是否成功
	 */
	@ApiField("suc")
	private Boolean suc;


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

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

	public void setSuc(Boolean suc) {
		this.suc = suc;
	}
	public Boolean getSuc( ) {
		return this.suc;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
