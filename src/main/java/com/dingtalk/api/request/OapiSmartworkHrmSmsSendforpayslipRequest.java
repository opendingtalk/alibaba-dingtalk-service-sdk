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
import com.dingtalk.api.response.OapiSmartworkHrmSmsSendforpayslipResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.sms.sendforpayslip request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.17
 */
public class OapiSmartworkHrmSmsSendforpayslipRequest extends BaseTaobaoRequest<OapiSmartworkHrmSmsSendforpayslipResponse> {
	
	

	/** 
	* 入参
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(PayslipSmsMessageParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.sms.sendforpayslip";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmSmsSendforpayslipResponse> getResponseClass() {
		return OapiSmartworkHrmSmsSendforpayslipResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PayslipSmsMessageParam extends TaobaoObject {
		private static final long serialVersionUID = 7858768882438398233L;
		/**
		 * 工资条月份
		 */
		@ApiField("month")
		private Long month;
		/**
		 * 员工userids
		 */
		@ApiListField("userid_list")
		@ApiField("string")
		private List<String> useridList;
	
		public Long getMonth() {
			return this.month;
		}
		public void setMonth(Long month) {
			this.month = month;
		}
		public List<String> getUseridList() {
			return this.useridList;
		}
		public void setUseridList(List<String> useridList) {
			this.useridList = useridList;
		}
	}
	

}