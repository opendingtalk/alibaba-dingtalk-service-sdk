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

import com.dingtalk.api.response.OapiImChatServicegroupMemberQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.im.chat.servicegroup.member.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.30
 */
public class OapiImChatServicegroupMemberQueryRequest extends BaseTaobaoRequest<OapiImChatServicegroupMemberQueryResponse> {
	
	

	/** 
	* 开放的chatId
	 */
	private String chatId;

	/** 
	* 0- 不包含群主，1-包含群主
	 */
	private Long includeOwner;

	/** 
	* 页码，从1开始
	 */
	private Long pageNum;

	/** 
	* 每页大小，最大100
	 */
	private Long pageSize;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setIncludeOwner(Long includeOwner) {
		this.includeOwner = includeOwner;
	}

	public Long getIncludeOwner() {
		return this.includeOwner;
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

	public String getApiMethodName() {
		return "dingtalk.oapi.im.chat.servicegroup.member.query";
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
		txtParams.put("include_owner", this.includeOwner);
		txtParams.put("page_num", this.pageNum);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImChatServicegroupMemberQueryResponse> getResponseClass() {
		return OapiImChatServicegroupMemberQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatId, "chatId");
		RequestCheckUtils.checkMaxLength(chatId, 128, "chatId");
		RequestCheckUtils.checkNotEmpty(pageNum, "pageNum");
		RequestCheckUtils.checkMinValue(pageNum, 1L, "pageNum");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
	}
	

}