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

import com.dingtalk.api.response.OapiMcsConferenceCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.mcs.conference.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.06
 */
public class OapiMcsConferenceCreateRequest extends BaseTaobaoRequest<OapiMcsConferenceCreateResponse> {
	
	

	/** 
	* 由MCS颁发给调用三方的使用凭证
	 */
	private String bizKey;

	/** 
	* 是否推送通话记录
	 */
	private Boolean isPushRecord;

	/** 
	* 倾向发起地 目前支持 CN-HZCN-HKCN-BJ
	 */
	private String preferenceRegion;

	/** 
	* 视频会议从创建之时起的最多保留时间
	 */
	private Long roomValidTime;

	/** 
	* 视频会议标题
	 */
	private String title;

	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}

	public String getBizKey() {
		return this.bizKey;
	}

	public void setIsPushRecord(Boolean isPushRecord) {
		this.isPushRecord = isPushRecord;
	}

	public Boolean getIsPushRecord() {
		return this.isPushRecord;
	}

	public void setPreferenceRegion(String preferenceRegion) {
		this.preferenceRegion = preferenceRegion;
	}

	public String getPreferenceRegion() {
		return this.preferenceRegion;
	}

	public void setRoomValidTime(Long roomValidTime) {
		this.roomValidTime = roomValidTime;
	}

	public Long getRoomValidTime() {
		return this.roomValidTime;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.mcs.conference.create";
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
		txtParams.put("is_push_record", this.isPushRecord);
		txtParams.put("preference_region", this.preferenceRegion);
		txtParams.put("room_valid_time", this.roomValidTime);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMcsConferenceCreateResponse> getResponseClass() {
		return OapiMcsConferenceCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizKey, "bizKey");
		RequestCheckUtils.checkNotEmpty(roomValidTime, "roomValidTime");
		RequestCheckUtils.checkNotEmpty(title, "title");
	}
	

}