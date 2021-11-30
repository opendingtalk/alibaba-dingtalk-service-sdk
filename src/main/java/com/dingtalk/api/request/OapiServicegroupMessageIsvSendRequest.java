package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServicegroupMessageIsvSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.servicegroup.message.isv.send request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.31
 */
public class OapiServicegroupMessageIsvSendRequest extends BaseTaobaoRequest<OapiServicegroupMessageIsvSendResponse> {
	
	

	/** 
	* 商品码
	 */
	private String goodsCode;

	/** 
	* 审批流程实例id
	 */
	private String processInstanceId;

	/** 
	* 消息类容
	 */
	private String text;

	/** 
	* 消息标题
	 */
	private String title;

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.servicegroup.message.isv.send";
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
		txtParams.put("goodsCode", this.goodsCode);
		txtParams.put("processInstanceId", this.processInstanceId);
		txtParams.put("text", this.text);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServicegroupMessageIsvSendResponse> getResponseClass() {
		return OapiServicegroupMessageIsvSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}