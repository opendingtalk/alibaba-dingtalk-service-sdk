package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiRhinoMosExecClothesBatchUnscrapResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.batch.unscrap request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecClothesBatchUnscrapRequest extends BaseTaobaoRequest<OapiRhinoMosExecClothesBatchUnscrapResponse> {
	
	

	/** 
	* 入参
	 */
	private String batchClothesPerformReq;

	public void setBatchClothesPerformReq(String batchClothesPerformReq) {
		this.batchClothesPerformReq = batchClothesPerformReq;
	}

	public void setBatchClothesPerformReq(BatchClothesPerformBaseReq batchClothesPerformReq) {
		this.batchClothesPerformReq = new JSONWriter(false,false,true).write(batchClothesPerformReq);
	}

	public String getBatchClothesPerformReq() {
		return this.batchClothesPerformReq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.clothes.batch.unscrap";
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
		txtParams.put("batch_clothes_perform_req", this.batchClothesPerformReq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecClothesBatchUnscrapResponse> getResponseClass() {
		return OapiRhinoMosExecClothesBatchUnscrapResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BatchClothesPerformBaseReq extends TaobaoObject {
		private static final long serialVersionUID = 5147835581123299381L;
		/**
		 * 实体列表
		 */
		@ApiListField("entity_ids")
		@ApiField("number")
		private List<Long> entityIds;
		/**
		 * 扩展属性
		 */
		@ApiField("ext_properties")
		private String extProperties;
		/**
		 * 订单ID
		 */
		@ApiField("order_id")
		private Long orderId;
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
	
		public List<Long> getEntityIds() {
			return this.entityIds;
		}
		public void setEntityIds(List<Long> entityIds) {
			this.entityIds = entityIds;
		}
		public String getExtProperties() {
			return this.extProperties;
		}
		public void setExtProperties(String extProperties) {
			this.extProperties = extProperties;
		}
		public void setExtPropertiesString(String extProperties) {
			this.extProperties = extProperties;
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