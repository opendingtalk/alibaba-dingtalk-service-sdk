package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiAlitripBtripInvoiceSettingModifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.invoice.setting.modify request
 * 
 * @author top auto create
 * @since 1.0, 2020.11.30
 */
public class OapiAlitripBtripInvoiceSettingModifyRequest extends BaseTaobaoRequest<OapiAlitripBtripInvoiceSettingModifyResponse> {
	
	

	/** 
	* 入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(OpenInvoiceModifyAndNewRq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.invoice.setting.modify";
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
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripInvoiceSettingModifyResponse> getResponseClass() {
		return OapiAlitripBtripInvoiceSettingModifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenInvoiceModifyAndNewRq extends TaobaoObject {
		private static final long serialVersionUID = 4669314834619234724L;
		/**
		 * 注册地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 开户行
		 */
		@ApiField("bank_name")
		private String bankName;
		/**
		 * 银行账号
		 */
		@ApiField("bank_no")
		private String bankNo;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 税号
		 */
		@ApiField("tax_no")
		private String taxNo;
		/**
		 * 公司电话
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * 第三方发票id
		 */
		@ApiField("third_part_id")
		private String thirdPartId;
		/**
		 * 发票抬头
		 */
		@ApiField("title")
		private String title;
		/**
		 * 类型，1:增值税普通发票,2:增值税专用发票
		 */
		@ApiField("type")
		private Long type;
	
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBankName() {
			return this.bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getBankNo() {
			return this.bankNo;
		}
		public void setBankNo(String bankNo) {
			this.bankNo = bankNo;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public String getTaxNo() {
			return this.taxNo;
		}
		public void setTaxNo(String taxNo) {
			this.taxNo = taxNo;
		}
		public String getTel() {
			return this.tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getThirdPartId() {
			return this.thirdPartId;
		}
		public void setThirdPartId(String thirdPartId) {
			this.thirdPartId = thirdPartId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	

}