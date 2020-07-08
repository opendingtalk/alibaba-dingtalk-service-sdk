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
import com.dingtalk.api.response.OapiRhinoMosExecPerformContextGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.context.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.22
 */
public class OapiRhinoMosExecPerformContextGetRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformContextGetResponse> {
	
	

	/** 
	* 入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(ContextGetReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.context.get";
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

	public Class<OapiRhinoMosExecPerformContextGetResponse> getResponseClass() {
		return OapiRhinoMosExecPerformContextGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ContextGetReq extends TaobaoObject {
		private static final long serialVersionUID = 3392284432325897431L;
		/**
		 * 上下文KEY
		 */
		@ApiListField("keys")
		@ApiField("string")
		private List<String> keys;
		/**
		 * 执行记录ID
		 */
		@ApiListField("operation_record_ids")
		@ApiField("number")
		private List<Long> operationRecordIds;
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
	
		public List<String> getKeys() {
			return this.keys;
		}
		public void setKeys(List<String> keys) {
			this.keys = keys;
		}
		public List<Long> getOperationRecordIds() {
			return this.operationRecordIds;
		}
		public void setOperationRecordIds(List<Long> operationRecordIds) {
			this.operationRecordIds = operationRecordIds;
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