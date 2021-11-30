package com.taobao.api.reqrsp;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

public class TaspChengxianTestRequest extends BaseTaobaoRequest<TaspChengxianTestResponse> {

	private Long itemId;
	private String options;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getApiMethodName() {
		return "taobao.tasp.chengxian.test";
	}

	public String getContentType() {
		return null;
	}

	public String getResponseType() {
		return null;
	}

	public String getApiVersion() {
		return null;
	}

	public String getApiCallType() {
		return null;
	}

	public String getHttpMethod() {
		return null;
	}

	public Map<String, String> getTextParams() {
		TaobaoHashMap params = new TaobaoHashMap();
		params.put("item_id", this.itemId);
		params.put("options", this.options);
		return params;
	}

	public Class<TaspChengxianTestResponse> getResponseClass() {
		return TaspChengxianTestResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}

}
