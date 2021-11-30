package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiV2DepartmentListsubResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.v2.department.listsub request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.13
 */
public class OapiV2DepartmentListsubRequest extends BaseTaobaoRequest<OapiV2DepartmentListsubResponse> {
	
	

	/** 
	* 父部门id（如果不传，默认部门为根部门，根部门ID为1）,只支持查询下一级子部门，不支持查询多级子部门
	 */
	private Long deptId;

	/** 
	* 通讯录语言（默认zh_CN，未来会支持en_US）
	 */
	private String language;

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return this.language;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.v2.department.listsub";
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
		txtParams.put("language", this.language);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiV2DepartmentListsubResponse> getResponseClass() {
		return OapiV2DepartmentListsubResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}