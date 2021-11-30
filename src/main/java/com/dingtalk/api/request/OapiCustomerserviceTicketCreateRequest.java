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
import com.dingtalk.api.response.OapiCustomerserviceTicketCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.ticket.create request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.15
 */
public class OapiCustomerserviceTicketCreateRequest extends BaseTaobaoRequest<OapiCustomerserviceTicketCreateResponse> {
	
	

	/** 
	* 工单对象
	 */
	private String ticketCreate;

	public void setTicketCreate(String ticketCreate) {
		this.ticketCreate = ticketCreate;
	}

	public void setTicketCreate(TicketCreateDto ticketCreate) {
		this.ticketCreate = new JSONWriter(false,false,true).write(ticketCreate);
	}

	public String getTicketCreate() {
		return this.ticketCreate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.ticket.create";
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
		txtParams.put("ticket_create", this.ticketCreate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceTicketCreateResponse> getResponseClass() {
		return OapiCustomerserviceTicketCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 工单表单
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketFieldDto extends TaobaoObject {
		private static final long serialVersionUID = 5594574832755328841L;
		/**
		 * 字段值
		 */
		@ApiField("name")
		private String name;
		/**
		 * 字段key
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
	 * 工单对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketCreateDto extends TaobaoObject {
		private static final long serialVersionUID = 3552852451473943277L;
		/**
		 * 第三方会员id
		 */
		@ApiField("foreign_id")
		private String foreignId;
		/**
		 * 第三方会员名
		 */
		@ApiField("foreign_name")
		private String foreignName;
		/**
		 * 工单表单
		 */
		@ApiListField("properties")
		@ApiField("ticket_field_dto")
		private List<TicketFieldDto> properties;
		/**
		 * 会员标识
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 工单模板id
		 */
		@ApiField("template_id")
		private String templateId;
		/**
		 * 工单标题
		 */
		@ApiField("title")
		private String title;
	
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
		public String getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	

}