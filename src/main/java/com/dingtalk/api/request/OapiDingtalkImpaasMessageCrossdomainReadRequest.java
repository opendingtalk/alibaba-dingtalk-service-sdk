package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiDingtalkImpaasMessageCrossdomainReadResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingtalk.impaas.message.crossdomain.read request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.08
 */
public class OapiDingtalkImpaasMessageCrossdomainReadRequest extends BaseTaobaoRequest<OapiDingtalkImpaasMessageCrossdomainReadResponse> {
	
	

	/** 
	* 消息已读结构
	 */
	private String messageReadModel;

	public void setMessageReadModel(String messageReadModel) {
		this.messageReadModel = messageReadModel;
	}

	public void setMessageReadModel(TopCrossDomainMessageReadModel messageReadModel) {
		this.messageReadModel = new JSONWriter(false,false,true).write(messageReadModel);
	}

	public String getMessageReadModel() {
		return this.messageReadModel;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingtalk.impaas.message.crossdomain.read";
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
		txtParams.put("message_read_model", this.messageReadModel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingtalkImpaasMessageCrossdomainReadResponse> getResponseClass() {
		return OapiDingtalkImpaasMessageCrossdomainReadResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 消息已读结构
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopCrossDomainMessageReadModel extends TaobaoObject {
		private static final long serialVersionUID = 6388866974779312754L;
		/**
		 * 消息ID列表
		 */
		@ApiListField("message_ids")
		@ApiField("string")
		private List<String> messageIds;
		/**
		 * 操作者ID
		 */
		@ApiField("operator_uid")
		private String operatorUid;
	
		public List<String> getMessageIds() {
			return this.messageIds;
		}
		public void setMessageIds(List<String> messageIds) {
			this.messageIds = messageIds;
		}
		public String getOperatorUid() {
			return this.operatorUid;
		}
		public void setOperatorUid(String operatorUid) {
			this.operatorUid = operatorUid;
		}
	}
	

}