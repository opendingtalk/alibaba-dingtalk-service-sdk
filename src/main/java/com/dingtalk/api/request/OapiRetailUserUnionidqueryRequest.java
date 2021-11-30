package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRetailUserUnionidqueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.retail.user.unionidquery request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.20
 */
public class OapiRetailUserUnionidqueryRequest extends BaseTaobaoRequest<OapiRetailUserUnionidqueryResponse> {
	
	

	/** 
	* 业务身份
	 */
	private String channel;

	/** 
	* 主帐号ID
	 */
	private String outerId;

	/** 
	* 子帐号ID
	 */
	private String subOuterId;

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setSubOuterId(String subOuterId) {
		this.subOuterId = subOuterId;
	}

	public String getSubOuterId() {
		return this.subOuterId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.retail.user.unionidquery";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel", this.channel);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("sub_outer_id", this.subOuterId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRetailUserUnionidqueryResponse> getResponseClass() {
		return OapiRetailUserUnionidqueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(channel, "channel");
		RequestCheckUtils.checkNotEmpty(outerId, "outerId");
		RequestCheckUtils.checkNotEmpty(subOuterId, "subOuterId");
	}
	

}