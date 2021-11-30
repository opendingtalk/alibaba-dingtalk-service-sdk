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
import com.dingtalk.api.response.OapiRhinoMosExecTrackTrackersUnbindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.track.trackers.unbind request
 * 
 * @author top auto create
 * @since 1.0, 2020.07.03
 */
public class OapiRhinoMosExecTrackTrackersUnbindRequest extends BaseTaobaoRequest<OapiRhinoMosExecTrackTrackersUnbindResponse> {
	
	

	/** 
	* 入参
	 */
	private String req;

	public void setReq(String req) {
		this.req = req;
	}

	public void setReq(SpecificEntityTypeWithTrackInfoReq req) {
		this.req = new JSONWriter(false,false,true).write(req);
	}

	public String getReq() {
		return this.req;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.track.trackers.unbind";
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

	public Class<OapiRhinoMosExecTrackTrackersUnbindResponse> getResponseClass() {
		return OapiRhinoMosExecTrackTrackersUnbindResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SpecificEntityTypeWithTrackInfoReq extends TaobaoObject {
		private static final long serialVersionUID = 7139241714972427846L;
		/**
		 * 实体类型
		 */
		@ApiField("entity_type")
		private String entityType;
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
		 * 追踪ID
		 */
		@ApiListField("track_ids")
		@ApiField("string")
		private List<String> trackIds;
		/**
		 * 追踪类型
		 */
		@ApiField("track_type")
		private String trackType;
		/**
		 * 预留参数
		 */
		@ApiField("userid")
		private String userid;
	
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
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
		public List<String> getTrackIds() {
			return this.trackIds;
		}
		public void setTrackIds(List<String> trackIds) {
			this.trackIds = trackIds;
		}
		public String getTrackType() {
			return this.trackType;
		}
		public void setTrackType(String trackType) {
			this.trackType = trackType;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}