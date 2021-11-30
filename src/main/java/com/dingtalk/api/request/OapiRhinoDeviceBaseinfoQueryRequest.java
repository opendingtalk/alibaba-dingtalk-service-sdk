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
import com.dingtalk.api.response.OapiRhinoDeviceBaseinfoQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.baseinfo.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.27
 */
public class OapiRhinoDeviceBaseinfoQueryRequest extends BaseTaobaoRequest<OapiRhinoDeviceBaseinfoQueryResponse> {
	
	

	/** 
	* 查询参数
	 */
	private String query;

	/** 
	* 租户id
	 */
	private String tenantId;

	/** 
	* 业务参数[这里先预留],这里是用户ID,比如钉钉用户ID
	 */
	private String userid;

	public void setQuery(String query) {
		this.query = query;
	}

	public void setQuery(Query query) {
		this.query = new JSONWriter(false,false,true).write(query);
	}

	public String getQuery() {
		return this.query;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.device.baseinfo.query";
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
		txtParams.put("query", this.query);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoDeviceBaseinfoQueryResponse> getResponseClass() {
		return OapiRhinoDeviceBaseinfoQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 行业设备型号List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ModelReqList extends TaobaoObject {
		private static final long serialVersionUID = 8472631367319781455L;
		/**
		 * 行业设备型号
		 */
		@ApiField("global_model_id")
		private String globalModelId;
		/**
		 * 版本
		 */
		@ApiField("version")
		private String version;
	
		public String getGlobalModelId() {
			return this.globalModelId;
		}
		public void setGlobalModelId(String globalModelId) {
			this.globalModelId = globalModelId;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	
	/**
	 * 查询参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Query extends TaobaoObject {
		private static final long serialVersionUID = 5319429554415924741L;
		/**
		 * 行业设备型号List
		 */
		@ApiListField("model_req_list")
		@ApiField("model_req_list")
		private List<ModelReqList> modelReqList;
	
		public List<ModelReqList> getModelReqList() {
			return this.modelReqList;
		}
		public void setModelReqList(List<ModelReqList> modelReqList) {
			this.modelReqList = modelReqList;
		}
	}
	

}