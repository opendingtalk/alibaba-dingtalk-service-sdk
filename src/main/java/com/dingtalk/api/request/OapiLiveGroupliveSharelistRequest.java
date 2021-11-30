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

import com.dingtalk.api.response.OapiLiveGroupliveSharelistResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.sharelist request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.26
 */
public class OapiLiveGroupliveSharelistRequest extends BaseTaobaoRequest<OapiLiveGroupliveSharelistResponse> {
	
	

	/** 
	* 群id
	 */
	private String cid;

	/** 
	* 直播uuid
	 */
	private String liveUuid;

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCid() {
		return this.cid;
	}

	public void setLiveUuid(String liveUuid) {
		this.liveUuid = liveUuid;
	}

	public String getLiveUuid() {
		return this.liveUuid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.live.grouplive.sharelist";
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
		txtParams.put("cid", this.cid);
		txtParams.put("live_uuid", this.liveUuid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiLiveGroupliveSharelistResponse> getResponseClass() {
		return OapiLiveGroupliveSharelistResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cid, "cid");
		RequestCheckUtils.checkNotEmpty(liveUuid, "liveUuid");
	}
	

}