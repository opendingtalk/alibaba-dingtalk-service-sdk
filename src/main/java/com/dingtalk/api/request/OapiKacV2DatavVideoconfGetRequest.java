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
import com.dingtalk.api.response.OapiKacV2DatavVideoconfGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.v2.datav.videoconf.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.13
 */
public class OapiKacV2DatavVideoconfGetRequest extends BaseTaobaoRequest<OapiKacV2DatavVideoconfGetResponse> {
	
	

	/** 
	* 请求对象类型
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(McsSummaryRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.v2.datav.videoconf.get";
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

	public Class<OapiKacV2DatavVideoconfGetResponse> getResponseClass() {
		return OapiKacV2DatavVideoconfGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象类型
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class McsSummaryRequest extends TaobaoObject {
		private static final long serialVersionUID = 4143186825877795269L;
		/**
		 * 日期标识
		 */
		@ApiField("data_id")
		private String dataId;
	
		public String getDataId() {
			return this.dataId;
		}
		public void setDataId(String dataId) {
			this.dataId = dataId;
		}
	}
	

}