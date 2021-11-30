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
import com.dingtalk.api.response.OapiRhinoOrderTagGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.tag.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.20
 */
public class OapiRhinoOrderTagGetRequest extends BaseTaobaoRequest<OapiRhinoOrderTagGetResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(QueryTagByProductOrderReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.order.tag.get";
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

	public Class<OapiRhinoOrderTagGetResponse> getResponseClass() {
		return OapiRhinoOrderTagGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryTagByProductOrderReq extends TaobaoObject {
		private static final long serialVersionUID = 2356137729165665999L;
		/**
		 * 生产订单id
		 */
		@ApiField("product_order_id")
		private Long productOrderId;
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
	
		public Long getProductOrderId() {
			return this.productOrderId;
		}
		public void setProductOrderId(Long productOrderId) {
			this.productOrderId = productOrderId;
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