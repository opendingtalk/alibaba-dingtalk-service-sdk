package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiRhinoMosExecPerformRepairResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.perform.repair request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.18
 */
public class OapiRhinoMosExecPerformRepairRequest extends BaseTaobaoRequest<OapiRhinoMosExecPerformRepairResponse> {
	
	

	/** 
	* 系统参数
	 */
	private String corpId;

	/** 
	* 系统参数
	 */
	private Long isvOrgId;

	/** 
	* 系统参数
	 */
	private Long orgId;

	/** 
	* 要返修的工序
	 */
	private String repairOperations;

	/** 
	* 系统参数
	 */
	private String suiteKey;

	/** 
	* 系统参数
	 */
	private Long tokenGrantType;

	/** 
	* 系统参数
	 */
	private String userId;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setIsvOrgId(Long isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

	public Long getIsvOrgId() {
		return this.isvOrgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getOrgId() {
		return this.orgId;
	}

	public void setRepairOperations(String repairOperations) {
		this.repairOperations = repairOperations;
	}

	public void setRepairOperations(List<RepairOperation> repairOperations) {
		this.repairOperations = new JSONWriter(false,false,true).write(repairOperations);
	}

	public String getRepairOperations() {
		return this.repairOperations;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public void setTokenGrantType(Long tokenGrantType) {
		this.tokenGrantType = tokenGrantType;
	}

	public Long getTokenGrantType() {
		return this.tokenGrantType;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.mos.exec.perform.repair";
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
		txtParams.put("corp_id", this.corpId);
		txtParams.put("isv_org_id", this.isvOrgId);
		txtParams.put("org_id", this.orgId);
		txtParams.put("repair_operations", this.repairOperations);
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("token_grant_type", this.tokenGrantType);
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoMosExecPerformRepairResponse> getResponseClass() {
		return OapiRhinoMosExecPerformRepairResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(repairOperations, 500, "repairOperations");
	}
	
	/**
	 * 要返修的工序
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RepairOperation extends TaobaoObject {
		private static final long serialVersionUID = 3161224839118413561L;
		/**
		 * 上下文
		 */
		@ApiField("context")
		private String context;
		/**
		 * 工序ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 优先级
		 */
		@ApiField("priority")
		private Long priority;
		/**
		 * 返修工位
		 */
		@ApiListField("workstation_codes")
		@ApiField("string")
		private List<String> workstationCodes;
	
		public String getContext() {
			return this.context;
		}
		public void setContext(String context) {
			this.context = context;
		}
		public void setContextString(String context) {
			this.context = context;
		}
		
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getPriority() {
			return this.priority;
		}
		public void setPriority(Long priority) {
			this.priority = priority;
		}
		public List<String> getWorkstationCodes() {
			return this.workstationCodes;
		}
		public void setWorkstationCodes(List<String> workstationCodes) {
			this.workstationCodes = workstationCodes;
		}
	}
	

}