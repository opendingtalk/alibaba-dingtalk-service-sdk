package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.internal.skupage.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAppstoreInternalSkupageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4583885379813324929L;

	/** 
	 * 服务结果码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 服务结果描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 内购商品SKU页面地址
	 */
	@ApiField("result")
	private String result;


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

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
