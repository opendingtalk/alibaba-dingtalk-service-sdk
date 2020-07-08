package com.qimencloud.api.sceneqimen.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API(QimenCloud): dingtalk.flow.form response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DingtalkFlowFormResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8598761549122582792L;

	/** 
	 * 表单数据以及默认选项等
	 */
	@ApiField("data")
	private ResponseFormData data;

	/** 
	 * 返回错误码
	 */
	@ApiField("resultCode")
	private String resultCode;

	/** 
	 * 返回错误消息
	 */
	@ApiField("resultMessage")
	private String resultMessage;

	/** 
	 * 业务是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setData(ResponseFormData data) {
		this.data = data;
	}
	public ResponseFormData getData( ) {
		return this.data;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}
	
	/**
 * 表单属性
 *
 * @author top auto create
 * @since 1.0, null
 */
 
public static class ResponseFormItemProperty {

	/**
		 * 表单控件别名
		 */
		@ApiField("bizAlias")
		private String bizAlias;
		/**
		 * 是否不可编辑
		 */
		@ApiField("disable")
		private Boolean disable;
		/**
		 * 是否不可见
		 */
		@ApiField("hidden")
		private Boolean hidden;
		/**
		 * 表单控件 label
		 */
		@ApiField("label")
		private String label;
		/**
		 * 选择框的选项列表，只有选择框需要此属性
		 */
		@ApiField("options")
		private String options;
	

	public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public Boolean getDisable() {
			return this.disable;
		}
		public void setDisable(Boolean disable) {
			this.disable = disable;
		}
		public Boolean getHidden() {
			return this.hidden;
		}
		public void setHidden(Boolean hidden) {
			this.hidden = hidden;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getOptions() {
			return this.options;
		}
		public void setOptions(String options) {
			this.options = options;
		}

}

	/**
 * 表单属性
 *
 * @author top auto create
 * @since 1.0, null
 */
 
public static class ResponseChildFormItemProperty {

	/**
		 * 是否不可编辑
		 */
		@ApiField("disable")
		private Boolean disable;
		/**
		 * 表单控件 label
		 */
		@ApiField("label")
		private String label;
	

	public Boolean getDisable() {
			return this.disable;
		}
		public void setDisable(Boolean disable) {
			this.disable = disable;
		}
		public String getLabel() {
			return this.label;
		}
		public void setLabel(String label) {
			this.label = label;
		}

}

	/**
 * 明细组件，没有使用该控件则忽略
 *
 * @author top auto create
 * @since 1.0, null
 */
 
public static class ResponseChildFormItem {

	/**
		 * 表单控件别名
		 */
		@ApiField("bizAlias")
		private String bizAlias;
		/**
		 * 扩展属性，譬如联系人的通讯录信息
		 */
		@ApiField("extValue")
		private String extValue;
		/**
		 * 表单属性
		 */
		@ApiField("props")
		private ResponseChildFormItemProperty props;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	

	public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
		public ResponseChildFormItemProperty getProps() {
			return this.props;
		}
		public void setProps(ResponseChildFormItemProperty props) {
			this.props = props;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}

}

	/**
 * 表单数据
 *
 * @author top auto create
 * @since 1.0, null
 */
 
public static class ResponseFormItem {

	/**
		 * 明细组件，没有使用该控件则忽略
		 */
		@ApiListField("children")
		@ApiField("response_child_form_item")
		private List<ResponseChildFormItem> children;
		/**
		 * 扩展属性，譬如联系人的通讯录信息
		 */
		@ApiField("extValue")
		private String extValue;
		/**
		 * 表单属性
		 */
		@ApiField("props")
		private ResponseFormItemProperty props;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	

	public List<ResponseChildFormItem> getChildren() {
			return this.children;
		}
		public void setChildren(List<ResponseChildFormItem> children) {
			this.children = children;
		}
		public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
		public ResponseFormItemProperty getProps() {
			return this.props;
		}
		public void setProps(ResponseFormItemProperty props) {
			this.props = props;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}

}

	/**
 * 表单数据以及默认选项等
 *
 * @author top auto create
 * @since 1.0, null
 */
 
public static class ResponseFormData {

	/**
		 * 表单数据
		 */
		@ApiListField("items")
		@ApiField("response_form_item")
		private List<ResponseFormItem> items;
		/**
		 * 需要联动的表单项别名(bizAlias)
		 */
		@ApiField("linkageFormItems")
		private String linkageFormItems;
	

	public List<ResponseFormItem> getItems() {
			return this.items;
		}
		public void setItems(List<ResponseFormItem> items) {
			this.items = items;
		}
		public String getLinkageFormItems() {
			return this.linkageFormItems;
		}
		public void setLinkageFormItems(String linkageFormItems) {
			this.linkageFormItems = linkageFormItems;
		}

}



}
