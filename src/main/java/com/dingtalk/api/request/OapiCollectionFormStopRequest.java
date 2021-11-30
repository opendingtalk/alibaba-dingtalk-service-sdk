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
import com.dingtalk.api.response.OapiCollectionFormStopResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.collection.form.stop request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.25
 */
public class OapiCollectionFormStopRequest extends BaseTaobaoRequest<OapiCollectionFormStopResponse> {
	
	

	/** 
	* 根请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(FormSchemaStopRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.collection.form.stop";
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

	public Class<OapiCollectionFormStopResponse> getResponseClass() {
		return OapiCollectionFormStopResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 根请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormSchemaStopRequest extends TaobaoObject {
		private static final long serialVersionUID = 4444895293373382317L;
		/**
		 * bizType
		 */
		@ApiField("biz_type")
		private Long bizType;
		/**
		 * 表单code
		 */
		@ApiField("form_code")
		private String formCode;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getBizType() {
			return this.bizType;
		}
		public void setBizType(Long bizType) {
			this.bizType = bizType;
		}
		public String getFormCode() {
			return this.formCode;
		}
		public void setFormCode(String formCode) {
			this.formCode = formCode;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}