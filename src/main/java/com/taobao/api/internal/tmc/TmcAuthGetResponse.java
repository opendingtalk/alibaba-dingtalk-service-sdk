package com.taobao.api.internal.tmc;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmcAuthGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7048494816614445538L;

	@ApiField("result")
	private String result;

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
