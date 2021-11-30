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

import com.dingtalk.api.response.OapiChatTagDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.tag.delete request
 * 
 * @author top auto create
 * @since 1.0, 2019.10.31
 */
public class OapiChatTagDeleteRequest extends BaseTaobaoRequest<OapiChatTagDeleteResponse> {
	
	

	/** 
	* 内部群的id
	 */
	private String chatid;

	/** 
	* 群标签的类型。1表示经销群；2表示销管群
	 */
	private Long groupTag;

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setGroupTag(Long groupTag) {
		this.groupTag = groupTag;
	}

	public Long getGroupTag() {
		return this.groupTag;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.tag.delete";
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
		txtParams.put("chatid", this.chatid);
		txtParams.put("group_tag", this.groupTag);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatTagDeleteResponse> getResponseClass() {
		return OapiChatTagDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatid, "chatid");
		RequestCheckUtils.checkNotEmpty(groupTag, "groupTag");
	}
	

}