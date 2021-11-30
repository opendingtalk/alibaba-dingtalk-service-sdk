package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiConnectorTriggerSendV2Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.connector.trigger.send_v2 request
 * 
 * @author top auto create
 * @since 1.0, 2021.01.06
 */
public class OapiConnectorTriggerSendV2Request extends BaseTaobaoRequest<OapiConnectorTriggerSendV2Response> {
	
	

	/** 
	* 触发消息请求结构体
	 */
	private String triggerMsgRequest;

	public void setTriggerMsgRequest(String triggerMsgRequest) {
		this.triggerMsgRequest = triggerMsgRequest;
	}

	public void setTriggerMsgRequest(TriggerMsgRequest triggerMsgRequest) {
		this.triggerMsgRequest = new JSONWriter(false,false,true).write(triggerMsgRequest);
	}

	public String getTriggerMsgRequest() {
		return this.triggerMsgRequest;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.connector.trigger.send_v2";
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
		txtParams.put("trigger_msg_request", this.triggerMsgRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiConnectorTriggerSendV2Response> getResponseClass() {
		return OapiConnectorTriggerSendV2Response.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 触发动作数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TriggerMsgData extends TaobaoObject {
		private static final long serialVersionUID = 5184328289959521315L;
		/**
		 * 业务触发时间
		 */
		@ApiField("dd_event_time")
		private Date ddEventTime;
		/**
		 * 触发数据
		 */
		@ApiField("json_data")
		private String jsonData;
		/**
		 * 触发动作ID
		 */
		@ApiField("trigger_id")
		private String triggerId;
	
		public Date getDdEventTime() {
			return this.ddEventTime;
		}
		public void setDdEventTime(Date ddEventTime) {
			this.ddEventTime = ddEventTime;
		}
		public String getJsonData() {
			return this.jsonData;
		}
		public void setJsonData(String jsonData) {
			this.jsonData = jsonData;
		}
		public String getTriggerId() {
			return this.triggerId;
		}
		public void setTriggerId(String triggerId) {
			this.triggerId = triggerId;
		}
	}
	
	/**
	 * 触发消息请求结构体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TriggerMsgRequest extends TaobaoObject {
		private static final long serialVersionUID = 5171133827158375523L;
		/**
		 * 是否为测试属性
		 */
		@ApiField("test")
		private Boolean test;
		/**
		 * 触发动作数据
		 */
		@ApiListField("trigger_msg_data_list")
		@ApiField("trigger_msg_data")
		private List<TriggerMsgData> triggerMsgDataList;
	
		public Boolean getTest() {
			return this.test;
		}
		public void setTest(Boolean test) {
			this.test = test;
		}
		public List<TriggerMsgData> getTriggerMsgDataList() {
			return this.triggerMsgDataList;
		}
		public void setTriggerMsgDataList(List<TriggerMsgData> triggerMsgDataList) {
			this.triggerMsgDataList = triggerMsgDataList;
		}
	}
	

}