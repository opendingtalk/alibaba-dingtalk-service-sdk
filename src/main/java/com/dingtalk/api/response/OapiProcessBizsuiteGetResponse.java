package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.process.bizsuite.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiProcessBizsuiteGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6321793443657669383L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 出参
	 */
	@ApiField("result")
	private BaseSuiteResponse result;

	/** 
	 * 成功失败
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

	public void setResult(BaseSuiteResponse result) {
		this.result = result;
	}
	public BaseSuiteResponse getResult( ) {
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
	 * 组件属性值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FormDataResponseVO extends TaobaoObject {
		private static final long serialVersionUID = 4441962133658296859L;
		/**
		 * 表单组件别名
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 表单组件扩展字段
		 */
		@ApiField("extend_value")
		private String extendValue;
		/**
		 * 表单组件key
		 */
		@ApiField("key")
		private String key;
		/**
		 * 表单组件标签
		 */
		@ApiField("lable")
		private String lable;
		/**
		 * 表单组件值
		 */
		@ApiField("value")
		private String value;
	
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public String getExtendValue() {
			return this.extendValue;
		}
		public void setExtendValue(String extendValue) {
			this.extendValue = extendValue;
		}
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getLable() {
			return this.lable;
		}
		public void setLable(String lable) {
			this.lable = lable;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 出参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseSuiteResponse extends TaobaoObject {
		private static final long serialVersionUID = 6778243672151622353L;
		/**
		 * 组件属性值
		 */
		@ApiListField("form_data_list")
		@ApiField("form_data_response_v_o")
		private List<FormDataResponseVO> formDataList;
		/**
		 * 组件属性值
		 */
		@ApiField("seq_id")
		private Long seqId;
	
		public List<FormDataResponseVO> getFormDataList() {
			return this.formDataList;
		}
		public void setFormDataList(List<FormDataResponseVO> formDataList) {
			this.formDataList = formDataList;
		}
		public Long getSeqId() {
			return this.seqId;
		}
		public void setSeqId(Long seqId) {
			this.seqId = seqId;
		}
	}
	


}
