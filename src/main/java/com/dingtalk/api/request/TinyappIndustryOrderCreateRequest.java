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
import com.dingtalk.api.response.TinyappIndustryOrderCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.tinyapp.industry.order.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.09.29
 */
public class TinyappIndustryOrderCreateRequest extends BaseTaobaoRequest<TinyappIndustryOrderCreateResponse> {
	
	

	/** 
	* 请求参数体
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(CreateIndustryOrderTinyAppOpenRequest param) {
		this.param = new JSONWriter(false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.tinyapp.industry.order.create";
	}

	private String topResponseType ;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_TOP;
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TinyappIndustryOrderCreateResponse> getResponseClass() {
		return TinyappIndustryOrderCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求参数体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateIndustryOrderTinyAppOpenRequest extends TaobaoObject {
		private static final long serialVersionUID = 5619336345935693934L;
		/**
		 * 金额(分)
		 */
		@ApiField("amount")
		private Long amount;
		/**
		 * 业务码，钉钉统一分配
		 */
		@ApiField("biz_code")
		private String bizCode;
		/**
		 * 产品码
		 */
		@ApiField("biz_prod_id")
		private String bizProdId;
		/**
		 * 扩展信息
		 */
		@ApiField("extension")
		private String extension;
		/**
		 * 外部流水号
		 */
		@ApiField("out_biz_no")
		private String outBizNo;
	
		public Long getAmount() {
			return this.amount;
		}
		public void setAmount(Long amount) {
			this.amount = amount;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
		public String getBizProdId() {
			return this.bizProdId;
		}
		public void setBizProdId(String bizProdId) {
			this.bizProdId = bizProdId;
		}
		public String getExtension() {
			return this.extension;
		}
		public void setExtension(String extension) {
			this.extension = extension;
		}
		public String getOutBizNo() {
			return this.outBizNo;
		}
		public void setOutBizNo(String outBizNo) {
			this.outBizNo = outBizNo;
		}
	}
	

}