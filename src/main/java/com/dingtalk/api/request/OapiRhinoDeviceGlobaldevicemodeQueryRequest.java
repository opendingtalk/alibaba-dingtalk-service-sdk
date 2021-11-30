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
import com.dingtalk.api.response.OapiRhinoDeviceGlobaldevicemodeQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.device.globaldevicemode.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.27
 */
public class OapiRhinoDeviceGlobaldevicemodeQueryRequest extends BaseTaobaoRequest<OapiRhinoDeviceGlobaldevicemodeQueryResponse> {
	
	

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
		return "dingtalk.oapi.rhino.device.globaldevicemode.query";
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

	public Class<OapiRhinoDeviceGlobaldevicemodeQueryResponse> getResponseClass() {
		return OapiRhinoDeviceGlobaldevicemodeQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 行业设备型号List
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetModelReqList extends TaobaoObject {
		private static final long serialVersionUID = 7776584174269523738L;
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
		private static final long serialVersionUID = 2223248495229782476L;
		/**
		 * 行业设备型号List
		 */
		@ApiListField("get_model_req_list")
		@ApiField("get_model_req_list")
		private List<GetModelReqList> getModelReqList;
		/**
		 * 是否获取非生产设备
		 */
		@ApiField("if_enclude_nonproduce")
		private Boolean ifEncludeNonproduce;
		/**
		 * 是否获取平均占地面积
		 */
		@ApiField("if_get_average_area")
		private Boolean ifGetAverageArea;
		/**
		 * 是否获取iot属性
		 */
		@ApiField("if_get_iotproperty")
		private Boolean ifGetIotproperty;
		/**
		 * 是否获取工序能力
		 */
		@ApiField("if_get_processability")
		private Boolean ifGetProcessability;
		/**
		 * 是否获取工艺参数
		 */
		@ApiField("if_get_processparam")
		private Boolean ifGetProcessparam;
		/**
		 * 设备名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 设备大类
		 */
		@ApiField("process_category_id")
		private Long processCategoryId;
		/**
		 * 过滤工序能力
		 */
		@ApiListField("processtype_list")
		@ApiField("string")
		private List<String> processtypeList;
	
		public List<GetModelReqList> getGetModelReqList() {
			return this.getModelReqList;
		}
		public void setGetModelReqList(List<GetModelReqList> getModelReqList) {
			this.getModelReqList = getModelReqList;
		}
		public Boolean getIfEncludeNonproduce() {
			return this.ifEncludeNonproduce;
		}
		public void setIfEncludeNonproduce(Boolean ifEncludeNonproduce) {
			this.ifEncludeNonproduce = ifEncludeNonproduce;
		}
		public Boolean getIfGetAverageArea() {
			return this.ifGetAverageArea;
		}
		public void setIfGetAverageArea(Boolean ifGetAverageArea) {
			this.ifGetAverageArea = ifGetAverageArea;
		}
		public Boolean getIfGetIotproperty() {
			return this.ifGetIotproperty;
		}
		public void setIfGetIotproperty(Boolean ifGetIotproperty) {
			this.ifGetIotproperty = ifGetIotproperty;
		}
		public Boolean getIfGetProcessability() {
			return this.ifGetProcessability;
		}
		public void setIfGetProcessability(Boolean ifGetProcessability) {
			this.ifGetProcessability = ifGetProcessability;
		}
		public Boolean getIfGetProcessparam() {
			return this.ifGetProcessparam;
		}
		public void setIfGetProcessparam(Boolean ifGetProcessparam) {
			this.ifGetProcessparam = ifGetProcessparam;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getProcessCategoryId() {
			return this.processCategoryId;
		}
		public void setProcessCategoryId(Long processCategoryId) {
			this.processCategoryId = processCategoryId;
		}
		public List<String> getProcesstypeList() {
			return this.processtypeList;
		}
		public void setProcesstypeList(List<String> processtypeList) {
			this.processtypeList = processtypeList;
		}
	}
	

}