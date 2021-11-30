package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.organization.dept.meta.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmOrganizationDeptMetaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2292151586397229972L;

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
	@ApiListField("result")
	@ApiField("org_ext_meta")
	private List<OrgExtMeta> result;

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

	public void setResult(List<OrgExtMeta> result) {
		this.result = result;
	}
	public List<OrgExtMeta> getResult( ) {
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
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgExtOption extends TaobaoObject {
		private static final long serialVersionUID = 8429124973836522863L;
		/**
		 * 选项的key
		 */
		@ApiField("key")
		private String key;
		/**
		 * 选项文本
		 */
		@ApiField("text")
		private String text;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
	
	/**
	 * 结果集
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgExtMeta extends TaobaoObject {
		private static final long serialVersionUID = 5773376137524781891L;
		/**
		 * 结果集
		 */
		@ApiListField("ext_options")
		@ApiField("org_ext_option")
		private List<OrgExtOption> extOptions;
		/**
		 * 字段code
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段名称
		 */
		@ApiField("field_name")
		private String fieldName;
	
		public List<OrgExtOption> getExtOptions() {
			return this.extOptions;
		}
		public void setExtOptions(List<OrgExtOption> extOptions) {
			this.extOptions = extOptions;
		}
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getFieldName() {
			return this.fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
	}
	


}
