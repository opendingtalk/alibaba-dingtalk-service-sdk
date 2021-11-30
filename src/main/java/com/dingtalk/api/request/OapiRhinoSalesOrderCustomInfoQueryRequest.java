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
import com.dingtalk.api.response.OapiRhinoSalesOrderCustomInfoQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.sales.order.custom.info.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.04
 */
public class OapiRhinoSalesOrderCustomInfoQueryRequest extends BaseTaobaoRequest<OapiRhinoSalesOrderCustomInfoQueryResponse> {
	
	

	/** 
	* 请求体
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(OpenApiSalesOrderCustomInfoQueryReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.sales.order.custom.info.query";
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

	public Class<OapiRhinoSalesOrderCustomInfoQueryResponse> getResponseClass() {
		return OapiRhinoSalesOrderCustomInfoQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiSalesOrderCustomInfoQueryReq extends TaobaoObject {
		private static final long serialVersionUID = 7458546678318895489L;
		/**
		 * 同步的2C订单批次id
		 */
		@ApiField("batch_id")
		private Long batchId;
		/**
		 * 页码
		 */
		@ApiField("page")
		private Long page;
		/**
		 * 每页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 计划交期-查询时间开始
		 */
		@ApiField("planned_delivery_time_begin")
		private Date plannedDeliveryTimeBegin;
		/**
		 * 计划交期-查询时间结束
		 */
		@ApiField("planned_delivery_time_end")
		private Date plannedDeliveryTimeEnd;
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
	
		public Long getBatchId() {
			return this.batchId;
		}
		public void setBatchId(Long batchId) {
			this.batchId = batchId;
		}
		public Long getPage() {
			return this.page;
		}
		public void setPage(Long page) {
			this.page = page;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Date getPlannedDeliveryTimeBegin() {
			return this.plannedDeliveryTimeBegin;
		}
		public void setPlannedDeliveryTimeBegin(Date plannedDeliveryTimeBegin) {
			this.plannedDeliveryTimeBegin = plannedDeliveryTimeBegin;
		}
		public Date getPlannedDeliveryTimeEnd() {
			return this.plannedDeliveryTimeEnd;
		}
		public void setPlannedDeliveryTimeEnd(Date plannedDeliveryTimeEnd) {
			this.plannedDeliveryTimeEnd = plannedDeliveryTimeEnd;
		}
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