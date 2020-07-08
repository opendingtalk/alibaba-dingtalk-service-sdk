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
import com.dingtalk.api.response.OapiOrgOpenencryptRegistekmsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.openencrypt.registekms request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.09
 */
public class OapiOrgOpenencryptRegistekmsRequest extends BaseTaobaoRequest<OapiOrgOpenencryptRegistekmsResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String topKmsMeta;

	public void setTopKmsMeta(String topKmsMeta) {
		this.topKmsMeta = topKmsMeta;
	}

	public void setTopKmsMeta(TopKMSMeta topKmsMeta) {
		this.topKmsMeta = new JSONWriter(false,false,true).write(topKmsMeta);
	}

	public String getTopKmsMeta() {
		return this.topKmsMeta;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.openencrypt.registekms";
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
		txtParams.put("top_kms_meta", this.topKmsMeta);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgOpenencryptRegistekmsResponse> getResponseClass() {
		return OapiOrgOpenencryptRegistekmsResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopKMSMeta extends TaobaoObject {
		private static final long serialVersionUID = 2157453479882823354L;
		/**
		 * 企业内部应用id
		 */
		@ApiField("agentid")
		private Long agentid;
		/**
		 * kms数据域名
		 */
		@ApiField("endpoint")
		private String endpoint;
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
		 * 0：禁用，1：启用
		 */
		@ApiField("status")
		private Long status;
	
		public Long getAgentid() {
			return this.agentid;
		}
		public void setAgentid(Long agentid) {
			this.agentid = agentid;
		}
		public String getEndpoint() {
			return this.endpoint;
		}
		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
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
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	

}