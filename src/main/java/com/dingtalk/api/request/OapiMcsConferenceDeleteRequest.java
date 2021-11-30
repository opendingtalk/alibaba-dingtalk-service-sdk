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

import com.dingtalk.api.response.OapiMcsConferenceDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mcs.conference.delete request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.06
 */
public class OapiMcsConferenceDeleteRequest extends BaseTaobaoRequest<OapiMcsConferenceDeleteResponse> {
	
	

	/** 
	* 由MCS颁发给调用三方的使用凭证
	 */
	private String bizKey;

	/** 
	* 会议码
	 */
	private String roomCode;

	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}

	public String getBizKey() {
		return this.bizKey;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getRoomCode() {
		return this.roomCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.mcs.conference.delete";
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
		txtParams.put("biz_key", this.bizKey);
		txtParams.put("room_code", this.roomCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMcsConferenceDeleteResponse> getResponseClass() {
		return OapiMcsConferenceDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizKey, "bizKey");
		RequestCheckUtils.checkNotEmpty(roomCode, "roomCode");
	}
	

}