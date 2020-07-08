package com.taobao.api.internal.sign;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.signature.validate response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SignatureValidateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7695382755428242179L;

	/** 
	 * appkey拥有者ID
	 */
	@ApiField("isv_id")
	private Long isvId;

	/** 
	 * 签名是否有效
	 */
	@ApiField("valid")
	private Boolean valid;
	

	/** 
	 * 签名校验成功后，返回secret用于本地签名
	 */
	@ApiField("secret")
	private String secret;

	public void setIsvId(Long isvId) {
		this.isvId = isvId;
	}
	public Long getIsvId( ) {
		return this.isvId;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getValid( ) {
		return this.valid;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}

}