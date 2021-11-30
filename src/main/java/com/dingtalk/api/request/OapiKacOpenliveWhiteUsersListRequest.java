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

import com.dingtalk.api.response.OapiKacOpenliveWhiteUsersListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.kac.openlive.white_users.list request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.17
 */
public class OapiKacOpenliveWhiteUsersListRequest extends BaseTaobaoRequest<OapiKacOpenliveWhiteUsersListResponse> {
	
	

	/** 
	* 直播id
	 */
	private String liveId;

	/** 
	* 分页大小
	 */
	private Long pageSize;

	/** 
	* 分页号，从1开始
	 */
	private Long pageStart;

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public String getLiveId() {
		return this.liveId;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageStart(Long pageStart) {
		this.pageStart = pageStart;
	}

	public Long getPageStart() {
		return this.pageStart;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.kac.openlive.white_users.list";
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
		txtParams.put("page_size", this.pageSize);
		txtParams.put("page_start", this.pageStart);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiKacOpenliveWhiteUsersListResponse> getResponseClass() {
		return OapiKacOpenliveWhiteUsersListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(liveId, "liveId");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(pageStart, "pageStart");
	}
	

}