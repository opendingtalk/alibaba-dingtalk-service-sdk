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

import com.dingtalk.api.response.OapiChatUpdatebanwordsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.updatebanwords request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.06
 */
public class OapiChatUpdatebanwordsRequest extends BaseTaobaoRequest<OapiChatUpdatebanwordsResponse> {
	
	

	/** 
	* 禁言时间，单位ms
	 */
	private Long banWordsTime;

	/** 
	* chatid
	 */
	private String chatid;

	/** 
	* 0表示剔除禁言名单，1表示加入禁言名单
	 */
	private Long type;

	/** 
	* 被禁言人id列表
	 */
	private String useridList;

	public void setBanWordsTime(Long banWordsTime) {
		this.banWordsTime = banWordsTime;
	}

	public Long getBanWordsTime() {
		return this.banWordsTime;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.updatebanwords";
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
		txtParams.put("ban_words_time", this.banWordsTime);
		txtParams.put("chatid", this.chatid);
		txtParams.put("type", this.type);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatUpdatebanwordsResponse> getResponseClass() {
		return OapiChatUpdatebanwordsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(banWordsTime, "banWordsTime");
		RequestCheckUtils.checkNotEmpty(chatid, "chatid");
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 20, "useridList");
	}
	

}