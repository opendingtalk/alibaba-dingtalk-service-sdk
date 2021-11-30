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

import com.dingtalk.api.response.OapiPbpInstanceCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.pbp.instance.create request
 * 
 * @author top auto create
 * @since 1.0, 2019.12.23
 */
public class OapiPbpInstanceCreateRequest extends BaseTaobaoRequest<OapiPbpInstanceCreateResponse> {
	
	

	/** 
	* 是否启用，建议传入该参数，只有启用状态的实例才允许打卡。如果不传入该参数，则实例默认为“已创建”状态而非“启用”状态。
	 */
	private Boolean active;

	/** 
	* 业务id，接入时由系统分配
	 */
	private String bizId;

	/** 
	* 实例结束时间，时间戳
	 */
	private Long endTime;

	/** 
	* 外部id，唯一对应一次业务实例，如一次会议的meeting_id
	 */
	private String outerId;

	/** 
	* 实例开始时间，时间戳
	 */
	private Long startTime;

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.pbp.instance.create";
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
		txtParams.put("active", this.active);
		txtParams.put("biz_id", this.bizId);
		txtParams.put("end_time", this.endTime);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("start_time", this.startTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiPbpInstanceCreateResponse> getResponseClass() {
		return OapiPbpInstanceCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkNotEmpty(outerId, "outerId");
	}
	

}