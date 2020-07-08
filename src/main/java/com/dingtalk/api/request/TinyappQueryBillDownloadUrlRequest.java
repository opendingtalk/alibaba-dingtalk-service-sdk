package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.TinyappQueryBillDownloadUrlResponse;

/**
 * TOP DingTalk-API: dingtalk.tinyapp.query.bill.download.url request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.02
 */
public class TinyappQueryBillDownloadUrlRequest extends BaseTaobaoRequest<TinyappQueryBillDownloadUrlResponse> {
	
	

	/** 
	* 请求体
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(QueryBillDownloadUrlTinyAppOpenRequest param) {
		this.param = new JSONWriter(false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.tinyapp.query.bill.download.url";
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

	public Class<TinyappQueryBillDownloadUrlResponse> getResponseClass() {
		return TinyappQueryBillDownloadUrlResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 请求体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class QueryBillDownloadUrlTinyAppOpenRequest extends TaobaoObject {
		private static final long serialVersionUID = 5337547434339334969L;
		/**
		 * 账单日期，格式：yyyMMdd
		 */
		@ApiField("bill_date")
		private Date billDate;
		/**
		 * 业务码
		 */
		@ApiField("biz_code")
		private String bizCode;
	
		public Date getBillDate() {
			return this.billDate;
		}
		public void setBillDate(Date billDate) {
			this.billDate = billDate;
		}
		public String getBizCode() {
			return this.bizCode;
		}
		public void setBizCode(String bizCode) {
			this.bizCode = bizCode;
		}
	}
	

}