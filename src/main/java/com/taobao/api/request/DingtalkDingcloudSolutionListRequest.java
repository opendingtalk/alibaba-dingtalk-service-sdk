package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DingtalkDingcloudSolutionListResponse;

/**
 * TOP API: dingtalk.dingcloud.solution.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.01.18
 */
public class DingtalkDingcloudSolutionListRequest extends BaseTaobaoRequest<DingtalkDingcloudSolutionListResponse> {
	
	

	/** 
	* fa
	 */
	private String corpId;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public String getApiMethodName() {
		return "dingtalk.dingcloud.solution.list";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("corp_id", this.corpId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkDingcloudSolutionListResponse> getResponseClass() {
		return DingtalkDingcloudSolutionListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}