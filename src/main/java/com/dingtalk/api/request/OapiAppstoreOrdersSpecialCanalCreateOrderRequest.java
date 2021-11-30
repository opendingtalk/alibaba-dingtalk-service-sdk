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

import com.dingtalk.api.response.OapiAppstoreOrdersSpecialCanalCreateOrderResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.appstore.orders.special_canal.create_order request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.20
 */
public class OapiAppstoreOrdersSpecialCanalCreateOrderRequest extends BaseTaobaoRequest<OapiAppstoreOrdersSpecialCanalCreateOrderResponse> {
	
	

	/** 
	* 下单企业id
	 */
	private String corpid;

	/** 
	* 订购周期数量
	 */
	private String cycNum;

	/** 
	* 订购的周期单位：1-年，2-月，3-日
	 */
	private String cycUnit;

	/** 
	* 商品码
	 */
	private String goodsCode;

	/** 
	* 规格码
	 */
	private String itemCode;

	/** 
	* 下单人手机号
	 */
	private String mobile;

	/** 
	* 联通订单id
	 */
	private String orderCenterId;

	/** 
	* 订购价格
	 */
	private String price;

	/** 
	* 订购数量
	 */
	private String quantity;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setCycNum(String cycNum) {
		this.cycNum = cycNum;
	}

	public String getCycNum() {
		return this.cycNum;
	}

	public void setCycUnit(String cycUnit) {
		this.cycUnit = cycUnit;
	}

	public String getCycUnit() {
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

	public void setOrderCenterId(String orderCenterId) {
		this.orderCenterId = orderCenterId;
	}

	public String getOrderCenterId() {
		return this.orderCenterId;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return this.price;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.appstore.orders.special_canal.create_order";
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
		txtParams.put("order_center_id", this.orderCenterId);
		txtParams.put("price", this.price);
		txtParams.put("quantity", this.quantity);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAppstoreOrdersSpecialCanalCreateOrderResponse> getResponseClass() {
		return OapiAppstoreOrdersSpecialCanalCreateOrderResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpid, "corpid");
		RequestCheckUtils.checkNotEmpty(cycNum, "cycNum");
		RequestCheckUtils.checkNotEmpty(cycUnit, "cycUnit");
		RequestCheckUtils.checkNotEmpty(goodsCode, "goodsCode");
		RequestCheckUtils.checkNotEmpty(itemCode, "itemCode");
		RequestCheckUtils.checkNotEmpty(mobile, "mobile");
		RequestCheckUtils.checkNotEmpty(orderCenterId, "orderCenterId");
		RequestCheckUtils.checkNotEmpty(price, "price");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
	}
	

}