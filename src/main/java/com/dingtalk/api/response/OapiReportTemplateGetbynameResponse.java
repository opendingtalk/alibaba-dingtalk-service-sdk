package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.template.getbyname response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiReportTemplateGetbynameResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7462757113374468873L;

	/** 
	 * 系统自动生成
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 系统自动生成
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private ReportTemplateResponseVo result;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setResult(ReportTemplateResponseVo result) {
		this.result = result;
	}
	public ReportTemplateResponseVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 模板默认接收人
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DefaultReceivers extends TaobaoObject {
		private static final long serialVersionUID = 2494189481242686585L;
		/**
		 * 默认接收人名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 默认接收人员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	
	/**
	 * 模板字段
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Fields extends TaobaoObject {
		private static final long serialVersionUID = 4665551548517664468L;
		/**
		 * 模板字段名称
		 */
		@ApiField("field_name")
		private String fieldName;
		/**
		 * 模板字段唯一标识
		 */
		@ApiField("sort")
		private Long sort;
		/**
		 * 字段类型
		 */
		@ApiField("type")
		private Long type;
	
		public String getFieldName() {
			return this.fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public Long getSort() {
			return this.sort;
		}
		public void setSort(Long sort) {
			this.sort = sort;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 默认接收群
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseConversationVo extends TaobaoObject {
		private static final long serialVersionUID = 4627387954964454279L;
		/**
		 * 默认接收群id
		 */
		@ApiField("conversation_id")
		private String conversationId;
		/**
		 * 群名称
		 */
		@ApiField("title")
		private String title;
	
		public String getConversationId() {
			return this.conversationId;
		}
		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReportTemplateResponseVo extends TaobaoObject {
		private static final long serialVersionUID = 4813119667938922195L;
		/**
		 * 默认接收群
		 */
		@ApiListField("default_received_convs")
		@ApiField("base_conversation_vo")
		private List<BaseConversationVo> defaultReceivedConvs;
		/**
		 * 模板默认接收人
		 */
		@ApiListField("default_receivers")
		@ApiField("default_receivers")
		private List<DefaultReceivers> defaultReceivers;
		/**
		 * 模板字段
		 */
		@ApiListField("fields")
		@ApiField("fields")
		private List<Fields> fields;
		/**
		 * 模板id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 模板名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 用户名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 员工id
		 */
		@ApiField("userid")
		private String userid;
	
		public List<BaseConversationVo> getDefaultReceivedConvs() {
			return this.defaultReceivedConvs;
		}
		public void setDefaultReceivedConvs(List<BaseConversationVo> defaultReceivedConvs) {
			this.defaultReceivedConvs = defaultReceivedConvs;
		}
		public List<DefaultReceivers> getDefaultReceivers() {
			return this.defaultReceivers;
		}
		public void setDefaultReceivers(List<DefaultReceivers> defaultReceivers) {
			this.defaultReceivers = defaultReceivers;
		}
		public List<Fields> getFields() {
			return this.fields;
		}
		public void setFields(List<Fields> fields) {
			this.fields = fields;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
