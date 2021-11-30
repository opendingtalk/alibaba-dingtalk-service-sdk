package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.organization.dept.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmOrganizationDeptGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7828415388183231112L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果集
	 */
	@ApiField("result")
	private OrgDeptVO result;

	/** 
	 * 成功标记
	 */
	@ApiField("success")
	private Boolean success;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(OrgDeptVO result) {
		this.result = result;
	}
	public OrgDeptVO getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 属性值列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgDeptAttributeVo extends TaobaoObject {
		private static final long serialVersionUID = 2682651444922524959L;
		/**
		 * 字段code
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段value
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
	
	/**
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgDeptVO extends TaobaoObject {
		private static final long serialVersionUID = 1742775791574174648L;
		/**
		 * 属性值列表
		 */
		@ApiListField("attribute_list")
		@ApiField("org_dept_attribute_vo")
		private List<OrgDeptAttributeVo> attributeList;
		/**
		 * 部门id
		 */
		@ApiField("dept_id")
		private Long deptId;
	
		public List<OrgDeptAttributeVo> getAttributeList() {
			return this.attributeList;
		}
		public void setAttributeList(List<OrgDeptAttributeVo> attributeList) {
			this.attributeList = attributeList;
		}
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
	}
	


}
