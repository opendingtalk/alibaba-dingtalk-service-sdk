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
import com.dingtalk.api.response.OapiRhinoEmpQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.emp.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.03
 */
public class OapiRhinoEmpQueryRequest extends BaseTaobaoRequest<OapiRhinoEmpQueryResponse> {
	
	

	/** 
	* 1
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(QueryCorpEmployeeDto req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.emp.query";
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
		txtParams.put("req", this.req);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoEmpQueryResponse> getResponseClass() {
		return OapiRhinoEmpQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryCorpEmployeeDto extends TaobaoObject {
		private static final long serialVersionUID = 7499229719851587316L;
		/**
		 * 1
		 */
		@ApiField("suiteKey")
		private String suiteKey;
		/**
		 * 1
		 */
		@ApiField("tenantId")
		private String tenantId;
		/**
		 * 1
		 */
		@ApiField("userId")
		private String userId;
		/**
		 * 1
		 */
		@ApiField("workNo")
		private String workNo;
	
		public String getSuiteKey() {
			return this.suiteKey;
		}
		public void setSuiteKey(String suiteKey) {
			this.suiteKey = suiteKey;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
	}
	

}