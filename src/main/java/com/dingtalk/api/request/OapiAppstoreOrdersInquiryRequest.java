package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAppstoreOrdersInquiryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.orders.inquiry request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.20
 */
public class OapiAppstoreOrdersInquiryRequest extends BaseTaobaoRequest<OapiAppstoreOrdersInquiryResponse> {
	
	

	/** 
	* 询价企业id
	 */
	private String corpid;

	/** 
	* 订购周期数量
	 */
	private Long cycNum;

	/** 
	* 订购周期单位
	 */
	private Long cycUnit;

	/** 
	* 商品码
	 */
	private String goodsCode;

	/** 
	* 规格码
	 */
	private String itemCode;

	/** 
	* 询价用户手机号
	 */
	private String mobile;

	/** 
	* 订购人数
	 */
	private Long quantity;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setCycNum(Long cycNum) {
		this.cycNum = cycNum;
	}

	public Long getCycNum() {
		return this.cycNum;
	}

	public void setCycUnit(Long cycUnit) {
		this.cycUnit = cycUnit;
	}

	public Long getCycUnit() {
		return this.cycUnit;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.appstore.orders.inquiry";
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
		txtParams.put("corpid", this.corpid);
		txtParams.put("cyc_num", this.cycNum);
		txtParams.put("cyc_unit", this.cycUnit);
		txtParams.put("goods_code", this.goodsCode);
		txtParams.put("item_code", this.itemCode);
		txtParams.put("mobile", this.mobile);
		txtParams.put("quantity", this.quantity);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAppstoreOrdersInquiryResponse> getResponseClass() {
		return OapiAppstoreOrdersInquiryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpid, "corpid");
		RequestCheckUtils.checkNotEmpty(cycNum, "cycNum");
		RequestCheckUtils.checkNotEmpty(cycUnit, "cycUnit");
		RequestCheckUtils.checkNotEmpty(goodsCode, "goodsCode");
		RequestCheckUtils.checkNotEmpty(itemCode, "itemCode");
		RequestCheckUtils.checkNotEmpty(mobile, "mobile");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
	}
	

}