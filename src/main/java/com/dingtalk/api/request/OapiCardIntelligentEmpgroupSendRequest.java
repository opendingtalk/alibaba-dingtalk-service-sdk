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

import com.dingtalk.api.response.OapiCardIntelligentEmpgroupSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.card.intelligent.empgroup.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.17
 */
public class OapiCardIntelligentEmpgroupSendRequest extends BaseTaobaoRequest<OapiCardIntelligentEmpgroupSendResponse> {
	
	

	/** 
	* 模版卡片注册的key
	 */
	private String msgKey;

	/** 
	* 卡片中需要填充的参数
	 */
	private String paramJson;

	/** 
	* 卡片接收成员列表，不填写为全部接收
	 */
	private String receiverList;

	/** 
	* 卡片消息去重复，长度不能大于64
	 */
	private String uuid;

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}

	public String getMsgKey() {
		return this.msgKey;
	}

	public void setParamJson(String paramJson) {
		this.paramJson = paramJson;
	}

	public String getParamJson() {
		return this.paramJson;
	}

	public void setReceiverList(String receiverList) {
		this.receiverList = receiverList;
	}

	public String getReceiverList() {
		return this.receiverList;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return this.uuid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.card.intelligent.empgroup.send";
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
		txtParams.put("msg_key", this.msgKey);
		txtParams.put("param_json", this.paramJson);
		txtParams.put("receiver_list", this.receiverList);
		txtParams.put("uuid", this.uuid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCardIntelligentEmpgroupSendResponse> getResponseClass() {
		return OapiCardIntelligentEmpgroupSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(msgKey, "msgKey");
		RequestCheckUtils.checkMaxListSize(receiverList, 999, "receiverList");
	}
	

}