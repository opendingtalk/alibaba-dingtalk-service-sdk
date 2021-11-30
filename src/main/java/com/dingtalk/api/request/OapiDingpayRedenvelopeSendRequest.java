package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingpayRedenvelopeSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingpay.redenvelope.send request
 * 
 * @author top auto create
 * @since 1.0, 2021.05.08
 */
public class OapiDingpayRedenvelopeSendRequest extends BaseTaobaoRequest<OapiDingpayRedenvelopeSendResponse> {
	
	

	/** 
	* 群会话ID
	 */
	private String chatId;

	/** 
	* 企业业务订单号（每个订单号必须唯一。取值范围：0~9，a~z，A~Z），接口根据企业订单号支持幂等，组成参考：corp_id+yyyymmdd+10位一天内不能重复的数字
	 */
	private String corpBizNo;

	/** 
	* 额外参数
	 */
	private String extParams;

	/** 
	* 红包祝福语
	 */
	private String greetings;

	/** 
	* 群会话ID
	 */
	private String openConversationId;

	/** 
	* 支付方式，WITHHOLD：代扣模式，目前只支持该方式
	 */
	private String payMethod;

	/** 
	* 签名方式咨询技术支持
	 */
	private String paySign;

	/** 
	* 接收人ID
	 */
	private String receiverId;

	/** 
	* 发送人ID
	 */
	private String senderId;

	/** 
	* 红包主题ID
	 */
	private String themeId;

	/** 
	* 红包金额
	 */
	private String totalAmount;

	/** 
	* 红包类型，目前支持：SINGLE_QUOTA，个人单聊红包
	 */
	private String type;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setCorpBizNo(String corpBizNo) {
		this.corpBizNo = corpBizNo;
	}

	public String getCorpBizNo() {
		return this.corpBizNo;
	}

	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}
	public void setExtParamsString(String extParams) {
		this.extParams = extParams;
	}

	public String getExtParams() {
		return this.extParams;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	public String getGreetings() {
		return this.greetings;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getPayMethod() {
		return this.payMethod;
	}

	public void setPaySign(String paySign) {
		this.paySign = paySign;
	}

	public String getPaySign() {
		return this.paySign;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceiverId() {
		return this.receiverId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

	public String getThemeId() {
		return this.themeId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingpay.redenvelope.send";
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
		txtParams.put("chat_id", this.chatId);
		txtParams.put("corp_biz_no", this.corpBizNo);
		txtParams.put("ext_params", this.extParams);
		txtParams.put("greetings", this.greetings);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("pay_method", this.payMethod);
		txtParams.put("pay_sign", this.paySign);
		txtParams.put("receiver_id", this.receiverId);
		txtParams.put("sender_id", this.senderId);
		txtParams.put("theme_id", this.themeId);
		txtParams.put("total_amount", this.totalAmount);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingpayRedenvelopeSendResponse> getResponseClass() {
		return OapiDingpayRedenvelopeSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpBizNo, "corpBizNo");
		RequestCheckUtils.checkNotEmpty(payMethod, "payMethod");
		RequestCheckUtils.checkNotEmpty(paySign, "paySign");
		RequestCheckUtils.checkNotEmpty(receiverId, "receiverId");
		RequestCheckUtils.checkNotEmpty(totalAmount, "totalAmount");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}