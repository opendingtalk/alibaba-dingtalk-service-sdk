package com.taobao.api.internal.sign;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: aliyun.user.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.12.06
 */
public class AliyunUserGetRequest extends BaseTaobaoRequest<AliyunUserGetResponse> {
	
	/** 
	* 淘宝用户ID
	 */
	private Long userId;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "aliyun.user.get";
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
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AliyunUserGetResponse> getResponseClass() {
		return AliyunUserGetResponse.class;
	}

	public void check() throws ApiRuleException {

	}

}