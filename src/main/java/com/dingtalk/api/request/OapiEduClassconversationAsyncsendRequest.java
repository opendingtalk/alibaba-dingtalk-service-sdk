package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduClassconversationAsyncsendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.classconversation.asyncsend request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.08
 */
public class OapiEduClassconversationAsyncsendRequest extends BaseTaobaoRequest<OapiEduClassconversationAsyncsendResponse> {
	
	

	/** 
	* 占位符替换词
	 */
	private String attributes;

	/** 
	* 班级id
	 */
	private Long classId;

	/** 
	* 随机数，在小程序打开的时候传入。需要透传过来
	 */
	private String nonce;

	/** 
	* 接收者userid
	 */
	private String receiverUserIds;

	/** 
	* 模板id
	 */
	private Long templateId;

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public void setAttributesString(String attributes) {
		this.attributes = attributes;
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getNonce() {
		return this.nonce;
	}

	public void setReceiverUserIds(String receiverUserIds) {
		this.receiverUserIds = receiverUserIds;
	}

	public String getReceiverUserIds() {
		return this.receiverUserIds;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.classconversation.asyncsend";
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
		txtParams.put("attributes", this.attributes);
		txtParams.put("class_id", this.classId);
		txtParams.put("nonce", this.nonce);
		txtParams.put("receiver_user_ids", this.receiverUserIds);
		txtParams.put("template_id", this.templateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduClassconversationAsyncsendResponse> getResponseClass() {
		return OapiEduClassconversationAsyncsendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(attributes, "attributes");
		RequestCheckUtils.checkNotEmpty(classId, "classId");
		RequestCheckUtils.checkMaxListSize(receiverUserIds, 20, "receiverUserIds");
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
	}
	

}