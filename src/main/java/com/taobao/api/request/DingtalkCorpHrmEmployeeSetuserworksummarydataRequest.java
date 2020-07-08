package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.DingtalkCorpHrmEmployeeSetuserworksummarydataResponse;

/**
 * TOP API: dingtalk.corp.hrm.employee.setuserworksummarydata request
 * 
 * @author top auto create
 * @since 1.0, 2018.04.17
 */
public class DingtalkCorpHrmEmployeeSetuserworksummarydataRequest extends BaseTaobaoRequest<DingtalkCorpHrmEmployeeSetuserworksummarydataResponse> {
	
	

	/** 
	* corp_id
	 */
	private String corpId;

	/** 
	* 员工信息对象，被操作人userid是必填
	 */
	private String hrmApiUserDataModel;

	/** 
	* isv_org_id
	 */
	private Long isvOrgId;

	/** 
	* 操作人userid，必须是拥有被操作人操作权限的管理员userid
	 */
	private String opUserId;

	/** 
	* org_id
	 */
	private Long orgId;

	/** 
	* suite_key
	 */
	private String suiteKey;

	/** 
	* token_grant_type
	 */
	private Long tokenGrantType;

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setHrmApiUserDataModel(String hrmApiUserDataModel) {
		this.hrmApiUserDataModel = hrmApiUserDataModel;
	}

	public void setHrmApiUserDataModel(HrmApiUserDataModel hrmApiUserDataModel) {
		this.hrmApiUserDataModel = new JSONWriter(false,true).write(hrmApiUserDataModel);
	}

	public String getHrmApiUserDataModel() {
		return this.hrmApiUserDataModel;
	}

	public void setIsvOrgId(Long isvOrgId) {
		this.isvOrgId = isvOrgId;
	}

	public Long getIsvOrgId() {
		return this.isvOrgId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getOrgId() {
		return this.orgId;
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

	public String getApiMethodName() {
		return "dingtalk.corp.hrm.employee.setuserworksummarydata";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("corp_id", this.corpId);
		txtParams.put("hrm_api_user_data_model", this.hrmApiUserDataModel);
		txtParams.put("isv_org_id", this.isvOrgId);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("org_id", this.orgId);
		txtParams.put("suite_key", this.suiteKey);
		txtParams.put("token_grant_type", this.tokenGrantType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DingtalkCorpHrmEmployeeSetuserworksummarydataResponse> getResponseClass() {
		return DingtalkCorpHrmEmployeeSetuserworksummarydataResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpId, "corpId");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(orgId, "orgId");
		RequestCheckUtils.checkNotEmpty(tokenGrantType, "tokenGrantType");
	}
	
	/**
 * 员工信息对象，被操作人userid是必填
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class HrmApiUserDataModel extends TaobaoObject {

	private static final long serialVersionUID = 7793747858879792439L;

	/**
		 * 数据说明,可选
		 */
		@ApiField("data_desc")
		private String dataDesc;
		/**
		 * 数据值,可以是数值或文字
		 */
		@ApiField("data_value")
		private String dataValue;
		/**
		 * 被操作人userid
		 */
		@ApiField("user_id")
		private String userId;
	

	public String getDataDesc() {
			return this.dataDesc;
		}
		public void setDataDesc(String dataDesc) {
			this.dataDesc = dataDesc;
		}
		public String getDataValue() {
			return this.dataValue;
		}
		public void setDataValue(String dataValue) {
			this.dataValue = dataValue;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}

}


}