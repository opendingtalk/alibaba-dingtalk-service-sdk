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

import com.dingtalk.api.response.OapiSmartworkHrmOrganizationDeptGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.organization.dept.get request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.19
 */
public class OapiSmartworkHrmOrganizationDeptGetRequest extends BaseTaobaoRequest<OapiSmartworkHrmOrganizationDeptGetResponse> {
	
	

	/** 
	* 部门ID
	 */
	private Long deptId;

	/** 
	* 字段 code 列表
	 */
	private String fieldCodeList;

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setFieldCodeList(String fieldCodeList) {
		this.fieldCodeList = fieldCodeList;
	}

	public String getFieldCodeList() {
		return this.fieldCodeList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.organization.dept.get";
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
		txtParams.put("dept_id", this.deptId);
		txtParams.put("field_code_list", this.fieldCodeList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmOrganizationDeptGetResponse> getResponseClass() {
		return OapiSmartworkHrmOrganizationDeptGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deptId, "deptId");
		RequestCheckUtils.checkNotEmpty(fieldCodeList, "fieldCodeList");
		RequestCheckUtils.checkMaxListSize(fieldCodeList, 999, "fieldCodeList");
	}
	

}