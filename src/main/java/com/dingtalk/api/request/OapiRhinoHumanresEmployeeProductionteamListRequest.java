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
import com.dingtalk.api.response.OapiRhinoHumanresEmployeeProductionteamListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.employee.productionteam.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.13
 */
public class OapiRhinoHumanresEmployeeProductionteamListRequest extends BaseTaobaoRequest<OapiRhinoHumanresEmployeeProductionteamListResponse> {
	
	

	/** 
	* 查询参数
	 */
	private String queryEmployeeProductionTeamParam;

	public void setQueryEmployeeProductionTeamParam(String queryEmployeeProductionTeamParam) {
		this.queryEmployeeProductionTeamParam = queryEmployeeProductionTeamParam;
	}

	public void setQueryEmployeeProductionTeamParam(QueryCorpEmployeeProductionTeamDto queryEmployeeProductionTeamParam) {
		this.queryEmployeeProductionTeamParam = new JSONWriter(false,false,true).write(queryEmployeeProductionTeamParam);
	}

	public String getQueryEmployeeProductionTeamParam() {
		return this.queryEmployeeProductionTeamParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.humanres.employee.productionteam.list";
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
		txtParams.put("query_employee_production_team_param", this.queryEmployeeProductionTeamParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoHumanresEmployeeProductionteamListResponse> getResponseClass() {
		return OapiRhinoHumanresEmployeeProductionteamListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryCorpEmployeeProductionTeamDto extends TaobaoObject {
		private static final long serialVersionUID = 4759788948499937581L;
		/**
		 * 是否包含未激活或者离职状态
		 */
		@ApiField("include_inactive")
		private Boolean includeInactive;
		/**
		 * 资产ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * uicic 列表
		 */
		@ApiListField("uic_ids")
		@ApiField("number")
		private List<Long> uicIds;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
	
		public Boolean getIncludeInactive() {
			return this.includeInactive;
		}
		public void setIncludeInactive(Boolean includeInactive) {
			this.includeInactive = includeInactive;
		}
		public String getTenantId() {
			return this.tenantId;
		}
		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
		public List<Long> getUicIds() {
			return this.uicIds;
		}
		public void setUicIds(List<Long> uicIds) {
			this.uicIds = uicIds;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}