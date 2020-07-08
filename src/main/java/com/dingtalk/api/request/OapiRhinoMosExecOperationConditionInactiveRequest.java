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
import com.dingtalk.api.response.OapiRhinoMosExecOperationConditionInactiveResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.operation.condition.inactive request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecOperationConditionInactiveRequest extends BaseTaobaoRequest<OapiRhinoMosExecOperationConditionInactiveResponse> {
	
	

	/** 
	* 入参
	 */
	private String inactiveOperationReq;

	public void setInactiveOperationReq(String inactiveOperationReq) {
		this.inactiveOperationReq = inactiveOperationReq;
	}

	public void setInactiveOperationReq(InactiveOperationByConditionReq inactiveOperationReq) {
		this.inactiveOperationReq = new JSONWriter(false,false,true).write(inactiveOperationReq);
	}

	public String getInactiveOperationReq() {
		return this.inactiveOperationReq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.operation.condition.inactive";
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
		txtParams.put("inactive_operation_req", this.inactiveOperationReq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecOperationConditionInactiveResponse> getResponseClass() {
		return OapiRhinoMosExecOperationConditionInactiveResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 来源
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Source extends TaobaoObject {
		private static final long serialVersionUID = 7585426664686943998L;
		/**
		 * source id
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * source type
		 */
		@ApiField("source_type")
		private String sourceType;
	
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getSourceType() {
			return this.sourceType;
		}
		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
	}
	
	/**
	 * 条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OperationCondition extends TaobaoObject {
		private static final long serialVersionUID = 2414951226814471195L;
		/**
		 * 记录id
		 */
		@ApiListField("ids")
		@ApiField("number")
		private List<Long> ids;
		/**
		 * 来源
		 */
		@ApiField("source")
		private Source source;
	
		public List<Long> getIds() {
			return this.ids;
		}
		public void setIds(List<Long> ids) {
			this.ids = ids;
		}
		public Source getSource() {
			return this.source;
		}
		public void setSource(Source source) {
			this.source = source;
		}
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InactiveOperationByConditionReq extends TaobaoObject {
		private static final long serialVersionUID = 8371585383124144145L;
		/**
		 * 条件
		 */
		@ApiField("condition")
		private OperationCondition condition;
		/**
		 * 订单id
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
	
		public OperationCondition getCondition() {
			return this.condition;
		}
		public void setCondition(OperationCondition condition) {
			this.condition = condition;
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