package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAttendanceAdvancedServiceBindResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.advanced.service.bind request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.03
 */
public class OapiAttendanceAdvancedServiceBindRequest extends BaseTaobaoRequest<OapiAttendanceAdvancedServiceBindResponse> {
	
	

	/** 
	* 操作者userId
	 */
	private String opUserid;

	/** 
	* 业务参数
	 */
	private String param;

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(BindParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.advanced.service.bind";
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
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceAdvancedServiceBindResponse> getResponseClass() {
		return OapiAttendanceAdvancedServiceBindResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
	}
	
	/**
	 * 业务参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BindParam extends TaobaoObject {
		private static final long serialVersionUID = 7544871469265953146L;
		/**
		 * 有效期结束时间，时间戳
		 */
		@ApiField("end_time")
		private Long endTime;
		/**
		 * 实体id
		 */
		@ApiField("entity_id")
		private String entityId;
		/**
		 * 实体类型，当前支持user,group,corp
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 绑定名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 服务id
		 */
		@ApiField("service_id")
		private Long serviceId;
		/**
		 * 有效期开始时间，时间戳
		 */
		@ApiField("start_time")
		private Long startTime;
	
		public Long getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public String getEntityId() {
			return this.entityId;
		}
		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getServiceId() {
			return this.serviceId;
		}
		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}
		public Long getStartTime() {
			return this.startTime;
		}
		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}
	}
	

}