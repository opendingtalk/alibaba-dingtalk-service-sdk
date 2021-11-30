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
import com.dingtalk.api.response.OapiKacDatavTelconfDetailListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.datav.telconf.detail.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.20
 */
public class OapiKacDatavTelconfDetailListRequest extends BaseTaobaoRequest<OapiKacDatavTelconfDetailListResponse> {
	
	

	/** 
	* 请求参数对象
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(TelConferenceSummaryRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.datav.telconf.detail.list";
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

	public Class<OapiKacDatavTelconfDetailListResponse> getResponseClass() {
		return OapiKacDatavTelconfDetailListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TelConferenceSummaryRequest extends TaobaoObject {
		private static final long serialVersionUID = 1471331967658638619L;
		/**
		 * 分页游标；首页请使用0，之后直接使用返回结果中的next_cursor
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 日期标识
		 */
		@ApiField("data_id")
		private String dataId;
		/**
		 * 分页大小;不超过100
		 */
		@ApiField("size")
		private Long size;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public String getDataId() {
			return this.dataId;
		}
		public void setDataId(String dataId) {
			this.dataId = dataId;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
	}
	

}