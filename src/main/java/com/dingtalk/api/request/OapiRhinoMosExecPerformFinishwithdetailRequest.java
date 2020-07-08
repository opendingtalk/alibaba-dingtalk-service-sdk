package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiRhinoMosExecPerformFinishwithdetailResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.finishwithdetail request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.22
 */
public class OapiRhinoMosExecPerformFinishwithdetailRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformFinishwithdetailResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(BatchFinishOperation2Req req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.finishwithdetail";
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

	public Class<OapiRhinoMosExecPerformFinishwithdetailResponse> getResponseClass() {
		return OapiRhinoMosExecPerformFinishwithdetailResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 要完成的工序及详情
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FinishOperationReq extends TaobaoObject {
		private static final long serialVersionUID = 2748763231914931761L;
		/**
		 * 设备ID列表
		 */
		@ApiListField("device_ids")
		@ApiField("number")
		private List<Long> deviceIds;
		/**
		 * 工序执行记录ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 执行耗时
		 */
		@ApiField("process_cost_time")
		private String processCostTime;
		/**
		 * 执行开始时间
		 */
		@ApiField("process_end_time")
		private Date processEndTime;
		/**
		 * 执行完成时间
		 */
		@ApiField("process_start_time")
		private Date processStartTime;
		/**
		 * 执行人
		 */
		@ApiListField("work_nos")
		@ApiField("string")
		private List<String> workNos;
	
		public List<Long> getDeviceIds() {
			return this.deviceIds;
		}
		public void setDeviceIds(List<Long> deviceIds) {
			this.deviceIds = deviceIds;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getProcessCostTime() {
			return this.processCostTime;
		}
		public void setProcessCostTime(String processCostTime) {
			this.processCostTime = processCostTime;
		}
		public Date getProcessEndTime() {
			return this.processEndTime;
		}
		public void setProcessEndTime(Date processEndTime) {
			this.processEndTime = processEndTime;
		}
		public Date getProcessStartTime() {
			return this.processStartTime;
		}
		public void setProcessStartTime(Date processStartTime) {
			this.processStartTime = processStartTime;
		}
		public List<String> getWorkNos() {
			return this.workNos;
		}
		public void setWorkNos(List<String> workNos) {
			this.workNos = workNos;
		}
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BatchFinishOperation2Req extends TaobaoObject {
		private static final long serialVersionUID = 5787687621943713157L;
		/**
		 * 要完成的工序及详情
		 */
		@ApiListField("finish_operation_reqs")
		@ApiField("finish_operation_req")
		private List<FinishOperationReq> finishOperationReqs;
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
	
		public List<FinishOperationReq> getFinishOperationReqs() {
			return this.finishOperationReqs;
		}
		public void setFinishOperationReqs(List<FinishOperationReq> finishOperationReqs) {
			this.finishOperationReqs = finishOperationReqs;
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