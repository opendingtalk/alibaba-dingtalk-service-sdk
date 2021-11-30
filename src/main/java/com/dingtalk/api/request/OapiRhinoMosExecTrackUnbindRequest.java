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

import com.dingtalk.api.response.OapiRhinoMosExecTrackUnbindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.track.unbind request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecTrackUnbindRequest extends BaseTaobaoRequest<OapiRhinoMosExecTrackUnbindResponse> {
	
	

	/** 
	* 实体ID列表
	 */
	private String entities;

	/** 
	* 实体类型
	 */
	private String entityType;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 追踪ID
	 */
	private String trackId;

	/** 
	* 追踪类型，吊挂或才RF
	 */
	private String trackType;

	/** 
	* 预留参数
	 */
	private String userid;

	/** 
	* 工位
	 */
	private String workstationCode;

	public void setEntities(String entities) {
		this.entities = entities;
	}

	public String getEntities() {
		return this.entities;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public String getTrackId() {
		return this.trackId;
	}

	public void setTrackType(String trackType) {
		this.trackType = trackType;
	}

	public String getTrackType() {
		return this.trackType;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWorkstationCode(String workstationCode) {
		this.workstationCode = workstationCode;
	}

	public String getWorkstationCode() {
		return this.workstationCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.track.unbind";
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
		txtParams.put("entities", this.entities);
		txtParams.put("entity_type", this.entityType);
		txtParams.put("order_id", this.orderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("track_id", this.trackId);
		txtParams.put("track_type", this.trackType);
		txtParams.put("userid", this.userid);
		txtParams.put("workstation_code", this.workstationCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecTrackUnbindResponse> getResponseClass() {
		return OapiRhinoMosExecTrackUnbindResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(entities, "entities");
		RequestCheckUtils.checkMaxListSize(entities, 500, "entities");
		RequestCheckUtils.checkNotEmpty(entityType, "entityType");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
		RequestCheckUtils.checkNotEmpty(trackId, "trackId");
		RequestCheckUtils.checkNotEmpty(trackType, "trackType");
	}
	

}