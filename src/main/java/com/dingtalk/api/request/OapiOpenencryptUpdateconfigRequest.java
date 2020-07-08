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
import com.dingtalk.api.response.OapiOpenencryptUpdateconfigResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.openencrypt.updateconfig request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.06
 */
public class OapiOpenencryptUpdateconfigRequest extends BaseTaobaoRequest<OapiOpenencryptUpdateconfigResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String topResourceKmsConfig;

	public void setTopResourceKmsConfig(String topResourceKmsConfig) {
		this.topResourceKmsConfig = topResourceKmsConfig;
	}

	public void setTopResourceKmsConfig(TopResourceKmsConfig topResourceKmsConfig) {
		this.topResourceKmsConfig = new JSONWriter(false,false,true).write(topResourceKmsConfig);
	}

	public String getTopResourceKmsConfig() {
		return this.topResourceKmsConfig;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.openencrypt.updateconfig";
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
		txtParams.put("top_resource_kms_config", this.topResourceKmsConfig);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOpenencryptUpdateconfigResponse> getResponseClass() {
		return OapiOpenencryptUpdateconfigResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopResourceKmsConfig extends TaobaoObject {
		private static final long serialVersionUID = 8236425163261486471L;
		/**
		 * 企业内部应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * 扩展字段,json格式
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 请求id
		 */
		@ApiField("requestid")
		private String requestid;
		/**
		 * 资源路径
		 */
		@ApiField("resource")
		private String resource;
		/**
		 * 轮转周期
		 */
		@ApiField("rotate_period_day")
		private Long rotatePeriodDay;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getRequestid() {
			return this.requestid;
		}
		public void setRequestid(String requestid) {
			this.requestid = requestid;
		}
		public String getResource() {
			return this.resource;
		}
		public void setResource(String resource) {
			this.resource = resource;
		}
		public Long getRotatePeriodDay() {
			return this.rotatePeriodDay;
		}
		public void setRotatePeriodDay(Long rotatePeriodDay) {
			this.rotatePeriodDay = rotatePeriodDay;
		}
	}
	

}