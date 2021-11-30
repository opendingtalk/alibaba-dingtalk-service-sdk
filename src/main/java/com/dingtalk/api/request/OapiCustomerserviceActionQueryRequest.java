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
import com.dingtalk.api.response.OapiCustomerserviceActionQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.action.query request
 * 
 * @author top auto create
 * @since 1.0, 2021.03.29
 */
public class OapiCustomerserviceActionQueryRequest extends BaseTaobaoRequest<OapiCustomerserviceActionQueryResponse> {
	
	

	/** 
	* 分页查询条件
	 */
	private String ticketActionPageQuery;

	public void setTicketActionPageQuery(String ticketActionPageQuery) {
		this.ticketActionPageQuery = ticketActionPageQuery;
	}

	public void setTicketActionPageQuery(TicketActionPageQueryDto ticketActionPageQuery) {
		this.ticketActionPageQuery = new JSONWriter(false,false,true).write(ticketActionPageQuery);
	}

	public String getTicketActionPageQuery() {
		return this.ticketActionPageQuery;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.customerservice.action.query";
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
		txtParams.put("ticket_action_page_query", this.ticketActionPageQuery);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCustomerserviceActionQueryResponse> getResponseClass() {
		return OapiCustomerserviceActionQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 分页查询条件
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketActionPageQueryDto extends TaobaoObject {
		private static final long serialVersionUID = 2232359883579217614L;
		/**
		 * 查询游标
		 */
		@ApiField("cursor")
		private Long cursor;
		/**
		 * 实例id
		 */
		@ApiField("open_instance_id")
		private String openInstanceId;
		/**
		 * 1智能客服
		 */
		@ApiField("production_type")
		private String productionType;
		/**
		 * 分页大小
		 */
		@ApiField("size")
		private Long size;
		/**
		 * 工单id
		 */
		@ApiField("ticket_id")
		private String ticketId;
	
		public Long getCursor() {
			return this.cursor;
		}
		public void setCursor(Long cursor) {
			this.cursor = cursor;
		}
		public String getOpenInstanceId() {
			return this.openInstanceId;
		}
		public void setOpenInstanceId(String openInstanceId) {
			this.openInstanceId = openInstanceId;
		}
		public String getProductionType() {
			return this.productionType;
		}
		public void setProductionType(String productionType) {
			this.productionType = productionType;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public String getTicketId() {
			return this.ticketId;
		}
		public void setTicketId(String ticketId) {
			this.ticketId = ticketId;
		}
	}
	

}