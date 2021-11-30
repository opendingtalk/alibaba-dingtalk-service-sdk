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

import com.dingtalk.api.response.OapiKacOpenliveWhiteUsersBatchDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.openlive.white_users.batch_delete request
 * 
 * @author top auto create
 * @since 1.0, 2021.09.28
 */
public class OapiKacOpenliveWhiteUsersBatchDeleteRequest extends BaseTaobaoRequest<OapiKacOpenliveWhiteUsersBatchDeleteResponse> {
	
	

	/** 
	* 直播id
	 */
	private String liveId;

	/** 
	* 员工id列表
	 */
	private String userIds;

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public String getLiveId() {
		return this.liveId;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.openlive.white_users.batch_delete";
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
		txtParams.put("live_id", this.liveId);
		txtParams.put("user_ids", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKacOpenliveWhiteUsersBatchDeleteResponse> getResponseClass() {
		return OapiKacOpenliveWhiteUsersBatchDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(liveId, "liveId");
		RequestCheckUtils.checkNotEmpty(userIds, "userIds");
		RequestCheckUtils.checkMaxListSize(userIds, 999, "userIds");
	}
	

}