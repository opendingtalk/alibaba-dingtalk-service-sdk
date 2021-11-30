package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;
import java.util.Date;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.ticket.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCustomerserviceTicketQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1741834559178897881L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * 工单列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketBaseDto extends TaobaoObject {
		private static final long serialVersionUID = 5227363223761993513L;
		/**
		 * 新建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 最新修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 模板id
		 */
		@ApiField("template_id")
		private String templateId;
		/**
		 * 工单id
		 */
		@ApiField("ticket_id")
		private String ticketId;
		/**
		 * 工单状态
		 */
		@ApiField("ticket_status")
		private String ticketStatus;
		/**
		 * 工单标题
		 */
		@ApiField("title")
		private String title;
	
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public String getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(String templateId) {
			this.templateId = templateId;
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
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 分页结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryCursorResult extends TaobaoObject {
		private static final long serialVersionUID = 6218253954764457119L;
		/**
		 * 是否有更多数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一次分页的游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 工单列表
		 */
		@ApiListField("ticket_list")
		@ApiField("ticket_base_dto")
		private List<TicketBaseDto> ticketList;
		/**
		 * 总数
		 */
		@ApiField("total")
		private Long total;
	
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public List<TicketBaseDto> getTicketList() {
			return this.ticketList;
		}
		public void setTicketList(List<TicketBaseDto> ticketList) {
			this.ticketList = ticketList;
		}
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 3483993177378948859L;
		/**
		 * 错误吗
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 错误消息
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 分页结果对象
		 */
		@ApiField("result")
		private PageQueryCursorResult result;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public PageQueryCursorResult getResult() {
			return this.result;
		}
		public void setResult(PageQueryCursorResult result) {
			this.result = result;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
