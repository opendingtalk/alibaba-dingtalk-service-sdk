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

import com.dingtalk.api.response.OapiCcoserviceServicegroupUpdateservicetimeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ccoservice.servicegroup.updateservicetime request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.03
 */
public class OapiCcoserviceServicegroupUpdateservicetimeRequest extends BaseTaobaoRequest<OapiCcoserviceServicegroupUpdateservicetimeResponse> {
	
	

	/** 
	* 服务结束时间
	 */
	private String endTime;

	/** 
	* 群加密id
	 */
	private String openConversationId;

	/** 
	* 服务开始时间
	 */
	private String startTime;

	/** 
	* 日期类型,0-工作日;1-每日;99-端上不显示
	 */
	private Long timeType;

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setTimeType(Long timeType) {
		this.timeType = timeType;
	}

	public Long getTimeType() {
		return this.timeType;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ccoservice.servicegroup.updateservicetime";
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
		txtParams.put("end_time", this.endTime);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("start_time", this.startTime);
		txtParams.put("time_type", this.timeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCcoserviceServicegroupUpdateservicetimeResponse> getResponseClass() {
		return OapiCcoserviceServicegroupUpdateservicetimeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
	}
	

}