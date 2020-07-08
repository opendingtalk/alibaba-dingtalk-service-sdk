package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.customerservice.action.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCustomerserviceActionQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6542237354873569415L;

	/** 
	 * 返回值
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
	 * 动作表单字段列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketFieldDto extends TaobaoObject {
		private static final long serialVersionUID = 7349288161313433525L;
		/**
		 * 标签名
		 */
		@ApiField("display_name")
		private String displayName;
		/**
		 * 标签值
		 */
		@ApiField("display_value")
		private String displayValue;
		/**
		 * 键
		 */
		@ApiField("name")
		private String name;
		/**
		 * 值
		 */
		@ApiField("value")
		private String value;
		/**
		 * 附件类型
		 */
		@ApiField("value_type")
		private String valueType;
	
		public String getDisplayName() {
			return this.displayName;
		}
		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
		public String getDisplayValue() {
			return this.displayValue;
		}
		public void setDisplayValue(String displayValue) {
			this.displayValue = displayValue;
		}
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
		public String getValueType() {
			return this.valueType;
		}
		public void setValueType(String valueType) {
			this.valueType = valueType;
		}
	}
	
	/**
	 * 动作列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TicketActionDto extends TaobaoObject {
		private static final long serialVersionUID = 8613494164252914372L;
		/**
		 * 动作表单字段列表
		 */
		@ApiListField("action_content")
		@ApiField("ticket_field_dto")
		private List<TicketFieldDto> actionContent;
		/**
		 * 执行人
		 */
		@ApiField("operator")
		private String operator;
		/**
		 * 创建者1；客服 4；
		 */
		@ApiField("operator_role")
		private String operatorRole;
	
		public List<TicketFieldDto> getActionContent() {
			return this.actionContent;
		}
		public void setActionContent(List<TicketFieldDto> actionContent) {
			this.actionContent = actionContent;
		}
		public String getOperator() {
			return this.operator;
		}
		public void setOperator(String operator) {
			this.operator = operator;
		}
		public String getOperatorRole() {
			return this.operatorRole;
		}
		public void setOperatorRole(String operatorRole) {
			this.operatorRole = operatorRole;
		}
	}
	
	/**
	 * 分页查询结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageQueryCursorResult extends TaobaoObject {
		private static final long serialVersionUID = 4234289672746614183L;
		/**
		 * 动作列表
		 */
		@ApiListField("action_list")
		@ApiField("ticket_action_dto")
		private List<TicketActionDto> actionList;
		/**
		 * 还有数据
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * 下一页的游标
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 总数
		 */
		@ApiField("total")
		private Long total;
	
		public List<TicketActionDto> getActionList() {
			return this.actionList;
		}
		public void setActionList(List<TicketActionDto> actionList) {
			this.actionList = actionList;
		}
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
		public Long getTotal() {
			return this.total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
	}
	
	/**
	 * 返回值
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7899349337493769517L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 文案
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * 分页查询结果
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
