package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.fugong.process_code.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiFugongProcessCodeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6112418279938983741L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误结果
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 模板code列表
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;


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

	public void setResult(List<String> result) {
		this.result = result;
	}
	public List<String> getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
