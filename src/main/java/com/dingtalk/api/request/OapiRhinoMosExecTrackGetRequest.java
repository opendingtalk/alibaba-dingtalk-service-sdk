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

import com.dingtalk.api.response.OapiRhinoMosExecTrackGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.track.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.06
 */
public class OapiRhinoMosExecTrackGetRequest extends BaseTaobaoRequest<OapiRhinoMosExecTrackGetResponse> {
	
	

	/** 
	* 租户ID
	 */
	private String tenantId;

	/** 
	* 追踪ID
	 */
	private String trackId;

	/** 
	* 追踪类型
	 */
	private String trackType;

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

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.track.get";
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
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("track_id", this.trackId);
		txtParams.put("track_type", this.trackType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecTrackGetResponse> getResponseClass() {
		return OapiRhinoMosExecTrackGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tenantId, "tenantId");
		RequestCheckUtils.checkNotEmpty(trackId, "trackId");
		RequestCheckUtils.checkNotEmpty(trackType, "trackType");
	}
	

}