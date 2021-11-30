package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceAdvancedServiceUnbindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.advanced.service.unbind request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.03
 */
public class OapiAttendanceAdvancedServiceUnbindRequest extends BaseTaobaoRequest<OapiAttendanceAdvancedServiceUnbindResponse> {
	
	

	/** 
	* 实体id
	 */
	private String entityId;

	/** 
	* 实体类型，目前支持user,group,corp
	 */
	private String entityType;

	/** 
	* 操作者userid
	 */
	private String opUserid;

	/** 
	* 服务id
	 */
	private Long serviceId;

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.advanced.service.unbind";
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
		txtParams.put("entity_id", this.entityId);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("service_id", this.serviceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceAdvancedServiceUnbindResponse> getResponseClass() {
		return OapiAttendanceAdvancedServiceUnbindResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(entityId, "entityId");
		RequestCheckUtils.checkNotEmpty(entityType, "entityType");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(serviceId, "serviceId");
	}
	

}