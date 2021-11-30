package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiDingpayPaymenttradeCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.paymenttrade.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.06
 */
public class OapiDingpayPaymenttradeCreateRequest extends BaseTaobaoRequest<OapiDingpayPaymenttradeCreateResponse> {
	
	

	/** 
	* 付款交易创建请求
	 */
	private String param;

	public void setParam(String param) {
		this.param = param;
	}

	public void setParam(PaymentTradeCreateOpenRequest param) {
		this.param = new JSONWriter(false,false,true).write(param);
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.paymenttrade.create";
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
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayPaymenttradeCreateResponse> getResponseClass() {
		return OapiDingpayPaymenttradeCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 收款方资金明细列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FundDetailInfo extends TaobaoObject {
		private static final long serialVersionUID = 3533541224319686768L;
		/**
		 * 交易金额（分）
		 */
		@ApiField("amount")
		private Long amount;
		/**
		 * 交易币种
		 */
		@ApiField("currency")
		private String currency;
		/**
		 * 资金工具摘要
		 */
		@ApiField("fundToolDigest")
		private String fundToolDigest;
		/**
		 * 账户类型（DA：钉钉账户、AA：支付宝账户、BC：银行卡）
		 */
		@ApiField("fundToolType")
		private String fundToolType;
		/**
		 * 资金明细说明，订单摘要信息
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 用户标识，收款主体，企业或个人钉钉标识
		 */
		@ApiField("userId")
		private String userId;
		/**
		 * 用户类型(B: 企业， C：个人)
		 */
		@ApiField("userType")
		private String userType;
	
		public Long getAmount() {
			return this.amount;
		}
		public void setAmount(Long amount) {
			this.amount = amount;
		}
		public String getCurrency() {
			return this.currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getFundToolDigest() {
			return this.fundToolDigest;
		}
		public void setFundToolDigest(String fundToolDigest) {
			this.fundToolDigest = fundToolDigest;
		}
		public String getFundToolType() {
			return this.fundToolType;
		}
		public void setFundToolType(String fundToolType) {
			this.fundToolType = fundToolType;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserType() {
			return this.userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
	}
	
	/**
	 * 业务信息资源符列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BusinessURI extends TaobaoObject {
		private static final long serialVersionUID = 6243398438412775665L;
		/**
		 * type
		 */
		@ApiField("type")
		private String type;
		/**
		 * 业务信息链接
		 */
		@ApiField("url")
		private String url;
	
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
	
	/**
	 * 业务信息，展示业务信息供付款时决策
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BusinessInfo extends TaobaoObject {
		private static final long serialVersionUID = 5658489977397585434L;
		/**
		 * 业务详情
		 */
		@ApiField("businessDetail")
		private String businessDetail;
		/**
		 * 业务信息类型(通用：GENERAL、审批：APPROVAL)
		 */
		@ApiField("businessType")
		private String businessType;
		/**
		 * 业务信息资源符列表
		 */
		@ApiListField("businessURIs")
		@ApiField("business_u_r_i")
		private List<BusinessURI> businessURIs;
	
		public String getBusinessDetail() {
			return this.businessDetail;
		}
		public void setBusinessDetail(String businessDetail) {
			this.businessDetail = businessDetail;
		}
		public String getBusinessType() {
			return this.businessType;
		}
		public void setBusinessType(String businessType) {
			this.businessType = businessType;
		}
		public List<BusinessURI> getBusinessURIs() {
			return this.businessURIs;
		}
		public void setBusinessURIs(List<BusinessURI> businessURIs) {
			this.businessURIs = businessURIs;
		}
	}
	
	/**
	 * 付款交易创建请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PaymentTradeCreateOpenRequest extends TaobaoObject {
		private static final long serialVersionUID = 5642235367882745227L;
		/**
		 * 业务日期（非必填），业务关联和对账使用
		 */
		@ApiField("businessDate")
		private Date businessDate;
		/**
		 * 业务信息，展示业务信息供付款时决策
		 */
		@ApiField("businessInfo")
		private BusinessInfo businessInfo;
		/**
		 * 业务流水号（必填），业务关联和对账使用，非幂等标识
		 */
		@ApiField("businessNo")
		private String businessNo;
		/**
		 * 创建人
		 */
		@ApiField("creator")
		private String creator;
		/**
		 * 订单说明
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 支付渠道
		 */
		@ApiField("payChannel")
		private String payChannel;
		/**
		 * 支付终端(PC、MOBILE)
		 */
		@ApiField("payTerminal")
		private String payTerminal;
		/**
		 * 收款方资金明细列表
		 */
		@ApiListField("payeeFundDetailInfos")
		@ApiField("fund_detail_info")
		private List<FundDetailInfo> payeeFundDetailInfos;
		/**
		 * 付款方ID，只有指定付款人时使用
		 */
		@ApiField("payerId")
		private String payerId;
		/**
		 * 交易请求标识（必填），幂等标识
		 */
		@ApiField("tradeRequestId")
		private String tradeRequestId;
		/**
		 * 交易抬头
		 */
		@ApiField("tradeTitle")
		private String tradeTitle;
	
		public Date getBusinessDate() {
			return this.businessDate;
		}
		public void setBusinessDate(Date businessDate) {
			this.businessDate = businessDate;
		}
		public BusinessInfo getBusinessInfo() {
			return this.businessInfo;
		}
		public void setBusinessInfo(BusinessInfo businessInfo) {
			this.businessInfo = businessInfo;
		}
		public String getBusinessNo() {
			return this.businessNo;
		}
		public void setBusinessNo(String businessNo) {
			this.businessNo = businessNo;
		}
		public String getCreator() {
			return this.creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public String getPayChannel() {
			return this.payChannel;
		}
		public void setPayChannel(String payChannel) {
			this.payChannel = payChannel;
		}
		public String getPayTerminal() {
			return this.payTerminal;
		}
		public void setPayTerminal(String payTerminal) {
			this.payTerminal = payTerminal;
		}
		public List<FundDetailInfo> getPayeeFundDetailInfos() {
			return this.payeeFundDetailInfos;
		}
		public void setPayeeFundDetailInfos(List<FundDetailInfo> payeeFundDetailInfos) {
			this.payeeFundDetailInfos = payeeFundDetailInfos;
		}
		public String getPayerId() {
			return this.payerId;
		}
		public void setPayerId(String payerId) {
			this.payerId = payerId;
		}
		public String getTradeRequestId() {
			return this.tradeRequestId;
		}
		public void setTradeRequestId(String tradeRequestId) {
			this.tradeRequestId = tradeRequestId;
		}
		public String getTradeTitle() {
			return this.tradeTitle;
		}
		public void setTradeTitle(String tradeTitle) {
			this.tradeTitle = tradeTitle;
		}
	}
	

}