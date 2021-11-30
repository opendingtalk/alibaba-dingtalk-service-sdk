package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DingtalkDingcloudUserListResponse;

/**
 * TOP API: dingtalk.dingcloud.user.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.01.21
 */
public class DingtalkDingcloudUserListRequest extends BaseTaobaoRequest<DingtalkDingcloudUserListResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.dingcloud.user.list";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkDingcloudUserListResponse> getResponseClass() {
		return DingtalkDingcloudUserListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}