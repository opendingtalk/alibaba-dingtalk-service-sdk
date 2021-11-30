package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiAttendanceAdvancedServiceIsboundResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.advanced.service.isbound request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.03
 */
public class OapiAttendanceAdvancedServiceIsboundRequest extends BaseTaobaoRequest<OapiAttendanceAdvancedServiceIsboundResponse> {
	
	

	/** 
	* 操作者userid
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

	public void setParam(IsBoundParam param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.advanced.service.isbound";
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

	public Class<OapiAttendanceAdvancedServiceIsboundResponse> getResponseClass() {
		return OapiAttendanceAdvancedServiceIsboundResponse.class;
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
	public static class IsBoundParam extends TaobaoObject {
		private static final long serialVersionUID = 5156377712729883584L;
		/**
		 * 实体id列表
		 */
		@ApiListField("entity_ids")
		@ApiField("string")
		private List<String> entityIds;
		/**
		 * 实体类型，可取值user,group,corp
		 */
		@ApiField("entity_type")
		private String entityType;
		/**
		 * 服务id
		 */
		@ApiField("service_id")
		private Long serviceId;
	
		public List<String> getEntityIds() {
			return this.entityIds;
		}
		public void setEntityIds(List<String> entityIds) {
			this.entityIds = entityIds;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
		public Long getServiceId() {
			return this.serviceId;
		}
		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}
	}
	

}