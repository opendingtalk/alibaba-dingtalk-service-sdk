package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiImpaasConversationOpencidGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.opencid.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.09.24
 */
public class OapiImpaasConversationOpencidGetRequest extends BaseTaobaoRequest<OapiImpaasConversationOpencidGetResponse> {
	
	

	/** 
	* 基础会话对象
	 */
	private String model;

	public void setModel(String model) {
		this.model = model;
	}

	public void setModel(CrossDomainBaseConversationModel model) {
		this.model = new JSONWriter(false,false,true).write(model);
	}

	public String getModel() {
		return this.model;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.conversation.opencid.get";
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
		txtParams.put("model", this.model);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasConversationOpencidGetResponse> getResponseClass() {
		return OapiImpaasConversationOpencidGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 基础会话对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CrossDomainBaseConversationModel extends TaobaoObject {
		private static final long serialVersionUID = 8419281243821322711L;
		/**
		 * 会话id
		 */
		@ApiField("cid")
		private String cid;
		/**
		 * 会话类型
		 */
		@ApiField("conversation_type")
		private Long conversationType;
	
		public String getCid() {
			return this.cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public Long getConversationType() {
			return this.conversationType;
		}
		public void setConversationType(Long conversationType) {
			this.conversationType = conversationType;
		}
	}
	

}