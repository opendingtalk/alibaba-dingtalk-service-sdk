package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingpayBillBatchqueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.bill.batchquery request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiDingpayBillBatchqueryRequest extends BaseTaobaoRequest<OapiDingpayBillBatchqueryResponse> {
	
	

	/** 
	* 申请支付者userid
	 */
	private String applyPayOperatorUserid;

	/** 
	* INCOME收入、EXPENSE支出
	 */
	private String billCategory;

	/** 
	* 业务代码
	 */
	private String bizCode;

	/** 
	* 创单者userid
	 */
	private String createOperatorUserid;

	/** 
	* 扩展属性
	 */
	private String extension;

	/** 
	* 申请付款开始时间
	 */
	private Date gmtApplyPayBeginTime;

	/** 
	* 申请付款截止时间
	 */
	private Date gmtApplyPayEndTime;

	/** 
	* 创单开始时间
	 */
	private Date gmtCreateBeginTime;

	/** 
	* 创单截止时间
	 */
	private Date gmtCreateEndTime;

	/** 
	* 完成付款开始时间
	 */
	private Date gmtPayBeginTime;

	/** 
	* 完成付款截止时间
	 */
	private Date gmtPayEndTime;

	/** 
	* 最大金额（单位：分）
	 */
	private Long maxAmount;

	/** 
	* 最小金额（单位：分）
	 */
	private Long minAmount;

	/** 
	* 第一次调用传空，后面翻页根据上次response的nextKey回传
	 */
	private String nextKey;

	/** 
	* 页码，从1开始
	 */
	private Long pageNum;

	/** 
	* 每页大小
	 */
	private Long pageSize;

	/** 
	* 支付渠道列表
	 */
	private String payChannelList;

	/** 
	* 支付渠道方付款者实际出资UID
	 */
	private String payChannelPayerRealUid;

	/** 
	* 收款者corpId或者userId
	 */
	private String payeeId;

	/** 
	* 收款者类型
	 */
	private String payeeUserType;

	/** 
	* 付款者corpId或者userId
	 */
	private String payerId;

	/** 
	* 付款者类型
	 */
	private String payerUserType;

	/** 
	* 收款人账户类型
	 */
	private String receiptorTypeList;

	/** 
	* 查询的条目数
	 */
	private Long size;

	/** 
	* 状态列表
	 */
	private String statusList;

	/** 
	* 中止支付原因
	 */
	private String terminationReason;

	/** 
	* 标题
	 */
	private String title;

	public void setApplyPayOperatorUserid(String applyPayOperatorUserid) {
		this.applyPayOperatorUserid = applyPayOperatorUserid;
	}

	public String getApplyPayOperatorUserid() {
		return this.applyPayOperatorUserid;
	}

	public void setBillCategory(String billCategory) {
		this.billCategory = billCategory;
	}

	public String getBillCategory() {
		return this.billCategory;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setCreateOperatorUserid(String createOperatorUserid) {
		this.createOperatorUserid = createOperatorUserid;
	}

	public String getCreateOperatorUserid() {
		return this.createOperatorUserid;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public void setExtensionString(String extension) {
		this.extension = extension;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setGmtApplyPayBeginTime(Date gmtApplyPayBeginTime) {
		this.gmtApplyPayBeginTime = gmtApplyPayBeginTime;
	}

	public Date getGmtApplyPayBeginTime() {
		return this.gmtApplyPayBeginTime;
	}

	public void setGmtApplyPayEndTime(Date gmtApplyPayEndTime) {
		this.gmtApplyPayEndTime = gmtApplyPayEndTime;
	}

	public Date getGmtApplyPayEndTime() {
		return this.gmtApplyPayEndTime;
	}

	public void setGmtCreateBeginTime(Date gmtCreateBeginTime) {
		this.gmtCreateBeginTime = gmtCreateBeginTime;
	}

	public Date getGmtCreateBeginTime() {
		return this.gmtCreateBeginTime;
	}

	public void setGmtCreateEndTime(Date gmtCreateEndTime) {
		this.gmtCreateEndTime = gmtCreateEndTime;
	}

	public Date getGmtCreateEndTime() {
		return this.gmtCreateEndTime;
	}

	public void setGmtPayBeginTime(Date gmtPayBeginTime) {
		this.gmtPayBeginTime = gmtPayBeginTime;
	}

	public Date getGmtPayBeginTime() {
		return this.gmtPayBeginTime;
	}

	public void setGmtPayEndTime(Date gmtPayEndTime) {
		this.gmtPayEndTime = gmtPayEndTime;
	}

	public Date getGmtPayEndTime() {
		return this.gmtPayEndTime;
	}

	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Long getMaxAmount() {
		return this.maxAmount;
	}

	public void setMinAmount(Long minAmount) {
		this.minAmount = minAmount;
	}

	public Long getMinAmount() {
		return this.minAmount;
	}

	public void setNextKey(String nextKey) {
		this.nextKey = nextKey;
	}

	public String getNextKey() {
		return this.nextKey;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPayChannelList(String payChannelList) {
		this.payChannelList = payChannelList;
	}

	public String getPayChannelList() {
		return this.payChannelList;
	}

	public void setPayChannelPayerRealUid(String payChannelPayerRealUid) {
		this.payChannelPayerRealUid = payChannelPayerRealUid;
	}

	public String getPayChannelPayerRealUid() {
		return this.payChannelPayerRealUid;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayeeId() {
		return this.payeeId;
	}

	public void setPayeeUserType(String payeeUserType) {
		this.payeeUserType = payeeUserType;
	}

	public String getPayeeUserType() {
		return this.payeeUserType;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getPayerId() {
		return this.payerId;
	}

	public void setPayerUserType(String payerUserType) {
		this.payerUserType = payerUserType;
	}

	public String getPayerUserType() {
		return this.payerUserType;
	}

	public void setReceiptorTypeList(String receiptorTypeList) {
		this.receiptorTypeList = receiptorTypeList;
	}

	public String getReceiptorTypeList() {
		return this.receiptorTypeList;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
	}

	public String getStatusList() {
		return this.statusList;
	}

	public void setTerminationReason(String terminationReason) {
		this.terminationReason = terminationReason;
	}

	public String getTerminationReason() {
		return this.terminationReason;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.bill.batchquery";
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
		txtParams.put("apply_pay_operator_userid", this.applyPayOperatorUserid);
		txtParams.put("bill_category", this.billCategory);
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("create_operator_userid", this.createOperatorUserid);
		txtParams.put("extension", this.extension);
		txtParams.put("gmt_apply_pay_begin_time", this.gmtApplyPayBeginTime);
		txtParams.put("gmt_apply_pay_end_time", this.gmtApplyPayEndTime);
		txtParams.put("gmt_create_begin_time", this.gmtCreateBeginTime);
		txtParams.put("gmt_create_end_time", this.gmtCreateEndTime);
		txtParams.put("gmt_pay_begin_time", this.gmtPayBeginTime);
		txtParams.put("gmt_pay_end_time", this.gmtPayEndTime);
		txtParams.put("max_amount", this.maxAmount);
		txtParams.put("min_amount", this.minAmount);
		txtParams.put("next_key", this.nextKey);
		txtParams.put("page_num", this.pageNum);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pay_channel_list", this.payChannelList);
		txtParams.put("pay_channel_payer_real_uid", this.payChannelPayerRealUid);
		txtParams.put("payee_id", this.payeeId);
		txtParams.put("payee_user_type", this.payeeUserType);
		txtParams.put("payer_id", this.payerId);
		txtParams.put("payer_user_type", this.payerUserType);
		txtParams.put("receiptor_type_list", this.receiptorTypeList);
		txtParams.put("size", this.size);
		txtParams.put("status_list", this.statusList);
		txtParams.put("termination_reason", this.terminationReason);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayBillBatchqueryResponse> getResponseClass() {
		return OapiDingpayBillBatchqueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(payChannelList, 20, "payChannelList");
		RequestCheckUtils.checkMaxListSize(receiptorTypeList, 20, "receiptorTypeList");
		RequestCheckUtils.checkMaxListSize(statusList, 20, "statusList");
	}
	

}