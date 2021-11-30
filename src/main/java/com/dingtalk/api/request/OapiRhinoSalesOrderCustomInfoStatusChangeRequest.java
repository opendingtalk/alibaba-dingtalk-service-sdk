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
import com.dingtalk.api.response.OapiRhinoSalesOrderCustomInfoStatusChangeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.sales.order.custom.info.status.change request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.04
 */
public class OapiRhinoSalesOrderCustomInfoStatusChangeRequest extends BaseTaobaoRequest<OapiRhinoSalesOrderCustomInfoStatusChangeResponse> {
	
	

	/** 
	* 请求提体
	 */
	private String salesOrderCustomInfoChangeReq;

	public void setSalesOrderCustomInfoChangeReq(String salesOrderCustomInfoChangeReq) {
		this.salesOrderCustomInfoChangeReq = salesOrderCustomInfoChangeReq;
	}

	public void setSalesOrderCustomInfoChangeReq(OpenApiCustomOrderChangeReq salesOrderCustomInfoChangeReq) {
		this.salesOrderCustomInfoChangeReq = new JSONWriter(false,false,true).write(salesOrderCustomInfoChangeReq);
	}

	public String getSalesOrderCustomInfoChangeReq() {
		return this.salesOrderCustomInfoChangeReq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.sales.order.custom.info.status.change";
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
		txtParams.put("sales_order_custom_info_change_req", this.salesOrderCustomInfoChangeReq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoSalesOrderCustomInfoStatusChangeResponse> getResponseClass() {
		return OapiRhinoSalesOrderCustomInfoStatusChangeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求提体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiCustomOrderChangeReq extends TaobaoObject {
		private static final long serialVersionUID = 5185569624931596913L;
		/**
		 * 2C订单id
		 */
		@ApiField("biz_id_customer_order")
		private String bizIdCustomerOrder;
		/**
		 * 2C订单状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 租户id
		 */
		@ApiField("tenant_id")
		private String tenantId;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getBizIdCustomerOrder() {
			return this.bizIdCustomerOrder;
		}
		public void setBizIdCustomerOrder(String bizIdCustomerOrder) {
			this.bizIdCustomerOrder = bizIdCustomerOrder;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
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