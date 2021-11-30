package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiRhinoHumanresProductionteamQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.productionteam.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.06
 */
public class OapiRhinoHumanresProductionteamQueryRequest extends BaseTaobaoRequest<OapiRhinoHumanresProductionteamQueryResponse> {
	
	

	/** 
	* 查询生产组入参
	 */
	private String queryProductionTeamParam;

	public void setQueryProductionTeamParam(String queryProductionTeamParam) {
		this.queryProductionTeamParam = queryProductionTeamParam;
	}

	public void setQueryProductionTeamParam(QueryProductionTeamDto queryProductionTeamParam) {
		this.queryProductionTeamParam = new JSONWriter(false,false,true).write(queryProductionTeamParam);
	}

	public String getQueryProductionTeamParam() {
		return this.queryProductionTeamParam;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.humanres.productionteam.query";
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
		txtParams.put("query_production_team_param", this.queryProductionTeamParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoHumanresProductionteamQueryResponse> getResponseClass() {
		return OapiRhinoHumanresProductionteamQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询生产组入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryProductionTeamDto extends TaobaoObject {
		private static final long serialVersionUID = 4342199968827826768L;
		/**
		 * 结束时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 开始时间
		 */
		@ApiField("start_time")
		private Date startTime;
		/**
		 * 资产ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 预业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
		 */
		@ApiField("userid")
		private String userid;
		/**
		 * 工段CODE
		 */
		@ApiField("workshop_section_code")
		private String workshopSectionCode;
	
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Date getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
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
		public String getWorkshopSectionCode() {
			return this.workshopSectionCode;
		}
		public void setWorkshopSectionCode(String workshopSectionCode) {
			this.workshopSectionCode = workshopSectionCode;
		}
	}
	

}