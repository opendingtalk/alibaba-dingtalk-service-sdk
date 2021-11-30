package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduCardTaskTodayListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.card.task.today.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.08.23
 */
public class OapiEduCardTaskTodayListRequest extends BaseTaobaoRequest<OapiEduCardTaskTodayListResponse> {
	
	

	/** 
	* 打卡类型,跳绳:jump
	 */
	private String cardType;

	/** 
	* 用户userId
	 */
	private String userid;

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.card.task.today.list";
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
		txtParams.put("card_type", this.cardType);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCardTaskTodayListResponse> getResponseClass() {
		return OapiEduCardTaskTodayListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}