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

import com.dingtalk.api.response.OapiSmartworkHrmEmployeeV2ListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.employee.v2.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.09
 */
public class OapiSmartworkHrmEmployeeV2ListRequest extends BaseTaobaoRequest<OapiSmartworkHrmEmployeeV2ListResponse> {
	
	

	/** 
	* 微应用在企业的agentId
	 */
	private Long agentid;

	/** 
	* 需要获取的花名册字段信息(不传值时，企业调用获取全部字段，ISV调用获取所有有权限字段。查询字段越少，RT越低，建议按需查询)
	 */
	private String fieldFilterList;

	/** 
	* 员工id列表
	 */
	private String useridList;

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getAgentid() {
		return this.agentid;
	}

	public void setFieldFilterList(String fieldFilterList) {
		this.fieldFilterList = fieldFilterList;
	}

	public String getFieldFilterList() {
		return this.fieldFilterList;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.employee.v2.list";
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
		txtParams.put("agentid", this.agentid);
		txtParams.put("field_filter_list", this.fieldFilterList);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmEmployeeV2ListResponse> getResponseClass() {
		return OapiSmartworkHrmEmployeeV2ListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentid, "agentid");
		RequestCheckUtils.checkMaxListSize(fieldFilterList, 100, "fieldFilterList");
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 100, "useridList");
	}
	

}