package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiEduClassconversationAsyncsendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.classconversation.asyncsend request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.17
 */
public class OapiEduClassconversationAsyncsendRequest extends BaseTaobaoRequest<OapiEduClassconversationAsyncsendResponse> {
	
	

	/** 
	* request
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(TopSendConversationMsgRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduClassconversationAsyncsendResponse> getResponseClass() {
		return OapiEduClassconversationAsyncsendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * request
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopSendConversationMsgRequest extends TaobaoObject {
		private static final long serialVersionUID = 1741151354748937163L;
		/**
		 * 占位符替换词
		 */
		@ApiField("attributes")
		private String attributes;
		/**
		 * 班级id
		 */
		@ApiField("class_id")
		private Long classId;
		/**
		 * 随机数，在小程序打开的时候传入。需要透传过来
		 */
		@ApiField("nonce")
		private String nonce;
		/**
		 * 接收者userid
		 */
		@ApiListField("receiver_user_ids")
		@ApiField("string")
		private List<String> receiverUserIds;
		/**
		 * 模板id
		 */
		@ApiField("template_id")
		private Long templateId;
	
		public String getAttributes() {
			return this.attributes;
		}
		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}
		public void setAttributesString(String attributes) {
			this.attributes = attributes;
		}
		
		public Long getClassId() {
			return this.classId;
		}
		public void setClassId(Long classId) {
			this.classId = classId;
		}
		public String getNonce() {
			return this.nonce;
		}
		public void setNonce(String nonce) {
			this.nonce = nonce;
		}
		public List<String> getReceiverUserIds() {
			return this.receiverUserIds;
		}
		public void setReceiverUserIds(List<String> receiverUserIds) {
			this.receiverUserIds = receiverUserIds;
		}
		public Long getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}
	}
	

}