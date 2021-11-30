package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRhinoHumanresEmployeeProcessCapacityQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.humanres.employee.process.capacity.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.06
 */
public class OapiRhinoHumanresEmployeeProcessCapacityQueryRequest extends BaseTaobaoRequest<OapiRhinoHumanresEmployeeProcessCapacityQueryResponse> {
	
	

	/** 
	* 1
	 */
	private String category;

	/** 
	* 1
	 */
	private String processStructuralClusterIdList;

	/** 
	* 1
	 */
	private String tenantId;

	/** 
	* 1
	 */
	private String userid;

	/** 
	* 1
	 */
	private String workNos;

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return this.category;
	}

	public void setProcessStructuralClusterIdList(String processStructuralClusterIdList) {
		this.processStructuralClusterIdList = processStructuralClusterIdList;
	}

	public String getProcessStructuralClusterIdList() {
		return this.processStructuralClusterIdList;
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

	public void setWorkNos(String workNos) {
		this.workNos = workNos;
	}

	public String getWorkNos() {
		return this.workNos;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.rhino.humanres.employee.process.capacity.query";
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
		txtParams.put("category", this.category);
		txtParams.put("process_structural_cluster_id_list", this.processStructuralClusterIdList);
		txtParams.put("tenant_id", this.tenantId);
		txtParams.put("userid", this.userid);
		txtParams.put("work_nos", this.workNos);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRhinoHumanresEmployeeProcessCapacityQueryResponse> getResponseClass() {
		return OapiRhinoHumanresEmployeeProcessCapacityQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(processStructuralClusterIdList, 20, "processStructuralClusterIdList");
		RequestCheckUtils.checkMaxListSize(workNos, 20, "workNos");
	}
	

}