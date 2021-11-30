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
import com.dingtalk.api.response.OapiTrainingGroupinfoGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.training.groupinfo.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.24
 */
public class OapiTrainingGroupinfoGetRequest extends BaseTaobaoRequest<OapiTrainingGroupinfoGetResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(RequestVO request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.training.groupinfo.get";
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

	public Class<OapiTrainingGroupinfoGetResponse> getResponseClass() {
		return OapiTrainingGroupinfoGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RequestVO extends TaobaoObject {
		private static final long serialVersionUID = 8736964226326521253L;
		/**
		 * 组织唯一标识corpid
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 群id
		 */
		@ApiListField("ids")
		@ApiField("string")
		private List<String> ids;
	
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public List<String> getIds() {
			return this.ids;
		}
		public void setIds(List<String> ids) {
			this.ids = ids;
		}
	}
	

}