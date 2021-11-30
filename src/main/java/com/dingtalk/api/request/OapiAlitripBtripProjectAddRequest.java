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
import com.dingtalk.api.response.OapiAlitripBtripProjectAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.project.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.04
 */
public class OapiAlitripBtripProjectAddRequest extends BaseTaobaoRequest<OapiAlitripBtripProjectAddResponse> {
	
	

	/** 
	* 入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(OpenProjectRs request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.project.add";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripProjectAddResponse> getResponseClass() {
		return OapiAlitripBtripProjectAddResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenProjectRs extends TaobaoObject {
		private static final long serialVersionUID = 5118794382911382331L;
		/**
		 * 项目代码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 项目名称
		 */
		@ApiField("project_name")
		private String projectName;
		/**
		 * 第三方成本中心id
		 */
		@ApiField("third_part_cost_center_id")
		private String thirdPartCostCenterId;
		/**
		 * 第三方项目id
		 */
		@ApiField("third_part_id")
		private String thirdPartId;
		/**
		 * 第三方发票id
		 */
		@ApiField("third_part_invoice_id")
		private String thirdPartInvoiceId;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getProjectName() {
			return this.projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getThirdPartCostCenterId() {
			return this.thirdPartCostCenterId;
		}
		public void setThirdPartCostCenterId(String thirdPartCostCenterId) {
			this.thirdPartCostCenterId = thirdPartCostCenterId;
		}
		public String getThirdPartId() {
			return this.thirdPartId;
		}
		public void setThirdPartId(String thirdPartId) {
			this.thirdPartId = thirdPartId;
		}
		public String getThirdPartInvoiceId() {
			return this.thirdPartInvoiceId;
		}
		public void setThirdPartInvoiceId(String thirdPartInvoiceId) {
			this.thirdPartInvoiceId = thirdPartInvoiceId;
		}
	}
	

}