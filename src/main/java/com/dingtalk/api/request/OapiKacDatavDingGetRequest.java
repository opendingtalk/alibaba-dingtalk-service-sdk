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
import com.dingtalk.api.response.OapiKacDatavDingGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.ding.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.17
 */
public class OapiKacDatavDingGetRequest extends BaseTaobaoRequest<OapiKacDatavDingGetResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String dingUsageSummaryRequest;

	public void setDingUsageSummaryRequest(String dingUsageSummaryRequest) {
		this.dingUsageSummaryRequest = dingUsageSummaryRequest;
	}

	public void setDingUsageSummaryRequest(DingUsageSummaryRequest dingUsageSummaryRequest) {
		this.dingUsageSummaryRequest = new JSONWriter(false,false,true).write(dingUsageSummaryRequest);
	}

	public String getDingUsageSummaryRequest() {
		return this.dingUsageSummaryRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.datav.ding.get";
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
		txtParams.put("ding_usage_summary_request", this.dingUsageSummaryRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKacDatavDingGetResponse> getResponseClass() {
		return OapiKacDatavDingGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingUsageSummaryRequest extends TaobaoObject {
		private static final long serialVersionUID = 2856595526556134963L;
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