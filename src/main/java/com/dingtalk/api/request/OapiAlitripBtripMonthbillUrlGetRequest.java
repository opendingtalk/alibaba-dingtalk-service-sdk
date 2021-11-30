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
import com.dingtalk.api.response.OapiAlitripBtripMonthbillUrlGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.monthbill.url.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.16
 */
public class OapiAlitripBtripMonthbillUrlGetRequest extends BaseTaobaoRequest<OapiAlitripBtripMonthbillUrlGetResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(OpenAccountRq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.monthbill.url.get";
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

	public Class<OapiAlitripBtripMonthbillUrlGetResponse> getResponseClass() {
		return OapiAlitripBtripMonthbillUrlGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenAccountRq extends TaobaoObject {
		private static final long serialVersionUID = 2624443122415781735L;
		/**
		 * 对账单月份，不传取最新对账单
		 */
		@ApiField("bill_month")
		private String billMonth;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
	
		public String getBillMonth() {
			return this.billMonth;
		}
		public void setBillMonth(String billMonth) {
			this.billMonth = billMonth;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
	}
	

}