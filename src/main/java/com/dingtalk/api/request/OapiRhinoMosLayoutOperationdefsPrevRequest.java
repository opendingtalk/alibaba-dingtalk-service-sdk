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

import com.dingtalk.api.response.OapiRhinoMosLayoutOperationdefsPrevResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.layout.operationdefs.prev request
 * 
 * @author top auto create
 * @since 1.0, 2020.04.09
 */
public class OapiRhinoMosLayoutOperationdefsPrevRequest extends BaseTaobaoRequest<OapiRhinoMosLayoutOperationdefsPrevResponse> {
	
	

	/** 
	* 版本：如果为空，查生效版本；不为空，查指定版本
	 */
	private Long flowVersion;

	/** 
	* 是否需要分配信息
	 */
	private Boolean needAssignInfo;

	/** 
	* 外部工序ID，和工序唯一ID不能同时为空
	 */
	private String operationExternalId;

	/** 
	* 工序唯一ID
	 */
	private Long operationUid;

	/** 
	* 订单ID
	 */
	private Long orderId;

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 查询暂存版本
	 */
	private Boolean tmpSave;

	/** 
	* 用户ID
	 */
	private String userid;

	public void setFlowVersion(Long flowVersion) {
		this.flowVersion = flowVersion;
	}

	public Long getFlowVersion() {
		return this.flowVersion;
	}

	public void setNeedAssignInfo(Boolean needAssignInfo) {
		this.needAssignInfo = needAssignInfo;
	}

	public Boolean getNeedAssignInfo() {
		return this.needAssignInfo;
	}

	public void setOperationExternalId(String operationExternalId) {
		this.operationExternalId = operationExternalId;
	}

	public String getOperationExternalId() {
		return this.operationExternalId;
	}

	public void setOperationUid(Long operationUid) {
		this.operationUid = operationUid;
	}

	public Long getOperationUid() {
		return this.operationUid;
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

	public void setTmpSave(Boolean tmpSave) {
		this.tmpSave = tmpSave;
	}

	public Boolean getTmpSave() {
		return this.tmpSave;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.layout.operationdefs.prev";
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
		txtParams.put("flow_version", this.flowVersion);
		txtParams.put("need_assign_info", this.needAssignInfo);
		txtParams.put("operation_external_id", this.operationExternalId);
		txtParams.put("operation_uid", this.operationUid);
		txtParams.put("order_id", this.orderId);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("tmp_save", this.tmpSave);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosLayoutOperationdefsPrevResponse> getResponseClass() {
		return OapiRhinoMosLayoutOperationdefsPrevResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(needAssignInfo, "needAssignInfo");
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
	}
	

}