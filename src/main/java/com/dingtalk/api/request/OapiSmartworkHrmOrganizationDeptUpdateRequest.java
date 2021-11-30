package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiSmartworkHrmOrganizationDeptUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.organization.dept.update request
 * 
 * @author top auto create
 * @since 1.0, 2021.02.24
 */
public class OapiSmartworkHrmOrganizationDeptUpdateRequest extends BaseTaobaoRequest<OapiSmartworkHrmOrganizationDeptUpdateResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String attributeVOS;

	/** 
	* 部门ID
	 */
	private Long deptId;

	public void setAttributeVOS(String attributeVOS) {
		this.attributeVOS = attributeVOS;
	}

	public void setAttributeVOS(List<OrgDeptAttributeVo> attributeVOS) {
		this.attributeVOS = new JSONWriter(false,false,true).write(attributeVOS);
	}

	public String getAttributeVOS() {
		return this.attributeVOS;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.smartwork.hrm.organization.dept.update";
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
		txtParams.put("attributeVOS", this.attributeVOS);
		txtParams.put("dept_id", this.deptId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSmartworkHrmOrganizationDeptUpdateResponse> getResponseClass() {
		return OapiSmartworkHrmOrganizationDeptUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(attributeVOS, 999, "attributeVOS");
		RequestCheckUtils.checkNotEmpty(deptId, "deptId");
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgDeptAttributeVo extends TaobaoObject {
		private static final long serialVersionUID = 2856938311425412711L;
		/**
		 * 字段code
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段值
		 */
		@ApiField("field_value")
		private String fieldValue;
	
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getFieldValue() {
			return this.fieldValue;
		}
		public void setFieldValue(String fieldValue) {
			this.fieldValue = fieldValue;
		}
	}
	

}