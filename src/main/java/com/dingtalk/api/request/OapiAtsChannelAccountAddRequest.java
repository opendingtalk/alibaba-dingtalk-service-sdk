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

import com.dingtalk.api.response.OapiAtsChannelAccountAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.channel.account.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.19
 */
public class OapiAtsChannelAccountAddRequest extends BaseTaobaoRequest<OapiAtsChannelAccountAddResponse> {
	
	

	/** 
	* 招聘业务码
	 */
	private String bizCode;

	/** 
	* 渠道用户唯一标识
	 */
	private String channelUserIdentify;

	/** 
	* 钉钉用户userId
	 */
	private String userid;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setChannelUserIdentify(String channelUserIdentify) {
		this.channelUserIdentify = channelUserIdentify;
	}

	public String getChannelUserIdentify() {
		return this.channelUserIdentify;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.channel.account.add";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("channel_user_identify", this.channelUserIdentify);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsChannelAccountAddResponse> getResponseClass() {
		return OapiAtsChannelAccountAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(channelUserIdentify, "channelUserIdentify");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}