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
import com.dingtalk.api.response.OapiRhinoHumanresCorpemployeeGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.corpemployee.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.06
 */
public class OapiRhinoHumanresCorpemployeeGetRequest extends BaseTaobaoRequest<OapiRhinoHumanresCorpemployeeGetResponse> {
	
	

	/** 
	* 查询员工入参
	 */
	private String queryCorpEmployeeParam;

	public void setQueryCorpEmployeeParam(String queryCorpEmployeeParam) {
		this.queryCorpEmployeeParam = queryCorpEmployeeParam;
	}

	public void setQueryCorpEmployeeParam(QueryCorpEmployeeDto queryCorpEmployeeParam) {
		this.queryCorpEmployeeParam = new JSONWriter(false,false,true).write(queryCorpEmployeeParam);
	}

	public String getQueryCorpEmployeeParam() {
		return this.queryCorpEmployeeParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.humanres.corpemployee.get";
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
		txtParams.put("query_corp_employee_param", this.queryCorpEmployeeParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoHumanresCorpemployeeGetResponse> getResponseClass() {
		return OapiRhinoHumanresCorpemployeeGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询员工入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryCorpEmployeeDto extends TaobaoObject {
		private static final long serialVersionUID = 6548326588591744829L;
		/**
		 * 资产ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 员工ID
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 工号
		 */
		@ApiField("work_no")
		private String workNo;
	
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getWorkNo() {
			return this.workNo;
		}
		public void setWorkNo(String workNo) {
			this.workNo = workNo;
		}
	}
	

}