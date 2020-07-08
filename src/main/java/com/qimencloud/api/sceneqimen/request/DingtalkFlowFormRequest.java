package com.qimencloud.api.sceneqimen.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiBodyField;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.json.JSONWriter;

import com.qimencloud.api.sceneqimen.response.DingtalkFlowFormResponse;

/**
 * TOP API(QimenCloud): qimen.dingtalk.flow.form request
 * 
 * @author top auto create
 * @since 1.0, 2018.12.14
 */
public class DingtalkFlowFormRequest extends BaseTaobaoRequest<DingtalkFlowFormResponse> {
     
     

	/** 
	* 表单渲染动作：RENDER, UPDATE, SUBMIT, 分别对应表单的初始化，内容更新以及提交前检查
	 */
	@ApiBodyField(value = "",fieldName = "action")
	private String action;

	/** 
	* 钉钉企业ID
	 */
	@ApiBodyField(value = "",fieldName = "corpId")
	private String corpId;

	/** 
	* 表单数据
	 */
	@ApiBodyField(value = "object",fieldName = "form")
	private String form;

	/** 
	* 审批模板唯一编码
	 */
	@ApiBodyField(value = "",fieldName = "processCode")
	private String processCode;

	/** 
	* 员工ID
	 */
	@ApiBodyField(value = "",fieldName = "userId")
	private String userId;

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public void setForm(RequestFormData form) {
		this.form = new JSONWriter(false,false,true).write(form);
	}

	public String getForm() {
		return this.form;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

     public String getApiMethodName() {
        return "qimen.dingtalk.flow.form";
     }

     private String topContentType = Constants.CONTENT_TYPE_JSON;

     public String getTopContentType() {
        return topContentType;
     }

     public void setTopContentType(String topContentType) {
         this.topContentType = topContentType;
     }

     private String topResponseType = Constants.RESPONSE_TYPE_QIMEN2;

     public String getTopResponseType() {
        return topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

    private String topApiVersion = "3.0";

     public String getTopApiVersion() {
        return this.topApiVersion;
     }

     public void setTopApiVersion(String topApiVersion) {
        this.topApiVersion = topApiVersion;
     }

     private String topApiFormat = Constants.FORMAT_JSON2;

     public String getTopApiFormat() {
     	return this.topApiFormat;
     }

     public void setTopApiFormat(String topApiFormat) {
     	this.topApiFormat = topApiFormat;
     }
     
     public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
     
     public Class<DingtalkFlowFormResponse> getResponseClass() {
		return DingtalkFlowFormResponse.class;
	}

     public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(action, "action");
		RequestCheckUtils.checkNotEmpty(corpId, "corpId");
		RequestCheckUtils.checkNotEmpty(processCode, "processCode");
		RequestCheckUtils.checkNotEmpty(userId, "userId");
     }
     
	/**
 * 表单属性
 *
 * @author top auto create
 * @since 1.0, null
 */
 
public static class RequestFormItemProperty {

	/**
		 * 表单控件别名
		 */
		@ApiField("bizAlias")
		private String bizAlias;
	

	public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}

}

	/**
 * 表单数据
 *
 * @author top auto create
 * @since 1.0, null
 */
 
public static class RequestFormItem {

	/**
		 * 表单项扩展数据
		 */
		@ApiField("extValue")
		private String extValue;
		/**
		 * 表单属性
		 */
		@ApiField("props")
		private RequestFormItemProperty props;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	

	public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
		public RequestFormItemProperty getProps() {
			return this.props;
		}
		public void setProps(RequestFormItemProperty props) {
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
 
public static class RequestFormData {

	/**
		 * 发生变化的 bizAlias
		 */
		@ApiField("changedItem")
		private String changedItem;
		/**
		 * 表单数据
		 */
		@ApiListField("items")
		@ApiField("request_form_item")
		private List<RequestFormItem> items;
	

	public String getChangedItem() {
			return this.changedItem;
		}
		public void setChangedItem(String changedItem) {
			this.changedItem = changedItem;
		}
		public List<RequestFormItem> getItems() {
			return this.items;
		}
		public void setItems(List<RequestFormItem> items) {
			this.items = items;
		}

}



}