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
import com.dingtalk.api.response.OapiRhinoMosSpaceWorkstationInsertResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.space.workstation.insert request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.02
 */
public class OapiRhinoMosSpaceWorkstationInsertRequest extends BaseTaobaoRequest<OapiRhinoMosSpaceWorkstationInsertResponse> {
	
	

	/** 
	* request
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ProdWorkstationInsertDto request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.space.workstation.insert";
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

	public Class<OapiRhinoMosSpaceWorkstationInsertResponse> getResponseClass() {
		return OapiRhinoMosSpaceWorkstationInsertResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * request
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ProdWorkstationInsertDto extends TaobaoObject {
		private static final long serialVersionUID = 3768488446619672231L;
		/**
		 * 类目code
		 */
		@ApiField("category_code")
		private String categoryCode;
		/**
		 * 类目子code
		 */
		@ApiField("category_sub_code")
		private String categorySubCode;
		/**
		 * 兴趣点code
		 */
		@ApiField("poi_code")
		private String poiCode;
		/**
		 * 站位code
		 */
		@ApiField("prod_workstation_code")
		private String prodWorkstationCode;
		/**
		 * 站位name
		 */
		@ApiField("prod_workstation_name")
		private String prodWorkstationName;
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
	
		public String getCategoryCode() {
			return this.categoryCode;
		}
		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}
		public String getCategorySubCode() {
			return this.categorySubCode;
		}
		public void setCategorySubCode(String categorySubCode) {
			this.categorySubCode = categorySubCode;
		}
		public String getPoiCode() {
			return this.poiCode;
		}
		public void setPoiCode(String poiCode) {
			this.poiCode = poiCode;
		}
		public String getProdWorkstationCode() {
			return this.prodWorkstationCode;
		}
		public void setProdWorkstationCode(String prodWorkstationCode) {
			this.prodWorkstationCode = prodWorkstationCode;
		}
		public String getProdWorkstationName() {
			return this.prodWorkstationName;
		}
		public void setProdWorkstationName(String prodWorkstationName) {
			this.prodWorkstationName = prodWorkstationName;
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