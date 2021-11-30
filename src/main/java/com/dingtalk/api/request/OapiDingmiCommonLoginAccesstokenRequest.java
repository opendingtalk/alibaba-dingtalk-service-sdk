package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDingmiCommonLoginAccesstokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingmi.common.login.accesstoken request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.15
 */
public class OapiDingmiCommonLoginAccesstokenRequest extends BaseTaobaoRequest<OapiDingmiCommonLoginAccesstokenResponse> {
	
	

	/** 
	* 用户外部系统id
	 */
	private String foreignId;

	/** 
	* 登录用户昵称
	 */
	private String nick;

	/** 
	* 业务账号登录source
	 */
	private Long source;

	public void setForeignId(String foreignId) {
		this.foreignId = foreignId;
	}

	public String getForeignId() {
		return this.foreignId;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setSource(Long source) {
		this.source = source;
	}

	public Long getSource() {
		return this.source;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingmi.common.login.accesstoken";
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
		txtParams.put("foreign_id", this.foreignId);
		txtParams.put("nick", this.nick);
		txtParams.put("source", this.source);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingmiCommonLoginAccesstokenResponse> getResponseClass() {
		return OapiDingmiCommonLoginAccesstokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}