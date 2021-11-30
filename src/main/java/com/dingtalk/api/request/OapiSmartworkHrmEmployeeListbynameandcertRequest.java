package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiSmartworkHrmEmployeeListbynameandcertResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.listbynameandcert request
 * 
 * @author top auto create
 * @since 1.0, 2019.03.19
 */
public class OapiSmartworkHrmEmployeeListbynameandcertRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeListbynameandcertResponse> {
	
	

	/** 
	* 查询参数
	 */
	private String params;

	public void setParams(String params) {
		this.params = params;
	}

	public void setParams(List<NameAndCertNumberQueryParam> params) {
		this.params = new JSONWriter(false,false,true).write(params);
	}

	public String getParams() {
		return this.params;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.listbynameandcert";
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
		txtParams.put("params", this.params);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeListbynameandcertResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeListbynameandcertResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(params, 100, "params");
	}
	
	/**
	 * 查询参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class NameAndCertNumberQueryParam extends TaobaoObject {
		private static final long serialVersionUID = 6611593313493773634L;
		/**
		 * 身份证号
		 */
		@ApiField("cert_no")
		private String certNo;
		/**
		 * 姓名
		 */
		@ApiField("real_name")
		private String realName;
	
		public String getCertNo() {
			return this.certNo;
		}
		public void setCertNo(String certNo) {
			this.certNo = certNo;
		}
		public String getRealName() {
			return this.realName;
		}
		public void setRealName(String realName) {
			this.realName = realName;
		}
	}
	

}