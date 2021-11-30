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

import com.dingtalk.api.response.OapiLiveGroupliveListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.live.grouplive.list request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiLiveGroupliveListRequest extends BaseTaobaoRequest<OapiLiveGroupliveListResponse> {
	
	

	/** 
	* 群id
	 */
	private Long cid;

	/** 
	* 截止时间ms
	 */
	private Long fromTime;

	/** 
	* 用户id
	 */
	private Long openId;

	/** 
	* 开始时间ms
	 */
	private Long toTime;

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setFromTime(Long fromTime) {
		this.fromTime = fromTime;
	}

	public Long getFromTime() {
		return this.fromTime;
	}

	public void setOpenId(Long openId) {
		this.openId = openId;
	}

	public Long getOpenId() {
		return this.openId;
	}

	public void setToTime(Long toTime) {
		this.toTime = toTime;
	}

	public Long getToTime() {
		return this.toTime;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.live.grouplive.list";
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
		txtParams.put("from_time", this.fromTime);
		txtParams.put("open_id", this.openId);
		txtParams.put("to_time", this.toTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiLiveGroupliveListResponse> getResponseClass() {
		return OapiLiveGroupliveListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cid, "cid");
	}
	

}