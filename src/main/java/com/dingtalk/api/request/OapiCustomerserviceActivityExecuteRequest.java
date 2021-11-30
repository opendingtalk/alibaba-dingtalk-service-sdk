package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
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
import com.dingtalk.api.response.OapiCustomerserviceActivityExecuteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.activity.execute request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.15
 */
public class OapiCustomerserviceActivityExecuteRequest extends BaseTaobaoRequest<OapiCustomerserviceActivityExecuteResponse> {
	
	

	/** 
	* 活动
	 */
	private String ticketActivity;

	public void setTicketActivity(String ticketActivity) {
		this.ticketActivity = ticketActivity;
	}

	public void setTicketActivity(TicketActivityDto ticketActivity) {
		this.ticketActivity = new JSONWriter(false,false,true).write(ticketActivity);
	}

	public String getTicketActivity() {
		return this.ticketActivity;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.activity.execute";
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
		txtParams.put("ticket_activity", this.ticketActivity);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceActivityExecuteResponse> getResponseClass() {
		return OapiCustomerserviceActivityExecuteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 表单的数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketFieldDto extends TaobaoObject {
		private static final long serialVersionUID = 7644784785167697577L;
		/**
		 * key
		 */
		@ApiField("name")
		private String name;
		/**
		 * value
		 */
		@ApiField("value")
		private String value;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * 活动
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketActivityDto extends TaobaoObject {
		private static final long serialVersionUID = 2139623248227437646L;
		/**
		 * 活动code
		 */
		@ApiField("activity_code")
		private String activityCode;
		/**
		 * 第三方会员id
		 */
		@ApiField("foreign_id")
		private String foreignId;
		/**
		 * 第三方会员名字
		 */
		@ApiField("foreign_name")
		private String foreignName;
		/**
		 * 表单的数据
		 */
		@ApiListField("properties")
		@ApiField("ticket_field_dto")
		private List<TicketFieldDto> properties;
		/**
		 * 第三方会员来源
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 工单id
		 */
		@ApiField("ticket_id")
		private String ticketId;
	
		public String getActivityCode() {
			return this.activityCode;
		}
		public void setActivityCode(String activityCode) {
			this.activityCode = activityCode;
		}
		public String getForeignId() {
			return this.foreignId;
		}
		public void setForeignId(String foreignId) {
			this.foreignId = foreignId;
		}
		public String getForeignName() {
			return this.foreignName;
		}
		public void setForeignName(String foreignName) {
			this.foreignName = foreignName;
		}
		public List<TicketFieldDto> getProperties() {
			return this.properties;
		}
		public void setProperties(List<TicketFieldDto> properties) {
			this.properties = properties;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public String getTicketId() {
			return this.ticketId;
		}
		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}
	}
	

}