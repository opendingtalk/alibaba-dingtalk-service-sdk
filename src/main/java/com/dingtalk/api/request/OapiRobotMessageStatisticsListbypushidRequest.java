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

import com.dingtalk.api.response.OapiRobotMessageStatisticsListbypushidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.robot.message.statistics.listbypushid request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiRobotMessageStatisticsListbypushidRequest extends BaseTaobaoRequest<OapiRobotMessageStatisticsListbypushidResponse> {
	
	

	/** 
	* 群Id列表
	 */
	private String conversationIds;

	/** 
	* 当前页码
	 */
	private Long page;

	/** 
	* 分页大小
	 */
	private Long pageSize;

	/** 
	* 机器人消息推送Id
	 */
	private String pushId;

	public void setConversationIds(String conversationIds) {
		this.conversationIds = conversationIds;
	}

	public String getConversationIds() {
		return this.conversationIds;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public String getPushId() {
		return this.pushId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.robot.message.statistics.listbypushid";
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
		txtParams.put("conversation_ids", this.conversationIds);
		txtParams.put("page", this.page);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("push_id", this.pushId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRobotMessageStatisticsListbypushidResponse> getResponseClass() {
		return OapiRobotMessageStatisticsListbypushidResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(conversationIds, "conversationIds");
		RequestCheckUtils.checkMaxListSize(conversationIds, 20, "conversationIds");
		RequestCheckUtils.checkNotEmpty(page, "page");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(pushId, "pushId");
	}
	

}