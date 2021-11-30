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
import com.dingtalk.api.response.OapiCustomerserviceStatusUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.status.update request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.12
 */
public class OapiCustomerserviceStatusUpdateRequest extends BaseTaobaoRequest<OapiCustomerserviceStatusUpdateResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String statusChange;

	public void setStatusChange(String statusChange) {
		this.statusChange = statusChange;
	}

	public void setStatusChange(ServiceStatusChangeDto statusChange) {
		this.statusChange = new JSONWriter(false,false,true).write(statusChange);
	}

	public String getStatusChange() {
		return this.statusChange;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.status.update";
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
		txtParams.put("status_change", this.statusChange);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceStatusUpdateResponse> getResponseClass() {
		return OapiCustomerserviceStatusUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ServiceStatusChangeDto extends TaobaoObject {
		private static final long serialVersionUID = 6799627111887277732L;
		/**
		 * 客服所在bu
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 原始状态
		 */
		@ApiField("origin_status")
		private Long originStatus;
		/**
		 * 客服id
		 */
		@ApiField("service_id")
		private String serviceId;
		/**
		 * 客服所在系统
		 */
		@ApiField("source")
		private String source;
		/**
		 * 目标状态
		 */
		@ApiField("target_status")
		private Long targetStatus;
	
		public String getBuId() {
			return this.buId;
		}
		public void setBuId(String buId) {
			this.buId = buId;
		}
		public Long getOriginStatus() {
			return this.originStatus;
		}
		public void setOriginStatus(Long originStatus) {
			this.originStatus = originStatus;
		}
		public String getServiceId() {
			return this.serviceId;
		}
		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public Long getTargetStatus() {
			return this.targetStatus;
		}
		public void setTargetStatus(Long targetStatus) {
			this.targetStatus = targetStatus;
		}
	}
	

}