package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.getbydeptid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasGroupGetbydeptidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8635999918325534367L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private BaseGroupInfo result;

	/** 
	 * success
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setResult(BaseGroupInfo result) {
		this.result = result;
	}
	public BaseGroupInfo getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupInfo extends TaobaoObject {
		private static final long serialVersionUID = 7682864361142911426L;
		/**
		 * conversation_id
		 */
		@ApiField("conversation_id")
		private String conversationId;
		/**
		 * icon
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * open_conversation_id
		 */
		@ApiField("open_conversation_id")
		private String openConversationId;
		/**
		 * owner
		 */
		@ApiField("owner")
		private Long owner;
		/**
		 * tag
		 */
		@ApiField("tag")
		private Long tag;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
	
		public String getConversationId() {
			return this.conversationId;
		}
		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public String getOpenConversationId() {
			return this.openConversationId;
		}
		public void setOpenConversationId(String openConversationId) {
			this.openConversationId = openConversationId;
		}
		public Long getOwner() {
			return this.owner;
		}
		public void setOwner(Long owner) {
			this.owner = owner;
		}
		public Long getTag() {
			return this.tag;
		}
		public void setTag(Long tag) {
			this.tag = tag;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	


}
