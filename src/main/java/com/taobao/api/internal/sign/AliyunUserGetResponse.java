package com.taobao.api.internal.sign;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;


/**
 * TOP API: aliyun.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AliyunUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2253324651121975345L;

	/** 
	 * 账号信息
	 */
	@ApiField("account")
	private String account;


	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount( ) {
		return this.account;
	}
	


}
