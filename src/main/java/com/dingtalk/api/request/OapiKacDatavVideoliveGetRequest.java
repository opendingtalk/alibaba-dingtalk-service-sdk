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
import com.dingtalk.api.response.OapiKacDatavVideoliveGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.videolive.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.10
 */
public class OapiKacDatavVideoliveGetRequest extends BaseTaobaoRequest<OapiKacDatavVideoliveGetResponse> {
	
	

	/** 
	* 请求参数对象
	 */
	private String paramVideoLiveSummaryRequest;

	public void setParamVideoLiveSummaryRequest(String paramVideoLiveSummaryRequest) {
		this.paramVideoLiveSummaryRequest = paramVideoLiveSummaryRequest;
	}

	public void setParamVideoLiveSummaryRequest(VideoLiveSummaryRequest paramVideoLiveSummaryRequest) {
		this.paramVideoLiveSummaryRequest = new JSONWriter(false,false,true).write(paramVideoLiveSummaryRequest);
	}

	public String getParamVideoLiveSummaryRequest() {
		return this.paramVideoLiveSummaryRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.datav.videolive.get";
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
		txtParams.put("param_video_live_summary_request", this.paramVideoLiveSummaryRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKacDatavVideoliveGetResponse> getResponseClass() {
		return OapiKacDatavVideoliveGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class VideoLiveSummaryRequest extends TaobaoObject {
		private static final long serialVersionUID = 5227981775195439212L;
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