package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
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
import com.dingtalk.api.response.OapiCustomerserviceTicketQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.ticket.query request
 * 
 * @author top auto create
 * @since 1.0, 2020.05.15
 */
public class OapiCustomerserviceTicketQueryRequest extends BaseTaobaoRequest<OapiCustomerserviceTicketQueryResponse> {
	
	

	/** 
	* 查询对象
	 */
	private String ticketPageQueryDto;

	public void setTicketPageQueryDto(String ticketPageQueryDto) {
		this.ticketPageQueryDto = ticketPageQueryDto;
	}

	public void setTicketPageQueryDto(TicketPageQueryDto ticketPageQueryDto) {
		this.ticketPageQueryDto = new JSONWriter(false,false,true).write(ticketPageQueryDto);
	}

	public String getTicketPageQueryDto() {
		return this.ticketPageQueryDto;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.ticket.query";
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
		txtParams.put("ticket_page_query_dto", this.ticketPageQueryDto);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceTicketQueryResponse> getResponseClass() {
		return OapiCustomerserviceTicketQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 查询对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketPageQueryDto extends TaobaoObject {
		private static final long serialVersionUID = 4183485256167699161L;
		/**
		 * 游标
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 结束时间
		 */
		@ApiField("end_date")
		private Date endDate;
		/**
		 * 三方账号id
		 */
		@ApiField("foreign_id")
		private String foreignId;
		/**
		 * 三方账号姓名
		 */
		@ApiField("foreign_name")
		private String foreignName;
		/**
		 * 分页大小
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 三方账号标识
		 */
		@ApiField("source_id")
		private String sourceId;
		/**
		 * 开始时间
		 */
		@ApiField("start_date")
		private Date startDate;
		/**
		 * 工单id
		 */
		@ApiField("ticket_id")
		private String ticketId;
		/**
		 * 待受理
		 */
		@ApiField("ticket_status")
		private String ticketStatus;
		/**
		 * 工单类型id
		 */
		@ApiField("ticket_template_id")
		private String ticketTemplateId;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public Date getEndDate() {
			return this.endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
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
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public String getSourceId() {
			return this.sourceId;
		}
		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}
		public Date getStartDate() {
			return this.startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public String getTicketId() {
			return this.ticketId;
		}
		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}
		public String getTicketStatus() {
			return this.ticketStatus;
		}
		public void setTicketStatus(String ticketStatus) {
			this.ticketStatus = ticketStatus;
		}
		public String getTicketTemplateId() {
			return this.ticketTemplateId;
		}
		public void setTicketTemplateId(String ticketTemplateId) {
			this.ticketTemplateId = ticketTemplateId;
		}
	}
	

}