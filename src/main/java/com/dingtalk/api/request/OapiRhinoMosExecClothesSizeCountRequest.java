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
import com.dingtalk.api.response.OapiRhinoMosExecClothesSizeCountResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.size.count request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.16
 */
public class OapiRhinoMosExecClothesSizeCountRequest extends BaseTaobaoRequest<OapiRhinoMosExecClothesSizeCountResponse> {
	
	

	/** 
	* 入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(ClothesGroupBySizeConditionReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.clothes.size.count";
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

	public Class<OapiRhinoMosExecClothesSizeCountResponse> getResponseClass() {
		return OapiRhinoMosExecClothesSizeCountResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ClothesGroupBySizeConditionReq extends TaobaoObject {
		private static final long serialVersionUID = 5664735762781926574L;
		/**
		 * 衣服状态列表
		 */
		@ApiListField("clothes_status_list")
		@ApiField("string")
		private List<String> clothesStatusList;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 租户ID
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 预留参数
		 */
		@ApiField("userid")
		private String userid;
	
		public List<String> getClothesStatusList() {
			return this.clothesStatusList;
		}
		public void setClothesStatusList(List<String> clothesStatusList) {
			this.clothesStatusList = clothesStatusList;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
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