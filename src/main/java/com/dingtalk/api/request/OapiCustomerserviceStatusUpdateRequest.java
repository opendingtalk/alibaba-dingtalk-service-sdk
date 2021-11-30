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
 * @since 1.0, 2021.03.29
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
		private static final long serialVersionUID = 5171142542264234595L;
		/**
		 * 客服所在bu
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 钉钉的企业id
		 */
		@ApiField("ding_corp_id")
		private String dingCorpId;
		/**
		 * 实例id
		 */
		@ApiField("open_instance_id")
		private String openInstanceId;
		/**
		 * 原始状态
		 */
		@ApiField("origin_status")
		private Long originStatus;
		/**
		 * 1，智能客服；1001，经济体版本
		 */
		@ApiField("production_type")
		private Long productionType;
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
		public String getDingCorpId() {
			return this.dingCorpId;
		}
		public void setDingCorpId(String dingCorpId) {
			this.dingCorpId = dingCorpId;
		}
		public String getOpenInstanceId() {
			return this.openInstanceId;
		}
		public void setOpenInstanceId(String openInstanceId) {
			this.openInstanceId = openInstanceId;
		}
		public Long getOriginStatus() {
			return this.originStatus;
		}
		public void setOriginStatus(Long originStatus) {
			this.originStatus = originStatus;
		}
		public Long getProductionType() {
			return this.productionType;
		}
		public void setProductionType(Long productionType) {
			this.productionType = productionType;
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