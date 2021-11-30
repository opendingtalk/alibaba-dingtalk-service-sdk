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

import com.dingtalk.api.response.OapiAtsJobDeliverAddResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ats.job.deliver.add request
 * 
 * @author top auto create
 * @since 1.0, 2020.08.04
 */
public class OapiAtsJobDeliverAddRequest extends BaseTaobaoRequest<OapiAtsJobDeliverAddResponse> {
	
	

	/** 
	* 业务唯一标识，接入前请提前沟通
	 */
	private String bizCode;

	/** 
	* 投递渠道, 接入前请提前沟通
	 */
	private String deliverChannel;

	/** 
	* 失败原因
	 */
	private String deliverMsg;

	/** 
	* 渠道中的一次职位外投的唯一id，如需要更新deliver_status该入参必传
	 */
	private String deliverOuterId;

	/** 
	* 投递中:created,投递失败:fail,投递成功:success,已下架:off_shelf
	 */
	private String deliverStatus;

	/** 
	* 智能招聘职位id
	 */
	private String jobId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setDeliverChannel(String deliverChannel) {
		this.deliverChannel = deliverChannel;
	}

	public String getDeliverChannel() {
		return this.deliverChannel;
	}

	public void setDeliverMsg(String deliverMsg) {
		this.deliverMsg = deliverMsg;
	}

	public String getDeliverMsg() {
		return this.deliverMsg;
	}

	public void setDeliverOuterId(String deliverOuterId) {
		this.deliverOuterId = deliverOuterId;
	}

	public String getDeliverOuterId() {
		return this.deliverOuterId;
	}

	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}

	public String getDeliverStatus() {
		return this.deliverStatus;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ats.job.deliver.add";
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
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("deliver_channel", this.deliverChannel);
		txtParams.put("deliver_msg", this.deliverMsg);
		txtParams.put("deliver_outer_id", this.deliverOuterId);
		txtParams.put("deliver_status", this.deliverStatus);
		txtParams.put("job_id", this.jobId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAtsJobDeliverAddResponse> getResponseClass() {
		return OapiAtsJobDeliverAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
		RequestCheckUtils.checkNotEmpty(deliverChannel, "deliverChannel");
		RequestCheckUtils.checkNotEmpty(deliverStatus, "deliverStatus");
		RequestCheckUtils.checkNotEmpty(jobId, "jobId");
	}
	

}