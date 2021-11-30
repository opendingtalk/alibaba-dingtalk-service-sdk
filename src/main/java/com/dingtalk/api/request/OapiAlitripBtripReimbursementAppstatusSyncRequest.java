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
import com.dingtalk.api.response.OapiAlitripBtripReimbursementAppstatusSyncResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.reimbursement.appstatus.sync request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.15
 */
public class OapiAlitripBtripReimbursementAppstatusSyncRequest extends BaseTaobaoRequest<OapiAlitripBtripReimbursementAppstatusSyncResponse> {
	
	

	/** 
	* 请求参数
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenApiUpdateAppStatusRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.reimbursement.appstatus.sync";
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
		txtParams.put("rq", this.rq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripReimbursementAppstatusSyncResponse> getResponseClass() {
		return OapiAlitripBtripReimbursementAppstatusSyncResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiUpdateAppStatusRq extends TaobaoObject {
		private static final long serialVersionUID = 8597931984131318165L;
		/**
		 * corp id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 是否已经安装（app是否正常提供服务）
		 */
		@ApiField("installed")
		private Boolean installed;
		/**
		 * isv 代码
		 */
		@ApiField("isv_code")
		private String isvCode;
		/**
		 * app版本
		 */
		@ApiField("version")
		private String version;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public Boolean getInstalled() {
			return this.installed;
		}
		public void setInstalled(Boolean installed) {
			this.installed = installed;
		}
		public String getIsvCode() {
			return this.isvCode;
		}
		public void setIsvCode(String isvCode) {
			this.isvCode = isvCode;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
	}
	

}