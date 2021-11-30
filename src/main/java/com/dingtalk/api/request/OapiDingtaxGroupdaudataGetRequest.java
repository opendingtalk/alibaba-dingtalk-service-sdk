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

import com.dingtalk.api.response.OapiDingtaxGroupdaudataGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.dingtax.groupdaudata.get request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.03
 */
public class OapiDingtaxGroupdaudataGetRequest extends BaseTaobaoRequest<OapiDingtaxGroupdaudataGetResponse> {
	
	

	/** 
	* 开放群ID列表
	 */
	private String openConversationIdList;

	/** 
	* 统计日期(格式为 yyyymmdd)
	 */
	private String statDate;

	public void setOpenConversationIdList(String openConversationIdList) {
		this.openConversationIdList = openConversationIdList;
	}

	public String getOpenConversationIdList() {
		return this.openConversationIdList;
	}

	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}

	public String getStatDate() {
		return this.statDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.dingtax.groupdaudata.get";
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
		txtParams.put("open_conversation_id_list", this.openConversationIdList);
		txtParams.put("stat_date", this.statDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDingtaxGroupdaudataGetResponse> getResponseClass() {
		return OapiDingtaxGroupdaudataGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openConversationIdList, "openConversationIdList");
		RequestCheckUtils.checkMaxListSize(openConversationIdList, 999, "openConversationIdList");
		RequestCheckUtils.checkNotEmpty(statDate, "statDate");
	}
	

}