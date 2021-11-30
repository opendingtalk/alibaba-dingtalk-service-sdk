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
import com.dingtalk.api.response.OapiRhinoMosSpaceWorkstationListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.workstation.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.07
 */
public class OapiRhinoMosSpaceWorkstationListRequest extends BaseTaobaoRequest<OapiRhinoMosSpaceWorkstationListResponse> {
	
	

	/** 
	* request
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ProdWorkstationConditionListReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.space.workstation.list";
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

	public Class<OapiRhinoMosSpaceWorkstationListResponse> getResponseClass() {
		return OapiRhinoMosSpaceWorkstationListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * request
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProdWorkstationConditionListReq extends TaobaoObject {
		private static final long serialVersionUID = 6581831728176556223L;
		/**
		 * 站位code列表
		 */
		@ApiListField("prod_workstation_code_list")
		@ApiField("string")
		private List<String> prodWorkstationCodeList;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
	
		public List<String> getProdWorkstationCodeList() {
			return this.prodWorkstationCodeList;
		}
		public void setProdWorkstationCodeList(List<String> prodWorkstationCodeList) {
			this.prodWorkstationCodeList = prodWorkstationCodeList;
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
	}
	

}