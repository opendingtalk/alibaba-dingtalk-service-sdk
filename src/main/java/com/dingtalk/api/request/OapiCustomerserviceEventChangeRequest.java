package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiCustomerserviceEventChangeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.event.change request
 * 
 * @author top auto create
 * @since 1.0, 2020.02.12
 */
public class OapiCustomerserviceEventChangeRequest extends BaseTaobaoRequest<OapiCustomerserviceEventChangeResponse> {
	
	

	/** 
	* 事件对象
	 */
	private String eventDto;

	public void setEventDto(String eventDto) {
		this.eventDto = eventDto;
	}

	public void setEventDto(EventDto eventDto) {
		this.eventDto = new JSONWriter(false,false,true).write(eventDto);
	}

	public String getEventDto() {
		return this.eventDto;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.event.change";
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
		txtParams.put("event_dto", this.eventDto);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceEventChangeResponse> getResponseClass() {
		return OapiCustomerserviceEventChangeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 事件对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class EventDto extends TaobaoObject {
		private static final long serialVersionUID = 3586883639694762575L;
		/**
		 * 事件业务类型，参考com.dingtalk.customerservice.common.EventBizTypeEnum
		 */
		@ApiField("biz_type")
		private String bizType;
		/**
		 * buId(租户id)
		 */
		@ApiField("bu_id")
		private String buId;
		/**
		 * 事件变更内容，json格式
		 */
		@ApiField("event_body")
		private String eventBody;
		/**
		 * 事件code，参考com.dingtalk.customerservice.common.EventBizTypeEnum
		 */
		@ApiField("event_code")
		private String eventCode;
		/**
		 * 事件的唯一性id，用于幂等
		 */
		@ApiField("event_id")
		private String eventId;
		/**
		 * 事件来源，com.dingtalk.customerservice.common.SourceEnum
		 */
		@ApiField("source")
		private String source;
	
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public String getBuId() {
			return this.buId;
		}
		public void setBuId(String buId) {
			this.buId = buId;
		}
		public String getEventBody() {
			return this.eventBody;
		}
		public void setEventBody(String eventBody) {
			this.eventBody = eventBody;
		}
		public String getEventCode() {
			return this.eventCode;
		}
		public void setEventCode(String eventCode) {
			this.eventCode = eventCode;
		}
		public String getEventId() {
			return this.eventId;
		}
		public void setEventId(String eventId) {
			this.eventId = eventId;
		}
		public String getSource() {
			return this.source;
		}
		public void setSource(String source) {
			this.source = source;
		}
	}
	

}